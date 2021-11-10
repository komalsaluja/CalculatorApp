package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inp1;
    private  EditText inp2;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inp1=(EditText) findViewById(R.id.inp1);
        inp2=(EditText) findViewById(R.id.inp2);
        output=(TextView) findViewById(R.id.output);


    }
    public void mul(View view) {
        float n1=Float.parseFloat(inp1.getText().toString());
        float n2=Float.parseFloat(inp2.getText().toString());
        float prod=n1*n2;
        output.setText(String.valueOf(prod));
    }

    public void div(View view) {
        float n1=Float.parseFloat(inp1.getText().toString());
        float n2=Float.parseFloat(inp2.getText().toString());
        float divi=n1/n2;
        output.setText(String.valueOf(divi));
    }

    public void add(View view) {
        float n1=Float.parseFloat(inp1.getText().toString());
        float n2=Float.parseFloat(inp2.getText().toString());
        float sum=n1+n2;
        output.setText(String.valueOf(sum));
    }

    public void sub(View view) {
        float n1=Float.parseFloat(inp1.getText().toString());
        float n2=Float.parseFloat(inp2.getText().toString());
        float diff=n1-n2;
        output.setText(String.valueOf(diff));
    }
}