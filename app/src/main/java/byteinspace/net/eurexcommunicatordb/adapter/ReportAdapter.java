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
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 27.02.2017.
 */

public class ReportAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Report> reports;


    public ReportAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        reports = ServiceFactory.getFactory().getReportService().getAllReports();

    }


    @Override
    public int getCount() {
        return reports.size();
    }

    @Override
    public Object getItem(int position) {
        return reports.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.report_list_view, parent, false);
            holder = new ViewHolder();
            holder.rep_time = (TextView) convertView.findViewById(R.id.rep_time);
            holder.rep_title = (TextView) convertView.findViewById(R.id.rep_title);
              convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Report report = (Report) getItem(position);
        holder.rep_time.setText(report.getExpected_final_date());
        holder.rep_title.setText(report.getTitle());


        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView rep_time, rep_title;


    }
}
