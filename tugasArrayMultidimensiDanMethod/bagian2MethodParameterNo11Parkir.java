package tugasArrayMultidimensiDanMethod;
import java.util.Scanner;

public class bagian2MethodParameterNo11Parkir {
    private static Scanner input = new Scanner(System.in);

    // Meminta jenis kendaraan sampai input valid (MOTOR/MOBIL)
    public static String inputJenis() {
        String jenis;
        while (true) {
            System.out.println("SILAHKAN MASUKKAN JENIS KENDARAAN ANDA,(MOTOR/MOBIL)");
            jenis = input.nextLine().trim().toUpperCase();
            if (jenis.equals("MOTOR") || jenis.equals("MOBIL")) {
                return jenis;
            }
            System.out.println("EROR");
            System.out.println("JENIS KENDARAAN YANG ANDA DIMASUKKAN SALAH SILAHKAN MASUKKAN KEMBALI JENIS KENDARAAN ANDA");
        }
    }

    // Mengembalikan tarif awal sesuai jenis kendaraan
    public static int tarifAwal(String jenis) {
        return jenis.equals("MOTOR") ? 2000 : 5000;
    }

    // Mengembalikan tarif tambahan per jam sesuai jenis kendaraan
    public static int tarifTambahan(String jenis) {
        return jenis.equals("MOTOR") ? 1000 : 2000;
    }

    // Menampilkan informasi tarif
    public static void tampilkanTarif(String jenis) {
        System.out.println("BIAYA PARKIR " + jenis + " SEBESAR Rp" + tarifAwal(jenis));
        System.out.println("BIAYA TAMBAHAN Rp" + tarifTambahan(jenis) + " PER JAM");
    }

    // Meminta durasi parkir (angka positif)
    public static int inputDurasi() {
        int lama;
        do {
            System.out.println("SILAHKAN MASUKKAN DURASI PARKIR");
            System.out.println("SILAHKAN MASUKKAN DENGAN ANGKA SAJA");
            lama = input.nextInt();
            if (lama < 1) {
                System.out.println("DURASI MINIMAL 1 JAM");
            }
        } while (lama < 1);
        return lama;
    }

    // Menghitung total biaya: jam pertama = tarif awal, jam berikutnya = tarif tambahan
    public static int hitungBiaya(String jenis, int lamaParkir) {
        return tarifAwal(jenis) + (lamaParkir - 1) * tarifTambahan(jenis);
    }

    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI TEMPAT PARKIR");

        String jenis = inputJenis();
        tampilkanTarif(jenis);
        int lamaParkir = inputDurasi();

        System.out.println("BIAYA PARKIR ANDA");
        System.out.println("Rp" + hitungBiaya(jenis, lamaParkir));

        System.out.println("TERIMAKASIH TELAH MENGGUNAKAN AREA PARKIR KAMI");
    }
}
