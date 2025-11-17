package practice_8.funcInterface;

public class task1_funcInterface {
    public static void main(String[] args) {
        MathOperation add = (x, y) -> x + y;
        MathOperation subtract = (x, y) -> x - y;
        MathOperation multiply = (x, y) -> x * y;
        MathOperation divide = (x, y) -> {
            if(y!=0){
                return x / y;
            }
            else {
                throw new ArithmeticException("На ноль делить нельзя");
            }
        };

        System.out.println(add.apply(4, 5));
        System.out.println(subtract.apply(10, 5));
        System.out.println(multiply.apply(1, 5));
        System.out.println(divide.apply(25, 5));

    }
}
