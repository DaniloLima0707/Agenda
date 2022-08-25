package com.example.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_nome, et_telefone;
    Button btn_salvar, btn_consultar, btn_fechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nome=(EditText)findViewById(R.id.et_nome);
        et_telefone=(EditText)findViewById(R.id.et_telefone);
        btn_salvar=(Button)findViewById(R.id.btn_salvar);
        btn_consultar=(Button)findViewById(R.id.btn_consultar);
        btn_fechar=(Button)findViewById(R.id.btn_fechar);
    }
}