package Q2;


/** @author Hariboobaalan
 *  @version 1.0
 */

// Defining an interface named CalcArea.
interface CalcArea{
    public void calculateArea();
}

// Defining an interface named CalcVolume.
interface CalcVolume{
    public void calculateVolume();
}

/**
 * Circle is a class that implements the CalcArea interface
 */
class Circle implements CalcArea{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Circle = "+3.14*this.radius*this.radius);
    }
}

/**
 * The class Square implements the interface CalcArea
 */
class Square implements CalcArea{
    private double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Square = "+this.side*this.side);
    }
}

/**
 * The Triangle class implements the CalcArea interface and overrides the calculateArea() method
 */
class Triangle implements CalcArea{
    private double sideA,sideB,sideC;
    Triangle(double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    @Override
    public void calculateArea() {
        double s = (this.sideA+this.sideB+this.sideC)/2;
        double area = Math.sqrt(s*(s-this.sideA)*(s-this.sideB)*(s-this.sideC));
        System.out.println("Area of Triangle = "+area);
    }
}

/**
 * The class Sphere implements the interfaces CalcArea and CalcVolume
 */
class Sphere implements CalcArea, CalcVolume{
    private double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Sphere = "+3.14*this.radius*this.radius);
    }
    @Override
    public void calculateVolume() {
        System.out.println("Volume of Sphere = "+(4/3)*3.14*this.radius*this.radius*this.radius);
    }
}

/**
 * The class Cuboid implements the interfaces CalcArea and CalcVolume
 */
class Cuboid implements CalcArea,CalcVolume{
    private double side;
    Cuboid(double side){
        this.side=side;
    }
    @Override
    public void calculateArea() {
        System.out.println("Area of Cuboid = "+this.side*this.side);
    }
    @Override
    public void calculateVolume() {
        System.out.println("Volume of Cuboid = "+this.side*this.side*this.side);
    }
}
/**
 * The main method creates a circle, square, triangle, sphere, and cuboid, and then calls the
 * calculateArea and calculateVolume methods on each of them
 */
public class AreaVolume {
/**
 * 
 * @param args
 */
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.calculateArea();

        Square square1 = new Square(10);
        square1.calculateArea();

        Triangle triangle1 = new Triangle(7,6,5);
        triangle1.calculateArea();

        Sphere sphere1 = new Sphere(15);
        sphere1.calculateArea();
        sphere1.calculateVolume();

        Cuboid cuboid1 = new Cuboid(10);
        cuboid1.calculateArea();
        cuboid1.calculateVolume();

    }
}
