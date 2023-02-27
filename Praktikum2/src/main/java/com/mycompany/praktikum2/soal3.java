/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class soal3 {
    public static void main(String[] args){
    char operator;
    int x,y,hasil;
        try (Scanner sc = new Scanner(System.in)) {
            x = sc.nextInt();
            operator = sc.next().charAt(0);
            y = sc.nextInt();
            
            switch(operator){
                case '+':
                    hasil = x + y;
                    System.out.println(hasil);
                    break;
                case '-':
                    hasil = x - y;
                    System.out.println(hasil);
                    break;
                case '*':
                    hasil = x * y;
                    System.out.println(hasil);
                    break;
                case '/':
                    if(x % y == 0){
                        hasil = x / y;
                        System.out.println(hasil);
                    }
                    else System.out.println("Input Tidak Valid!");
                    break;
                case '%':
                    hasil = x % y;
                    System.out.println(hasil);
                    break;
                default:
                    System.out.println("Operator Tidak Valid!");
                            }   }
  }
}
