package com.apple.dekay.isms;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class selectScreen extends AppCompatActivity {

    Button parent;
    Button student;
    Button staff;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);

        parent = findViewById(R.id.parent);
        student = findViewById(R.id.student);
        staff = findViewById(R.id.staff);

    }

    /** Called when the user taps the Send button */
    public void parentClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(selectScreen.this, login.class);
        startActivity(loginIntent);
    }

    public void studentClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(selectScreen.this, login.class);
        startActivity(loginIntent);
    }

    public void staffClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(selectScreen.this, login.class);
        startActivity(loginIntent);
    }


}



