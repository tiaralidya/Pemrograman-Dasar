/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CPMK3;

import java.util.*;
import java.lang.Math;

public class PerhitunganSederhanaFatimahLidya {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kode;
        int a, b;

        System.out.println("Program Perhitungan Sederhana");
        System.out.println("Masukkan nilai pertama!");
        a = input.nextInt();
        System.out.println("Masukkan nilai kedua!");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Ketik kode X untuk penjumlahan");
        System.out.println("Ketik kode Y untuk pengurangan");
        System.out.println("Ketik kode Z untuk perkalian");
        System.out.println("Ketik kode F untuk pembagian");
        kode = input.nextLine();
        if (kode.equals("X")) {
            System.out.println("Hasil penjumlahan= " + (a + b));
        } else {
            if (kode.equals("Y")) {
                System.out.println("Hasil pengurangan= " + (a - b));
            } else {
                if (kode.equals("Z")) {
                    System.out.println("Hasil perkalian= " + (a * b));
                } else {
                    if (kode.equals("F")) {
                        System.out.println("Hasil perkalian= " + (double) (a / b));
                    }
                }
            }
        }
        input.close();
    }
}
