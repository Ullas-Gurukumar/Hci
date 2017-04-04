package com.example.pc.hci4020prototype;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class HomePage extends AppCompatActivity {

    private int runProgress = 50;
    private int gymVisits = 80;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        final String[] people = {"Suneet", "Ullas", "Chris", "HQ"};
        ListView listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, people);
        listView.setAdapter(adapter);

        String[] options = {"Set next weeks goals", "Edit members", "Previous week"};
        ListView listViewOptions = (ListView) findViewById(R.id.listOptions);
        ArrayAdapter<String> optionsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options);
        listViewOptions.setAdapter(optionsAdapter);


        final TextView weeklyGoals = (TextView) findViewById(R.id.textView2);
        weeklyGoals.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getApplicationContext(), WorkoutDetails.class);
                i.putExtra("NAME", "Suneet");
                i.putExtra("RUN", runProgress);
                i.putExtra("GYM_VISIT", gymVisits);
                i.putExtra("PUSH_UPS", 40);
                startActivity(i);
            }
        });

        final ProgressBar run = (ProgressBar) findViewById(R.id.progressBar2);

        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        run.setProgress(runProgress);
                    }
                });
            }
        }).start();

        final ProgressBar gym = (ProgressBar) findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        gym.setProgress(gymVisits);
                    }
                });
            }
        }).start();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), WorkoutDetails.class);
                i.putExtra("NAME", people[position]);
                i.putExtra("RUN", runProgress - (position*5));
                i.putExtra("GYM_VISIT", gymVisits - (position*5));
                i.putExtra("PUSH_UPS", 40 - (position*10));
                startActivity(i);
            }
        });

        listViewOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                    startActivity(i);
                }
                if (position == 2) {
                    Intent i = new Intent(getApplicationContext(), LastWeekWorkout.class);
                    startActivity(i);
                }

                if (position == 1) {
                    Intent i = new Intent(getApplicationContext(), EditMembers.class);
                    startActivity(i);
                }
            }
        });
    }
}
