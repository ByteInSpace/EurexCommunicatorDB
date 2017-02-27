package byteinspace.net.eurexcommunicatordb;

import android.app.Service;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import byteinspace.net.eurexcommunicatordb.model.User;
import byteinspace.net.eurexcommunicatordb.service.ServiceFactory;
import byteinspace.net.eurexcommunicatordb.model.Event;

public class EventRegisterActivity extends BasePrivateActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventregister);

        Intent intent = getIntent();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_event_register);

        int eventid = intent.getIntExtra("EVENTID", 0);
        String userid = intent.getStringExtra("USERID");

        System.out.println("EVENT: " + eventid);


        Event event = ServiceFactory.getFactory().getEventService().getEventByID(eventid);
        User eventuser = ServiceFactory.getFactory().getAuthenticationService().getUser(userid);

        final TextView eventname = (TextView) findViewById(R.id.evr_name);
        eventname.setText(event.getTitle());

        final TextView eventdate = (TextView) findViewById(R.id.evr_datum);
        eventdate.setText(event.getDatum());

        final TextView eventort = (TextView) findViewById(R.id.evr_ort);
        eventort.setText(event.getPlace());

        final TextView vorname = (TextView) findViewById(R.id.evr_uservorname);
        vorname.setText(eventuser.getVorname());

        final TextView nachname = (TextView) findViewById(R.id.evr_nachname);
        nachname.setText(eventuser.getFamilienname());
        showToolbar(toolbar);
    }
}
