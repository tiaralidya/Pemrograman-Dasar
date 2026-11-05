package tugasArrayMultidimensiDanMethod;

import java.util.Scanner;

public class latihan3ArrayMulti {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
            int[][] matriks = new int[3][3];
            int terbesar = matriks[0][0];
            int baris = 0;
            int kolom = 0;

            System.out.println("Masukkan elemen matriks 3x3!");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matriks[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                }
            }
            System.out.println("\n===== MATRIKS =====");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriks[i][j] + "\t");
                }
                System.out.println();
            }
            for (int i = 0; i < matriks.length; i++) {
                for (int j = 0; j < matriks[i].length; j++) {
                    if (matriks[i][j] > terbesar) {
                        terbesar = matriks[i][j];
                        baris = i;
                        kolom = j;
                    }
                }
            }
            // tampilkan hasil
            System.out.println("\nNilai terbesar : " + terbesar);
            System.out.println("Posisi baris   : " + baris);
            System.out.println("Posisi kolom   : " + kolom);
        }
        }  
