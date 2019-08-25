package com.rizkykhapidsyah.javafundamental.function;

public class ReturnFunction {
    public static void main(String[] args) {
        double P = 7;
        double L = 6.5;
        double Hasil = 0;

        Hasil = HitungLuas(P, L); //Memanggil Fungsi
        System.out.println("Hasilnya Adalah: " + Hasil);
    }

    //Fungsi Dengan Nilai Balik
    public static double HitungLuas(double Panjang, double Lebar) {
        double Luas = 0;
        Luas = Panjang * Lebar;
        return Luas;
    }
}
