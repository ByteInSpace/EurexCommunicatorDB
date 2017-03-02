package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Order;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 02.03.2017.
 */

public class OrderBookAdapter  extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Order> orders;


    public OrderBookAdapter(Context context, String product) {
        inflator = LayoutInflater.from(context);
        orders = ServiceFactory.getFactory().getTradingOverviewService().getAllOrdersForProduct(product);
    }


    @Override
    public int getCount() {
        return orders.size();
    }

    @Override
    public Object getItem(int position) {
        return orders.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.trading_list_view, parent, false);

            holder = new ViewHolder();
            holder.orderid = (TextView) convertView.findViewById(R.id.orderid);
            holder.orderqty = (TextView) convertView.findViewById(R.id.orderqty);
            holder.orderprice = (TextView) convertView.findViewById(R.id.orderprice);
            holder.leaveqty = (TextView) convertView.findViewById(R.id.leaveqty);
            holder.lastexecutedqty = (TextView) convertView.findViewById(R.id.lastexecutedqty);
            holder.lastexecutedprice = (TextView) convertView.findViewById(R.id.lastexecutedprice);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Order order = (Order) getItem(position);
        holder.orderid.setText(order.getOrderID());
        holder.orderqty.setText(order.getAmount());
        holder.orderprice.setText(order.getPrice());
        holder.leaveqty.setText(order.getLeaveQty());
        holder.lastexecutedqty.setText(order.getLastExecutedQty());
        holder.lastexecutedprice.setText(order.getLastExecutedPrice());

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView orderid, orderqty, orderprice, leaveqty, lastexecutedqty, lastexecutedprice;


    }

}