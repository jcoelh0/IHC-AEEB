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

    private static String strNovoAnuncio = new String();
    private static String dataNovoAnuncio = new String();

    public static String getStrNovoAnuncio(){
        return strNovoAnuncio;
    }

    public static String getDataNovoAnuncio(){
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
        DatePicker dataAnuncio = (DatePicker) findViewById(R.id.datePicker1);

        if(item.getItemId()==R.id.novo_anuncio){
            strNovoAnuncio = descAnuncio.getEditText().getText().toString();
            dataNovoAnuncio = "Data: "+ dataAnuncio.getDayOfMonth()+"/"+ dataAnuncio.getMonth()+"/"+dataAnuncio.getYear();
        } else {
            strNovoAnuncio = "";
            dataNovoAnuncio= "";
        }

        navigateUpTo(new Intent(getBaseContext(), Anuncios.class));
        Toast.makeText(this,"Anúncio Adicionado.", Toast.LENGTH_SHORT).show();
        return true;
    }

}
