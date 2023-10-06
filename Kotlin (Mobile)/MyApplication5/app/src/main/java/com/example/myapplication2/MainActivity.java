package com.example.myapplication2;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextIdade;
    Button buttonEnviar;
    Button buttonSalvar;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        buttonEnviar = findViewById(R.id.buttonEnviar);
        buttonSalvar = findViewById(R.id.buttonSalvar);
        textViewResultado = findViewById(R.id.textViewResultado);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
//                intent.putExtra("nome", editTextNome);
//                intent.putExtra("idade", editTextIdade);
                  startActivity(intent);
            }
        });
    }
}