package com.example.aula001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Desenvolvimento do Button btnKmMt e Associação
        // ao Button btnKmMt da Activity (tela)
        Button btnKmMt_prog = (Button)findViewById(R.id.btnKmMt);

        Button btnMtKm_prog = (Button)findViewById(R.id.btnMtKM);

        // Estrutura responsável por verificar o momento que o
        // botão é pressionado, disparand as ações (códigos)
        // para chamar a tela.

        btnKmMt_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent informando que estamos na Activity "MainActivity"
                // e vamos para a Activity "Intent"
                Intent intent = new Intent(MainActivity.this, KmM.class);

                // Comando que executa a intenção desenvolvida anteriormente
                startActivity(intent);
            }
        });

        btnMtKm_prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MKm.class);
                startActivity(intent);
            }
        });
    }
}