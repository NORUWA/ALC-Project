package com.example.android.fifa_world_cup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

  Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


// Locate the button in activity_main.xml
        LinearLayout rlayout = (LinearLayout) findViewById(R.id.mainlayout);

        /* Capture button clicks */
         rlayout.setOnClickListener(new View.OnClickListener() {
           public void onClick(View arg0) {

          // Start NewActivity.class
             Intent myIntent = new Intent(MainActivity.this,
                   Main2Activity.class);
         startActivity(myIntent);
         }
         });




    }
}
