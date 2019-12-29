package io.bkrzyminski.movieinfoservice.resources;

import io.bkrzyminski.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main resource for movie catalog service
 *
 * @author bkrzyminski
 */
@RestController
@RequestMapping("/movies")
public class MovieResource {

    public static final String TEST_NAME = "Test name";

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId) {
        return new Movie(movieId, TEST_NAME);
    }

}
