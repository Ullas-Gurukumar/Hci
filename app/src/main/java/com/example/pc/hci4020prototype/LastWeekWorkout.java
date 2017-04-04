package com.example.pc.hci4020prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LastWeekWorkout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_week_workout);
        String[] weeklyGoals = {"Go to the gym 5 week.", "ascend to super sayian", "ascend to super sayian god", "ascend to super sayian blue", "perfect SSBlue KK x 10"};
        String[] stretchGoals = {"Touch your toes", "ascend to super sayian", "ascend to super sayian god", "ascend to super sayian blue", "perfect SSBlue KK x 10"};
        ListView lwWeekly= (ListView) findViewById(R.id.listWeeklyGoals);
        ArrayAdapter<String> weeklyAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, weeklyGoals);
        lwWeekly.setAdapter(weeklyAdapter);

        ListView lwstretch= (ListView) findViewById(R.id.listStretchGoals);
        ArrayAdapter<String> stretchAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, stretchGoals);
        lwstretch.setAdapter(stretchAdapter);
    }
}
