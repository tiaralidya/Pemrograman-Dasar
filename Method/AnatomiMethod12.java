/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;
public class AnatomiMethod12 {
static double luasPersegiPanjang(double panjang, double lebar) {
return panjang * lebar;
}
static double luasSegitiga(double alas, double tinggi) {
return 0.5* alas * tinggi;
}
static void cetakHasil (String namaBangun, double hasil){
    System.out.println (" " + namaBangun + hasil);
}
public static void main(String[] args) {
double luas = luasPersegiPanjang(5, 3);
double luasSegitiga = luasSegitiga(6.2, 5);
cetakHasil("Luas Persegi Panjang: ", luas);
cetakHasil("Luas Segitiga: ", luasSegitiga);
}   
}