package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.News;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by conta on 22.02.2017.
 */

public class NewsAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<News> news;


    public NewsAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        news = ServiceFactory.getFactory().getNewsService().getAllNewsOrderedByDate();

    }


    @Override
    public int getCount() {
        return news.size();
    }

    @Override
    public Object getItem(int position) {
        return news.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.news_list_view, parent, false);
            holder = new ViewHolder();
            holder.news_date = (TextView) convertView.findViewById(R.id.news_date);
            holder.news_type = (TextView) convertView.findViewById(R.id.news_type);
            holder.news_headline = (TextView) convertView.findViewById(R.id.news_headline);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        News news = (News) getItem(position);
        holder.news_date.setText(news.getDate());
        holder.news_type.setText(news.getAuthor() + " | " + news.getType());
        holder.news_headline.setText(news.getHeadline());

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
        TextView news_date, news_type, news_headline;

    }

}