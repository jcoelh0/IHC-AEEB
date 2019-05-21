package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class AtividadesExtracur_Add extends AppCompatActivity {

    private static String strNovaAtiv = new String();
    private static String dataNovaAtiv = new String();

    public static String getStrNovoAnuncio(){
        return strNovaAtiv;
    }

    public static String getDataNovoAnuncio(){
        return dataNovaAtiv;
    }

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextInputLayout descAtiv = (TextInputLayout) findViewById(R.id.textInputLayout2);
        DatePicker dataAtiv = (DatePicker) findViewById(R.id.datePicker1);

        if(item.getItemId()==R.id.novo_anuncio){
            strNovaAtiv = descAtiv.getEditText().getText().toString();
            dataNovaAtiv = "Data: "+ dataAtiv.getDayOfMonth()+"/"+ dataAtiv.getMonth()+"/"+dataAtiv.getYear();
        } else {
            strNovaAtiv = "";
            dataNovaAtiv= "";
        }

        Intent anuncios = new Intent(getApplicationContext(), Anuncios.class);
        startActivity(anuncios);
        return true;
    }
}
