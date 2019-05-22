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

    private static String tituloNovaAtiv = new String();
    private static String descNovaAtiv = new String();
    private static String dataNovaAtiv = new String();

    public static String getTituloNovaAtiv(){
        return tituloNovaAtiv;
    }

    public static String getDescNovaAtiv(){
        return descNovaAtiv;
    }

    public static String getDataNovaAtiv(){
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
        TextInputLayout tituloAtiv = (TextInputLayout) findViewById(R.id.textInputLayout1);
        TextInputLayout descAtiv = (TextInputLayout) findViewById(R.id.textInputLayout2);
        DatePicker dataAtiv = (DatePicker) findViewById(R.id.datePicker1);

        if(item.getItemId()==R.id.novo_anuncio){

            tituloNovaAtiv = tituloAtiv.getEditText().getText().toString();
            descNovaAtiv = descAtiv.getEditText().getText().toString();
            dataNovaAtiv = "Data: "+ dataAtiv.getDayOfMonth()+"/"+ dataAtiv.getMonth()+"/"+dataAtiv.getYear();
        } else {
            tituloNovaAtiv = "";
            dataNovaAtiv= "";
        }

        Intent atividadesExtracur = new Intent(getApplicationContext(), AtividadesExtracur.class);
        startActivity(atividadesExtracur);
        return true;
    }
}
