package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.AuthenticationService;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * Created by conta on 24.02.2017.
 */

public class BasePrivateActivity extends AppCompatActivity {

    private Toolbar toolbar;
    protected User user;


    protected void showToolbar(Toolbar toolbar) {

        this.toolbar = toolbar;

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

                }
                return false;
            }
        });
    }


    private void showCirculars() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, CircularsActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showMailings() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, MailingActivity.class);
        intent.putExtra("USERID", intentReceived.getStringExtra("USERID"));
        startActivity(intent);
    }

    private void showEvents() {
        Intent intentReceived = getIntent();
        Intent intent = new Intent(this, EventActivity.class);
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

    @Override public boolean onCreateOptionsMenu(Menu menu){
        setUpUser();
        getMenuInflater().inflate(R.menu.menu_private, menu);
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
}

