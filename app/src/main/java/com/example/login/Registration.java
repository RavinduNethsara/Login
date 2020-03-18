package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    EditText etEmail,etPass,etName,etConfPass;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
        etConfPass = findViewById(R.id.etConfPass);

        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name, email, pass, conpass;

                name = etName.getText().toString();
                email = etEmail.getText().toString();
                pass = etPass.getText().toString();
                conpass = etConfPass.getText().toString();

                if(name.equals("")){
                    Toast.makeText(Registration.this,"Name Required",Toast.LENGTH_SHORT).show();
                }
                else if(email.equals("")){
                    Toast.makeText(Registration.this,"Email Required",Toast.LENGTH_SHORT).show();
                }
                else if(pass.equals("")){
                    Toast.makeText(Registration.this,"Password Required",Toast.LENGTH_SHORT).show();
                }
                else if(conpass.equals("")){
                    Toast.makeText(Registration.this,"Password Required",Toast.LENGTH_SHORT).show();
                }
                else if(!conpass.equals("pass")){
                    Toast.makeText(Registration.this,"Password Mismatch",Toast.LENGTH_SHORT).show();
                }
                else{
                    //Authentication
                }
            }
        });

    }
}
