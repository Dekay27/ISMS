package com.apple.dekay.isms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class send_message extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);


    }

    public void sendMsgClick(View view) {
        // Do something in response to button
        Toast.makeText(getApplicationContext(),
                "Message sent!",Toast.LENGTH_SHORT).show();
    }
}


