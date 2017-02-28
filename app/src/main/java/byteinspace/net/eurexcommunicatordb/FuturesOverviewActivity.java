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
        lv = (ListView) findViewById(R.id.futureslist);
        adapter = new FuturesAdapter(this);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showFuture(id);

            }
        });

    }


    private void showFuture(long id) {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, FutureDetailActivity.class);
        intent.putExtra("FUTUREID", id);
        startActivity(intent);
}

    @Override protected int getContentView() {
        return R.layout.activity_futures_overview;
    }
}


