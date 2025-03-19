package Tugas130325;

public class Mahasiswa {
    int nim;
    String nama;
    int tugas;
    int uts;
    int uas;
    int quiz;
    double nilaiAkhir;

    public Mahasiswa(int nim, String n, int t, int uts, int uas, int q) {
        this.nim = nim;
        this.nama = n;
        this.tugas = t;
        this.uts = uts;
        this.uas = uas;
        this.quiz = q;
    }

    public void TampilData() {
        System.out.println("Nim Anda: " + nim);
        System.out.println("Nama Anda: " + nama);
        System.out.println("Nilai Tugas Anda: " + tugas);
        System.out.println("Nilai UTS Anda: " + uts);
        System.out.println("Nilai UAS Anda: " + uas);
        System.out.println("Nilai Quiz Anda: " + quiz);
    }

    public void MenentukanNilaiAkhir() {
        nilaiAkhir = 0.15 * tugas + 0.2 * quiz + 0.3 * uts + 0.25 * uas;
        System.out.println("Nilai Akhir Anda (angka): " + nilaiAkhir);
    }

    public void KonversiNilai() {
        System.out.println("Nilai Akhir Anda (huruf): " + nilaiAkhir);
        if (nilaiAkhir >= 80) {
            System.out.println("A");
        } else if (nilaiAkhir >= 65) {
            System.out.println("B");
        } else if (nilaiAkhir >= 50) {
            System.out.println("C");
        } else if (nilaiAkhir >= 35) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}