/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kamis10042025;

/**
 *
 * @author LAB-MM
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }

    Tabungan(int saldoAwal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getSaldo(){
        return saldo;
    }
    public void simpanUang(int jumlah){
        saldo +=jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        if (jumlah <= saldo){
            saldo -=jumlah;
            return true;
        }
        return false;
    }
    
    public boolean transfer(Tabungan t, int jumlah){
        if (ambilUang(jumlah)){
            return true;
        }
        return false;
    }
    @Override
    public String toString()
}

