package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ReviewRequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_request);
    }
    public void onclickAccept(View view) {
        Intent myIntent=new Intent(view.getContext(),ReviewRegisterationRequestList.class);
        startActivity(myIntent);
        Toast.makeText(this, "New User Added", Toast.LENGTH_SHORT).show();
    }

    public void onCLickReject(View view) {
        Intent myIntent=new Intent(view.getContext(),ReviewRegisterationRequestList.class);
        startActivity(myIntent);
        Toast.makeText(this, "User Rejected", Toast.LENGTH_SHORT).show();
    }
}
