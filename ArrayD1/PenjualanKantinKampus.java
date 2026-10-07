/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayD1;

public class PenjualanKantinKampus {
    public static void main(String[] args) {
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};
        int total = 0;
        int max = penjualan[0];
        int min = penjualan[0];
        int minHari = 0;
for (int i = 0; i < penjualan.length; i++) {
total += penjualan[i];
if (penjualan[i] > max) max = penjualan[i];
if (penjualan[i] < min) min = penjualan[i];
}
for (int i = 0; i < penjualan.length; i++){
    if (penjualan[i] >= 30){
        minHari++;
    }
}
double rataRata = (double) total / penjualan.length;
System.out.println("\n=== HASIL ===");
System.out.println("Total Penjualan = " + total);
System.out.println("Rata-rata = " + rataRata);
System.out.println("Penjualan Tertinggi = " + max);
System.out.println("Penjualan Terendah = " + min);
System.out.println("Hari dengan Penjualan Mininmal 30 = " + minHari);
}
}
