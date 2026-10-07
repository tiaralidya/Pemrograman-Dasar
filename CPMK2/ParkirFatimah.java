/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CPMK2;

import java.util.*;
import java.lang.Math;

public class ParkirFatimah {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String ulangan, jenis;
        int lamaParkir;

        System.out.println("SELAMAT DATANG DI TEMPAT PARKIR");
        System.out.println("SILAHKAN MASUKKAN JENIS KENDARAAN ANDA,(MOTOR/MOBIL)");
        jenis = input.nextLine();
        if (jenis.equals("MOTOR")) {
            System.out.println("BIAYA PARKIR MOTOR SEBESAR Rp2.000");
            System.out.println("BIAYA TAMBAHAN Rp1.000 PER JAM");
            System.out.println("SILAHKAN MASUKKAN DURASI PARKIR");
            System.out.println("SILAHKAN MASUKKAN DENGAN ANGKA SAJA");
            lamaParkir = input.nextInt();
            if (lamaParkir > 1) {
                System.out.println("BIAYA PARKIR ANDA");
                System.out.println(2000 + lamaParkir * 1000);
            }
        } else {
            if (jenis.equals("MOBIL")) {
                System.out.println("BIAYA PARKIR MOBIL SEBESAR Rp5.000");
                System.out.println("BIAYA TAMBAHAN Rp2.000 PER JAM");
                System.out.println("SILAHKAN MASUKKAN DURASI PARKIR");
                System.out.println("SILAHKAN MASUKKAN DENGAN ANGKA SAJA");
                lamaParkir = input.nextInt();
                if (lamaParkir > 1) {
                    System.out.println("BIAYA PARKIR ANDA");
                    System.out.println(5000 + lamaParkir * 2000);
                }
            } else {
                System.out.println("EROR");
                System.out.println("JENIS KENDARAAN YANG ANDA DIMASUKKAN SALAH SILAHKAN MASUKKAN KEMBALI JENIS KENDARAAN ANDA");
            }
        }
        System.out.println("TERIMAKASIH TELAH MENGGUNAKAN AREA PARKIR KAMI");
    }
}
