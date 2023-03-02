package structural_patterns.flyweight_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class MovieType {
    private String genre;
    private String productions;
    MovieType(String genre, String productions){
        this.genre=genre;
        this.productions=productions;
    }
    @Override
    public String toString() {
        return "Genre = "+genre+" | Productions = "+productions;
    }
}
