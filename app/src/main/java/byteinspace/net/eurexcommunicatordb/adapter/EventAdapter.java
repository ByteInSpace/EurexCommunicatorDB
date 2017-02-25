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
import byteinspace.net.eurexcommunicatordb.model.Event;
import byteinspace.net.eurexcommunicatordb.service.EventService;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 25.02.2017.
 */

public class EventAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Event> events;


    public EventAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        events = ServiceFactory.getFactory().getEventService().getAllEvents();

    }


    @Override
    public int getCount() {
        return events.size();
    }

    @Override
    public Object getItem(int position) {
        return events.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.events_list_view, parent, false);
            holder = new ViewHolder();
            holder.event_date_headline = (TextView) convertView.findViewById(R.id.event_date_headline);
            holder.event_coordinations = (TextView) convertView.findViewById(R.id.event_coordinations);
            holder.event_date = (TextView) convertView.findViewById(R.id.event_date);
            holder.event_headline = (TextView) convertView.findViewById(R.id.event_headline);
            holder.events_register = (ImageView) convertView.findViewById(R.id.events_register);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Event event = (Event) getItem(position);
        holder.event_date_headline.setText("Event date:");
        holder.event_coordinations.setText(event.getPlace() + "|" + event.getArea());
        holder.event_date.setText(event.getDatum());
        holder.event_headline.setText(event.getTitle());

        if (event.getAvailability().equals(EventService.EVENT_AVAILABILITY.AVAILABLE)) {
            holder.events_register.setImageResource(R.drawable.event_available);
        } else if (event.getAvailability().equals(EventService.EVENT_AVAILABILITY.FULL)) {
            holder.events_register.setImageResource(R.drawable.event_full);
        } else
            holder.events_register.setImageResource(R.drawable.event_registered);


        convertView.setFocusable(false);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Hier bin ich");
            }
        });
        return convertView;


    }

    static class ViewHolder {
        TextView event_date_headline, event_coordinations, event_date, event_headline;
        ImageView events_register;

    }

}
