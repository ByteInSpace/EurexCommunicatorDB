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

public class NewsActivity extends BasePublicActivity {

    NewsAdapter adapter;

    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Toolbar toolbar = (Toolbar) findViewById(R.id.news_toolbar);

        lv = (ListView) findViewById(R.id.newslist);
        adapter = new NewsAdapter(this);
        lv.setAdapter(adapter);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("TEST");
            }
        });


        showToolbar(toolbar);
    }


}
