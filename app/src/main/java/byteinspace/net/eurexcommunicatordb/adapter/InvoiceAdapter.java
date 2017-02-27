package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Invoice;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

import static byteinspace.net.eurexcommunicatordb.R.string.events;

/**
 * Created by daniel on 27.02.2017.
 */

public class InvoiceAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Invoice> invoices;


    public InvoiceAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        invoices = ServiceFactory.getFactory().getInvoiceService().getAllInvoices();

    }


    @Override
    public int getCount() {
        return invoices.size();
    }

    @Override
    public Object getItem(int position) {
        return invoices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.invoice_list_view, parent, false);
            holder = new ViewHolder();
            holder.inv_date = (TextView) convertView.findViewById(R.id.inv_date);
            holder.inv_title = (TextView) convertView.findViewById(R.id.inv_title);
            holder.inv_paid = (ImageView) convertView.findViewById(R.id.inv_paid);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Invoice invoice = (Invoice) getItem(position);
        holder.inv_date.setText(invoice.getDatum());
        holder.inv_title.setText(invoice.getTitle());

        if (invoice.isPaid()) {
            holder.inv_paid.setImageResource(R.drawable.event_registered);
        } else
            holder.inv_paid.setImageResource(R.drawable.event_full);


        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView inv_date, inv_title;
        ImageView inv_paid;

    }

}
