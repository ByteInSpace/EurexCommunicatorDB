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

import byteinspace.net.eurexcommunicatordb.MailingActivity;
import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.Mailing;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 25.02.2017.
 */

public class MailingsAdapter  extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Mailing> mailings;


    public MailingsAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        mailings = ServiceFactory.getFactory().getMailingService().getMailingsOrderByDate();

    }


    @Override
    public int getCount() {
        return mailings.size();
    }

    @Override
    public Object getItem(int position) {
        return mailings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.mailings_list_view, parent, false);
            holder = new ViewHolder();
            holder.mailing_date = (TextView) convertView.findViewById(R.id.mailing_date);
            holder.mailing_text = (TextView) convertView.findViewById(R.id.mailing_text);
            holder.mailing_headline = (TextView) convertView.findViewById(R.id.mailing_headline);
            holder.mailing_favorite = (ImageView) convertView.findViewById(R.id.mailing_favorite);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Mailing mailing = (Mailing) getItem(position);
        holder.mailing_date.setText(mailing.getDatum());
        holder.mailing_headline.setText(mailing.getTitel());
        if (!mailing.isRead()) {
            holder.mailing_headline.setTypeface(null, Typeface.BOLD);
        }
        holder.mailing_text.setText(mailing.getText());
        holder.mailing_favorite.setImageResource(R.drawable.favorite);

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
        TextView mailing_headline, mailing_date, mailing_text;
        ImageView mailing_favorite;


    }
}
