package byteinspace.net.eurexcommunicatordb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import byteinspace.net.eurexcommunicatordb.adapter.PrivateDrawerAdapter;
import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by conta on 24.02.2017.
 */

public abstract class BasePrivateActivity extends AppCompatActivity {

    protected User user;

    private Toolbar toolbar;
    protected ListView drawerList;

    private ActionBarDrawerToggle mDrawerToggle;
    protected DrawerLayout mDrawerLayout;
    protected String mActivityTitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        setUpUser();
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        showToolbar();
        drawerList = (ListView)findViewById(R.id.navList);
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mActivityTitle = getTitle().toString();

        createDrawer(this);

    }

    protected abstract int getContentView() ;

    protected void createDrawer(Context context) {
        drawerList.setAdapter(new PrivateDrawerAdapter(context, user));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setupDrawer();

    }
    protected void showToolbar() {

        setSupportActionBar(toolbar);
        //this.toolbar = toolbar;
/*
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {


            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_circulars:
                        showCirculars();
                        return true;
                    case R.id.menu_mailings:
                        showMailings();
                        return true;
                    case R.id.menu_events:
                        showEvents();
                        return true;
                    case R.id.menu_surverys:
                        showSurveys();
                        return true;
                    case R.id.menu_invoices:
                        showInvoices();
                        return true;
                    case R.id.menu_report_state:
                        showReports();
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
                        showCirculars();
                        return;
                    case 1:
                        showEvents();
                        return;
                    case 2:
                        showMailing();
                        return;
                    case 3: // Replace it by constants
                        showNotification();
                        return;
                    case 4:
                        showSurveys();
                        return;
                    case 5:
                        showInvoices();
                        return;
                    case 6:
                        showOrderBook();
                        return;
                    case 7:
                        showReports();
                        return;
                    case 8:
                        showTicket();
                        return;
                    case 9:
                        showContactTkam();
                        return;
                    case 10:
                        showEmergency();
                        return;

                    case 13:
                        showNotificationExample();
                        return;
                }
            }
        });
    }

    private void showNotificationExample() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, NotificationCrashActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showCirculars() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, CircularsActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }


    private void showTicket() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, TicketActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showContactTkam() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, ContactTKAMActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }
    private void showEmergency() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, EmergencyActionActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showOrderBook() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, TradingOverviewActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showNotification() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, NotificationActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showMailing() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, MailingActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showMailings() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, MailingActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showInvoices() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, InvoicesActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showReports() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, ReportActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showEvents() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, EventActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showSurveys() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, SurveysActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
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

    private void showLogon() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    protected void setUpUser() {
        Intent intent = getIntent();
        user = ServiceFactory.getFactory().getAuthenticationService().getUser(intent.getStringExtra("USERID"));
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

    /*
    @Override public boolean onCreateOptionsMenu(Menu menu){
        setUpUser();
        getMenuInflater().inflate(R.menu.menu_private, menu);
        if (menu instanceof MenuBuilder) {
            MenuBuilder m = (MenuBuilder) menu;
            ((MenuBuilder) menu).setOptionalIconsVisible(true);
        }
        if (!user.isRightSet(AuthenticationService.RIGHT_NOTIFY_CUSTOMER)) {
            MenuItem item = menu.findItem(R.id.menu_notify_customer);
            item.setVisible(false);
        }

        if (!user.isRightSet(AuthenticationService.RIGHT_CIRCULAR)) {
            MenuItem item = menu.findItem(R.id.menu_circulars);
            item.setVisible(false);
        }
        if (!user.isRightSet(AuthenticationService.RIGHT_MAILING)) {
            MenuItem item = menu.findItem(R.id.menu_mailings);
            item.setVisible(false);
        }
        if (!user.isRightSet(AuthenticationService.RIGHT_SURVEYS)) {
            MenuItem item = menu.findItem(R.id.menu_surverys);
            item.setVisible(false);
        }
        if (!user.isRightSet(AuthenticationService.RIGHT_CONTACT_TKAM)) {
            MenuItem item = menu.findItem(R.id.menu_tkam);
            item.setVisible(false);
        }
        if (!user.isRightSet(AuthenticationService.RIGHT_REPORT)) {
            MenuItem item = menu.findItem(R.id.menu_report_state);
            item.setVisible(false);
        }
        if (!user.isRightSet(AuthenticationService.RIGHT_INVOICE)) {
            MenuItem item = menu.findItem(R.id.menu_invoices);
            item.setVisible(false);
        }
        return true;
    }
    */
}

