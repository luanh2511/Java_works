package com.example.myapplication2;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText valor1;
    EditText valor2;
    Button botaoSoma;
    Button botaoSub;
    Button botaoDiv;
    Button botaoMult;
    TextView textoDeSaida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        botaoSoma = findViewById(R.id.botaoSoma);
        botaoSub = findViewById(R.id.botaoSub);
        botaoDiv = findViewById(R.id.botaoDiv);
        botaoMult = findViewById(R.id.botaoMult);
        textoDeSaida = findViewById(R.id.textoDeSaida);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(valor1.getText().toString());
                int val2 = Integer.parseInt(valor2.getText().toString());
                int resultado = val1 + val2;

                textoDeSaida.setText("Resultado: "+ resultado);
            }
        });

        botaoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(valor1.getText().toString());
                int val2 = Integer.parseInt(valor2.getText().toString());
                int resultado = val1 - val2;

                textoDeSaida.setText("Resultado: "+ resultado);
            }
        });

       botaoDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(valor1.getText().toString());
                int val2 = Integer.parseInt(valor2.getText().toString());
                int resultado = val1 / val2;

                textoDeSaida.setText("Resultado: "+ resultado);
            }
        });

        botaoMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val1 = Integer.parseInt(valor1.getText().toString());
                int val2 = Integer.parseInt(valor2.getText().toString());
                int resultado = val1 * val2;

                textoDeSaida.setText("Resultado: "+ resultado);
            }
        });
    }
}