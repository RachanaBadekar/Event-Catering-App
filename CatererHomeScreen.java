package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CatererHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer_home_screen);
    }

    public void onclickLogout(View view) {
        Intent myIntent=new Intent(view.getContext(),Login.class);
        startActivity(myIntent);
    }
}
