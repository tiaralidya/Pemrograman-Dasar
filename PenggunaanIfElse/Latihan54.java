/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PenggunaanIfElse;

import java.util.Scanner;
public class Latihan54 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        System.out.print("masukkan nilai anda: ");
                nilai = input.nextInt ();
       if (nilai >= 75){
           System.out.println("LULUS");
                   }else{
           System.out.println("TIDAK LULUS");
       }
    }
}
