package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian2MethodParameterNo6 {
    public static double rataRata(double a, double b) {
        return (a + b) / 2;
    }

    // Rata-rata tiga bilangan
    public static double rataRata(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US); // desimal memakai titik (10.5)

        System.out.print("Masukkan bilangan pertama: ");
        double x = input.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double y = input.nextDouble();
        System.out.print("Masukkan bilangan ketiga: ");
        double z = input.nextDouble();

        System.out.println("Rata-rata dua bilangan (" + x + ", " + y + ") = " + rataRata(x, y));
        System.out.println("Rata-rata tiga bilangan (" + x + ", " + y + ", " + z + ") = " + rataRata(x, y, z));

        input.close();
    }
}
