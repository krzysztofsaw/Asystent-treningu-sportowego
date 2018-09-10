package com.example.tk.a111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Wyszykiwarka extends AppCompatActivity {


    public EditText PoleWyszukaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyszykiwarka);

        getSupportActionBar().setTitle("Atalas ćwiczeń");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    public void OnCliclWYszukaj(View view) {

        PoleWyszukaj = (EditText)findViewById(R.id.schere);
       // String tekst = PoleWyszukaj.getText().toString();
        String test2 = "Test :)";
        Toast.makeText(this,test2,Toast.LENGTH_SHORT).show();
    }
}
