package ex2;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class TestShape {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("Circle1 : "
                + "\n Radius = " + c1.getRadius()
                + c1.toString());
        
        Circle c2 = new Circle(5.0);
        System.out.println("\nCircle 2 :"
                + "\n Radius = " + c2.getRadius()
                + c2.toString());
        
        Circle c3 = new Circle(10.0 , "red", true);
        System.out.println("\nCircle 3 : "
                + "\nRadius = " + c3.getRadius()
                + c3.toString());
        
        Square s1 = new Square();
        System.out.println("\nSquare 1 : "
                + "\nSide = " + s1.getWidth()
                + "\nBase Area = " +s1.getArea()
                + "\nPerimeter = " +s1.getPerimeter()
                + s1.toString());
        
        Square s2 = new Square(10.0);
        System.out.println("\nSquare 2 : "
                + "\nSide = " + s2.getWidth()
                + s2.toString());
        
        Square s3 = new Square("green", true, 20.0);
        System.out.println("\nSquare 3 : "
                + "\nSide = " + s3.getWidth()
                + s3.toString());
    }
}
