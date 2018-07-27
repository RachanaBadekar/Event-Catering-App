package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UpdateProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
    }
    public void onclickUpdate(View view) {
        Intent myIntent=new Intent(view.getContext(),CatererStaffHomeScreen.class);
        Toast.makeText(this, "Profile Updated Sucessfully", Toast.LENGTH_SHORT).show();
        startActivity(myIntent);
    }
}
