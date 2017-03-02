package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.MenuItem;
import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.AuthenticationService;

/**
 * Created by conta on 01.03.2017.
 */

public class PrivateDrawerAdapter extends BaseAdapter {

    List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private final LayoutInflater inflator;

    public PrivateDrawerAdapter(Context context, User user) {
        inflator = LayoutInflater.from(context);
        menuItems.add(new MenuItem("Notifications", R.drawable.notification_middle));

        if (user.isRightSet(AuthenticationService.RIGHT_MAILING))
            menuItems.add(new MenuItem("Mailings", R.drawable.mailing_middle));

        if (user.isRightSet(AuthenticationService.RIGHT_INVOICE))
            menuItems.add(new MenuItem("Invoices", R.drawable.invoice_middle));

        menuItems.add(new MenuItem("TradeMaster", R.drawable.game_big));
        menuItems.add(new MenuItem("Settings", R.drawable.settings_big));
    }

    @Override
    public int getCount() {
        return menuItems.size();
    }

    @Override
    public Object getItem(int position) {
        return menuItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = inflator.inflate(R.layout.drawer_private_list_view, parent, false);
            holder = new ViewHolder();
            holder.caption = (TextView) convertView.findViewById(R.id.caption);
            holder.menuicon = (ImageView) convertView.findViewById(R.id.menuicon);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Context context = parent.getContext();
        MenuItem menuItem = (MenuItem) getItem(position);
        holder.caption.setText(menuItem.getCaption());
        holder.menuicon.setImageResource(menuItem.getMenuicon());

        convertView.setFocusable(false);

        return convertView;


    }

    static class ViewHolder {
        TextView caption;
        ImageView menuicon;

    }
}


