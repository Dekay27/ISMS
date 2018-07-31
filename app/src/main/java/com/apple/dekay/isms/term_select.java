package com.apple.dekay.isms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class term_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term_select);

        Spinner yearSpinner = findViewById(R.id.yearSpinner);

        ArrayAdapter<String> yearArray = new ArrayAdapter<String>(term_select.this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.yearList));
        yearArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(yearArray);


        Spinner termSpinner = findViewById(R.id.termSpinner);

        ArrayAdapter<String> termArray = new ArrayAdapter<String>(term_select.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.termList));
        termArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        termSpinner.setAdapter(termArray);
    }

    public void termSelectClick(View view) {
        Intent loginIntent = new Intent(term_select.this, check_fees.class);
        startActivity(loginIntent);
    }
}
