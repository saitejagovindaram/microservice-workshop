package com.saitejag.ratingsdataservice.resouces;

import com.saitejag.ratingsdataservice.models.Rating;
import com.saitejag.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRatings(@PathVariable("movieId") String movieId){
        return new Rating("123",4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){
        List<Rating> ratings= Arrays.asList(
                new Rating("xyz", 4),
                new Rating("abc", 8)
        );
        UserRating userRating=new UserRating();
        userRating.setRatingList(ratings);
        return userRating;
    }
}
