package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateNewEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_event);
    }

    public void onclickAssign(View view) {
        Intent myIntent=new Intent(view.getContext(),AssignStaffMembers.class);
        startActivity(myIntent);
    }
}
