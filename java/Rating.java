package com.example.rony.astrogeekz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;




public class Rating extends AppCompatActivity {
    private RatingBar ratingbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);


       ratingbar=(RatingBar)findViewById(R.id.ratingbar);

        ratingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
               Toast.makeText(Rating.this, "Thanks for Rating", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
