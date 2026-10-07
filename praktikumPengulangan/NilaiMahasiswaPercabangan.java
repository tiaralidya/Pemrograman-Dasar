/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikumPengulangan;
import java.util.Scanner;
public class NilaiMahasiswaPercabangan {
    public static void main(String[] args) {
/*Nilai >= 75 → Lulus
*Nilai < 75  → Tidak Lulus
*/
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double totalNilai = 0;
        int jumlahMahasiswa = 5;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();

            totalNilai += nilai;
            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                jumlahLulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                jumlahTidakLulus++;
            }
        }
        double rataRata = totalNilai / jumlahMahasiswa;
        System.out.println("------------------------------------");
        System.out.println("Jumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        System.out.println("Rata-rata nilai              : " + rataRata);

        input.close();
    }
}