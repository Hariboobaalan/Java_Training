package structural_patterns.flyweight_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

import java.util.HashMap;

public class MovieFactory{
    private static final HashMap<String,MovieType> movieTypesDataBase = new HashMap<>();
    
    public static MovieType getMovieType(String genre, String productions){
        if(movieTypesDataBase.get(genre)==null){
            MovieType movieTypeObject = new MovieType(genre,productions);
            movieTypesDataBase.put(genre,movieTypeObject);
        }
        return movieTypesDataBase.get(genre);
    }
}
