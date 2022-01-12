package com.hfad.restaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp_Ativity extends AppCompatActivity {

    Button btnRegister;
    TextView tvAlreadyAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__ativity);

        getSupportActionBar().setTitle("Sign Up");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnRegister = findViewById(R.id.btnRegister);
        tvAlreadyAccount = findViewById(R.id.tvLogIn);

        tvAlreadyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Ativity.this, "login", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignUp_Ativity.this, Login_Activity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUp_Ativity.this, "Register", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignUp_Ativity.this, SignUp_Ativity.class);
                startActivity(intent);


            }
        });



    }
}
