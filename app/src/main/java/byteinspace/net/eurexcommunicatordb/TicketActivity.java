package byteinspace.net.eurexcommunicatordb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.TicketAdapter;

public class TicketActivity extends BasePrivateActivity {

    TicketAdapter adapter;

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new TicketAdapter(this);


        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);
    }

    @Override protected int getContentView() {
        return R.layout.activity_ticket;
    }
}
