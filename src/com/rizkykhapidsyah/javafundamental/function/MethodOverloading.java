package com.rizkykhapidsyah.javafundamental.function;

public class MethodOverloading {
    public static void main(String[] agrs) {
        double P1 = 7, L1 = 6.5;
        int P2 = 7, L2 = 6;
        double Hasil1 = 0, Hasil2 = 0;

        Hasil1 = HitungLuas(P1, L1);
        Hasil2 = HitungLuas(P2, L2);

        System.out.println("Hasil (double) adalah : " + Hasil1);
        System.out.println("Hasil (int) adalah : " + Hasil2);
    }

    public static double HitungLuas(double Panjang, double Lebar) {
        double Luas = 0;
        Luas = Panjang * Lebar;
        return Luas;
    }

    public static int HitungLuas(int Panjang, int Lebar) {
        int Luas = 0;
        Luas = Panjang * Lebar;
        return Luas;
    }
}
