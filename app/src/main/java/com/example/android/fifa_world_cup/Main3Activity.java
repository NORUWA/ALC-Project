package com.example.android.fifa_world_cup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    Button button;
    static int m =0;
    private ImageView imgSmiley;

    private final int[] SmileyID = {R.drawable.thumbsup};
    private final int[] SmileyID2 = {R.drawable.thumbsdown};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //Add back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Locate the button in activity_main.xml
button =(Button) findViewById(R.id.buttonclick) ;

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent myIntent = new Intent(Main3Activity.this,
                Main4Activity.class);
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
        final CheckBox cupChecked1 =  findViewById(R.id.Germany_cup_checkbox);
        final CheckBox cupChecked2 =  findViewById(R.id.migrant_crisis_checkbox);
        final CheckBox cupChecked3 =  findViewById(R.id.birth_rate_checkbox);
        final CheckBox cupChecked4 =  findViewById(R.id.Crime_incr_checkbox);

        // Find the GUI components.
        this.imgSmiley = (ImageView) findViewById(R.id.imgSmiley);

        Button buttonResult = (Button) findViewById(R.id.CheckAnswer);


        buttonResult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                {

                    switch (View.getId()){
                        case R.id.Germany_cup_checkbox:
                            if (cupChecked1.isChecked())
                                imgSmiley.setImageResource(SmileyID2[m]);

                            else

                                break;
                        case R.id.migrant_crisis_checkbox:
                            if (cupChecked2.isChecked())
                                imgSmiley.setImageResource(SmileyID2[m]);
                            else
                                break;;
                        case R.id.birth_rate_checkbox:
                            if (cupChecked3.isChecked())
                                imgSmiley.setImageResource(SmileyID[m]);
                            else
                                break;
                        case R.id.Crime_incr_checkbox:
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

