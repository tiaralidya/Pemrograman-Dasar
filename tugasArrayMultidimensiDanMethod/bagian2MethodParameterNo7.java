package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;
public class bagian2MethodParameterNo7 {

    // Menghitung basis^eksponen secara rekursif (eksponen >= 0)
    public static long pangkat(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1; // kasus dasar: bilangan apa pun pangkat 0 = 1
        }
        return basis * pangkat(basis, eksponen - 1); // kasus rekursif
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan basis: ");
        int basis = input.nextInt();
        System.out.print("Masukkan eksponen (>= 0): ");
        int eksponen = input.nextInt();

        if (eksponen < 0) {
            System.out.println("Eksponen harus bilangan bulat tidak negatif.");
        } else {
            System.out.println(basis + " pangkat " + eksponen + " = " + pangkat(basis, eksponen));
        }

        input.close();
    }   
}
