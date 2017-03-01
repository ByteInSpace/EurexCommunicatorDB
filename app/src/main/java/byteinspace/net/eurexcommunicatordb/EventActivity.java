package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import byteinspace.net.eurexcommunicatordb.EventRegisterActivity;

import byteinspace.net.eurexcommunicatordb.adapter.EventAdapter;
import byteinspace.net.eurexcommunicatordb.model.Event;
import byteinspace.net.eurexcommunicatordb.model.User;

public class EventActivity extends BasePrivateActivity {

    EventAdapter adapter;


    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new EventAdapter(this);


        lv = (ListView) findViewById(R.id.list_event);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showEventRegistration(id);
            }
        });


    }

    @Override protected int getContentView() {
        return R.layout.activity_event;
    }

    private void showEventRegistration(long id) {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, EventRegisterActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        Event event = (Event) adapter.getItem((int) id);
        intent.putExtra("EVENTID", event.getId());
         startActivity(intent);


    }
}
