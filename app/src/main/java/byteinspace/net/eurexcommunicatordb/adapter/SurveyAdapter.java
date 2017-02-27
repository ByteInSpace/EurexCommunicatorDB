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
import byteinspace.net.eurexcommunicatordb.model.Survey;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 27.02.2017.
 */

public class SurveyAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Survey> surveys;


    public SurveyAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        surveys = ServiceFactory.getFactory().getSurveyService().getAllSurveys();

    }


    @Override
    public int getCount() {
        return surveys.size();
    }

    @Override
    public Object getItem(int position) {
        return surveys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.surveys_list_view, parent, false);
            holder = new ViewHolder();
            holder.srv_dueto = (TextView) convertView.findViewById(R.id.srv_dueto);
            holder.srv_subheadline = (TextView) convertView.findViewById(R.id.srv_subheadline);
            holder.srv_date = (TextView) convertView.findViewById(R.id.srv_date);
            holder.srv_headline = (TextView) convertView.findViewById(R.id.srv_headline);
            holder.srv_register = (ImageView) convertView.findViewById(R.id.srv_register);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Survey survey = (Survey) getItem(position);
        holder.srv_date.setText("Event date:");
        holder.srv_subheadline.setText(survey.getSubheadline());
        holder.srv_dueto.setText(survey.getDateDueTo());
        holder.srv_headline.setText(survey.getTitle());

        if (survey.getSurvey_state().equals(Survey.SURVEY_STATE.PENDING)) {
            holder.srv_register.setImageResource(R.drawable.event_available);
        } else if (survey.getSurvey_state().equals(Survey.SURVEY_STATE.EXPIRED)) {
            holder.srv_register.setImageResource(R.drawable.event_full);
        } else
            holder.srv_register.setImageResource(R.drawable.event_registered);


        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView srv_dueto, srv_subheadline, srv_date, srv_headline;
        ImageView srv_register;

    }

}
