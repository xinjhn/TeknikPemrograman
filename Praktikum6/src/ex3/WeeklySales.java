package ex3;

import java.util.Scanner;

public class WeeklySales {
	public static void main(String [] args) {
		Salesperson[] salesStaff = new Salesperson[11];
		
		salesStaff[0] = new Salesperson("Jane","Jones", 3000);
		salesStaff[1] = new Salesperson("Daffy","Duck", 4935);
		salesStaff[2] = new Salesperson("James","Jones", 3000);
		salesStaff[3] = new Salesperson("Dick","Walter", 2800);
		salesStaff[4] = new Salesperson("Don","Trump", 1570);
		salesStaff[5] = new Salesperson("Jane","Black", 3000);
		salesStaff[6] = new Salesperson("Harry","Taylor", 7300);
		salesStaff[7] = new Salesperson("Andy","Adams", 5000);
		salesStaff[8] = new Salesperson("Jim","Doe", 2850);
		salesStaff[9] = new Salesperson("Walt","Smith", 3000);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		String first = sc.next();
		System.out.println("Enter Last Name: ");
		String last = sc.next();
		System.out.println("Enter Salary: ");
		int sale = sc.nextInt();
		
		salesStaff[10] = new Salesperson(first, last, sale);

		
		Sorting.insertionSort(salesStaff);
		sc.close();

		
		System.out.println("\nRanking of Sales for the Week\n");
		System.out.println("Insertion Sort (Descending)");
		for (Salesperson s : salesStaff) {
			System.out.println(s);
		}
		
		Sorting.selectionSort(salesStaff);
		System.out.println("\nSelection Sort (Ascending)");
		for (Salesperson s : salesStaff) {
			System.out.println(s);
		}
	}
}
