package byteinspace.net.eurexcommunicatordb.adapter;

import android.graphics.Color;
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

public abstract class IndexAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    protected final List<Index> indices;



    public IndexAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        indices = new ArrayList<>();

        addIndices();
        // andere folgen

    }

    protected abstract void addIndices();

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
            convertView = inflator.inflate(R.layout.index_list_view, parent, false);
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
        double changeRate = ticker.getIncreaseDecrease();
        holder.index_increasedecrease.setText(String.valueOf(changeRate) + " %");
        if (changeRate >= 0)
            holder.index_increasedecrease.setTextColor(Color.GREEN);
        else
            holder.index_increasedecrease.setTextColor(Color.RED);

        convertView.setFocusable(false);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hier bin ich");
            }
        });
        return convertView;


    }

    protected Index getNewIndex(String name, double last_rate, double new_rate) {
        Index dax = new Index(name, last_rate);
        dax.setNewRate(new_rate);
        return dax;
    }
    static class ViewHolder {
        TextView index_name, index_value, index_increasedecrease;
        ImageView favorite;
    }
}
