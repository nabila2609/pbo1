/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kamis10042025;

/**
 *
 * @author LAB-MM
 */
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private Tabungan tabungan;
    
    public Nasabah(String namaAwal, String namaAkhir){
        this.namaAkhir = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
    public Tabungan getTabungan(){
        return tabungan;
    }
    
    public String toString(){
        if (tabungan != null) {
            return namaAwal + " " + namaAkhir + "-" +tabungan.toString();
        } else {
            return namaAwal + " " + namaAkhir + "- Tidak Ada Tabungan";
        }
    }
}
