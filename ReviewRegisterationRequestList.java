package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ReviewRegisterationRequestList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_registeration_request_list);
    }


    public void onclickReview(View view) {
        Intent myIntent=new Intent(view.getContext(),ReviewRequest.class);
        startActivity(myIntent);
    }
}
