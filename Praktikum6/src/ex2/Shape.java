package ex2;

public abstract class Shape {
	String shapeName;
	
	public Shape(String string) {
		this.shapeName = string;
	}

	public abstract double area();
	
	public String toString() {
		return shapeName;
	}
}
