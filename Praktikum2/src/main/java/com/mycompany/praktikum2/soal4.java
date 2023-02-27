/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;

import java.util.Scanner;
/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class soal4 {
    public static void main(String[] args){
        int item, gaji;
        try (Scanner sc = new Scanner(System.in)) {
			item = sc.nextInt();
		}
        if(item > 80){
            gaji = item * 50000 * 35 / 100 + 500000;
        }
        else if (item >= 40){
            gaji = item * 50000 * 25 / 100 + 500000;
        }
        else if (item >= 15){
            gaji = item * 50000 * 10 / 100 + 500000;
        }
        else {
            gaji = 500000 - ((15 - item ) * 50000 * 15 /100);
        }
        System.out.println(gaji);
    }
}
