package com.example.myapplication6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome, editTextIdade;
    private Button btnSalvar, btnEnviar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextIdade = findViewById(R.id.editTextIdade);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnEnviar = findViewById(R.id.btnEnviar);
        textView = findViewById(R.id.textView);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editTextNome.getText().toString();
                String idade = editTextIdade.getText().toString();

                // Exibe o nome e a idade no TextView
                String mensagem = "Nome: " + nome + "\nIdade: " + idade;
                textView.setText(mensagem);
            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implemente aqui a lógica para enviar os dados para algum lugar (por exemplo, um servidor).
            }
        });
    }
}
