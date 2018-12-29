package com.example.rony.astrogeekz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    private EditText name,password,email;
    private Button SignUp;
    private boolean val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        name=(EditText) findViewById(R.id.editText3);
        password=(EditText)findViewById(R.id.editText4);
        email=(EditText)findViewById(R.id.editText5);
        SignUp = (Button) findViewById(R.id.button2); //Signup(Java)==text(XML)

        SignUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) { //passing no argument
                if (check()) {
                    Toast.makeText(SignIn.this, "Email sent for Verification ", Toast.LENGTH_SHORT).show();
                    Intent myintent = new Intent(SignIn.this, MainPage.class); //create an intent whose name is myintent
                    startActivity(myintent);
                } else {
                    Toast.makeText(SignIn.this, "Enter complete Detail ", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    private boolean check()
    {
        val=false;
        String uname=name.getText().toString();
        String upass=password.getText().toString();
        String uemail=email.getText().toString();

        if(uname.isEmpty()||upass.isEmpty()||uemail.isEmpty())
        {
            val=false;
        }
        else
        {
            val=true;
        }
        return val;

    }




}
