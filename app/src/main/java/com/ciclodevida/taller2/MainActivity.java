package com.ciclodevida.taller2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    TextView num2;
    Button calcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editText);
        num2=(TextView) findViewById(R.id.textView);
        calcular=(Button)findViewById(R.id.button);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(num1.getText().toString());
                final int random = new Random().nextInt((100 - 1) + 1) + 1;
                if(n1 == random){
                        Toast notificacion = Toast.makeText(MainActivity.this, "Has ganado", Toast.LENGTH_LONG);
                        notificacion.show();
                    }else{
                        Toast notificacion = Toast.makeText(MainActivity.this, "Sigue intentando", Toast.LENGTH_LONG);
                        notificacion.show();
                    }
                num2.setText(String.valueOf(random));
                }
        });
    }
}
