package creational_patterns.builder_pattern;

public class Shops{
    String electronicsStore, foodCourt, mobileShop, jewellery, grocery, theater;

    public Shops(String electronicsStore, String foodCourt, String mobileShop, String jewellery, String grocery, String theater){
        this.electronicsStore = electronicsStore;
        this.foodCourt=foodCourt;
        this.mobileShop=mobileShop;
        this.jewellery=jewellery;
        this.grocery=grocery;
        this.theater=theater;
    }

    @Override
    public String toString() {
        return "Electronic Store = "+electronicsStore+" | Food Court = "+foodCourt+" | MobileShop = "+mobileShop+" | Jewellery = "+jewellery+" | Grocery = "+grocery+" | Theater = "+theater;
    }
}