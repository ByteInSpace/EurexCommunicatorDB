package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by conta on 22.02.2017.
 */

public abstract class BasePublicActivity extends AppCompatActivity {

    private Toolbar toolbar;
    protected void showToolbar(Toolbar toolbar) {

        this.toolbar = toolbar;

        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {


            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.news:
                        showNews();
                        return true;
                    case R.id.eurexclearinglogon:
                        showLogon();
                        return true;
                    case R.id.eurexlogon:
                        showLogon();
                        return true;
                    case R.id.xetralogon:
                        showLogon();
                        return true;
                    case R.id.mainindices:
                        showIndices(Constants.MAIN);
                        return true;
                    case R.id.futures:
                        showFutures();
                        return true;
                    case R.id.options:
                        showIndices(Constants.OPTIONS);
                        return true;
                }
                return false;
            }
        });
    }


    private void showNews() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }
    private void showIndices(String target) {
        Intent intent = new Intent(this, IndexTickerActivity.class);
        intent.putExtra(Constants.KEY, target);
        startActivity(intent);
    }

    private void showFutures() {
        Intent intent = new Intent(this, FuturesOverviewActivity.class);
        startActivity(intent);
    }

    private void showLogon() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_public, menu);
        return true;
    }
}

