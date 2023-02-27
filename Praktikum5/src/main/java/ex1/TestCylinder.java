package ex1;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class TestCylinder {

    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
 // with default color, radius, and height
 Cylinder c1 = new Cylinder();
 System.out.println("Cylinder1:"
 + "\nRadius=" + c1.getRadius()
 + "\nHeight=" + c1.getHeight()
 + "\nBase area=" + c1.getArea()
 + "\nVolume=" + c1.getVolume()
 + c1.toString());
 
 // Declare and allocate a new instance of cylinder
 // specifying height, with default color and radius
 Cylinder c2 = new Cylinder(10.0);
 System.out.println("\nCylinder2:"
 + "\nRadius=" + c2.getRadius()
 + "\nHeight=" + c2.getHeight()
 + "\nBase Area=" + c2.getArea()
 + "\nVolume=" + c2.getVolume()
 + c2.toString());
 
 // Declare and allocate a new instance of cylinder
 // specifying radius and height, with default color
 Cylinder c3 = new Cylinder(2.0, 10.0);
 System.out.println("\nCylinder3:"
 + "\nRadius=" + c3.getRadius()
 + "\nHeight=" + c3.getHeight()
 + "\nBase Area=" + c3.getArea()
 + "\nVolume=" + c3.getVolume()
 + c3.toString());
    }
}

