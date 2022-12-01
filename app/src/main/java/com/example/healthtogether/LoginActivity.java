package com.example.healthtogether;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class LoginActivity extends Activity {
    private EditText email;
    private EditText senha;
    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        loginButton = findViewById(R.id.loginButton);
        registerButton = findViewById(R.id.registerButton);
        email.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#232323")));
        senha.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#232323")));

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (validate(email.getText().toString(), senha.getText().toString())) {
//                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                    startActivity(intent);
//                }
            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    public boolean validate(String email, String senha) {
        return (email != null && senha != null);
    }
}
