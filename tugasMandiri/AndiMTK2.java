/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugasMandiri;

import java.util.Scanner;
import java.lang.Math;

public class AndiMTK2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih = 2;
        int a, b;

        System.out.println("Hallo Andi! hari ini kamu ingin belajar apa? Masukkan sesuai kode berikut!");
        System.out.println("Ketik 1: untuk belajar pertambahan");
        System.out.println("Ketik 2: untuk belajar pengurangan");
        System.out.println("Ketik 3: untuk belajar pembagian");
        System.out.println("Ketik (Random angka): untuk belajar perkalian");
        System.out.print("Masukkan kode: ");
        pilih = input.nextInt();
        
        
        //Pertambahan
        if (pilih ==1) {
            System.out.println("Andi memilih belajar pertambahan");
            System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil pertambahan= " + (a + b));
        //pengurangan
        } else {
            if (pilih ==2) {
                System.out.println("Andi memilih belajar pengurangan");
                System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil pengurangan= " + (a - b));
        //pembagian
            } else {
                if (pilih ==3) {
                    System.out.println("Andi memilih belajar pembagian");
                    System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil pembagian= " + (a / b));
        //perkalian
                } else {
                    System.out.println("Andi memilih belajar perkalian");
                    System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil perkalian= " + (a * b));
                }
            }
        }
        System.out.println("Thanks!");
        input.close();
    }
}
