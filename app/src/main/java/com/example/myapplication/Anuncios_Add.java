package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class Anuncios_Add extends AppCompatActivity {


    boolean first = false;
    private static String strNovoAnuncio = "";
    private static String dataNovoAnuncio = "";

    public static String getStrNovoAnuncio(){
        return strNovoAnuncio;
    }

    public static String getDataNovoAnuncio(){
        return dataNovoAnuncio;
    }

    private static String strNovoAnuncio2 = "";
    private static String dataNovoAnuncio2 = "";

    public static String getStrNovoAnuncio2(){
        return strNovoAnuncio2;
    }

    public static String getDataNovoAnuncio2(){
        return dataNovoAnuncio2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios_add);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_certo, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextInputLayout descAnuncio = findViewById(R.id.textInputLayout2);
        DatePicker dataAnuncio = findViewById(R.id.datePicker1);

        if(item.getItemId()==R.id.novo_anuncio){
            if(!first) {
                strNovoAnuncio = descAnuncio.getEditText().getText().toString();
                dataNovoAnuncio = "Data: " + dataAnuncio.getDayOfMonth() + "/" + dataAnuncio.getMonth() + "/" + dataAnuncio.getYear();
                first = true;
            }else {
                strNovoAnuncio2 = descAnuncio.getEditText().getText().toString();
                dataNovoAnuncio2 = "Data: " + dataAnuncio.getDayOfMonth() + "/" + dataAnuncio.getMonth() + "/" + dataAnuncio.getYear();
            }
        } else {
            strNovoAnuncio = "";
            dataNovoAnuncio= "";
        }

        navigateUpTo(new Intent(getBaseContext(), Anuncios.class));
        Toast.makeText(this,"Anúncio Adicionado.", Toast.LENGTH_SHORT).show();
        return true;
    }

}
