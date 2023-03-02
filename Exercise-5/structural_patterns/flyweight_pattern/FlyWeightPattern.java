package structural_patterns.flyweight_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class FlyWeightPattern {
    /**
     * 
     * @param args
     * @return null
     */
    public static void main(String[] args) {
        MovieDB movieStore = new MovieDB();
        movieStore.storeMovie("animated","tangled","disney");
        movieStore.storeMovie("drama","abcd","20th century fox");
        movieStore.storeMovie("animated","cars","disney");

        movieStore.display();
    }
}