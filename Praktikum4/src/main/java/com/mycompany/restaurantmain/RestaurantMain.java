package com.mycompany.restaurantmain;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Cipok", 2_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Cimol", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tempe", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Basmut", 500, 50);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Seblak", 10_000, 10);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Cireng", 1_500, 30);
        
        menu.tampilMenuMakanan();
        
        menu.pesanMakanan();      //menambahkan fitur untuk memesan makanan sekaligus mengurangi stok
        
        menu.tampilMenuMakanan();
    }
}
