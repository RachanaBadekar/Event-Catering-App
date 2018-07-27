package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewSystemUserDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_system_user_details);
    }

    public void onclickdummy3(View view) {
        Intent myIntent=new Intent(view.getContext(),CreateNewEvent.class);
        startActivity(myIntent);
    }

    public void onclickabc(View view) {
        Intent myIntent=new Intent(view.getContext(),AdminHomeScreen.class);
        startActivity(myIntent);
    }
}
