package ex3;

import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		String[] strList;
		int size;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nHow many integers do you want to sort? ");
		size = scan.nextInt();
		strList = new String[size];
		
		System.out.println("\nEnter the numbers...");
		for(int i = 0; i < size; i++) {
			strList[i] = scan.next();
		}
		Sorting.selectionSort(strList);
		System.out.println("\nYour numbers in sorted order...");
		for (int i = 0; i < size; i++) {
			System.out.println(strList[i] + "	");
		}
		System.out.println();
		scan.close();
	}
}
