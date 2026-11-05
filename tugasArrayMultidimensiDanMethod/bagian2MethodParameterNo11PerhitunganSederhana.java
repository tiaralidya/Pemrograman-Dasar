package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian2MethodParameterNo11PerhitunganSederhana {
    private static Scanner input = new Scanner(System.in);
    public static int inputNilai(String label) {
        System.out.println("Masukkan nilai " + label + "!");
        return input.nextInt();
    }
    // Meminta kode operasi (X/Y/Z/F)
    public static String inputKode() {
        input.nextLine(); // membuang sisa Enter setelah nextInt()
        System.out.println("Ketik kode X untuk penjumlahan");
        System.out.println("Ketik kode Y untuk pengurangan");
        System.out.println("Ketik kode Z untuk perkalian");
        System.out.println("Ketik kode F untuk pembagian");
        return input.nextLine().trim().toUpperCase();
    }
    public static int penjumlahan(int a, int b) {
        return a + b; }
    public static int pengurangan(int a, int b) {
        return a - b; }
    public static int perkalian(int a, int b) {
        return a * b; }
    public static double pembagian(int a, int b) {
        return (double) a / b; }
    // Memilih operasi berdasarkan kode lalu mencetak hasilnya
    public static void tampilkanHasil(String kode, int a, int b) {
        switch (kode) {
            case "X":
                System.out.println("Hasil penjumlahan = " + penjumlahan(a, b));
                break;
            case "Y":
                System.out.println("Hasil pengurangan = " + pengurangan(a, b));
                break;
            case "Z":
                System.out.println("Hasil perkalian = " + perkalian(a, b));
                break;
            case "F":
                if (b == 0) {
                    System.out.println("Pembagian dengan nol tidak bisa dilakukan.");
                } else {
                    System.out.println("Hasil pembagian = " + pembagian(a, b));
                }
                break;
            default:
                System.out.println("Kode tidak valid.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Program Perhitungan Sederhana");
        int a = inputNilai("pertama");
        int b = inputNilai("kedua");
        String kode = inputKode();

        tampilkanHasil(kode, a, b);

        input.close();
    }
}
