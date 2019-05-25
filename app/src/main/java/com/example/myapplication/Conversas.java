package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Conversas extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();
    String aluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversas);

        TextView text1 = (TextView) findViewById(R.id.textView1);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        TextView text3 = (TextView) findViewById(R.id.textView3);
        TextView text4 = (TextView) findViewById(R.id.textView4);
        TextView text5 = (TextView) findViewById(R.id.textView5);
        TextView data = (TextView) findViewById(R.id.textViewData);
        Spinner spinner = (Spinner) findViewById(R.id.dynamic_spinner);

        //String aluno = spinner.getSelectedItem().toString();
/*
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> parent, View seletedItem, int pos, long id)
            {
                aluno = parent.getSelectedItem().toString();
            }

            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
*/
        String[] texto = {"Boa tarde senhores!",
                "Boa tarde professor Carlos!",
                "Gostava de informar que a Ana queixou-se de cansaço nas vistas, recomendamos que marquem uma consulta a um Oftalmologista assim que possível",
                "Obrigada, vamos fazê-lo imediatamente"
        };

        if(tipoUsuario==false){
            spinner.setVisibility(View.GONE);
            text5.setVisibility(View.GONE);

            text1.setText(texto[3]);
            text2.setText(texto[2]);
            text3.setText(texto[1]);
            text4.setText(texto[0]);
        }
/*
        if(tipoUsuario==true && (aluno.equals("Ana Marisa Rondão"))){
            data.setVisibility(View.VISIBLE);
            text1.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            text3.setVisibility(View.VISIBLE);
            text4.setVisibility(View.VISIBLE);

            text1.setText(texto[0]);
            text2.setText(texto[1]);
            text3.setText(texto[2]);
            text4.setText(texto[3]);

        } else {
            data.setVisibility(View.GONE);
            text1.setVisibility(View.GONE);
            text2.setVisibility(View.GONE);
            text3.setVisibility(View.GONE);
            text4.setVisibility(View.GONE);
        }
*/

        if(tipoUsuario){
            data.setVisibility(View.GONE);
            text1.setVisibility(View.GONE);
            text2.setVisibility(View.GONE);
            text3.setVisibility(View.GONE);
            text4.setVisibility(View.GONE);
        }


    }
}
