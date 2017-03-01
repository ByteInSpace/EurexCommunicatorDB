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

        adapter = new ReportAdapter(this);


        lv = (ListView) findViewById(R.id.list_report);
        lv.setAdapter(adapter);

    }

    @Override protected int getContentView() {
        return R.layout.activity_report;
    }
}
