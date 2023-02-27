package ex1;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius and height
    public Cylinder() {
    super(); // call superclass no-arg constructor Circle()
    height = 1.0; 
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
    super(); // call superclass no-arg constructor Circle()
    this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
    super(radius); // call superclass constructor Circle(r)
    this.height = height;
    }
    
    // Constructor with given color, given radius, and given height
    public Cylinder(String color, double radius, double height){
        super(radius,color);
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
    return height; 
    }
    
    //override the getArea of a circle into a surface area of a cylinder
    @Override
    public double getArea(){
       return ((2*Math.PI*getRadius()*getHeight()) + (2*super.getArea()));
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
    return super.getArea()*height; 
    }
    
    /*Return a self-descriptive string of this instance in the form of 
        Cylinder[radius=?,color=?,]*/
    @Override
    public String toString() { // in Cylinder class
    return "\nCylinder: subclass of " + super.toString() // use Circle's toString()
    + " height=" + height;
    }
}

