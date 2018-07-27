package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ViewSelectedEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_selected_event);
    }

    public void onclickSubmit(View view) {
        Intent myIntent=new Intent(view.getContext(),ViewAssignedEvents.class);
        startActivity(myIntent);

    }
}
