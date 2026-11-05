package tugasArrayMultidimensiDanMethod;

public class bagian1MethodParameterNo4 {
  static int x = 5;
static void ubah(int x) {

x = x + 10;
System.out.println("A: " + x);
}
public static void main(String[] args) {
int y = 3;
ubah(y);
ubah(x);
System.out.println("B: " + x + " " + y);  
}
}