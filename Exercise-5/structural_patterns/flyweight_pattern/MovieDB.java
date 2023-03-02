package structural_patterns.flyweight_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class MovieDB{
    private final List<Movie> movies = new ArrayList<>();

    public void storeMovie(String genre, String name, String productions){
        MovieType movieType = MovieFactory.getMovieType(genre, productions);
        movies.add(new Movie(name,movieType));
    }

    public void display(){
        for(Movie movie: movies){
            System.out.println(movie);
        }
    }
}