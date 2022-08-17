package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    Bundle valoresDevueltos=this.getIntent().getExtras();

        ((EditText)findViewById(R.id.editTextTextPersonName3)).setText(valoresDevueltos.getString("caja1"));
        ((EditText)findViewById(R.id.editTextTextPersonName4)).setText(valoresDevueltos.getString("caja2"));
    }
}