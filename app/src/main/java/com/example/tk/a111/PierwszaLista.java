package com.example.tk.a111;

import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListAdapter;
        import android.widget.ListView;
        import android.widget.Toast;


public class PierwszaLista extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pierwsza_lista);


        String[] glownepartie = {"Biceps", "Triceps", "Klata", "Barki" ,"Plecy"};

        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, glownepartie);

        final ListView theListView = (ListView) findViewById(R.id.theListView);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;
                String value = (String) theListView.getItemAtPosition(position);

                final int result = 1;
                switch(value){
                    case "Biceps":
                        Intent bicek = new Intent(PierwszaLista.this, cw1.class);
                        PierwszaLista.this.startActivity(bicek);
                        break;
                    case "Triceps":
                        Intent tricek = new Intent(PierwszaLista.this, cw2.class);
                        PierwszaLista.this.startActivity(tricek);
                        break;
                    case "Klata":
                        Intent klata = new Intent(PierwszaLista.this, cw3.class);
                        PierwszaLista.this.startActivity(klata);
                        break;
                    case "Barki":
                        Intent barki = new Intent(PierwszaLista.this, cw4.class);
                        PierwszaLista.this.startActivity(barki);
                        break;
                    case "Plecy":
                        Intent plecy = new Intent(PierwszaLista.this, cw5.class);
                        PierwszaLista.this.startActivity(plecy);
                        break;
                }
            }
        });

    }
}