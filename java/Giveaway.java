package com.example.rony.astrogeekz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Giveaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giveaway);
        TextView textView11 = (TextView)findViewById(R.id.textView11);
        textView11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView12 = (TextView)findViewById(R.id.textView12);
        textView12.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
