package structural_patterns.flyweight_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class Movie {
    
    private String name;
    private MovieType movieType;
    Movie(String name, MovieType movieType) {
        this.name=name;
        this.movieType=movieType;
    }

    @Override
    public String toString() {
        return "Movie Name = "+name +" | "+movieType;
    }
}