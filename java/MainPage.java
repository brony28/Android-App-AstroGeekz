package com.example.rony.astrogeekz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;












public class MainPage extends AppCompatActivity {
    private EditText name,password;
    private Button Login;
    private TextView Signup;
    private boolean val1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        name=(EditText) findViewById(R.id.editText1);
        password=(EditText)findViewById(R.id.editText2);
        Login = (Button) findViewById(R.id.button1);
        Signup = (TextView) findViewById(R.id.text); //Signup(Java)==text(XML)

        Signup.setOnClickListener(new OnClickListener(){
            public void onClick(View arg0){ //passing no argument
                Intent myintent=new Intent(MainPage.this,SignIn.class); //create an intent whose name is myintent
                startActivity(myintent);

            }
        });

        Login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0) { //passing no argument
                if (check1()) {
                    Toast.makeText(MainPage.this, "Login Success", Toast.LENGTH_SHORT).show();
                    Intent myintent1 = new Intent(MainPage.this, AstroPage.class); //create an intent whose name is myintent
                    startActivity(myintent1);
                } else {
                    Toast.makeText(MainPage.this, "Enter complete Detail ", Toast.LENGTH_SHORT).show();

                }
            }
        });




    }

    private boolean check1()
    {
        val1=false;
        String uname=name.getText().toString();
        String upass=password.getText().toString();

        if(uname.isEmpty()||upass.isEmpty())
        {
            val1=false;
        }
        else
        {
            val1=true;
        }
        return val1;

    }


}
