package byteinspace.net.eurexcommunicatordb.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Index;


/**
 * Created by daniel on 18.02.2017.
 */

public class IndexAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private final List<Index> indices;

    public static final String DAX = "DAX";
    public static final String MINIDAX = "MINIDAX";
    public static final String SMI = "SMI";
    public static final String SLI = "SLI";
    public static final String OMX = "OMX";
    public static final String STOXX = "STOXX";
    public static final String SENSEX = "SENSEX";

    public IndexAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        indices = new ArrayList<>();

        indices.add(getNewIndex(DAX, 11435, 11430));
        indices.add(getNewIndex(MINIDAX, 345, 380));
        indices.add(getNewIndex(SMI, 3445, 3440));
        indices.add(getNewIndex(SLI, 9833, 9850));
        indices.add(getNewIndex(OMX, 2345, 2341));
        indices.add(getNewIndex(STOXX, 23, 22));
        indices.add(getNewIndex(SENSEX, 34543, 34503));

    }

    @Override public int getCount() {
        return indices.size();
    }

    @Override public Object getItem(int position) {
        return indices.get(position);
    }

    @Override public long getItemId(int position) {
        return position;
    }

    @Override public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.content_index_ticker, parent, false);
            holder = new ViewHolder();
            holder.index_name = (TextView) convertView.findViewById(R.id.index_name);
            holder.index_value = (TextView) convertView.findViewById(R.id.index_value);
            holder.index_increasedecrease = (TextView) convertView.findViewById(R.id.index_increasedecrease);
            holder.favorite = (ImageView) convertView.findViewById(R.id.favorite);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Index ticker = (Index) getItem(position);
        holder.index_name.setText(ticker.getName());
        holder.index_value.setText(String.valueOf(ticker.getLastRate()));
        holder.index_increasedecrease.setText(String.valueOf(ticker.getIncreaseDecrease()) + " %");

        return convertView;


    }

    private Index getNewIndex(String name, double last_rate, double new_rate) {
        Index dax = new Index(name, last_rate);
        dax.setNewRate(new_rate);
        return dax;
    }
    static class ViewHolder {
        TextView index_name, index_value, index_increasedecrease;
        ImageView favorite;
    }
}
