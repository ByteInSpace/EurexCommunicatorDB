package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;

import byteinspace.net.eurexcommunicatordb.model.Future;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by conta on 22.02.2017.
 */

public class FuturesAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Future> futures;


    public FuturesAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        futures = ServiceFactory.getFactory().getFuturesService().getFutures();
    }


    @Override
    public int getCount() {
        return futures.size();
    }

    @Override
    public Object getItem(int position) {
        return futures.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.futuresoverview_list_view, parent, false);

            holder = new ViewHolder();
            holder.futures_name = (TextView) convertView.findViewById(R.id.futures_name);
            holder.futures_intervall = (TextView) convertView.findViewById(R.id.futures_intervall);
            holder.future_price = (TextView) convertView.findViewById(R.id.future_price);
            holder.future_rate = (TextView) convertView.findViewById(R.id.future_rate);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Future future = (Future) getItem(position);
        holder.futures_name.setText(future.getName());
        holder.futures_intervall.setText(future.getIntervall());
        holder.future_price.setText(future.getPrice());
        holder.future_rate.setText(future.getChange() + " %");
        if (Float.valueOf(future.getChange()) >= 0) {
            //holder.future_rate.setTextColor(Color.GREEN);
            holder.future_rate.setBackgroundColor(Color.GREEN);
        } else {
            //holder.future_rate.setTextColor(Color.RED);
            holder.future_rate.setBackgroundColor(Color.RED);
        }

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView futures_name, futures_intervall, future_price, future_rate;


    }

}