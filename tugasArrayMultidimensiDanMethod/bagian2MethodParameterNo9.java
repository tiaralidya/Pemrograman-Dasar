package tugasArrayMultidimensiDanMethod;

public class bagian2MethodParameterNo9 {
    static int misteri(int n) {
if (n == 0) {
return 0;
}
return n + misteri(n - 1);
}
}