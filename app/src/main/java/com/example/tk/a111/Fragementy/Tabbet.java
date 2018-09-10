package com.example.tk.a111.Fragementy;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.tk.a111.Fragementy.Frag1;
import com.example.tk.a111.Fragementy.Frag2;
import com.example.tk.a111.Fragementy.Frag3;
import com.example.tk.a111.R;

public class Tabbet extends AppCompatActivity {


    EditText editText;
    EditText editText2;
    TextView textView3;

    float sumaa;
    float liczba1, liczba2;
    float a=0,b=0,c=0,d=0;
    float F=0;
     EditText WiekBMR,WzrostBMR,WagaBMR;
    TextView WynikBMR;
    float waga,wiek,wzrost;
    float Wynik;
    float sumaBRM;

    EditText EditWagaBF,EditTaliaBF;
    TextView WynikBF;
    float wagaBF,taliaBF,T,Y,U,I,O,P;


    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbet);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        getSupportActionBar().setTitle("Kalkulatory");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ObliczBMI(View view) {
        editText = (EditText)findViewById(R.id.editText);//waga
        editText2 = (EditText)findViewById(R.id.editText2);//wzrost
        textView3 = (TextView)findViewById(R.id.textView3);

        liczba1 = Float.parseFloat(editText.getText().toString());
        liczba2 = Float.parseFloat(editText2.getText().toString());
        sumaa = liczba1/((liczba2*liczba2)/10000);
        textView3.setText(String.valueOf(sumaa));
    }

    public void ObliczBMR(View view) {

        WagaBMR = (EditText)findViewById(R.id.WagaBMR);//waga
        WzrostBMR = (EditText)findViewById(R.id.WzrostBMR);//wzrost
       WiekBMR = (EditText)findViewById(R.id.WiekBMR);//wiek
        WynikBMR = (TextView)findViewById(R.id.WynikBMR);


        waga = Float.parseFloat(WagaBMR.getText().toString());
       wzrost = Float.parseFloat(WzrostBMR.getText().toString());
      wiek = Float.parseFloat(WiekBMR.getText().toString());

 //     66 + [13,7 x masa ciała (kg)] + [5 x wzrost (cm)] - [6,76 x wiek (lata)]
        Wynik = (float) d+(((a*waga)+(b*wzrost)-(c*wiek)));
        WynikBMR.setText(String.valueOf(Wynik));

    }

    public void ObliczBF(View view) {
        EditWagaBF = (EditText)findViewById(R.id.EditWagaBF);//waga
        EditTaliaBF = (EditText)findViewById(R.id.EditTaliaBF);//talia
        WynikBF = (TextView)findViewById(R.id.WynikBF);

        wagaBF = Float.parseFloat(EditWagaBF.getText().toString());
        taliaBF = Float.parseFloat(EditTaliaBF.getText().toString());

         T= (float) (4.15*taliaBF);//a
         Y= (float)  (T/2.54);  //b
         U= (float) (0.082*wagaBF*2.2);  //c
         I= (float) ((Y-U)-F);  //d
         O= (float) (wagaBF*2.2); //e
         P= (float)(I/O)*100;//wynik

        WynikBF.setText(String.valueOf(P));

    }


    public void MK(View view) {



        boolean zaznaczony = ((RadioButton)view).isChecked();
        switch(view.getId()) {
            case R.id.K:
                if (zaznaczony) {
                    //     Wynik = (float) ((13.7*waga)+(5*wzrost)-(6.76*wiek));
                    a = (float) 9.6;
                    b = (float) 1.8;
                    c = (float) 4.7;
                    d = 655;
                    F = (float) 76.76;
                }
                    break;
            case R.id.M:
                    if (zaznaczony){
                    a = (float) 13.7;
                    b = 5;
                    c = (float) 7.76;
                    d = 66;
                    F = (float) 98.42;
                //  Wynik = (float) ((13.7*waga)+(50*wzrost)-(6.76*wiek));
        }
                break;
        }
    }



    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Frag1 fragment1 = new Frag1();
                    return fragment1;
                case 1:
                   Frag2 fragment2 = new Frag2();
                  return fragment2;
                case 2:
                    Frag3 fragment3 = new Frag3();
                    return fragment3;
                    default:
                        return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
