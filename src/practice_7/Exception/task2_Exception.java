package practice_7.Exception;

public class task2_Exception {
    public static void main(String[] args) {
        System.out.println(division(6, 2));
        System.out.println(division(6, 0));

    }
    public static int division(int a, int b) {
        int c;
        if (b != 0) {
             c = a / b;
        }
        else {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return c;
        
    }
}
