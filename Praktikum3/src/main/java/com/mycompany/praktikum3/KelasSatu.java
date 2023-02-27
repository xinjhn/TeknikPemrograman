package com.mycompany.praktikum3;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
class KelasSatu{
    {
        System.out.println(11); // akan dipanggil setiap saat memasuki class 
    }
    static{
        System.out.println(2); // akan dipanggil pertama setiap memasuki class dan hanya dipanggil sekali
    }
    public KelasSatu(int i){ // akan dipanggil sesuai dengan urutan pada main
        System.out.println(3);
    }
    public KelasSatu(){ // akan dipanggil sesuai dengan urutan pada main
        System.out.println(4);
    }
}