package com.example.eyobtefera.flickster.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by eyobtefera on 6/22/17.
 */

public class Movie {

    //values from API
    private String title;
    private String overview;
    private String posterPath;
    private String backdropPath;

    // initialize from JSON data
    public Movie(JSONObject object) throws JSONException{
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
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
}
