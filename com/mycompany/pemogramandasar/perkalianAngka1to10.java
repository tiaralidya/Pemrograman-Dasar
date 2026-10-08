package com.mycompany.pemogramandasar;

import java.util.Scanner;
import java.lang.Math;

public class perkalianAngka1to10 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, angka;

        i = 1;
        System.out.print("Masukkan angka yang ingin kamu kalikan: ");
        angka = input.nextInt();
        while (i <= 10) {
            System.out.println(Integer.toString(angka) + " x " + i + " = " + i * angka);
            i = i + 1;
        }
    }
}