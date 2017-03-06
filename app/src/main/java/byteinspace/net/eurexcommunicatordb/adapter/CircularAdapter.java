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
import byteinspace.net.eurexcommunicatordb.model.Circular;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 06.03.2017.
 */

public class CircularAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Circular> circulars;


    public CircularAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        circulars = ServiceFactory.getFactory().getCircularsService().getCirculars();

    }


    @Override
    public int getCount() {
        return circulars.size();
    }

    @Override
    public Object getItem(int position) {
        return circulars.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.circular_list_vew, parent, false);
            holder = new ViewHolder();
            holder.circular_headline = (TextView) convertView.findViewById(R.id.circular_headline);
            holder.circular_date = (TextView) convertView.findViewById(R.id.circular_date);
            holder.circular_number = (TextView) convertView.findViewById(R.id.circular_number);
            holder.circular_favorite = (ImageView) convertView.findViewById(R.id.circular_favorite);
            holder.circular_image = (ImageView) convertView.findViewById(R.id.circular_image);
            holder.tag1 = (TextView) convertView.findViewById(R.id.tag1);
            holder.tag2 = (TextView) convertView.findViewById(R.id.tag2);
            holder.tag3 = (TextView) convertView.findViewById(R.id.tag3);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Circular circular = (Circular) getItem(position);
        holder.circular_date.setText(circular.getReleaseDate());
        holder.circular_headline.setText(circular.getTitle());

        holder.circular_number.setText(circular.getNumber());
        if (circular.isFav()) {
            holder.circular_favorite.setImageResource(R.drawable.fav);
        } else {
            holder.circular_favorite.setImageResource(R.drawable.no_fav);
        }
        holder.tag1.setText(circular.getTag1());
        holder.tag2.setText(circular.getTag2());
        holder.tag3.setText(circular.getTag3());
        holder.circular_image.setImageResource(circular.getImage());

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView circular_headline, circular_date, circular_number, tag1, tag2, tag3;
        ImageView circular_image, circular_favorite;


    }
}