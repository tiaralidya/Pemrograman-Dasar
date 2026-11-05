package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian2MethodParameterNo8 {
    
    // Versi rekursif: n + (n-1) + ... + 1
    public static int jumlahDeret(int n) {
        if (n <= 0) {
            return 0; // kasus dasar
        }
        return n + jumlahDeret(n - 1); // kasus rekursif
    }

    // Versi perulangan
    public static int jumlahDeretLoop(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        int hasilRekursif = jumlahDeret(n);
        int hasilLoop = jumlahDeretLoop(n);

        System.out.println("Versi rekursif   : 1 + 2 + ... + " + n + " = " + hasilRekursif);
        System.out.println("Versi perulangan : 1 + 2 + ... + " + n + " = " + hasilLoop);

        if (hasilRekursif == hasilLoop) {
            System.out.println("Kedua hasil sama.");
        }

        input.close();
    }
}
