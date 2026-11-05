package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class latihan1ArrayMulti {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Mahasiswa = 3;
        int mataKuliah = 4;
        double[][] nilai = new double[Mahasiswa][mataKuliah];
        
        // ===== INPUT NILAI =====
        for (int i = 0; i < Mahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < mataKuliah; j++) {
                System.out.print("  Nilai Mata Kuliah " + (j + 1) + ": ");
                nilai[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        // ===== TAMPILKAN NILAI & RATA-RATA =====
        System.out.println("=== DAFTAR NILAI ===");
        System.out.println("Mahasiswa\tMata Kuliah1\tMata Kuliah2\tMata Kuliah3\tMata Kuliah4\tRata-rata");

        for (int i = 0; i < Mahasiswa; i++) {
            double total = 0;
            System.out.print((i + 1) + "\t\t");

            for (int j = 0; j < mataKuliah; j++) {
                System.out.print(nilai[i][j] + "\t\t");
                total += nilai[i][j];
            }

            double rata = total / mataKuliah;
            System.out.println(rata);
        }

        input.close();
    }
} 
//Materi Array Multidimensi