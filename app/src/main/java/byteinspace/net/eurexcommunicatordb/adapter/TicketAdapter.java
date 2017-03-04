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
import byteinspace.net.eurexcommunicatordb.model.Ticket;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 04.03.2017.
 */

public class TicketAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Ticket> tickets;


    public TicketAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        tickets = ServiceFactory.getFactory().getTicketService().getAllTickets();

    }


    @Override
    public int getCount() {
        return tickets.size();
    }

    @Override
    public Object getItem(int position) {
        return tickets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.ticket_list_view, parent, false);
            holder = new ViewHolder();
            holder.date = (TextView) convertView.findViewById(R.id.date);
            holder.headline = (TextView) convertView.findViewById(R.id.headline);
            holder.ticket_state = (ImageView) convertView.findViewById(R.id.ticket_state);
                convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Ticket ticket = (Ticket) getItem(position);
        holder.date.setText(ticket.getCreatedOn());
        holder.headline.setText(ticket.getTitle());

        if (ticket.isFinished()) {
            holder.ticket_state.setImageResource(R.drawable.done);
        } else {
            holder.ticket_state.setImageResource(R.drawable.open);
        }

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView date, headline;
        ImageView ticket_state;


    }
}