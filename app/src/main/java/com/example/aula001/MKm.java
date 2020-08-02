package com.example.aula001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MKm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_km);

        //Declarando os componentes e fazendo associações
        final EditText edtM_prog = (EditText) findViewById(R.id.edtMetro);
        final EditText edtKm_prog = (EditText)  findViewById(R.id.edtKm);
        Button btnConverter_prog = (Button) findViewById(R.id.btnConverter);

        //Ação do click do botão
        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Declaração das variáveis
                float metro, km;

                //Leitura e atribuição do valor de m.
                //Observação: O valor vem como "String" do "PlainText",
                //e vamos converter em número através do
                //"Float.parseFloat".
                metro = Float.parseFloat(edtM_prog.getText().toString());

                // Cálculo para converter Metro em KM
                km = metro / 1000;

                // Convertendo "km" que é um numeral para String
                edtKm_prog.setText(String.valueOf(km));
            }
        });
    }
}