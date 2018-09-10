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
public class cw2 extends AppCompatActivity {

    SearchView searchView2;
    ArrayAdapter<String> adapter;

    //  String test3 = "trlolos :)";

    public final static  String MESSAGE_DATA = "com.example.tk.a111";

    OpisCwiczneia op = new OpisCwiczneia();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga_lista);


        final String[] elo = {"Wyciskanie francuskie sztangi wąskim chwytem leżąc","Wyciskanie francuskie sztangi szerokim chwytem leżąc głową w dół", "Wyciskanie francuskie hantla zza głowy jednorącz stojąc", "Prostowanie przedramion z linkami wyciągu dolnego stojąc"};
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elo);

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
                    case "Wyciskanie francuskie sztangi wąskim chwytem leżąc":
                        //Toast.makeText(cw1.this,naruto[position],Toast.LENGTH_SHORT).show();
                        Intent wyciskannie = new Intent(cw2.this, OpisCwiczneia.class);
                        wyciskannie.putExtra(MESSAGE_DATA,value);
                        cw2.this.startActivity(wyciskannie);
                        break;

                    case "Wyciskanie francuskie sztangi szerokim chwytem leżąc głową w dół":
                        Intent francuskie = new Intent(cw2.this, OpisCwiczneia.class);
                        francuskie.putExtra(MESSAGE_DATA,value);
                        cw2.this.startActivity(francuskie);

                        break;
                    case "Wyciskanie francuskie hantla zza głowy jednorącz stojąc":
                        Intent zaglowe = new Intent(cw2.this, OpisCwiczneia.class);
                        zaglowe.putExtra(MESSAGE_DATA,value);
                        cw2.this.startActivity(zaglowe);
                        break;
                    case "Prostowanie przedramion z linkami wyciągu dolnego stojąc":
                        Intent prostowanie = new Intent(cw2.this, OpisCwiczneia.class);
                        prostowanie.putExtra(MESSAGE_DATA,value);
                        cw2.this.startActivity(prostowanie);
                        break;

                }
            }
        });



    }
}
