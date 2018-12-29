package com.example.rony.astrogeekz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Socialmedia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socialmedia);

        TextView textView15= (TextView)findViewById(R.id.textView15);
        textView15.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView16 = (TextView)findViewById(R.id.textView16);
        textView16.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView17 = (TextView)findViewById(R.id.textView17);
        textView17.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView18 = (TextView)findViewById(R.id.textView18);
        textView18.setMovementMethod(LinkMovementMethod.getInstance());





    }
}
