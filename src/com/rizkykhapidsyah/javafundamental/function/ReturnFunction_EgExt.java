package com.rizkykhapidsyah.javafundamental.function;


import java.util.Scanner;

public class ReturnFunction_EgExt {
    public static void main(String[] args) {
        double Panjang = 0;
        double Lebar = 0;
        double Hasil = 0;

        Scanner Baca = new Scanner(System.in);

        System.out.print("Nilai Panjang (cm): "); Panjang = Baca.nextDouble();
        System.out.print("Nilai Lebar (cm): "); Lebar = Baca.nextDouble();

        Hasil = HitungLuasPP(Panjang, Lebar);

        System.out.println("Luas = " + Hasil + " cm2");
    }

    public static double HitungLuasPP(double P_Panjang, double P_Lebar) {
        double P_Hasil = 0;
        P_Hasil = P_Panjang * P_Lebar;
        return P_Hasil;
    }
}
