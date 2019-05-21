package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;
import java.util.Date;

public class Anuncios_Add extends AppCompatActivity {

    private static String strNovoAnuncio = new String();
    private static Date dataNovoAnuncio = new Date();

    public static String getStrNovoAnuncio(){
        return strNovoAnuncio;
    }

    public static Date getDataNovoAnuncio(){
        return dataNovoAnuncio;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios_add);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_certo, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextInputLayout descAnuncio = (TextInputLayout) findViewById(R.id.textInputLayout2);
        CalendarView dataAnuncio = (CalendarView) findViewById(R.id.calendarView1);

        if(item.getItemId()==R.id.novo_anuncio){
            strNovoAnuncio = descAnuncio.getEditText().getText().toString();
            dataNovoAnuncio = dataAnuncio.getDate();
        } else {
            strNovoAnuncio = "";
            dataNovoAnuncio = null;
        }
/*
        switch(item.getItemId()) {
            case R.id.novo_anuncio:
                Intent anuncios = new Intent(getApplicationContext(), Anuncios.class);
                startActivity(anuncios);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
*/
        Intent anuncios = new Intent(getApplicationContext(), Anuncios.class);
        startActivity(anuncios);
        return true;
    }

}
