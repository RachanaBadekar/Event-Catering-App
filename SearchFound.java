package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SearchFound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_found);
    }
    public void onclickSearch(View view) {
        Intent myIntent=new Intent(view.getContext(),ViewSystemUserDetails.class);
        startActivity(myIntent);

    }
}
