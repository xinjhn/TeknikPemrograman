package ex2;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }
    
    public Circle(double r){
        this.radius = r;
    }

    public Circle(double r, String color, boolean filled){
        super(color, filled);
        this.radius = r;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
    
    public double getPerimeter(){
        return Math.PI * 2 * getRadius();
    }
    
    @Override
    public String toString(){
        return "\nCircle[" + super.toString() + "radius = " + radius + "]";
    }
}
