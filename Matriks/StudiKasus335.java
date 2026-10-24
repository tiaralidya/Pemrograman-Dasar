/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matriks;
public class StudiKasus335 {
    public static void main (String[] args) {
String [][][] arr = new String[3][3][5];

String[][][] data = {
    {
        {"Ancika", "Bobby", "Chiro", "Dhania", "Evangga"},
        {"Ayora", "Bilby", "Coera", "Deora", "Ervyna"},
        {"Arexsa", "Bloe", "Ciy", "Dhanip", "Erpoy"}
    },
    {
        {"Tiara", "Aurira", "Chika", "Alika", "Kanza"},
        {"Rara", "Anugrah", "Shiely", "Evry", "Zora"},
        {"Fara", "Gina", "Dea", "Vira", "Eraksa"}
    },
    {
        {"Alpan", "Zayyan", "Rayyan", "Sadid", "Lamucu"},
        {"Rama", "Farhat", "Farhan", "Hanisa", "Shopik"},
        {"Azka", "Andini", "Bunga", "Ussy", "Obby"}
    }
    };
    for(int i =0; i<3; i++){
    System.out.println("\n Prodi" +(i+1));
    for(int j=0; j<3; j++) {
        System.out.print("\n Kelas" +(j+1)+" ");
    for(int k=1; k<5; k++) {
    System.out.print(data[i][j][k] +" ");
    }
    System.out.println();
}
}   
}
}