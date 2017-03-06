package byteinspace.net.eurexcommunicatordb;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NotificationCrashActivity extends BasePrivateActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected int getContentView() {
        return R.layout.activity_notification_crash;
    }


    public void createNotification(View view) {
        System.out.println("Arriving");
        Intent intent = new Intent(this, NotificationReceiverActivity.class);
         PendingIntent pIntent = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 20);

        String title = "EMERGENCY NOTIFICATION";
        String message = "Crash on T7 partition 8!";

        Notification noti = new Notification.Builder(this)
                .setSmallIcon(R.drawable.emergency_middle)
                .setContentTitle(title)
                .setContentText(message)
                .setColor(0x008000)
                .setContentIntent(pIntent)
                .setPriority(Notification.PRIORITY_HIGH)
                .build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        // hide the notification after its selected
        noti.flags |= Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(1234, noti);

             new AlertDialog.Builder(this).setTitle(title).setMessage(message).setIcon(R.drawable.emergency_middle).setNeutralButton("Close", null).setNegativeButton("Delete all orders", null).show();

    }
}
