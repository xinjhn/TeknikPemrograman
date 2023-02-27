/*
 * Click  to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class soal5 {
    public static void main(String[] args){
        String masukan;
        
        try (Scanner sc = new Scanner(System.in)) {
			masukan = sc.nextLine();
		}
        StringTokenizer st = new StringTokenizer(masukan, " ");
        
        String st1 = st.nextToken();
        st1 = st1.concat(st.nextToken());
        st1 = st1.concat(st.nextToken());
        st1 = st1.concat(st.nextToken());
        
        long plat = Long.parseLong(st1);
        
        long hasil = plat - 999999;
        
        if(hasil % 5 == 0){
            System.out.println("jalan");
        }
        else {
            System.out.println("berhenti");
        }
    }
}
