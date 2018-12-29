package com.example.rony.astrogeekz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;


public class Facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        TextView textView14 = (TextView)findViewById(R.id.textView14);
        textView14.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

