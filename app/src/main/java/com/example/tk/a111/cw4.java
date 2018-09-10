package com.example.tk.a111;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mitch on 2016-04-03.
 */
public class cw4 extends AppCompatActivity {

    SearchView searchView2;
    ArrayAdapter<String> adapter;

    //  String test3 = "trlolos :)";

    public final static  String MESSAGE_DATA = "com.example.tk.a111";

    OpisCwiczneia op = new OpisCwiczneia();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_lista);


        final String[] naruto = {"Barki 1", "Barki 2", "Barki 3", "Barki 4"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, naruto);

        final ListView theListView = (ListView) findViewById(R.id.theListView2);
        searchView2 = (SearchView)findViewById(R.id.searchView2);

        theListView.setAdapter(adapter);

        searchView2.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {
                adapter.getFilter().filter(text);
                return false;
            }
        });


        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String value = (String) theListView.getItemAtPosition(position);

                final int result = 1;
                switch(value){
                    case "Barki 1":
                        //Toast.makeText(cw1.this,naruto[position],Toast.LENGTH_SHORT).show();
                        Intent sztangielki = new Intent(cw4.this, OpisCwiczneia.class);
                        sztangielki.putExtra(MESSAGE_DATA,value);
                        cw4.this.startActivity(sztangielki);
                        break;

                    case "Barki 2":
                        Intent wyciskanie = new Intent(cw4.this, OpisCwiczneia.class);
                        wyciskanie.putExtra(MESSAGE_DATA,value);
                        cw4.this.startActivity(wyciskanie);

                        break;
                    case "Barki 3":
                        Intent modlitewnik = new Intent(cw4.this, OpisCwiczneia.class);
                        modlitewnik.putExtra(MESSAGE_DATA,value);
                        cw4.this.startActivity(modlitewnik);
                        break;
                    case "Barki 4":
                        Intent wyciskanielez = new Intent(cw4.this, OpisCwiczneia.class);
                        wyciskanielez.putExtra(MESSAGE_DATA,value);
                        cw4.this.startActivity(wyciskanielez);
                        break;

                }
            }
        });



    }
}
