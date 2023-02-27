package ex3;

public class Salesperson implements Comparable{
	private String 	firstName, lastName;
	private Integer totalSales;
	
	public Salesperson(String first, String last, int sales) {
		firstName = first;
		lastName = last;
		totalSales = sales;
	}
	
	public String toString() {
		return lastName + ", " + firstName + "\t: " + totalSales;
	}
	
	public boolean equals(Object other) {
		return (lastName.equals(((Salesperson)other).getLastName()) &&
				firstName.equals(((Salesperson)other).getFirstName()));
	}

	public int compareTo(Object other) {
		int result = -1;
		    if(this.totalSales < ((Salesperson)other).totalSales) {
		    	result = -1;
		    }
		    else if(this.totalSales > ((Salesperson)other).totalSales) {
		    	result = 1;
		    }
		    else  {
		    	int k = this.firstName.compareTo(((Salesperson)other).firstName);
		    	if(k != 0) {
		    		result = k;
		    	} 
			else {
			    result = this.lastName.compareTo(((Salesperson)other).lastName);
			}
		    }
		return result;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getSales() {
		return totalSales;
	}
}
