package com.example.aula001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KmM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_m);

        //Declarando os componentes e fazendo associações
        final EditText edtKm_prog = (EditText)findViewById(R.id.edtKm);
        final EditText edtM_prog = (EditText)findViewById(R.id.edtMetro);
        Button btnConverter_prog = (Button)findViewById(R.id.btnConverter);

        //Ação do botão
        btnConverter_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Declaração das variáveis
                float km, m;

                // Leitura do campo KM
                // Conversao de uma String, pois o valor vem de um campo "Plain Text", para numeral
                // Conversão através do "Float.parseFloat".
                km = Float.parseFloat(edtKm_prog.getText().toString());

                m = km * 1000;

                // Convertendo um numeral para String
                edtM_prog.setText(String.valueOf(m));
            }
        });
    }
}