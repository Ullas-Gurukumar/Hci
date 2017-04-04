package com.example.pc.hci4020prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChooseGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_group);

        final ImageButton button = (ImageButton) findViewById(R.id.imageButton2);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), HomePage.class);
                startActivity(i);
            }
        });

        final ImageButton button2 = (ImageButton) findViewById(R.id.imageButton3);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "Choose Group 1", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton button3 = (ImageButton) findViewById(R.id.imageButton4);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "Choose Group 1", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton button4 = (ImageButton) findViewById(R.id.imageButton5);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "Choose Group 1", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton button5 = (ImageButton) findViewById(R.id.imageButton6);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "Choose Group 1", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        final ImageButton button6 = (ImageButton) findViewById(R.id.imageButton7);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(getApplicationContext(), "Choose Group 1", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
