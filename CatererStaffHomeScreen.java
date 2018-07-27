package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CatererStaffHomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caterer_staff_home_screen);
    }

    public void onclickUpdateProfile(View view) {
        Intent myIntent=new Intent(view.getContext(),UpdateProfile.class);
        startActivity(myIntent);
    }

    public void onclickDummy(View view) {
        Intent myIntent=new Intent(view.getContext(),ReviewRegisterationRequestList.class);
        startActivity(myIntent);
    }

    public void onclickLogout(View view) {

        Intent myIntent=new Intent(view.getContext(),Login.class);
        startActivity(myIntent);
        Toast.makeText(this, "Logout Sucessfull", Toast.LENGTH_SHORT).show();
    }

    public void onclickAssign(View view) {
        Intent myIntent=new Intent(view.getContext(),ViewAssignedEvents.class);
        startActivity(myIntent);
    }
}
