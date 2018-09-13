package com.weather.pc.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtname,txtemail,txtphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtname=findViewById(R.id.edtname);
        txtemail=findViewById(R.id.edtemail);
        txtphone=findViewById(R.id.edtphone);

        if(savedInstanceState!=null){
            txtname.setText(savedInstanceState.getString("name"));
            txtemail.setText(savedInstanceState.getString("email"));
            txtphone.setText(savedInstanceState.getString("phone"));

        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name",txtname.getText().toString());
        outState.putString("email",txtemail.getText().toString());
        outState.putString("phone",txtphone.getText().toString());

    }
}
