package creational_patterns.builder_pattern;

public class BuilderPattern {
    public static void main(String[] args) {
        Mall luluMall = (new Mall.BuildMall()).setElectronicsStore("HP Electronics").setFoodCourt("Subway").setGrocery("SPAR").setJewellery("Kalyan").setMobileShop("MI").setTheater("INOX").build();
        System.out.println(luluMall);
    }
}

// It is used to build a complex object using simple objects in a step by step approach.
// There are a number of optional parameters for the object.
// We can specify which parts the object must posses and build the object in a step by step manner.
// Finally a Builder class is used to build the original object.