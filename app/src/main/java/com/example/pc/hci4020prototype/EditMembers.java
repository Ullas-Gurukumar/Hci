package com.example.pc.hci4020prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EditMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_members);

        String[] members = {"Suneet", "Ullas", "Chris", "HQ"};
        ListView memberList = (ListView) findViewById(R.id.currentMembers);
        ArrayAdapter<String> memberAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, members);
        memberList.setAdapter(memberAdapter);

        String[] nonMembers = {"Taihyun", "Thieng", "HARRIS"};
        ListView listView = (ListView) findViewById(R.id.nonMembers);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nonMembers);
        listView.setAdapter(adapter);
    }
}
