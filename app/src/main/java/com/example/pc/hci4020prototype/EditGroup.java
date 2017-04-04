package com.example.pc.hci4020prototype;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EditGroup extends AppCompatActivity {
    ArrayList<String> names;

    @Override//s
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
setTitle("");
        setContentView(R.layout.activity_edit_group);
String temp =         getIntent().getStringExtra("yes");
        names = new ArrayList<String>();
        //names.add("Chris");
        names.add("James");

        names.add("Bob");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names);

        ListView listView = (ListView) findViewById(R.id.listOfNames);

        listView.setAdapter(adapter);

        TextView temps = (TextView) findViewById(R.id.textView);
temps.setText("Current Group members of "+temp);

    }
    public void addPerson(View view){
       String [] x = new String [20];
for(int i =0; i<names.size(); i++){
x[i] = names.get(i);
System.out.println(x[i]);
        }

        //names.size()
        AlertDialog.Builder builder1 = new AlertDialog.Builder(EditGroup.this);
        builder1.setTitle("Which do you want to delete?" )
        .setItems(x, new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){

            }
                });
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
    public void editGroup(View view){
        Intent intent = new Intent(this, LeaderBoard.class);
       // intent.putStringArrayListExtra("names",names);
        String temp =         getIntent().getStringExtra("yes");
intent.putExtra("yes",temp);
        startActivity(intent);


    }

}
