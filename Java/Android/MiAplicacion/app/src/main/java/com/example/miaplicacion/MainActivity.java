package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText text1, text2;

    private Button boton1;

    private TextView text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    text1=(EditText)findViewById(R.id.editTextTextPersonName);
        text2=(EditText)findViewById(R.id.editTextTextPersonName2);
    text3=(TextView)findViewById(R.id.textView);

    Button botonNuevo=findViewById(R.id.button);

   /* botonNuevo.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            String valor1=text1.getText().toString();
            String valor2=text2.getText().toString();

            int num1= Integer.parseInt(valor1);
            int num2= Integer.parseInt(valor2);
            int suma1=num1+num2;
            text3.setText(suma1);

        }
    });
*/
        botonNuevo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent nuevoIntent=new Intent(view.getContext(),MainActivity2.class);


            Bundle valores=new Bundle();
            valores.putString("caja1",text1.getText().toString());
                valores.putString("caja2",text2.getText().toString());
nuevoIntent.putExtras(valores);

                startActivityForResult(nuevoIntent,0);

            }
        });






    }




/*    public void sumar(View vi)
    {

        String valor1=text1.getText().toString();
        String valor2=text2.getText().toString();

        int num1= Integer.parseInt(valor1);
        int num2= Integer.parseInt(valor2);
        int suma1=num1+num2;
        text3.setText(suma1);

    }
*/
}