package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Anuncios extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();
    String strNovoAnuncio = Anuncios_Add.getStrNovoAnuncio();
    String dataNovoAnuncio = Anuncios_Add.getDataNovoAnuncio();
    String strNovoAnuncio2 = Anuncios_Add.getStrNovoAnuncio2();
    String dataNovoAnuncio2 = Anuncios_Add.getDataNovoAnuncio2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);

        TextView anuncio1 = findViewById(R.id.textView4);
        TextView dataAnuncio1 = findViewById(R.id.textView7);
        TextView anuncio2 = findViewById(R.id.textView6);
        TextView dataAnuncio2 = findViewById(R.id.textViewdata2);
        TextView anuncio3 =  findViewById(R.id.textView10);
        TextView dataAnuncio3 = findViewById(R.id.textView11);

        anuncio1.setText("Levar autorização de visita ao Museu, que foi entregue ao aluno, assinada pelo encarregado de educação");
        dataAnuncio1.setText("Data: 28/5/2019");

        if(anuncio2.length()==0) {
            anuncio2.setText(strNovoAnuncio);
            dataAnuncio2.setText(dataNovoAnuncio);
        } else{
            anuncio3.setText(strNovoAnuncio2);
            dataAnuncio3.setText(dataNovoAnuncio2);
        }




/*
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        // verifica qual tab esta selecionada
        TabLayout.TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            //TextView anuncio3 = (TextView) findViewById(R.id.textView8);
            //anuncio3.setText(tabLayout.getSelectedTabPosition());
        }

        if(!(tabLayout.getSelectedTabPosition()==0)){
            anuncio1.setVisibility(View.INVISIBLE);
            dataAnuncio1.setVisibility(View.INVISIBLE);
            anuncio2.setVisibility(View.INVISIBLE);
            dataAnuncio2.setVisibility(View.INVISIBLE);
        }
*/

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(tipoUsuario){
            getMenuInflater().inflate(R.menu.menu_novo, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.novo_anuncio:
                Intent anuncios_add = new Intent(getApplicationContext(), Anuncios_Add.class);
                startActivity(anuncios_add);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

}
