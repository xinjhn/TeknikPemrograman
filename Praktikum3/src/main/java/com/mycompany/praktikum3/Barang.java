package com.mycompany.praktikum3;

/**
 *
 * @author Jeihan Ilham Kusumawardhana
 */
public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk) { 
        kode_barang = kode;
        nama_barang = nama; 
        stok = stk;
    }
    public String getKode(){
        return kode_barang;
    }
    public String getNama(){
        return nama_barang;
    }
    public int getStok(){
        return stok;
    }
    public void setKode(String kode){
        this.kode_barang = kode;
    }
    public void setNama(String nama){
        this.nama_barang = nama;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    
    public void addStok(int hasil){
        int awal = getStok();
        setStok(awal + hasil);
    }
}
