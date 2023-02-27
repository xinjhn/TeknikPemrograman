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
public class soal1 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String[] arrOfStr = str.split("[, ?.@'!]+");
            System.out.println(arrOfStr.length);
            for (String a : arrOfStr)
            System.out.println(a);
        }
    }
}
