package com.example.pc.hci4020prototype;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);




    }
    public void WagerClass(View view){
        EditText user = (EditText) findViewById(R.id.editText3);
        EditText password = (EditText) findViewById(R.id.editText2);

        if(user.getText().toString().equals("chris") && password.getText().toString().equals("Password1")) {

            Intent i = new Intent(this, wager.class);
            startActivity(i);
        }
        else {
            AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);

            dlgAlert.setMessage("wrong password or username");
            dlgAlert.setTitle("Error Message...");
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


    public void editGroup(){
        Intent intent = new Intent(MainActivity.this, wager.class);
       // intent.putStringArrayListExtra("names",names);
        startActivity(intent);



    }
}


