package modul2;

public class ShortCircuitBooleanOr {
    public static void main(String args[]){
        int a=5, b=7;
        if ((a>2) || (b++<10)) b+=2;
        System.out.println(b);
    }
}
