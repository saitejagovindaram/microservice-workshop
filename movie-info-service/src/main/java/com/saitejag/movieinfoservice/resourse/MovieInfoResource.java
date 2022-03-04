package com.saitejag.movieinfoservice.resourse;

import com.saitejag.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @RequestMapping("/{movieId}")
    public Movie getMovies(@PathVariable("movieId") String movieId){
        return new Movie("1234", "transformers");

    }
}
