package com.mycompany.restaurantmain;

import java.util.Scanner;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class Restaurant {
    private String[] nama_makanan = {"adonan"};
    private double[] harga_makanan = {0};           //melakukan encapsulation dengan cara mengubah setiap public menjadi private
    private int[] stok = {0};                       //menginisialisasi data sesuai dengan buku chapter 4.10
    private static byte id = 0;

    
    public int getStok(){                           //menambahkan getter karena data sudah di enkapsulasi dan sesuai dengan buku chapter 4.10
        return stok[id];                            //cukup pada variable stok saja karena data harga dan makanan tetap
    }
    
    
    public void setStok(int[] stok){                //menambahkan setter karena data sudah di enkapsulasi
        this.stok = stok;                           //cukup pada variable stok saja karena variable stok yang biasanya berubah
    }   
    
    public Restaurant(){
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan(){
        for(int i = 0; i <= id; i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] + "["+stok[i]+"]"+" \tRp. " +harga_makanan[i]);
            }
            else if(isOutOfStock(i)){
                System.out.println(nama_makanan[i] + "\t\t   Habis!");        //menambahkan fitur untuk mengetahui apabila stok makanan sudah habis
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        return stok[id] == 0;
    }
    
    public static void nextId(){
        id++;
    }
    
    public void decreaseStock(int id, int qty){
        stok[id] = stok[id] - qty;                         //fitur untuk mengurangi stok makanan
    }
    
    public  void pesanMakanan(){
        System.out.println("\nMasukkan Pesanan : ");
        @SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
        String nama = keyboard.next();
        int qty = keyboard.nextInt();
        System.out.println(nama + "\n");
        for(int i = 0; i <= id; i++){
            if(nama_makanan[i].toLowerCase().equals(nama.toLowerCase())){                 //untuk mencocokkan pesanan dengan daftar makanan
                if(qty > stok[i]){                                                               //untuk mengecek apakah jumlah pembelian melebihi stok yang ada
                    System.out.println("Stok tidak cukup!\n");
                }else {
                    decreaseStock(i ,qty);
                }
            }
        }     
    }
    
}
