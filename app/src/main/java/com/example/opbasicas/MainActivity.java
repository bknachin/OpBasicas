package com.example.opbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numero1, numero2;
    Button boton;
    TextView rs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     numero1 = (EditText) findViewById(R.id.n1);
     numero2 = (EditText) findViewById(R.id.n2);
     boton = (Button) findViewById(R.id.btn);
     rs = (TextView) findViewById(R.id.resul);

     boton.setOnClickListener(this);

    }

        public void onClick(View view)
    {
    int nm = Integer.parseInt(numero1.getText().toString());
    int nm1 = Integer.parseInt(numero2.getText().toString());
    int suma = nm+nm1;
    rs.setText(""+suma);


    }


}
