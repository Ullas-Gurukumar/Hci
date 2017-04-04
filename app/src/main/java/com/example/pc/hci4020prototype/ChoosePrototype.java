package com.example.pc.hci4020prototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ChoosePrototype extends AppCompatActivity {
//sfs
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_prototype);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
     //   setSupportActionBar(toolbar);

       // FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
       //     @Override
            //public void onClick(View view) {
          //      Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            //            .setAction("Action", null).show();
       //     }
       // });
    }

    public void starGroup(View view){
        Intent intent = new Intent(this, Login.class);
        // intent.putStringArrayListExtra("names",names);
        String temp =        "yes";
        intent.putExtra("yes",temp);
        startActivity(intent);


    }

    public void leaderboardGroup(View view){
        Intent intent = new Intent(this, Login.class);
        // intent.putStringArrayListExtra("names",names);
        String temp =     "no";
        intent.putExtra("yes",temp);
        startActivity(intent);


    }

}
