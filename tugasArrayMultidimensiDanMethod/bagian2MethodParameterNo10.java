package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian2MethodParameterNo10 {
    
    // Mencetak representasi biner dari n (n > 0) secara rekursif
    public static void cetakBiner(int n) {
        if (n == 0) {
            return; // kasus dasar: berhenti
        }
        cetakBiner(n / 2);        // cetak bagian sebelumnya lebih dulu
        System.out.print(n % 2);  // lalu cetak sisa bagi
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Bilangan harus bulat positif.");
        } else {
            System.out.print("Biner dari " + n + " = ");
            cetakBiner(n);
            System.out.println();
        }

        input.close();
    }
}
