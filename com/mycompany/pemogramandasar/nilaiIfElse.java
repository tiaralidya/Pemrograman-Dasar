package com.mycompany.pemogramandasar;

import java.util.Scanner;

public class nilaiIfElse {
 static void main(String[] args) {
       System.out.print("Masukkan nilai: ");
       Scanner input = new Scanner(System.in);
       double nilai = input.nextDouble();
       
        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai yang anda masukkan tidak valid");
        } else if (nilai >= 91) {
            System.out.println("A");
        } else if (nilai >= 86) {
            System.out.println("A-");
        } else if (nilai >= 81) {
            System.out.println("B+");
        } else if (nilai >= 76) {
            System.out.println("B");
        } else if (nilai >= 71) {
            System.out.println("B-");
        } else if (nilai >= 66) {
            System.out.println("C+");
        } else if (nilai >= 61) {
            System.out.println("C");
        } else if (nilai >= 56) {
            System.out.println("D");
        } else if (nilai >= 0) {
            System.out.println("E");
        } else if (nilai <=0 ) {
            System.out.println("");
        }
}
}