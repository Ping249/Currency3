package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ntd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ntd = findViewById(R.id.ntd);

    }

    public void go(View v){
        String n= ntd.getText().toString();

       if(n.equals("")){
            new AlertDialog.Builder(this)
                    .setTitle("Problem")
                    .setMessage("Please enter your NTD amount")
                    .setPositiveButton("OK", null)
                    .show();
        }
        else {
            float NTD = Float.parseFloat(n);
            double USD = NTD/30.9;
            new AlertDialog.Builder(this)
                    .setTitle("Result")
                    .setMessage("USD:"+ USD)
                    .setPositiveButton("OK", null)
                    .show();
        }

    }
}
