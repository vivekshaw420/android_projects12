package com.example.vivek.firebase_service;

import android.app.Fragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.firebase.client.core.view.View;

/**
 * Created by vivek on 7/22/2016.
 */
public class firebase   extends Service {
    static  int  n =2;
    NotificationManager mNotificationManager;
    NotificationCompat.Builder builder;
     int notification_check = 0 ;
  BlogPost person;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {





        /*Firebase.setAndroidContext(this);
        Toast.makeText(this,"servive started create ",Toast.LENGTH_LONG).show();
        Firebase mRef;
        mRef = new Firebase("https://my-check-project.firebaseio.com/batterynotifi");
        Log.d("firebaseobject", mRef.toString());

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {


                    person = postSnapshot.getValue(BlogPost.class);
                    Log.d("vivek1", postSnapshot.toString());


                }
                 String data = person.getBattery().toString().trim();
                //Toast.makeText(this," ",Toast.LENGTH_LONG).show();
                SharedPreferences sharedpreferences = getSharedPreferences("reg_details123", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("mydata",data );
                editor.putInt("n",n);
                editor.commit();
                SharedPreferences sharedpreferences1 = getSharedPreferences("reg_details123", Context.MODE_PRIVATE);
                String name1 =  sharedpreferences1.getString("mydata","n/a");
                int  n4= sharedpreferences1.getInt("n",0);
                //String data = person.getBattery().toString().trim();

                if (n != notification_check)
                {   notification_check = n;
                    if (data.equals("11%")) {
                        sendNotification(data, "welcome");
                    }
                }

                Log.d("mydata", person.getBattery());
               // SharedPreferences sharedpreferences1 = getSharedPreferences("reg_details123", Context.MODE_PRIVATE);
                //String name1 =  sharedpreferences1.getString("mydata","n/a");
                //vk.setText(person.getBattery());

                Toast.makeText(firebase.this,name1,Toast.LENGTH_LONG).show();
                LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                android.view.View vi = inflater.inflate(R.layout.activity_main, null); //log.xml is your file.
                TextView tv = (TextView)vi.findViewById(R.id.vk);

                //System.out.println("Textview= "+tv);
                tv.setText(person.getBattery());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });*/

    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        Firebase.setAndroidContext(this);
        Toast.makeText(this,"servive started create ",Toast.LENGTH_LONG).show();
        Firebase device1,device2,device3,device4;
        device1 = new Firebase("https://my-check-project.firebaseio.com/device1");
        device2 = new Firebase("https://my-check-project.firebaseio.com/device2");
        device3 = new Firebase("https://my-check-project.firebaseio.com/device3");
        device4 = new Firebase("https://my-check-project.firebaseio.com/device4");

       // Log.d("firebaseobject", mRef.toString());

        device1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {


                    person = postSnapshot.getValue(BlogPost.class);
                    Log.d("vivek1", postSnapshot.toString());


                }
                String battery_charge = person.getBattery().toString().trim();
                String devise_off =person.getDevice_on_off().toString().trim();

                 int i =1;
                if (i != 0)
                {   i = 0;
                    if (battery_charge.equals("10%")) {
                        sendNotification(battery_charge, "Device1 Battery");
                    }

                }
                int j=1;
                if ( j != 0)
                {   j = 0;
                    if (devise_off.equals("OFF")) {
                        sendNotification(devise_off, "Device1 Running Status");
                    }

                }



            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });



        device2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {


                    person = postSnapshot.getValue(BlogPost.class);
                    Log.d("vivek1", postSnapshot.toString());


                }
                String battery_charge = person.getDevice_on_off().toString().trim();
                String devise_off =person.getDevice_on_off().toString().trim();
                int i =1;
                if (i != 0)
                {   i = 0;
                    if (battery_charge.equals("10%")) {
                        sendNotification(battery_charge, "Device2 Battery");
                    }
                }

                int j=1;
                if ( j != 0)
                {   j = 0;
                    if (devise_off.equals("OFF")) {
                        sendNotification(devise_off, "Device2 Running Status ");
                    }

                }



            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });


        device3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {


                    person = postSnapshot.getValue(BlogPost.class);
                    Log.d("vivek1", postSnapshot.toString());


                }
                String battery_charge = person.getBattery().toString().trim();
                String devise_off =person.getDevice_on_off().toString().trim();

                int i =1;
                if (i != 0)
                {   i = 0;
                    if (battery_charge.equals("10%")) {
                        sendNotification(battery_charge, "Device3 Battery ");
                    }

                }
                int j=1;
                if ( j != 0)
                {   j = 0;
                    if (devise_off.equals("OFF")) {
                        sendNotification(devise_off, "Device3 Running Status");
                    }

                }



            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });




        device4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {


                    person = postSnapshot.getValue(BlogPost.class);
                    Log.d("vivek1", postSnapshot.toString());


                }
                String battery_charge = person.getBattery().toString().trim();
                String devise_off =person.getDevice_on_off().toString().trim();

                int i =1;
                if (i != 0)
                {   i = 0;
                    if (battery_charge.equals("10%")) {
                        sendNotification(battery_charge, "Device4 Battery");
                    }

                }
                int j=1;
                if ( j != 0)
                {   j = 0;
                    if (devise_off.equals("OFF")) {
                        sendNotification(devise_off, "Device4 Running Status ");
                    }

                }



            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });



        return 0;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    private void sendNotification(String msg,String MSG) {

        SharedPreferences sharedpreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor1 = sharedpreferences.edit();
        editor1.putInt("notifi",n );
        editor1.commit();

        SharedPreferences sharedpreferences1 = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        // SharedPreferences.Editor editor12 = sharedpreferences.edit();
        int n123 =  sharedpreferences1.getInt("notifi",0);
        int  NOTIFICATION_ID = n123;
        // Toast.makeText(GcmIntentService.this,NOTIFICATION_ID, Toast.LENGTH_SHORT).show();
        n =n +2;

        Uri soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Vibrator v = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milliseconds
        v.vibrate(5000);

        mNotificationManager = (NotificationManager)
                this.getSystemService(Context.NOTIFICATION_SERVICE);

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
                new Intent(this, firebase.class), 0);
        //  Notification no = new Notification.Builder(this);
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this).setSmallIcon(R.drawable.viv)
                .setContentTitle(MSG)
                .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText(msg))
                //  .setAutoCancel(true)
                .setContentText(msg)
                .setSound(soundUri);

        mBuilder.setContentIntent(contentIntent);
        mNotificationManager.notify(NOTIFICATION_ID, mBuilder.build());


        SharedPreferences sharedpreferences2 = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor2 = sharedpreferences.edit();
        editor2.putInt("notifi",n );
        editor2.commit();
    }
}
