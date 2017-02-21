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
import byteinspace.net.eurexcommunicatordb.model.EurexIndexAdapter;
import byteinspace.net.eurexcommunicatordb.model.FuturesAdapter;
import byteinspace.net.eurexcommunicatordb.model.Index;
import byteinspace.net.eurexcommunicatordb.model.OptionsAdapter;

public class IndexTickerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private Toolbar toolbar;
    private ListView lv;
    private IndexAdapter eurexIndexAdapter;
    private IndexAdapter futuresAdapter;
    private IndexAdapter adapter;
    private IndexAdapter optionsAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_ticker);

        eurexIndexAdapter = new EurexIndexAdapter(this);
        futuresAdapter = new FuturesAdapter(this);
        optionsAdapter = new OptionsAdapter(this);

        adapter = eurexIndexAdapter;

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv = (ListView) findViewById(R.id.lv);
        setSupportActionBar(toolbar);

        lv.setAdapter(eurexIndexAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                processItemClick(position, id);
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {


            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_index_eurex:
                        adapter = eurexIndexAdapter;
                        lv.setAdapter(eurexIndexAdapter);
                        return true;
                    case R.id.action_index_futures:
                        adapter = futuresAdapter;
                        lv.setAdapter(futuresAdapter);
                        return true;
                    case R.id.action_index_options:
                        adapter = optionsAdapter;
                        lv.setAdapter(optionsAdapter);
                        return true;
                }
                return false;
            }
        });
    }

    private void processItemClick(int position, long id) {
        System.out.println("Position: " + position + " ID " + id);
    }
    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Index index = (Index) adapter.getItem(position);
        System.out.println("Entry: " + index.getName());
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_index_ticker, menu);
        return true;
    }
}
