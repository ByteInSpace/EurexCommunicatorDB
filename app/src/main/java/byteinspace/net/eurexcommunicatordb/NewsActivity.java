package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import byteinspace.net.eurexcommunicatordb.adapter.NewsAdapter;
import byteinspace.net.eurexcommunicatordb.model.News;

public class NewsActivity extends BasePublicActivity implements AdapterView.OnItemClickListener{

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


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(NewsActivity.this, "You Clicked ", Toast.LENGTH_SHORT).show();
                News news = (News) adapter.getItem(position);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(news.getUrl()));
                startActivity(i);
            }
        });
        showToolbar(toolbar);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(NewsActivity.this, "You Clicked ", Toast.LENGTH_SHORT).show();
    }
}
