package com.example.primer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void presion(View v) { // metodo para mostrar texto en el momento que se haga click sobre el.
        Toast.makeText(this, "Se acaba de precionar el boton con onclick", Toast.LENGTH_SHORT).show();
    }

    public void presion2(View v) { // metodo para mostrar texto en el momento que se haga click sobre el.
        Toast.makeText(this, "Se preciono el segundo boton.", Toast.LENGTH_SHORT).show();
    }
}