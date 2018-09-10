package com.example.tk.a111;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Przjscie extends AppCompatActivity {

  //  ImageButton imageButton6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przjscie);

        getSupportActionBar().setTitle("Narzędzia");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //      imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
    }

    public void cliclminutnik(View view) {
        Intent PrzejsceiMinutnik = new Intent(this,Minutnik.class);
        startActivity(PrzejsceiMinutnik);
    }

    public void OnClickStoper(View view) {
        Intent PrzjscieStoper = new Intent(this, Stoper.class);
        startActivity(PrzjscieStoper);
    }
}
