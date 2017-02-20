package byteinspace.net.eurexcommunicatordb;

import android.app.ListActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.IndexAdapter;
import byteinspace.net.eurexcommunicatordb.model.Index;

public class IndexTickerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private IndexAdapter adapter;
    private Toolbar toolbar;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_ticker);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv = (ListView) findViewById(R.id.lv);
        setSupportActionBar(toolbar);

        adapter = new IndexAdapter(this);
        lv.setAdapter(adapter);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {


            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_index_eurex:
                        System.out.println("Index Eurex");
                        return true;
                    case R.id.action_index_futures:
                        System.out.println("Index Futures");
                        return true;
                    case R.id.action_index_options:
                        System.out.println("Index Options");
                        return true;
                }
                return false;
            }
        });
    }

    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Index index = (Index) adapter.getItem(position);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_index_ticker, menu);
        return true;
    }
}
