package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_screen);
    }

    public void onclickLogout(View view) {
        Intent myIntent=new Intent(view.getContext(),Login.class);
        startActivity(myIntent);
    }

    public void abc(View view) {
        Intent myIntent=new Intent(view.getContext(),CatererHomeScreen.class);
        startActivity(myIntent);

    }

    public void xyz(View view) {
        Intent myIntent=new Intent(view.getContext(),UserHomeScreen.class);
        startActivity(myIntent);
    }
}
