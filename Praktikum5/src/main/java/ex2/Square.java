package ex2;


/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class Square extends Rectangle{

    
    public Square() {
        super.setWidth(1.0);
        super.setLength(1.0);
    }
    
    public Square(double side) {
        super(side,side);
    }
    
    public Square(String color, boolean filled, double side){
        super(color,filled,side,side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString() {
        return "\nSquare subclass of[" + super.toString() + "side=" + super.getWidth() + "]";
    }
}
