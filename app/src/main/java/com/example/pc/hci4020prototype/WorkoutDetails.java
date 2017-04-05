package com.example.pc.hci4020prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.EditText;

public class WorkoutDetails extends AppCompatActivity {
    private int run;
    private int gym;
    private int pushUps;
    private Handler handler = new Handler();
    private int m_Text = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_details);

        TextView name = (TextView) findViewById(R.id.textView22);
        Bundle extras = getIntent().getExtras();
        name.setText(extras.getString("NAME"));
        run = extras.getInt("RUN");
        gym = extras.getInt("GYM_VISIT");
        pushUps = extras.getInt("PUSH_UPS");

        TextView gymCount = (TextView) findViewById(R.id.textView14);
        gymCount.setText((run*0.05) + "Km/5Km");
        TextView runCount = (TextView) findViewById(R.id.textView9);
        runCount.setText((int)(gym*.05)+ "/5");
        TextView pushUpsCount = (TextView) findViewById(R.id.textView13);
        pushUpsCount.setText((pushUps*2) + "/200");

        final ProgressBar SRunProgress = (ProgressBar) findViewById(R.id.progressBar4);
        this.setProgressBar(SRunProgress, run);

        final ProgressBar SGymProgress = (ProgressBar) findViewById(R.id.progressBar7);
        this.setProgressBar(SGymProgress, gym);


        final ProgressBar SPushProgress = (ProgressBar) findViewById(R.id.progressBar5);
        this.setProgressBar(SPushProgress, pushUps);

    }

    public void setProgressBar(ProgressBar p, int x){
        final ProgressBar pBar = p;
        final int progress = x;
        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        pBar.setProgress(progress);
                    }
                });
            }
        }).start();
    }


    public void addPushProress(View view){

        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        input.setRawInputType(Configuration.KEYBOARD_12KEY);
        dlgAlert.setView(input);


        dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = Integer.parseInt(input.getText().toString());
                TextView pushUpsCount = (TextView) findViewById(R.id.textView13);
                pushUpsCount.setText((pushUps*2)+m_Text + "/200");
                pushUps += m_Text/2;
                setProgressBar((ProgressBar) findViewById(R.id.progressBar5), pushUps);
            }
        });

        dlgAlert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dlgAlert.setTitle("Add Progress");
        dlgAlert.create().show();
    }

    public void addRunProress(View view){

        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        input.setRawInputType(Configuration.KEYBOARD_12KEY);
        dlgAlert.setView(input);


        dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = Integer.parseInt(input.getText().toString());
                run += m_Text*20;
                TextView gymCount = (TextView) findViewById(R.id.textView14);
                gymCount.setText((run*0.05) + "Km/5Km");
                setProgressBar((ProgressBar) findViewById(R.id.progressBar4), run);
            }
        });

        dlgAlert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dlgAlert.setTitle("Add Progress");
        dlgAlert.create().show();
    }

    public void addGymProress(View view){

        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        input.setRawInputType(Configuration.KEYBOARD_12KEY);
        dlgAlert.setView(input);


        dlgAlert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = Integer.parseInt(input.getText().toString());
                gym += m_Text*20;
                TextView runCount = (TextView) findViewById(R.id.textView9);
                runCount.setText((int)(gym*.05)+ "/5");
                setProgressBar((ProgressBar) findViewById(R.id.progressBar7), gym);
            }
        });

        dlgAlert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        dlgAlert.setTitle("Add Progress");
        dlgAlert.create().show();
    }

}
