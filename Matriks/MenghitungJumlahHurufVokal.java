package Matriks;
public class MenghitungJumlahHurufVokal {
    public static void main (String[] args) {
   String kalimat = "Pemrograman Dasar";
int vokal = 0;
for (int i = 0; i < kalimat.length(); i++) {
char c = Character.toLowerCase(kalimat.charAt(i));
if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
vokal++;
}
}
System.out.println("Jumlah vokal: " + vokal); 
}
}