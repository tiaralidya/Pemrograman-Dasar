package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class latihan2ArrayMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];
        int[][] transpose = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3!");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matriks[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("\n===== MATRIKS =====");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("===== MATRIKS TRANSPOSE =====");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}