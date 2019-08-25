package com.rizkykhapidsyah.javafundamental.function;

public class InputFunction {
    public static void main(String[] args) {
        HitungLuas(7, 3);
    }

    public static void HitungLuas(double Panjang, double Lebar) {
        double Luas = 0;
        Luas = Panjang * Lebar;
        System.out.println(Luas);
    }
}
