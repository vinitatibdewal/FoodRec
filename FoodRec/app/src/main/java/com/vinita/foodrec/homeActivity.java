package com.vinita.foodrec;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class homeActivity extends AppCompatActivity{

    String name, password, email, Err;
    TextView nameTV, emailTV, passwordTV, err;

    Button btn;

            @Override
    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_home);

                btn = (Button)findViewById(R.id.home_camera);
                nameTV = (TextView) findViewById(R.id.home_name);
                emailTV = (TextView) findViewById(R.id.home_email);
                passwordTV = (TextView) findViewById(R.id.home_password);
                err = (TextView) findViewById(R.id.err);

                name = getIntent().getStringExtra("name");
                password = getIntent().getStringExtra("password");
                email = getIntent().getStringExtra("email");
                Err = getIntent().getStringExtra("err");

                nameTV.setText("Welcome " + name);
                passwordTV.setText("Your password is " + password);
                emailTV.setText("Your email is " + email);
                err.setText(Err);


                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(homeActivity.this, cameraActivity.class));
                    }
                });

            }
}
