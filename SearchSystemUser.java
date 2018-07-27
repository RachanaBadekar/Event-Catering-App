package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SearchSystemUser extends AppCompatActivity {
private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_system_user);
    }

    public void onclickSearch(View view) {
        Intent myIntent=new Intent(view.getContext(),SearchFound.class);
        startActivity(myIntent);
        Toast.makeText(this, "Search Found", Toast.LENGTH_SHORT).show();
    }
}
