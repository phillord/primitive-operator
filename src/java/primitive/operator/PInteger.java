package primitive.operator;

public class PInteger{

    public static int mul(int x, int y){
        return x * y;
    }

    public static int div(int x, int y){
        return x / y;
    }

    public static int rem(int x, int y){
        return x % y;
    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int minus(int x, int y){
        return x - y;
    }

    public static int leftShift(int x, int y){
        return x << y;
    }

    public static int rightShift(int x, int y){
        return x >> y;
    }

    public static int unsignedRightShift(int x, int y){
        return x >>> y;
    }

    public static int complement(int x){
        return ~x;
    }

    public static int and(int x, int y){
        return x & y;
    }

    public static int xor(int x, int y){
        return x ^ y;
    }

    public static int or(int x, int y){
        return x | y;
    }
}
