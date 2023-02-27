package ex2;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public abstract class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){
        color = "blue";
        filled = false;
    }
    
    public Shape(String c, boolean f){
        color = c;
        filled = f;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean f){
        this.filled = f;
    }
    
    public String convertFilled(boolean filled){
        if(filled == true){
            return "filled";
        }
        else {
            return "not filled";
        }
    }
    
    @Override
    public String toString(){
        return "Shape[color = " + color + " filled = " + convertFilled(isFilled()) + "]";
    }
}
