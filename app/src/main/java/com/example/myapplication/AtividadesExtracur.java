package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class AtividadesExtracur extends AppCompatActivity {

    String tituloNovaAtiv = AtividadesExtracur_Add.getTituloNovaAtiv();
    String descNovaAtiv = AtividadesExtracur_Add.getDescNovaAtiv();
    String dataNovaAtiv = AtividadesExtracur_Add.getDataNovaAtiv();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades_extracur);

        TextView tituloAtiv2 = (TextView) findViewById(R.id.textView18);
        TextView descAtiv2 = (TextView) findViewById(R.id.textView19);
        TextView dataAtiv2 = (TextView) findViewById(R.id.textView20);

        tituloAtiv2.setText(tituloNovaAtiv);
        descAtiv2.setText(descNovaAtiv);
        dataAtiv2.setText(dataNovaAtiv);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        if(MainActivity.getTipoUsuario())
            getMenuInflater().inflate(R.menu.menu_novo, menu);
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
