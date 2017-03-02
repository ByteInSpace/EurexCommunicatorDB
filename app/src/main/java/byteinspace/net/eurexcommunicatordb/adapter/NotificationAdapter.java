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
import byteinspace.net.eurexcommunicatordb.model.Notification;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by conta on 01.03.2017.
 */

public class NotificationAdapter  extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Notification> notifications;


    public NotificationAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        notifications = ServiceFactory.getFactory().getNotificationService().getAllNotifications();
    }


    @Override
    public int getCount() {
        return notifications.size();
    }

    @Override
    public Object getItem(int position) {
        return notifications.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.notification_list_view, parent, false);

            holder = new ViewHolder();
            holder.date = (TextView) convertView.findViewById(R.id.date);
            holder.title = (TextView) convertView.findViewById(R.id.title);
            holder.level = (ImageView) convertView.findViewById(R.id.level);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Notification notification = (Notification) getItem(position);
        holder.date.setText(notification.getDate());
        holder.title.setText(notification.getTitle());
        if (notification.isRead()) {
            holder.title.setTypeface(Typeface.DEFAULT_BOLD);
        }

        if (notification.getLevel().equals(Notification.LEVEL.URGENT))
            holder.level.setImageResource(R.drawable.urgent);
        else if (notification.getLevel().equals(Notification.LEVEL.MIDDLE))
            holder.level.setImageResource(R.drawable.middle);
        else
            holder.level.setImageResource(R.drawable.low);

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView date, title;
        ImageView level;

    }

}