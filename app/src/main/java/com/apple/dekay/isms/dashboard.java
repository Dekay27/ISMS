package com.apple.dekay.isms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    ImageView view1;
    ImageView view2;
    ImageView view3;
    ImageView view4;
    ImageView view5;
    ImageView view6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        view1 = findViewById(R.id.check_fees_image);
        view2 = findViewById(R.id.check_results_image);
        view3 = findViewById(R.id.course_material_image);
        view4 = findViewById(R.id.academic_calender_image);
        view5 = findViewById(R.id.send_msg_image);
        view6 = findViewById(R.id.logout_image);
    }

    public void checkFeesClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(dashboard.this, check_fees.class);
        startActivity(loginIntent);
    }
    // results clicking intent
    public void checkResultsClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(dashboard.this, check_results.class);
        startActivity(loginIntent);
    }

    // course material intent
    public void courseMaterialClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(dashboard.this, login.class);
        startActivity(loginIntent);
    }

    // academic calender intent
    public void academicCalenderClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(dashboard.this, login.class);
        startActivity(loginIntent);
    }

    // send message intent
    public void sendMessageClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(dashboard.this, login.class);
        startActivity(loginIntent);
    }

    // logout intent
    public void logoutClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Welcome",Toast.LENGTH_SHORT).show();
        Intent loginIntent = new Intent(dashboard.this, login.class);
        startActivity(loginIntent);
    }
}
