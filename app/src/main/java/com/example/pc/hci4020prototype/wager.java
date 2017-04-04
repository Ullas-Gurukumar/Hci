package com.example.pc.hci4020prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;

public class wager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
setTitle("");
        setContentView(R.layout.activity_wager);
    //    Intent i = getIntent();
//      ArrayList x = i.getStringArrayListExtra("names");
  //      System.out.println(x.toString());
    }

    public void back(View view){

        Intent i = new Intent(this,Group_Page.class);
        startActivity(i);
    }
    public void toLeaderBoard(View view){
        Intent i = new Intent(this,LeaderBoard.class);
        String temp =         getIntent().getStringExtra("yes");
        i.putExtra("yes",temp);
        startActivity(i);

    }

}
