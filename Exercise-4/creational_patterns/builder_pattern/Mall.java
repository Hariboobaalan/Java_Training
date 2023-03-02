package creational_patterns.builder_pattern;

/** @author Hariboobaalan
 *  @version 1.0
 */

public class Mall{
    
    Shops shopsObject;
    String nameOfMall;

    public Mall(BuildMall bm){
        nameOfMall = "LULU Mall";
        shopsObject = new Shops(bm.electronicsStore, bm.foodCourt, bm.mobileShop, bm.jewellery, bm.grocery, bm.theater);
    }

    @Override
    public String toString() {
        return nameOfMall +" => { "+shopsObject+" }";
    }

    static class BuildMall{
        String electronicsStore, foodCourt, mobileShop, jewellery, grocery, theater;
        
        public BuildMall setElectronicsStore(String electronicsStore){
            this.electronicsStore=electronicsStore;
            return this;
        }
        public BuildMall setFoodCourt(String foodCourt){
            this.foodCourt=foodCourt;
            return this;
        }
        public BuildMall setMobileShop(String mobileShop){
            this.mobileShop=mobileShop;
            return this;
        }
        public BuildMall setJewellery(String jewellery){
            this.jewellery=jewellery;
            return this;
        }
        public BuildMall setGrocery(String grocery){
            this.grocery=grocery;
            return this;
        }
        public BuildMall setTheater(String theater){
            this.theater=theater;
            return this;
        }
        
        public Mall build(){
            return new Mall(this);
        }
        
    }

}
// Defines an instance for creating an object but letting subclasses decide which class to instantiate 
// Allows a fine control over the construction process.