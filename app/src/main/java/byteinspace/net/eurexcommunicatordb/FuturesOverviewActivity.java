package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import byteinspace.net.eurexcommunicatordb.adapter.FuturesAdapter;

public class FuturesOverviewActivity  extends BasePublicActivity {

    FuturesAdapter adapter;

    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futures_overview);
        Toolbar toolbar = (Toolbar) findViewById(R.id.futuresover_toolbar);
        lv = (ListView) findViewById(R.id.futureslist);
        adapter = new FuturesAdapter(this);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FuturesOverviewActivity.this, "You Clicked ", Toast.LENGTH_SHORT).show();

            }
        });
        showToolbar(toolbar);
    }

}


