package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1, text2;
    private Button btn;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.editTextTextPersonName);
        text2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        btn = (Button) findViewById(R.id.button);
        result = (TextView) findViewById(R.id.result);

       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1_str = text1.getText().toString();
                String text2_str = text2.getText().toString();
                int text1_int = Integer.parseInt(text1_str);
                int text2_int = Integer.parseInt(text2_str);
                int result_int = text1_int + text2_int;
                result.setText(String.valueOf(result_int));
            }
        });*/

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity2.class);

                Bundle valores = new Bundle();
                valores.putString("caja1", text1.getText().toString());
                valores.putString("caja2", text2.getText().toString());
                intent.putExtras(valores);

                startActivityForResult(intent, 0);
            }
        });
    }


    /*public void suma(View view) {
        String num1 = text1.getText().toString();
        String num2 = text2.getText().toString();
        int num1Int = Integer.parseInt(num1);
        int num2Int = Integer.parseInt(num2);
        result.setText(String.valueOf(num1Int + num2Int));
    }*/
}