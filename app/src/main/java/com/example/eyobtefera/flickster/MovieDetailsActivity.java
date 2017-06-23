package com.example.eyobtefera.flickster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.eyobtefera.flickster.models.Movie;

import org.parceler.Parcels;

public class MovieDetailsActivity extends AppCompatActivity {

    Movie movie;
    // the view objects
    TextView tvTitle;
    TextView tvOverview;
    RatingBar rbVoteAverage;
    ProgressBar popularity;
    int popConvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        // unwrap the movie passed in via intent, using its simple name as a key
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvOverview = (TextView) findViewById(R.id.tvOverview);
        rbVoteAverage = (RatingBar) findViewById(R.id.rbVoteAverage);
        popularity = (ProgressBar) findViewById(R.id.popularity);

        movie = (Movie) Parcels.unwrap(getIntent().getParcelableExtra(Movie.class.getSimpleName()));
        Log.d("MovieDetailsActivity", String.format("Showing details for '%s'", movie.getTitle()));

        // set the title and overview
        tvTitle.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());

        // vote average is 0..10, convert to 0..5 by dividing by 2
        float voteAverage = movie.getVoteAverage().floatValue();
        rbVoteAverage.setRating(voteAverage = voteAverage > 0 ? voteAverage / 2.0f : voteAverage);

        //set popularity rating
        double d = movie.getPopularity();
        popConvert = (int) d;
        popularity.setProgress(popConvert);
    }
}
