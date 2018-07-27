package com.example.harinia.utacateringevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void onclickSubmit(View view) {
        Intent myIntent=new Intent(view.getContext(),Login.class);
        startActivity(myIntent);
        Toast.makeText(this, "Your password has been emailed to you", Toast.LENGTH_SHORT).show();
    }
}
