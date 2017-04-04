package com.example.pc.hci4020prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddStar extends AppCompatActivity {
static int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setTitle("");

        setContentView(R.layout.activity_add_star);
    }
    @Override
    public void onBackPressed() {
    }


    public void cancelButton(View view){
        Intent i = new Intent(this,LeaderBoard.class);
        startActivity(i);
    }

    public void acceptButton(View view){

        EditText insertTitle = (EditText) findViewById(R.id.editText4);
            String title = insertTitle.getText().toString();
        if(!title.equals("") ) {

            counter++;
            Intent i = new Intent(this, LeaderBoard.class);
            if (counter == 2) {
                i.putExtra("yes", title);
            } else

                i.putExtra("yes", title);
            startActivity(i);
        } else {
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

            dlgAlert.setMessage("You must write a comment to show what you did today!");
            dlgAlert.setTitle("Error Message");
            dlgAlert.setPositiveButton("OK", null);
            dlgAlert.setCancelable(true);
            dlgAlert.create().show();

            dlgAlert.setPositiveButton("Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });



        }
    }
}
