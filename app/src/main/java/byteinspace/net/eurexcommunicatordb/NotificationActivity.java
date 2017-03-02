package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.NotificationAdapter;

public class NotificationActivity extends BasePrivateActivity {

    NotificationAdapter adapter;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lv = (ListView) findViewById(R.id.newslist);
        adapter = new NotificationAdapter(this);
        lv.setAdapter(adapter);



    }

    protected int getContentView() {
        return R.layout.activity_notification;
    }
}
