package ex1;

public class Commission extends Hourly{
	private double totalSale;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
	}
	
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
	}
	
	public void addSales(double totalSale) {
		this.totalSale = this.totalSale + totalSale;
	}
	
	public double pay() {
		double payment = super.pay() + (totalSale * commissionRate);
		totalSale = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + totalSale;
		return result;
	}
}
