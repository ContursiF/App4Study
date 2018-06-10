package dev.contursif.app4study;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
//    TO DO: Esempio deprecato, da provare con Notifiation Channel
    Intent i=new Intent(this,MessageActivity.class);
    PendingIntent pi=PendingIntent.getActivity(this, 0, i, 0);

    NotificationCompat.Builder n  = new NotificationCompat.Builder(this)
        .setContentTitle("Arrivato nuovo messaggio!!")
        .setContentText("Autore: Nicola Rossi")
        .setSmallIcon(android.R.drawable.ic_dialog_email);
//        .setContentIntent(pi);
//        .setAutoCancel(true);

//    NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
//        notificationManager.notify(0, n.build());
}
