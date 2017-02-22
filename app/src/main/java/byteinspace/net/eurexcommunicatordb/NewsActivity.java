package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.NewsAdapter;
import byteinspace.net.eurexcommunicatordb.model.News;

public class NewsActivity extends AppCompatActivity {

    NewsAdapter adapter;
    Toolbar toolbar;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        adapter = new NewsAdapter(this);

        toolbar = (Toolbar) findViewById(R.id.news_toolbar);
        setSupportActionBar(toolbar);

        lv = (ListView) findViewById(R.id.newslist);
        lv.setAdapter(adapter);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        lv.setFocusable(false);

    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_public, menu);
        return true;
    }


}
