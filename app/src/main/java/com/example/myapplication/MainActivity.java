package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import Ut.tcounter;


public class MainActivity extends AppCompatActivity {

    private EditText edPhrase;
    private TextView tvmain;
    private Spinner myspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edPhrase = findViewById(R.id.edPhrase);
        this.tvmain = findViewById(R.id.tvmain);

        this.myspinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.soptions, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        this.myspinner.setAdapter(adapter);

    }

    public void onBtnCountClick(View view) {




        if (this.myspinner.getSelectedItem().toString().equals(getResources().getString(R.string.charselec))) {
            this.tvmain.setText(tcounter.charcount(this.edPhrase.getText().toString()));
        }

        else{
            Toast.makeText(getApplicationContext(), "EMPTY!", Toast.LENGTH_LONG).show();
        }
    }
}

