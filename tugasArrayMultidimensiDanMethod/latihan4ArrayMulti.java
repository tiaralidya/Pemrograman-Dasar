package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class latihan4ArrayMulti {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] matriks = new int[3][3];
        int  jumlah = 0;
            System.out.println("Masukkan elemen matriks 3x3!");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Elemen [" + i + "][" + j + "]: ");
                    matriks[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < matriks.length; i++) {
            jumlah += matriks[i][i];
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
            System.out.println("Jumlah diagonal utama: " + jumlah);
        }
    }    
