package ex2;

public class Paint{
	private double coverage;
	
	public Paint(double c) {
		coverage = c;
	}
	
	public double amount(Shape s) {
		double paintNeeded = s.area() / coverage;
		System.out.println("Computing amount for " + s);
		return paintNeeded;
	}
}
