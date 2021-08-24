package com.example.batalladeconocimientos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etCodigo, etTitulo, etAnio, etURL, etDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCodigo = (EditText)findViewById(R.id.edCodigo);
        etTitulo = (EditText)findViewById(R.id.edTitulo);
        etAnio = (EditText)findViewById(R.id.edAño);
        etURL = (EditText)findViewById(R.id.edURL);
        etDescripcion = (EditText)findViewById(R.id.edDescripcion);
    }
    
}