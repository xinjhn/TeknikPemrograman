package com.mycompany.restaurantmain;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class MainPenjualan {
	public static void main(String[] args) {
		Penjualan tokoA = new Penjualan();
		
		tokoA.tambahProdukMakanan("Seblak", 10_000, 10);
		tokoA.tambahProdukMakanan("Cimol", 2_500, 20);
		tokoA.tambahProdukMakanan("Basmut", 1_000, 100);
		tokoA.tambahProdukMakanan("Cilung", 1_500, 25);
		tokoA.tambahProdukMakanan("Batagor", 5_000, 30);
		tokoA.tambahProdukMakanan("Es Teh", 3_000, 15);
		tokoA.tambahProdukMakanan("Es Jeruk", 3_000, 80);
		tokoA.tambahProdukMakanan("Telor Dadar", 9_000, 60);
		tokoA.tambahProdukMakanan("Mie Rebus", 6_000, 40);
		tokoA.tambahProdukMakanan("Mie Goreng", 6_000, 70);

		System.out.println("\t  Daftar Produk");
		System.out.println("==================================");
		tokoA.tampilMenuProduk();
		
		tokoA.pesanProduk();
		
		tokoA.displayStruk();
		
		System.out.println("\n\n\t  Daftar Produk");
		System.out.println("==================================");
		tokoA.tampilMenuProduk();
		

	}
}
