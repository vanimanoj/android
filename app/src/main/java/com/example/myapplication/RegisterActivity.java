package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    AppCompatButton b1,b2;
    String getname,getadd,getph,getmail,getusername,getpass,getconpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.add);
        e3=(EditText) findViewById(R.id.ph);
        e4=(EditText) findViewById(R.id.mail);
        e5=(EditText) findViewById(R.id.username);
        e6=(EditText) findViewById(R.id.pass);
        e7=(EditText) findViewById(R.id.conpass);
        b1=(AppCompatButton) findViewById(R.id.reg);
        b2=(AppCompatButton)findViewById(R.id.backtologin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getname, Toast.LENGTH_SHORT).show();
                getadd= e2.getText().toString();
                Toast.makeText(getApplicationContext(),getadd,Toast.LENGTH_SHORT).show();
                getph=e3.getText().toString();
                Toast.makeText(getApplicationContext(),getph,Toast.LENGTH_SHORT).show();
                getmail=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getmail,Toast.LENGTH_SHORT).show();
                getusername=e5.getText().toString();
                Toast.makeText(getApplicationContext(),getusername,Toast.LENGTH_SHORT).show();
                getpass=e6.getText().toString();
                Toast.makeText(getApplicationContext(),getpass,Toast.LENGTH_SHORT).show();
                getconpass=e7.getText().toString();
                Toast.makeText(getApplicationContext(),getconpass,Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}