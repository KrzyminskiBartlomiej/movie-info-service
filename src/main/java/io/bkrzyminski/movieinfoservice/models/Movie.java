package io.bkrzyminski.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Model class
 *
 * @author bkrzyminski
 */
@Data
@AllArgsConstructor
public class Movie {
    private String movieId;
    private String name;
}
