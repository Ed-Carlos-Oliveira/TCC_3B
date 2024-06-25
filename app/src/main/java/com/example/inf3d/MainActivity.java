package com.example.inf3d;

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

        Button abrir_historico = findViewById(R.id.btn_historico);
        abrir_historico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Historico.class);
                startActivity (intent);
            }
        });

        Button abrir_produtos = findViewById(R.id.btn_produtos);
        abrir_produtos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Produtos.class);
                startActivity (intent);
            }
        });

        Button abrir_fornecedores = findViewById(R.id.btn_fornecedores);
        abrir_fornecedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fornecedores.class);
                startActivity (intent);
            }
        });

        Button abrir_cliente = findViewById(R.id.btn_cliente);
        abrir_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Clientes.class);
                startActivity (intent);
            }
        });

    }
}