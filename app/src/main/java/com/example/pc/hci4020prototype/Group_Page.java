package com.example.pc.hci4020prototype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class Group_Page extends Activity {

    View list;
    String[] itemname ={
            "House Gryffindor",
            "House Slytherin",
            "House HufflePuff",
            "House Ravenclaw",
            "Create new group"
    };

    Integer[] imgid={
            R.mipmap.gryffindor,
            R.mipmap.slytherin,
            R.mipmap.hufflepuff,
            R.mipmap.ravenclaw,
            R.mipmap.newgroup

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_group__page);
       // getWindow().getDecorView().setBackgroundColor(Color.RED);

        CustomList adapter = new CustomList(this, itemname, imgid);
        ListView list =(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selcteditem= itemname[+position];
click(itemname[position]);
            }
        });
    }
    public void click(String name){
        if(name.equals("Create new group"))
        {
            Context context = getApplicationContext();
            CharSequence text = "Not yet implemented";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
        else {
            Intent i;
            if(getIntent().getStringExtra("yes").equals("yes")) {
                i = new Intent(this, EditGroup.class);
                i.putExtra("yes", name);
            }
            else
                 i = new Intent(getApplicationContext(), HomePage.class);



            startActivity(i);
        }
        }
}
