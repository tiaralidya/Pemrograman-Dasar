/**Nama: Fatimah Azzahrah  Lidya
 *  NIM: 09040626119
 */
package praktikumPengulangan;
import java.util.Scanner;

public class PerulanganWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka=1;
        while (angka != 0) {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        }
            System.out.println("Program selesai.");
    }
}