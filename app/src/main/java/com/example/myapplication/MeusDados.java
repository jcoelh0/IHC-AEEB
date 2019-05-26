package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MeusDados extends AppCompatActivity {

    boolean tipoUsuario = MainActivity.getTipoUsuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        ImageView foto = findViewById(R.id.imageView);
        TextView nome = findViewById(R.id.textView1);
        TextView dado1 = findViewById(R.id.textView3);
        TextView desc1 = findViewById(R.id.textView4);
        TextView dado2 = findViewById(R.id.textView5);
        TextView desc2 = findViewById(R.id.textView6);
        TextView dado3 = findViewById(R.id.textView7);
        TextView desc3 = findViewById(R.id.textView8);
        TextView dado4 = findViewById(R.id.textView9);
        TextView desc4 = findViewById(R.id.textView10);
        TextView dado5 = findViewById(R.id.textView11);
        TextView desc5 = findViewById(R.id.textView12);
        TextView dado6 = findViewById(R.id.textView13);
        TextView desc6 = findViewById(R.id.textView14);
        TextView dado7 = findViewById(R.id.textView15);
        TextView desc7 = findViewById(R.id.textView16);

        if(tipoUsuario){
            foto.setImageResource(R.drawable.carlos);
            nome.setText("Carlos Fonseca");
            dado1.setText("1667123");
            desc1.setText("Doc. Identidade");
            dado2.setText("10234");
            desc2.setText("N. Docente");
            dado3.setText("261359789");
            desc3.setText("NIF");
            dado4.setText("carlos.f@eb.pt");
            desc4.setText("Email");
            dado5.setText("912321197");
            desc5.setText("Contacto");
            dado6.setText("");
            desc6.setText("");
            dado7.setText("");
            desc7.setText("");

        }else {
            foto.setImageResource(R.drawable.ana);
            nome.setText("Ana Marisa Rondão");
            dado1.setText("09/07/2013");
            desc1.setText("Data de nascimento");
            dado2.setText("José Rondão");
            desc2.setText("Enc. educação");
            dado3.setText("Rosa Rondão");
            desc3.setText("Enc. educação");
            dado4.setText("936252397");
            desc4.setText("Contacto");
            dado5.setText("912321197");
            desc5.setText("Contacto");
            dado6.setText("");
            desc6.setText("");
            dado7.setText("");
            desc7.setText("");
        }
    }
}
