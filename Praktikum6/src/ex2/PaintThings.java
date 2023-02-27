package ex2;

import java.text.DecimalFormat;

public class PaintThings {
	public static void main(String[] args) {
		final double COVERAGE = 350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck;
		Sphere bigBall;
		Cylinder tank;
		
		double deckAmt, ballAmt, tankAmt;
		
		deck = new Rectangle(20, 35);
		bigBall = new Sphere(15);
		tank = new Cylinder(10, 30);
		
		deckAmt = paint.amount(deck);
		ballAmt = paint.amount(bigBall);
		tankAmt = paint.amount(tank);
		
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\nNumber of gallons of paint needed...");
		System.out.println("Deck\t\t" + fmt.format(deckAmt));
		System.out.println("Big Ball\t" + fmt.format(ballAmt));
		System.out.println("Tank\t\t" + fmt.format(tankAmt));
	}
}
