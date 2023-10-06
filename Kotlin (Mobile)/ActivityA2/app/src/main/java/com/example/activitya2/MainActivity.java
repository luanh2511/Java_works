package com.example.activitya2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;
    private EditText edtAmount;
    private RadioGroup radioGroup;
    private TextView tvResult;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtAmount = findViewById(R.id.edtAmount);
        radioGroup = findViewById(R.id.radioGroup);
        tvResult = findViewById(R.id.tvResult);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                String amountStr = edtAmount.getText().toString();
                double amount = Double.parseDouble(amountStr);

                String currency = "";

                int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (selectedRadioButtonId == R.id.radioUSD) {
                    currency = " Dólares";
                    amount *= 5.0642;
                } else if (selectedRadioButtonId == R.id.radioEUR) {
                    currency = " Euros";
                    amount *= 5.3087;
                } else if (selectedRadioButtonId == R.id.radioGBP) {
                    currency = " Libras";
                    amount *= 6.1137;
                }

                String resultMessage = "Prezado(a) " + name + "\n" +
                        "Se você tiver um salário de " + amountStr + currency + "\n" +
                        "Você vai receber " + String.format("%.2f", amount) + " reais por mês";

                tvResult.setText(resultMessage);
            }
        });
    }
}
