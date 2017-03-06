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
import byteinspace.net.eurexcommunicatordb.model.Rule;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by daniel on 04.03.2017.
 */

public class RuleAdapter extends BaseAdapter {

    private final LayoutInflater inflator;
    private List<Rule> rules;


    public RuleAdapter(Context context) {
        inflator = LayoutInflater.from(context);
        rules = ServiceFactory.getFactory().getRulesService().getAllRules();

    }


    @Override
    public int getCount() {
        return rules.size();
    }

    @Override
    public Object getItem(int position) {
        return rules.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.rules_list_view, parent, false);
            holder = new ViewHolder();
            holder.rule = (TextView) convertView.findViewById(R.id.rule);
            holder.rule_image = (ImageView) convertView.findViewById(R.id.rule_image);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        Rule rule = (Rule) getItem(position);
        if (rule.getTitle() != null)
            holder.rule.setText(rule.getTitle());
        else
            holder.rule.setText("Banane");

        holder.rule_image.setImageResource(R.drawable.eurex);
        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView rule;
        ImageView rule_image;



    }
}
