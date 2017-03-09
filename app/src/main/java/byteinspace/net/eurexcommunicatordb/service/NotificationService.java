package byteinspace.net.eurexcommunicatordb.service;

import java.util.ArrayList;
import java.util.List;

import byteinspace.net.eurexcommunicatordb.model.Notification;

/**
 * Created by conta on 01.03.2017.
 */

public class NotificationService {

    private List<Notification> notifications = new ArrayList<>();

    public NotificationService() {
        Notification notif1 = new Notification();
        notif1.setLevel(Notification.LEVEL.URGENT);
        notif1.setDate("01/03/17 13:10");
        notif1.setTitle("Crash in T7 partition 8.");
        notif1.setRead(false);
        notifications.add(notif1);

        Notification notif2 = new Notification();
        notif2.setLevel(Notification.LEVEL.MIDDLE);
        notif2.setDate("26/02/17 12:10");
        notif2.setTitle("Price range in FDAX exceeded");
        notif2.setRead(true);
        notifications.add(notif2);

        Notification notif3 = new Notification();
        notif3.setLevel(Notification.LEVEL.URGENT);
        notif3.setDate("24/02/17 13:10");
        notif3.setTitle("Crash in T7 partition 4.");
        notif3.setRead(false);
        notifications.add(notif3);

        Notification notif4 = new Notification();
        notif4.setLevel(Notification.LEVEL.LOW);
        notif4.setDate("21/02/17 13:10");
        notif4.setTitle("Member ABCDE suspended in XEUR");
        notif4.setRead(true);
        notifications.add(notif4);

        Notification notif5 = new Notification();
        notif5.setLevel(Notification.LEVEL.URGENT);
        notif5.setDate("20/02/17 13:10");
        notif5.setTitle("OTR limit for FDAX exceeded");
        notif5.setRead(true);
        notifications.add(notif5);

        Notification notif6 = new Notification();
        notif6.setLevel(Notification.LEVEL.LOW);
        notif6.setDate("19/02/17 13:10");
        notif6.setTitle("Report CA008 delayed");
        notif6.setRead(true);
        notifications.add(notif6);
    }

    public List<Notification> getAllNotifications() {
        return this.notifications;
    }
}
