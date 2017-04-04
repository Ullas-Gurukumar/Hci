package com.example.pc.hci4020prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.visible;
import static android.R.attr.x;
import static com.example.pc.hci4020prototype.R.id.fifthStar;
import static com.example.pc.hci4020prototype.R.id.fourthStar;
import static com.example.pc.hci4020prototype.R.id.meStar;
import static com.example.pc.hci4020prototype.R.id.secondStar;
import static com.example.pc.hci4020prototype.R.id.textView10;
import static com.example.pc.hci4020prototype.R.id.thirdStar;

public class LeaderBoard extends AppCompatActivity {
   // static ArrayList<String> detailedStarValues;
    static String starOne;
    static String starTwo;
    static String star3;
    static String star4;
    static String star5;

    static boolean star2 = false;
    static boolean answer = false;
    static boolean third = false;
    static boolean fourth = false;
    static boolean fifth = false;
static int tempps = 0;
    @Override
    public void onBackPressed() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if(tempps == 0){
        setTitle(  getIntent().getStringExtra("yes"));}

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board);
        ImageView x = (ImageView) findViewById(meStar);
        ImageView y = (ImageView) findViewById(secondStar);
        ImageView thirdstar = (ImageView) findViewById(thirdStar);
        ImageView  fourthstar = (ImageView) findViewById(fourthStar);
        ImageView fifthstar = (ImageView) findViewById(fifthStar);

        if(answer == true){
x.setVisibility(View.VISIBLE);
        }
        if (star2 == true){
            y.setVisibility(View.VISIBLE);
            x.setVisibility(View.VISIBLE);

        }
        if (third == true) {
            y.setVisibility(View.VISIBLE);
            x.setVisibility(View.VISIBLE);
thirdstar.setVisibility(View.VISIBLE);
        }
        if (fourth == true) {
            y.setVisibility(View.VISIBLE);
            x.setVisibility(View.VISIBLE);
            thirdstar.setVisibility(View.VISIBLE);
            fourthstar.setVisibility(View.VISIBLE);

        }
        if (fifth == true) {
            y.setVisibility(View.VISIBLE);
            x.setVisibility(View.VISIBLE);
            thirdstar.setVisibility(View.VISIBLE);
            fifthstar.setVisibility(View.VISIBLE);
            fourthstar.setVisibility(View.VISIBLE);
        }
        if (getIntent().getStringExtra("yes") != null) {
            //System.out.println(getIntent().getStringExtra("yes"));

            // if (getIntent().getStringExtra("yes") != (null)) {

            tempps++;

            if (tempps == 2) {
                System.out.println(starOne);

                starOne = getIntent().getStringExtra("yes");
answer = true;
                x.setVisibility(View.VISIBLE);
//                  y.setVisibility(View.VISIBLE);
            } else{
                if (tempps == 3) {
                    starTwo = getIntent().getStringExtra("yes");
                    x.setVisibility(View.VISIBLE);
                    y.setVisibility(View.VISIBLE);
              star2 = true;
                    TextView mr = (TextView) findViewById(textView10);
                    mr.setText("Current Score: Chris is in the lead!");
                }
else if( tempps ==1){} else if( tempps == 4){
                    star3 = getIntent().getStringExtra("yes");

                    third = true;
                        x.setVisibility(View.VISIBLE);
                        y.setVisibility(View.VISIBLE);
                    thirdstar.setVisibility(View.VISIBLE);


                } else if(tempps == 5){
                    x.setVisibility(View.VISIBLE);
                    y.setVisibility(View.VISIBLE);
                    thirdstar.setVisibility(View.VISIBLE);
                    fourthstar.setVisibility(View.VISIBLE);
                    fourth = true;
                    star4 = getIntent().getStringExtra("yes");


                } else if( tempps == 6 ){

                    x.setVisibility(View.VISIBLE);
                    y.setVisibility(View.VISIBLE);
                    thirdstar.setVisibility(View.VISIBLE);
                    fifthstar.setVisibility(View.VISIBLE);
                    fourthstar.setVisibility(View.VISIBLE);
                    fifth = true;
                    star5 = getIntent().getStringExtra("yes");

                } else {}

                }
        }

    }


    public void imageOpen(View view) {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

//        Intent value = null;
        switch(view.getId()) {
            case R.id.meStar:
                System.out.println(starOne);
               //  value = new Intent(this, DetailedStar.class);
                //value.putExtra("yes",starOne);
             //   AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

                dlgAlert.setMessage(starOne);
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.secondStar:
             //    AlertDialog.Builder dlgAlerts  = new AlertDialog.Builder(this);

                dlgAlert.setMessage(starTwo);
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.imageView:
              //  AlertDialog.Builder dlgAlertss  = new AlertDialog.Builder(this);

                dlgAlert.setMessage("Today I went to the gym and I did abs for 3 hours");
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
             //   value = new Intent(this, DetailedStar.class);
               // value.putExtra("yes","Today I went to the gym and I did abs for 3 hours");
                break;
            case R.id.imageView4:
                dlgAlert.setMessage("Today I went to the gym and I did back and Triceps for 4 hours");
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.imageView5:
               // value = new Intent(this, DetailedStar.class);
                //value.putExtra("yes","Today I went to the gym and I did legs for 1 hours");
                dlgAlert.setMessage("Today I went to the gym and I did legs for 1 hours");
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.imageView6:
              //  value = new Intent(this, DetailedStar.class);
                ///value.putExtra("yes","Today I went to the gym and I did shoulders for 2 hours");
                dlgAlert.setMessage("Today I went to the gym and I did shoulders for 2 hours");
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.fifthStar:
                dlgAlert.setMessage(star5);
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.thirdStar:
                dlgAlert.setMessage(star3);
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;
            case R.id.fourthStar:
                dlgAlert.setMessage(star4);
                dlgAlert.setTitle("User activity");
                dlgAlert.setPositiveButton("OK", null);
                dlgAlert.setCancelable(true);
                dlgAlert.create().show();

                dlgAlert.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                break;


            //Intent value = new Intent(this, DetailedStar.class);


        }
//startActivity(value);
    }


    public void goAddStar(View view) {
        Intent i = new Intent(this, AddStar.class);
        startActivity(i);

    }
}

