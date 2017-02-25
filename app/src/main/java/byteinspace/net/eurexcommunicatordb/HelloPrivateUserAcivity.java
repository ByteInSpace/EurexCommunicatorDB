package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

public class HelloPrivateUserAcivity extends BasePrivateActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_private_user_acivity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.welcome_toolbar);
        showToolbar(toolbar);

    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        TextView textview = (TextView) findViewById(R.id.welcome_user);
        textview.setText("Welcome " + user.getName());
        return true;
    }
}
