/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CPMK2;

import java.util.Scanner;
import java.lang.Math;

public class WudhuPerbaikan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jumlahMahasiswa, frekuensiWudhu;
        double airPerWudhu, totalAir, hemat, totalAirHemat;

        System.out.print("Masukkan jumlah mahasiswa:");
        jumlahMahasiswa = input.nextInt();
        System.out.print("Masukkan jumlah frekuensi wudhu dalam sehari:");
        frekuensiWudhu = input.nextInt();
        System.out.print("Masukkan jumlah liter air untuk wudhu per orang:");
        airPerWudhu = input.nextDouble();
        totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        hemat = totalAir - totalAir * 0.15;
        totalAirHemat = totalAir - hemat;
        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air: " + totalAir + " Liter");
        System.out.println("Total kebutuhan air setelah penghematan: " + hemat + " Liter");
        System.out.println("Saat ini pemakaian air wudhu lebih hemat 15%: " + totalAirHemat + " Liter lebih hemat");
        input.close();
    }
}

