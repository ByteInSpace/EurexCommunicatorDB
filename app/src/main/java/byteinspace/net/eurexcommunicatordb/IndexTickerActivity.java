package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.IndexAdapter;
import byteinspace.net.eurexcommunicatordb.adapter.EurexIndexAdapter;
import byteinspace.net.eurexcommunicatordb.adapter.FuturesAdapter;
import byteinspace.net.eurexcommunicatordb.model.Index;
import byteinspace.net.eurexcommunicatordb.adapter.OptionsAdapter;

public class IndexTickerActivity extends BasePublicActivity implements AdapterView.OnItemClickListener {

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

        Intent intent = getIntent();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        lv = (ListView) findViewById(R.id.lv);

        showAdapter(intent.getStringExtra(Constants.KEY));

        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setFocusable(false);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                processItemClick(position, id);
            }
        });

        showToolbar(toolbar);


    }

    private void showAdapter(String target) {
        switch (target) {
            case Constants.MAIN:
                lv.setAdapter(eurexIndexAdapter);
                adapter = eurexIndexAdapter;
                return;
            case Constants.FUTURES:
                lv.setAdapter(futuresAdapter);
                adapter = futuresAdapter;
                return;
            case Constants.OPTIONS:
                lv.setAdapter(optionsAdapter);
                adapter = optionsAdapter;
                return;
        }
    }
    private void showLogonScreen() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    private void processItemClick(int position, long id) {
        System.out.println("Position: " + position + " ID " + id);
    }
    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Index index = (Index) adapter.getItem(position);
        System.out.println("Entry: " + index.getName());
    }




}
