package ex1;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */

/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;


    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
    radius = 1.0;
    color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color
     * @param r */
    public Circle(double r) { // 2nd constructor
    radius = r;
    color = "red";
    }

    /* Constructs a Circle instance with the given radius and given color*/
    public Circle(double r, String c){ //3rd constructor
        radius = r;
        color = c;
    }

       /* @return the radius  */
    public double getRadius() {
    return radius; 
    }


       /* @return  the color of this Circle instance*/
    public String getColor(){
        return color;
    }
    
        //set the color of this Circle instance
    public void setColor(String c){
        this.color = c;
    }

     /* @return the area of this Circle instance */
    public double getArea() {
    return radius*radius*Math.PI;
    }

    /** Return a self-descriptive string of this instance in the form of 
   Circle[radius=?,color=?] */
    @Override
    public String toString() {
    return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
