package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Form;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 03.03.2017.
 */

public class FormsAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Form> forms;


    public FormsAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        forms = ServiceFactory.getFactory().getFormsService().getAllForms();

    }


    @Override
    public int getCount() {
        return forms.size();
    }

    @Override
    public Object getItem(int position) {
        return forms.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.form_list_view, parent, false);
            holder = new ViewHolder();
            holder.headline = (TextView) convertView.findViewById(R.id.headline);
            holder.date = (TextView) convertView.findViewById(R.id.date);
            holder.tag1 = (TextView) convertView.findViewById(R.id.tag1);
            holder.tag2 = (TextView) convertView.findViewById(R.id.tag2);
            holder.tag3 = (TextView) convertView.findViewById(R.id.tag3);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Form form = (Form) getItem(position);
        holder.date.setText("Last updated: " + form.getLastUpdate());
        holder.headline.setText(form.getTitle());

        holder.tag1.setText(form.getTag1());
        holder.tag2.setText(form.getTag2());
        holder.tag3.setText(form.getTag3());

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView headline, date, tag1, tag2, tag3;



    }
}
