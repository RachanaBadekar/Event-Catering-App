package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AssignStaffMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assign_staff_members);
    }


    public void onclickResource(View view) {
        Intent myIntent=new Intent(view.getContext(),AddResources.class);
        startActivity(myIntent);
        Toast.makeText(this, "Staff Members Assigned Sucessfully", Toast.LENGTH_SHORT).show();
    }

}
