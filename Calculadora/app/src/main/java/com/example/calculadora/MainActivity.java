package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button btnSumar;
    public Button btnRestar ;
    public Button btnDividir;
    public Button btnLimpiar ;
    public EditText txtNumeroUno;
    public EditText txtNumeroDos;
    public TextView lblResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar = findViewById(R.id.btnSuma);
        btnRestar = findViewById(R.id.btnResta);
        btnDividir = findViewById(R.id.btnDivision);
        btnLimpiar = findViewById(R.id.btnLimpiar);
        txtNumeroUno = findViewById(R.id.txtNumeroUno);
        txtNumeroDos = findViewById(R.id.txtNumeroDos);
        lblResultado = findViewById(R.id.lblResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblResultado.setText(suma(Integer.parseInt(txtNumeroUno.getText().toString()), Integer.parseInt(txtNumeroDos.getText().toString()))+"");
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblResultado.setText(resta(Integer.parseInt(txtNumeroUno.getText().toString()), Integer.parseInt(txtNumeroDos.getText().toString()))+"");
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lblResultado.setText(dividir(Integer.parseInt(txtNumeroUno.getText().toString()), Integer.parseInt(txtNumeroDos.getText().toString()))+"");
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            lblResultado.setText("");
            txtNumeroUno.setText("");
            txtNumeroDos.setText("");
            }
        });
    }


    public int suma(int numerouno, int numerodos){
        return numerouno + numerodos;
    }

    public int resta(int numerouno, int numerodos){
        return numerouno - numerodos;
    }

    public int dividir(int numerouno, int numerodos){
        return numerouno/numerodos;
    }


}
