package byteinspace.net.eurexcommunicatordb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.R;
import byteinspace.net.eurexcommunicatordb.model.MenuItem;
import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.AuthenticationService;

/**
 * Created by conta on 01.03.2017.
 */

public class PrivateDrawerAdapter extends BaseAdapter {

    public static Map<Integer, MENU_ITEMS> menuItemsLinks = new HashMap<Integer, MENU_ITEMS>();

    public static enum MENU_ITEMS {MAILING, INVOICE, NOTIFICATION, TRADING, TRADEMASER, SETTINGS, EMERGENCY, EVENT}


    List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private final LayoutInflater inflator;

    public PrivateDrawerAdapter(Context context, User user) {
        inflator = LayoutInflater.from(context);
        menuItems.add(new MenuItem("Notifications", R.drawable.notification_middle));
        menuItemsLinks.put(0, MENU_ITEMS.NOTIFICATION);
        int i = 0;

        if (user.isRightSet(AuthenticationService.RIGHT_MAILING)) {
            menuItems.add(new MenuItem("Mailings", R.drawable.mailing_middle));
            i++;
            menuItemsLinks.put(i, MENU_ITEMS.MAILING);
        }

        if (user.isRightSet(AuthenticationService.RIGHT_INVOICE)) {
            menuItems.add(new MenuItem("Invoices", R.drawable.invoice_middle));
            i++;
            menuItemsLinks.put(i, MENU_ITEMS.INVOICE);
        }

        if (user.isRightSet(AuthenticationService.RIGHT_TRADING)) {
            menuItems.add(new MenuItem("Own order book", R.drawable.trading_middle));
            i++;
            menuItemsLinks.put(i, MENU_ITEMS.TRADING);
        }

        i++;
        menuItemsLinks.put(i, MENU_ITEMS.EMERGENCY);
        menuItems.add(new MenuItem("Emergency Action", R.drawable.emergency_middle));

        if (user.isRightSet(AuthenticationService.RIGHT_EVENT)) {
            menuItems.add(new MenuItem("Events", R.drawable.event_middle));
            i++;
            menuItemsLinks.put(i, MENU_ITEMS.EVENT);
        }

        i++;
        menuItemsLinks.put(i, MENU_ITEMS.TRADEMASER);
        menuItems.add(new MenuItem("TradeMaster", R.drawable.game_big));
        i++;
        menuItemsLinks.put(i, MENU_ITEMS.SETTINGS);
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


