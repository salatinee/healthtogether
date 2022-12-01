package com.example.healthtogether;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class RegisterActivity extends Activity {
    private EditText nome;
    private EditText dataNascimento;
    private EditText email;
    private EditText cep;
    private EditText cpf;
    private EditText senha;
    private EditText confirmarSenha;
    private Button cadastrar;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        nome = findViewById(R.id.novoNome);
        dataNascimento = findViewById(R.id.novoDataNascimento);
        email = findViewById(R.id.novoEmail);
        cep = findViewById(R.id.novoCep);
        cpf = findViewById(R.id.novoCpf);
        senha = findViewById(R.id.novoSenha);
        confirmarSenha = findViewById(R.id.novoConfirmarSenha);
        cadastrar = findViewById(R.id.cadastrar);
        voltar = findViewById(R.id.voltar);
        email.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#232323")));
        senha.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#232323")));
        confirmarSenha.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#232323")));

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validate(nome.getText().toString(), dataNascimento.getText().toString(), email.getText().toString(), cep.getText().toString(), cpf.getText().toString(), senha.getText().toString(), confirmarSenha.getText().toString())) {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean validate(String nome, String dataNascimento, String email, String
            cep, String cpf, String senha, String confirmarSenha) {
        return (!nome.equals("") && !dataNascimento.equals("") && !email.equals("") && !cep.equals("") && !cpf.equals("null") && !senha.equals("") && !confirmarSenha.equals(""));
    }
}