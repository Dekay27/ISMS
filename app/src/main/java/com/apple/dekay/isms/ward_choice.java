package com.apple.dekay.isms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ward_choice extends AppCompatActivity {

    ImageView ward1;
    ImageView ward2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ward_choice);

        ward1 = findViewById(R.id.ward1_image);
        ward2 = findViewById(R.id.ward2_image);

    }

    public void ward1_click(View view) {
        Intent loginIntent = new Intent(ward_choice.this, dashboard.class);
        startActivity(loginIntent);
    }

    public void ward2_click(View view) {
        Intent loginIntent = new Intent(ward_choice.this, dashboard.class);
        startActivity(loginIntent);
    }

}
