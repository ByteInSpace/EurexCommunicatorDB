package byteinspace.net.eurexcommunicatordb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.ReportAdapter;

public class ReportActivity extends BasePrivateActivity {

    ReportAdapter adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        adapter = new ReportAdapter(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_report);

        lv = (ListView) findViewById(R.id.list_report);
        lv.setAdapter(adapter);

        showToolbar(toolbar);
    }
}
