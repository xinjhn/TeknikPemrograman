package ex2;

public class Rectangle extends Shape{
	private double length, width;
	
	public Rectangle(double length,double width) {
		super("Rectangle");
		this.width = width;
		this.length = length;
	}

	public double area() {
		return length * width;
	}
	
	public String toString() {
		return super.toString() + " of length " + length + " and width " + width;
		
	}
}
