package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class AtividadesExtracur extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();
    String strNovaAtiv = Anuncios_Add.getStrNovoAnuncio();
    String dataNovaAtiv = Anuncios_Add.getDataNovoAnuncio();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades_extracur);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        if(tipoUsuario){
            getMenuInflater().inflate(R.menu.menu_novo, menu);
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.novo_anuncio:
                Intent attvExtra_add = new Intent(getApplicationContext(), AtividadesExtracur_Add.class);
                startActivity(attvExtra_add);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }


}
