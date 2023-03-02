package structural_patterns.flyweight_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.util.HashMap;

public class MovieFactory{
    private static final HashMap<String,MovieType> movieTypesDataBase = new HashMap<>();
    
    public static MovieType getMovieType(String genre, String hero){
        if(movieTypesDataBase.get(genre)==null){
            MovieType movieObject = new MovieType(genre,hero);
            movieTypesDataBase.put(genre,movieObject);
        }
        return movieTypesDataBase.get(genre);
    }
}