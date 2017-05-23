package com.jerrysolutions.beastmovies.services;

/**
 * Created by Jerry on 5/22/2017.
 */

public class MovieServices {
    private MovieServices() {
    }

    public static class SearchMoviesRequest{
        public String query;

        public SearchMoviesRequest(String query) {
            this.query = query;
        }
    }
    public static class SearchMoviesResponse{
        public String modifiedQuery;
    }
}
