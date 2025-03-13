/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1PBO;

import java.util.Scanner;
/**
 *
 * @author HP TEKHNOLOGY
 */
public class PermutasiKombinasiTugas {
    public static void main(String[] args) {
        int n, r, i;
        int mutasi=1, komb=1, x=1;

        Scanner inn = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukkan nilai n: ");
        n = inn.nextInt();
        System.out.print("Masukkan nilai r: ");
        r = inn.nextInt();
        System.out.println("---------------------");

        for (i=n; i>(n-r); i--) {
            mutasi *= i;
        }
        for (i=r; i>1; i--) {
            x *= i;
        }

        komb = mutasi / x;

        System.out.println("Nilai Permutasi: "+mutasi);
        System.out.println("Nilai Kombinasi: "+komb);
        System.out.println("---------------------");
    }
    
}
