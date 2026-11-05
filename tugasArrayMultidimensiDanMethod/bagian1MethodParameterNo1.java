package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian1MethodParameterNo1 {
public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan jari-jari ke-" + i + ": ");
            double r = input.nextDouble();

            double luas = luasLingkaran(r);
            System.out.printf("Luas lingkaran dengan jari-jari %.2f = %.2f%n%n", r, luas);
        }

        input.close();
    }
}
//Materi method parameter