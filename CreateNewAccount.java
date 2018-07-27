package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CreateNewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
    }

    public void onclickSubmit(View view) {
        Intent myIntent=new Intent(view.getContext(),Login.class);
        Toast.makeText(this, "Account Created Sucessfully", Toast.LENGTH_SHORT).show();
        startActivity(myIntent);
    }
}
