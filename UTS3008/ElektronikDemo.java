/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2401083008;

import java.util.Scanner;

/**
 *
 * @author HP TEKHNOLOGY
 */
public class ElektronikDemo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("1. Elektronik\n2. Laptop\n3. Smartphone\n4. Gaming\n5. SmartWatch\n6. Keluar");
            int input;
            System.out.print("Input: ");
            input = in.nextInt();
            in.nextLine();
            
            String merek;
            int tahunProduksi, garansi;
            
            System.out.print("Merek: ");
            merek = in.nextLine();
            System.out.print("Tahun Produksi:2");
            tahunProduksi = in.nextInt();
            in.nextLine();
            System.out.print("Garansi: ");
            garansi = in.nextInt();
            in.nextLine();
            
            if(input == 1){
                Elektronik A = new Elektronik();
                A.setMerek(merek);
                A.setTahunProduksi(tahunProduksi);
                A.setGaransi(garansi);
                A.display();
            }
            else if(input != 6){
                if(input == 2 || input == 4){
                    int ukuranLayar, kapasitasRAM;

                    System.out.print("Ukuran Layar: ");
                    ukuranLayar = in.nextInt();
                    in.nextLine();
                    System.out.print("Kapasitas RAM: ");
                    kapasitasRAM = in.nextInt();
                    in.nextLine();

                    if(input == 2){
                        Laptop B = new Laptop();
                        B.setMerek(merek);
                        B.setTahunProduksi(tahunProduksi);
                        B.setGaransi(garansi);
                        B.setUkuranLayar(ukuranLayar);
                        B.setKapasitasRAM(kapasitasRAM);
                        B.display();
                    }
                    else{
                        String kartuGrafis;
                        int refreshRate;

                        System.out.print("Kartu Grafis: ");
                        kartuGrafis = in.nextLine();
                        System.out.print("Refresh Rate: ");
                        refreshRate = in.nextInt();
                        in.nextLine();

                        Gaming C = new Gaming();
                        C.setMerek(merek);
                        C.setTahunProduksi(tahunProduksi);
                        C.setGaransi(garansi);
                        C.setUkuranLayar(ukuranLayar);
                        C.setKapasitasRAM(kapasitasRAM);
                        C.setKartuGrafis(kartuGrafis);
                        C.setRefreshRate(refreshRate);
                        C.display();
                    }
                }
                else{
                    int kapasitasBaterai, jumlahKamera;
                    
                    System.out.print("Kapasitas Baterai: ");
                    kapasitasBaterai = in.nextInt();
                    in.nextLine();
                    System.out.print("Jumlah Kamera: ");
                    jumlahKamera = in.nextInt();
                    in.nextLine();
                    
                    if(input == 3){
                        Smartphone D = new Smartphone();
                        
                        D.setMerek(merek);
                        D.setTahunProduksi(tahunProduksi);
                        D.setGaransi(garansi);
                        D.setKapasitasBaterai(kapasitasBaterai);
                        D.setJumlahKamera(jumlahKamera);
                    }
                    else{
                        int ukuranLayar;
                        boolean tahanAir;
                        
                        System.out.print("Ukuran Layar: ");
                        ukuranLayar = in.nextInt();
                        in.nextLine();
                        System.out.print("Tahan Air: ");
                        tahanAir = in.nextBoolean();
                        
                        Smartwatch E = new Smartwatch();
                        E.setMerek(merek);
                        E.setTahunProduksi(tahunProduksi);
                        E.setGaransi(garansi);
                        E.setKapasitasBaterai(kapasitasBaterai);
                        E.setJumlahKamera(jumlahKamera);
                        E.setUkuranLayar(ukuranLayar);
                        E.setTahanAir(tahanAir);
                        E.display();
                    }
                }
            }
            else if(input == 6){
                break;
            }
        }
    }
}
