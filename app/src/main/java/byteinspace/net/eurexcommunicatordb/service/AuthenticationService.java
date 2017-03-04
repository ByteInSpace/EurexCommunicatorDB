package byteinspace.net.eurexcommunicatordb.service;

import java.util.HashMap;
import java.util.Map;

import byteinspace.net.eurexcommunicatordb.model.User;

/**
 * Created by conta on 24.02.2017.
 */

public class AuthenticationService {

    public static final String RIGHT_CIRCULAR = "circular";
    public static final String RIGHT_MAILING = "mailing";
    public static final String RIGHT_SURVEYS = "surveys";
    public static final String RIGHT_CONTACT_TKAM = "contact_tkam";
    public static final String RIGHT_INVOICE = "invoice";
    public static final String RIGHT_EVENT = "event";
    public static final String RIGHT_REPORT = "report";
    public static final String RIGHT_NOTIFY_CUSTOMER = "notifycustomer";
    public static final String RIGHT_TRADING = "trading";
    public static final String RIGHT_TICKET = "ticket";

    private static Map<String, User> users = new HashMap<>();

    protected AuthenticationService() {
        User user = new User();
        user.setRight(RIGHT_CIRCULAR, true);
        user.setRight(RIGHT_MAILING, true);
        user.setRight(RIGHT_SURVEYS, true);
        user.setRight(RIGHT_CONTACT_TKAM, true);
        user.setRight(RIGHT_INVOICE, true);
        user.setRight(RIGHT_REPORT, true);
        user.setRight(RIGHT_TRADING, true);
        user.setRight(RIGHT_EVENT, true);
        user.setRight(RIGHT_TICKET, true);
        user.setName("Daniel");
        user.setVorname("Daniel");
        user.setFamilienname("Ludwig");

        users.put("user", user);

        User tkam = new User();
        tkam.setRight(RIGHT_NOTIFY_CUSTOMER, true);
        tkam.setName("Siegbert");
        tkam.setVorname("Siegbert");
        tkam.setFamilienname("Banane");
        users.put("tkam", tkam);


    }



    public static User getUser(String userid) {
        return users.get(userid);
    }
}
