/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CPMK2;

import java.util.*;
import java.lang.Math;

public class GameFatimah {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int rahasia, jawaban, percobaan;

        jawaban = 0;
        rahasia = random.nextInt(100);
        percobaan = 0;
        System.out.println("Ayo bermain tebak angka!");
        System.out.println("Pilih angka mulai dari  1 sampai 100");
        System.out.println("Kamu hanya memiliki kesempatan menjawab sebanyak 7 kali");
        while (percobaan < 7) {
            jawaban = input.nextInt();
            percobaan = percobaan + 1;
            if (jawaban == rahasia) {
                System.out.println("Tebakanmu= " + jawaban);
                System.out.println("Yeay! Selamat angka yang kamu tebak benar");
            } else {
                if (jawaban > rahasia) {
                    System.out.println("Tebakanmu= " + jawaban);
                    System.out.println("Angka tebakanmu terlalu tinggi");
                } else {
                    System.out.println("Tebakanmu= " + jawaban);
                    System.out.println("Nilainya Terlalu Rendah");
                }
            }
        }
        System.out.println("Yeah! Kesempatan menebakmu sudah habis");
        input.close();
    }
}