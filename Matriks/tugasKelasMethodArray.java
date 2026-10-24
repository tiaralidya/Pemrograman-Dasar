package Matriks;

import java.util.Scanner;
public class tugasKelasMethodArray {
    static Scanner input = new Scanner(System.in);
    static int bacaUkuran(String pesan) {
        while (true) {
            System.out.print(pesan);
            try {
                int n = Integer.parseInt(input.nextLine().trim());
                if (n > 0) return n;
                System.out.println("Ukuran harus lebih dari 0!");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }
    static String[][][] buatArray() {
        int prodi = bacaUkuran("Jumlah prodi            : ");
        int kelas = bacaUkuran("Jumlah kelas per prodi  : ");
        int mhs   = bacaUkuran("Jumlah mahasiswa per kelas  : ");
        return new String[prodi][kelas][mhs];
    }
    static void isiData(String[][][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("---- Prodi " + (i + 1) + "----");
            for (int j = 0; j < data[i].length; j++) {
                System.out.println(" Kelas " + (j + 1) + ": ");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(" Mahasiswa " + (k + 1) + ": ");
                    data[i][j][k] = input.nextLine().trim();
                }
            }
        }
    }
    static void tampilkanData(String[][][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nProdi " + (i + 1));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Kelas " + (j + 1) + " : ");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print(data[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
    static void cariNama(String[][][] data) {
        System.out.print("Masukkan kata kunci: ");
        String kunci = input.nextLine().trim().toLowerCase();
        boolean ketemu = false;
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                for (int k = 0; k < data[i][j].length; k++)
                    if (data[i][j][k].toLowerCase().contains(kunci)) {
                        System.out.println(data[i][j][k] + " -> Prodi " + (i + 1)
                                + ", Kelas " + (j + 1) + ", Urutan " + (k + 1));
                        ketemu = true;
                    }
        if (!ketemu) System.out.println("Nama tidak ditemukan.");
    }
    static int hitungVokal(String nama) {
        int vokal = 0;
        for (int i = 0; i < nama.length(); i++)
            if ("aiueo".indexOf(Character.toLowerCase(nama.charAt(i))) != -1)
                vokal++;
        return vokal;
    }
    static void tampilkanVokal(String[][][] data) {
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data[i].length; j++)
                for (String nama : data[i][j])
                    System.out.println(nama + " -> " + hitungVokal(nama) + " vokal");
    }
    static void tampilkanMenu() {
        System.out.println("\n===== Pilih Kata Kunci =====");
        System.out.println("1. Tampilkan data");
        System.out.println("2. Cari nama (gunakan kata kunci)");
        System.out.println("3. Hitung huruf vokal");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
    public static void main(String[] args) {
        String[][][] data = buatArray();
        System.out.println();
        isiData(data);

        int pilihan;
        do {
            tampilkanMenu();
            try {
                pilihan = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                pilihan = -1;
            }
            System.out.println();
            switch (pilihan) {
                case 1: tampilkanData(data); break;
                case 2: cariNama(data); break;
                case 3: tampilkanVokal(data); break;
                case 0: System.out.println("Terimakasih."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}