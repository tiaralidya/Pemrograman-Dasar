/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CPMK2;

import java.util.*;
import java.lang.Math;

public class ZakatFatimah {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double jumlahHarta, nisabSekarang, zakat;

        System.out.println("Masukan Jumlah Harta Yang Anda Miliki:");
        jumlahHarta = input.nextDouble();
        nisabSekarang = 2498000 * 85;
        if (jumlahHarta >= nisabSekarang) {
            zakat = jumlahHarta * 0.25;
            System.out.println("Anda wajib melakukan zakat sebesar Rp" + zakat);
        } else {
            System.out.println("Anda belum wajib melaksanakan zakat");
        }
    }
}