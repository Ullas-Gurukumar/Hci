package com.example.pc.hci4020prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class DetailedStar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
setTitle("");
        setContentView(R.layout.activity_detailed_star);
        if (getIntent().getStringExtra("yes") != null) {
            TextView insertTitle = (TextView) findViewById(R.id.textView8);
            String title = getIntent().getStringExtra("yes");
            insertTitle.setText(title);
        }
    }
    @Override
    public void onBackPressed() {
    }
    public void  temp(View view){
        Intent x = new Intent(this,LeaderBoard.class);
        startActivity(x);
    }
}
