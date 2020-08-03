package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
//import androidx.arch.core.util.Function;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textView_pantalla;

    private EditText editT_operadorA;
    private EditText editT_operadorB;

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_pantalla = findViewById(R.id.textView_pantalla);

        editT_operadorA = findViewById(R.id.editT_operadorA);
        editT_operadorB = findViewById(R.id.editT_operadorB);

        btn_suma = findViewById(R.id.btn_suma);
        btn_suma.setOnClickListener(this);

        btn_resta = findViewById(R.id.btn_resta);
        btn_resta.setOnClickListener(this);

        btn_multiplicacion = findViewById(R.id.btn_multiplicacion);
        btn_multiplicacion.setOnClickListener(this);

        btn_division = findViewById(R.id.btn_division);
        btn_division.setOnClickListener(this);

    }

    @Override
    public void onClick(View button) {
        float number_a = Float.valueOf(editT_operadorA.getText().toString());
        float number_b = Float.valueOf(editT_operadorB.getText().toString());
        String result;

        switch (button.getId()){
            case R.id.btn_suma:
                result = String.valueOf(number_a + number_b);
                break;
            case R.id.btn_resta:
                result = String.valueOf(number_a - number_b);
                break;
            case R.id.btn_multiplicacion:
                result = String.valueOf(number_a * number_b);
                break;
            case R.id.btn_division:
                result = String.valueOf(number_a / number_b);
                break;
            default:
                result = "0";
        }
        
        textView_pantalla.setText(result);
    }
}
