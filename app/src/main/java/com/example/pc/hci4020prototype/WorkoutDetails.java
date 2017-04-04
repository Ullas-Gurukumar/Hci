package com.example.pc.hci4020prototype;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class WorkoutDetails extends AppCompatActivity {
    private int run;
    private int gym;
    private int pushUps;
    private Handler handler = new Handler();

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

        final ProgressBar SRunProgress = (ProgressBar) findViewById(R.id.progressBar4);

        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        SRunProgress.setProgress(run);
                    }
                });
            }
        }).start();

        final ProgressBar SGymProgress = (ProgressBar) findViewById(R.id.progressBar7);

        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        SGymProgress.setProgress(gym);
                    }
                });
            }
        }).start();

        final ProgressBar SPushProgress = (ProgressBar) findViewById(R.id.progressBar5);

        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        SPushProgress.setProgress(pushUps);
                    }
                });
            }
        }).start();
    }
}
