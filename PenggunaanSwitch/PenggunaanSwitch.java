/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PenggunaanSwitch;

import java.util.Scanner;
import java.lang.Math;

public class PenggunaanSwitch {

    public static void main(String[] args) {
       System.out.println("Masukkan pilihan:");
       Scanner input = new Scanner(System.in);
       int day = input.nextInt();
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
              System.out.println("Sunday");
            break;
        }
    }
}
        //Outputs "Thursday" (day 4)