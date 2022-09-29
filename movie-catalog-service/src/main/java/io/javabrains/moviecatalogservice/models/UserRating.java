package io.javabrains.moviecatalogservice.models;

import org.apache.catalina.User;

import java.util.List;

public class UserRating {

    private List<Rating> userRating;

    private String userId;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public UserRating(){}

    public UserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
