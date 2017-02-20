package byteinspace.net.eurexcommunicatordb;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
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
/*
        final ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24dp);
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        */
    }

    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Index index = (Index) adapter.getItem(position);
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_index_ticker, menu);
        return true;
    }
}
