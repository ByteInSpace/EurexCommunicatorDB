package byteinspace.net.eurexcommunicatordb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BasePublicActivity {

    /**
     * Id to identity READ_CONTACTS permission request.
     */
    private static final int REQUEST_READ_CONTACTS = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button signup = (Button) findViewById(R.id.email_sign_in_button);
        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                logonUser();
            }
        });

    }

    private void logonUser() {
        TextView userIDView = (TextView) findViewById(R.id.logon_user);
        String userID = userIDView.getText().toString();

        User user = ServiceFactory.getFactory().getAuthenticationService().getUser(userID);
        if (user == null) {
            System.out.println("No user found for " + userID);
            return;
        }

        Intent intent = new Intent(this, HelloPrivateUserAcivity.class);
        intent.putExtra("USERID", userID);
        startActivity(intent);

    }

    @Override protected int getContentView() {
        return R.layout.activity_login;
    }
}

