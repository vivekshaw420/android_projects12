package com.example.vivek.firebase_service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.Transaction;


public class MainActivity extends AppCompatActivity {
   TextView  vk;
    BlogPost person;
  //Handler m_Runnable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          vk=(TextView)findViewById(R.id.vk);
        Intent sk =new Intent(this,firebase.class);
        startService(sk);
             // m_Runnable =  new R();


                   //  m_Runnable.run();

        SharedPreferences sharedpreferences = getSharedPreferences("reg_details123", Context.MODE_PRIVATE);
        String name1 =  sharedpreferences.getString("mydata","N/A");
        vk.setText(name1);



    }
     Runnable m_Runnable = new Runnable()
    {

        public void run()

        {
            Handler handler =new Handler();
            //.makeText(calling.this,"in runnable",Toast.LENGTH_SHORT).show();

            SharedPreferences sharedpreferences = getSharedPreferences("reg_details123", Context.MODE_PRIVATE);
            String name1 =  sharedpreferences.getString("mydata","N/A");
            //vk.setText(name1);

           // Toast.makeText(MainActivity.this,"i am in thread",Toast.LENGTH_LONG).show();

           handler.postDelayed(m_Runnable,2000);
        }

    };



}
