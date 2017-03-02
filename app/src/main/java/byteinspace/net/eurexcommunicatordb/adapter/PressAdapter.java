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
import byteinspace.net.eurexcommunicatordb.model.Press;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 02.03.2017.
 */

public class PressAdapter  extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Press> press;


    public PressAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        press = ServiceFactory.getFactory().getPressService().getAllPressOrderedByDate();
    }


    @Override
    public int getCount() {
        return press.size();
    }

    @Override
    public Object getItem(int position) {
        return press.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.press_list_view, parent, false);

            holder = new ViewHolder();
            holder.date = (TextView) convertView.findViewById(R.id.date);
            holder.headline = (TextView) convertView.findViewById(R.id.headline);
            holder.autor = (TextView) convertView.findViewById(R.id.autor);
             holder.headimage = (ImageView) convertView.findViewById(R.id.headimage);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Press press = (Press) getItem(position);
        holder.date.setText(press.getDate());
        holder.headline.setText(press.getTitle());
        holder.autor.setText(press.getAuthor());
        holder.headimage.setImageResource(press.getImage());

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView date, headline, autor;
        ImageView headimage;

    }

}