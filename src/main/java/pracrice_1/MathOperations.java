package pracrice_1;

public class MathOperations {
    public static void main (String[] args) {
        int add1 = add(4, 6);
        System.out.println(add1);
        int sub = subtract(6, 3);
        System.out.println(sub);
        int mul = multiply(2, 7);
        System.out.println(mul);
        double div = divide(6, 2);
        System.out.println(div);
        int max = findMax(2, 7);
        System.out.println(max);
        int diff = difference(2, 7);
        System.out.println(diff);
        int area = squareArea(3);
        System.out.println(area);
        int perimeter = squarePerimeter(6);
        System.out.println(perimeter);
        double seconds = convertSecondsToMinutes(498);
        System.out.println(seconds);
        double speed = averageSpeed(45, 3);
        System.out.println(speed);
        double circle = circleCircumference(3.5);
        System.out.println(circle);
        double calculate = calculatePercentage(0, 8.7);
        System.out.println(calculate);
        double fahr = celsiusToFahrenheit(32.9);
        System.out.println(fahr);
        double celsius = fahrenheitToCelsius(342.9);
        System.out.println(celsius);



    }
    public static int add (int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static double divide(int x, int y) {
        return (double) x / y;
    }
    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }
    public static int squareArea(int side){
        return side * side;
    }
    public static int squarePerimeter(int side) {
        return 4 * side;
    }
    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }
    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }
    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
    public static double calculatePercentage(double total, double part) {
        if (total != 0) {
            return (part / total) * 100;}
        else {
            System.out.println("total не должен быть равен нулю");
            return 0;
        }
    }
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }






}

