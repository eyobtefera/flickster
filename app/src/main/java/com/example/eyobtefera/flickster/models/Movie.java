package com.example.eyobtefera.flickster.models;

import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

/**
 * Created by eyobtefera on 6/22/17.
 */
@Parcel
public class Movie {

    //values from API
    String title;
    String overview;
    String posterPath;
    String backdropPath;
    Double voteAverage;
    Double popularity;

    public Movie(){

    }
    // initialize from JSON data
    public Movie(JSONObject object) throws JSONException{
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
        voteAverage = object.getDouble("vote_average");
        popularity = object.getDouble("popularity");
    }
    public String getTitle() {
        return title;
    }
    public String getOverview() {
        return overview;
    }
    public String getPosterPath() {
        return posterPath;
    }
    public String getBackdropPath() {
        return backdropPath;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }
    public Double getPopularity() {
        return popularity;
    }
}
