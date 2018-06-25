package com.apple.dekay.isms;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class login extends AppCompatActivity {
    Button b1,b2;
    EditText ed1,ed2;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        b1 = findViewById(R.id.next_button);
        ed1 = findViewById(R.id.phone_number);
        ed2 = findViewById(R.id.four_digit_code);

        b2 = findViewById(R.id.forgot_password);
        tx1 = findViewById(R.id.tries);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("1234") &&
                        ed2.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(login.this, ward_choice.class);
                    startActivity(loginIntent);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                            tx1.setVisibility(View.VISIBLE);
                    counter--;
                    if(counter!=0){
                        tx1.setText(Integer.toString(counter) + " " + getString(R.string.extra_text));
                    }else{
                        tx1.setText("No" + " " + getString(R.string.extra_text));
                    }


                    if (counter == 0) {
                        b1.setEnabled(false);
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
