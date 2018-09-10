package com.example.tk.a111;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tk.a111.Fragementy.Tabbet;
import com.example.tk.a111.paczka.Wpiszaktywnosc;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import java.util.Calendar;


public class AsystentTreningu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


public final static  String MESSAGE_DATA = "com.example.tk.a11";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lewe_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        view = (ImageView) findViewById(R.id.imageView2);
//        Animation animation = AnimationUtils.loadAnimation(this,R.anim.bounce);
//        view.startAnimation(animation);

        final MaterialCalendarView calender = (MaterialCalendarView) findViewById(R.id.calendarView);


        calender.state().edit()
                .setFirstDayOfWeek(Calendar.MONDAY)
                .setMinimumDate(CalendarDay.from(1900, 1, 1))
                .setMaximumDate(CalendarDay.from(2019, 12, 31))
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();

        calender.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                // Toast.makeText(calendar_layout.this, ""+ date, Toast.LENGTH_SHORT).show();

                Intent jakisintent = new Intent(AsystentTreningu.this, Wpiszaktywnosc.class);
                jakisintent.putExtra(MESSAGE_DATA,"Data: "+  date.getYear()+"."+ date.getMonth()+"."+date.getDay());
                startActivity(jakisintent);

            }
        });

















        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return true;
    }



   // lewe menu
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.PlanyTreningowe) {
            Intent Wyszukiwarka = new Intent(this,AsystentTreningu.class);
            startActivity(Wyszukiwarka);
            return true;

        } else if (id == R.id.Narzedzia) {
            Intent Narzedzia = new Intent(this,Przjscie.class);
            startActivity(Narzedzia);
            return true;
        } else if (id == R.id.Kalkulator) {
            Intent kalkulator = new Intent(this,Tabbet.class);
            startActivity(kalkulator);
             return true;
        } else if (id == R.id.Atlas) {
            Intent atlas = new Intent(this, PierwszaLista.class);
            startActivity(atlas);
            return true;
        }else if (id == R.id.O_aplikacji) {
            Intent O_aplikacji = new Intent(this,AboutActivity.class);
            startActivity(O_aplikacji);
            return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;




    }


}
