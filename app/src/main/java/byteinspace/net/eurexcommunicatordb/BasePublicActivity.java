package byteinspace.net.eurexcommunicatordb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.NewsAdapter;
import byteinspace.net.eurexcommunicatordb.adapter.PublicDrawerAdapter;
import byteinspace.net.eurexcommunicatordb.model.News;

/**
 * Created by conta on 22.02.2017.
 */

public abstract class BasePublicActivity extends AppCompatActivity {

    private Toolbar toolbar;
    protected ListView drawerList;

    private ActionBarDrawerToggle mDrawerToggle;
    protected DrawerLayout mDrawerLayout;
    protected String mActivityTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        showToolbar();
        drawerList = (ListView)findViewById(R.id.navList);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();

        createDrawer(this);

    }

    protected abstract int getContentView() ;

    protected void createDrawer(Context context) {
        String[] osArray = { "Android", "iOS", "Windows", "OS X", "Linux" };
        drawerList.setAdapter(new PublicDrawerAdapter(context));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setupDrawer();

    }

    protected void showToolbar() {

        setSupportActionBar(toolbar);
/*
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
        });*/
    }

    protected void setupDrawer() {
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
                R.string.drawer_open, R.string.drawer_close) {

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getSupportActionBar().setTitle("mActivityTitle!");
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getSupportActionBar().setTitle(mActivityTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        drawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch ((int) id) {
                    case 0: // Replace it by constants
                        showNews();
                        return;
                    case 1:
                        showPress();
                        return;
                    case 2:
                        showForms();
                        return;
                    case 3:
                        showRules();
                        return;
                    case 4:
                        showIndices(Constants.MAIN);
                        return;
                    case 5:
                        showFutures();
                        return;
                    case 7:
                        showMarginCalculators();
                        return;

                    case 9:
                        showLogon();
                        return;
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        // Activate the navigation drawer toggle
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected void showRules() {
        Intent intent = new Intent(this, RulesRegulationsActivity.class);
        startActivity(intent);
    }
    protected void showPress() {
        Intent intent = new Intent(this, PressActivity.class);
        startActivity(intent);
    }

    protected void showNews() {
        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }

    protected void showForms() {
        Intent intent = new Intent(this, FormsActivity.class);
        startActivity(intent);
    }

    protected void showMarginCalculators() {
        Intent intent = new Intent(this, MarginCalculatorsActivity.class);
        startActivity(intent);
    }
    protected void showIndices(String target) {
        Intent intent = new Intent(this, IndexTickerActivity.class);
        intent.putExtra(Constants.KEY, target);
        startActivity(intent);
    }

    protected void showFutures() {
        Intent intent = new Intent(this, FuturesOverviewActivity.class);
        startActivity(intent);
    }

    protected void showLogon() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    /*
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_public, menu);
        if (menu instanceof MenuBuilder) {
            MenuBuilder m = (MenuBuilder) menu;
            ((MenuBuilder) menu).setOptionalIconsVisible(true);
        }
        return true;
    }*/
}

