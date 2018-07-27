package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewAssignedEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_assigned_events);
    }

    public void onclickDOne(View view) {
        Intent myIntent=new Intent(view.getContext(),CatererStaffHomeScreen.class);
        startActivity(myIntent);
    }

    public void onclickempty(View view) {
        Intent myIntent=new Intent(view.getContext(),ViewSelectedEvent.class);
        startActivity(myIntent);

    }

    public void dummy(View view) {
        Intent myIntent=new Intent(view.getContext(),SearchSystemUser.class);
        startActivity(myIntent);

    }
}
