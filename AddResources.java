package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AddResources extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_resources);
    }



    public void onclickSubmitDummy(View view) {
        Intent myIntent=new Intent(view.getContext(),CatererHomeScreen.class);
        startActivity(myIntent);
        Toast.makeText(this, "Resources added. Event Created Sucessfull", Toast.LENGTH_SHORT).show();
    }

}
