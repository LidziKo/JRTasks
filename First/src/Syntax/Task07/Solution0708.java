package Syntax.Task07;

/*Реализуй метод setValues(long value), чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.*/

public class Solution0708 {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
