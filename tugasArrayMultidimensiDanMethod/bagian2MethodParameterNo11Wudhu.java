package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian2MethodParameterNo11Wudhu {
    private static Scanner input = new Scanner(System.in);
    private static final double PERSEN_HEMAT = 0.15;

    // Meminta jumlah mahasiswa
    public static int inputJumlahMahasiswa() {
        System.out.print("Masukkan jumlah mahasiswa: ");
        return input.nextInt();
    }

    // Meminta frekuensi wudhu dalam sehari
    public static int inputFrekuensiWudhu() {
        System.out.print("Masukkan jumlah frekuensi wudhu dalam sehari: ");
        return input.nextInt();
    }

    // Meminta jumlah liter air untuk sekali wudhu per orang
    public static double inputAirPerWudhu() {
        System.out.print("Masukkan jumlah liter air untuk wudhu per orang: ");
        return input.nextDouble();
    }

    // Total kebutuhan air sebelum penghematan
    public static double hitungTotalAir(int jumlahMahasiswa, int frekuensiWudhu, double airPerWudhu) {
        return jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
    }

    // Total kebutuhan air setelah penghematan 15%
    public static double hitungAirSetelahHemat(double totalAir) {
        return totalAir - totalAir * PERSEN_HEMAT;
    }

    // Jumlah air yang berhasil dihemat
    public static double hitungSelisihHemat(double totalAir, double airSetelahHemat) {
        return totalAir - airSetelahHemat;
    }

    // Menampilkan hasil
    public static void tampilkanHasil(double totalAir, double airSetelahHemat, double selisihHemat) {
        System.out.println("\n=== HASIL ===");
        System.out.println("Total kebutuhan air: " + totalAir + " Liter");
        System.out.println("Total kebutuhan air setelah penghematan: " + airSetelahHemat + " Liter");
        System.out.println("Saat ini pemakaian air wudhu lebih hemat 15%: " + selisihHemat + " Liter lebih hemat");
    }

    public static void main(String[] args) {
        input.useLocale(java.util.Locale.US); // desimal memakai titik (1.5)

        int jumlahMahasiswa = inputJumlahMahasiswa();
        int frekuensiWudhu = inputFrekuensiWudhu();
        double airPerWudhu = inputAirPerWudhu();

        double totalAir = hitungTotalAir(jumlahMahasiswa, frekuensiWudhu, airPerWudhu);
        double airSetelahHemat = hitungAirSetelahHemat(totalAir);
        double selisihHemat = hitungSelisihHemat(totalAir, airSetelahHemat);

        tampilkanHasil(totalAir, airSetelahHemat, selisihHemat);

        input.close();
    }
}
