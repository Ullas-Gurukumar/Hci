package com.example.pc.hci4020prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
setTitle("");
        setContentView(R.layout.activity_login);

    }

    public void userChange(View view){
        EditText user = (EditText) findViewById(R.id.editText3);
        user.setText("");
    }
    public void passwordChange(View view){
        EditText password = (EditText) findViewById(R.id.editText2);
    password.setText("");
    }
    public void WagerClass(View view){
        EditText user = (EditText) findViewById(R.id.editText3);
        EditText password = (EditText) findViewById(R.id.editText2);

        if(user.getText().toString().equals("u") && password.getText().toString().equals("p")) {

            Intent i = new Intent(this, Group_Page.class);
           if(getIntent().getStringExtra("yes").equals("yes"))
            i.putExtra("yes", "yes");
            else i.putExtra("yes","no");

            startActivity(i);
        }//s
        else {
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

            dlgAlert.setMessage("wrong password or username");
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
    public void registerUser(View view){

        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

        dlgAlert.setMessage("To be implemented in future!");
        dlgAlert.setTitle("Next Milestone ");
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

