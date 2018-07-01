package com.example.android.fifa_world_cup;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {


    Button button;
static int m =0;
    private ImageView imgSmiley;

    private final int[] SmileyID = {R.drawable.thumbsup};
    private final int[] SmileyID2 = {R.drawable.thumbsdown};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Locate the button in activity_main.xml
       button = (Button) findViewById(R.id.buttonclick);


        // Capture button clicks
             button.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View arg0) {

                        // Start NewActivity.class
                        Intent myIntent = new Intent(Main2Activity.this,
                                Main3Activity.class);
                        startActivity(myIntent);
                    }
               });
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id =item.getItemId();
        if(id== android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
}



public  void onCheckboxClicked(final View View){
    // Is the view now checked?
  final CheckBox cupChecked1 =  findViewById(R.id.stanley_cup_checkbox);
  final CheckBox cupChecked2 =  findViewById(R.id.vince_cup_checkbox);
  final CheckBox cupChecked3 =  findViewById(R.id.Rimet_cup_checkbox);
  final CheckBox cupChecked4 =  findViewById(R.id.warren_cup_checkbox);

  // Find the GUI components.
    this.imgSmiley = (ImageView) findViewById(R.id.imgSmiley);

Button buttonResult = (Button) findViewById(R.id.CheckAnswer);


buttonResult.setOnClickListener(new View.OnClickListener() {
    public void onClick(View arg0) {
        {

            switch (View.getId()){
                case R.id.stanley_cup_checkbox:
                if (cupChecked1.isChecked())
                    imgSmiley.setImageResource(SmileyID2[m]);

else

break;
                case R.id.vince_cup_checkbox:
                    if (cupChecked2.isChecked())
                        imgSmiley.setImageResource(SmileyID2[m]);
else
    break;;
                case R.id.Rimet_cup_checkbox:
                    if (cupChecked3.isChecked())
                        imgSmiley.setImageResource(SmileyID[m]);
                    else
                        break;
                case R.id.warren_cup_checkbox:
            if (cupChecked4.isChecked())
                imgSmiley.setImageResource(SmileyID2[m]);
                else
                    break;

            }

        }
    }
                                });
}
}

