package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AtividadesExtracur_Add extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades_extracur__add);
        CalendarView cal = new CalendarView(this);
        cal.setDate(System.currentTimeMillis(),false,true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_certo, menu);


        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){

        navigateUpTo(new Intent(getBaseContext(), MainActivity.class));
        Toast.makeText(this,"Atividade Adicionada.", Toast.LENGTH_SHORT).show();

        return true;
    }
}
