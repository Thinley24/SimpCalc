package com.example.simpcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText number2 = (EditText) findViewById(R.id.editTextNumber2);
        Button btn1 = (Button) findViewById(R.id.custom_button1);
        Button btn2 = (Button) findViewById(R.id.custom_button2);
        Button btn3 = (Button) findViewById(R.id.custom_button3);
        TextView txt = (TextView) findViewById(R.id.textView2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1, s2;
                s1 = number1.getText().toString();
                int n1 = Integer.parseInt(s1);
                s2 = number2.getText().toString();
                int n2 = Integer.parseInt(s2);

                txt.setText(s1+" + "+s2+" = "+(n1+n2));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1.setText("");
                number2.setText("");
            }
        });
        
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = null;
                dialog.dismiss();
//                dialog.cancel(); //we can also use cancel(). It will call your DialogInterface.OnCancelListener (if registered)
            }
        });
    }
}