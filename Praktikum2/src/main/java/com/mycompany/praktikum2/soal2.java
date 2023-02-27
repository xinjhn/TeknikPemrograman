package com.mycompany.praktikum2;

import java.util.Scanner;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class soal2 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("================================");
			for(int i = 0; i < 3; i++){
			    String s1 = sc.next();
			    int x = sc.nextInt();
			    System.out.printf("%-14s%03d\n", s1,x);
			}
		}
        System.out.println("================================");
    }
}
