package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian1MethodParameterNo2 {
    public static double konversiCelsiusKeFahrenheit(double c) {
        return (c * 1.8) + 32;
    }

    public static double konversiFahrenheitKeCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);

        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Pilih (1/2): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan suhu: ");
        double suhu = input.nextDouble();

        if (pilihan == 1) {
            System.out.println(suhu + " C = " + konversiCelsiusKeFahrenheit(suhu) + " F");
        } else if (pilihan == 2) {
            System.out.println(suhu + " F = " + konversiFahrenheitKeCelsius(suhu) + " C");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}