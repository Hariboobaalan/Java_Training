package Q2;

/**
 *  @author Hariboobaalan
 *  @version 1.0
 * 
 */

/**
 * The class Complex has two fields, real and image, and a constructor that initializes the fields. It
 * also has a method addComplex that adds the real and image parts of the complex number passed as
 * parameter to the real and image parts of the object on which the method is called
 */
class Complex{
    int real;
    int image;
    Complex(int real, int image){
        this.real=real;
        this.image=image;
    }

    
    /** 
     * @param comp
     */
    public void addComplex(Complex comp){
        this.real+=comp.real;
        this.image+=comp.image;
    }
}

public class ComplexNumber {
    public static void main(String[] args) {
        // Creating a new object of the class Complex and assigning it to the variable a.
        Complex a = new Complex(3, 4);
        // Creating a new object of the class Complex and assigning it to the variable b.
        Complex b = new Complex(4, 10);
        a.addComplex(b);
        System.out.println("Real = "+a.real+" Image = "+a.image);
    }
}
