package com.example.tk.a111.paczka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tk.a111.R;

public class Wpiszaktywnosc extends AppCompatActivity {

    private static final String TAG = "Wpiszaktywnosc";
    public final static  String MESSAGE_DATA = "com.example.tk.a11";

    DatabaseHelper mDatabaseHelper;
    private Button btnAdd, btnViewData;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitywpisz);
        editText = (EditText) findViewById(R.id.editText);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnViewData = (Button) findViewById(R.id.btnView);
        mDatabaseHelper = new DatabaseHelper(this);

         Intent intent = getIntent();
         final String message = intent.getStringExtra(MESSAGE_DATA);
         System.out.println("wartosc message to :"+ message);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = editText.getText().toString();
                if (editText.length() != 0) {
                    AddData(message+"     "+"Aktywność:    "+ newEntry, "     "+"Powodzenia");
                    editText.setText("");
                } else {
                    toastMessage("You must put something in the text field!");
                }

            }
        });

        btnViewData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Wpiszaktywnosc.this, ListDataActivity.class);
                startActivity(intent);
            }
        });

    }

    public void AddData(String newEntry, String jakasdata) {
        boolean insertData = mDatabaseHelper.addData(newEntry,jakasdata);

        if (insertData) {
            toastMessage("Aktynosc pomyslnei dodana");
        } else {
            toastMessage("Blad w dodawniau");
        }
    }

    /**
     * customizable toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}
