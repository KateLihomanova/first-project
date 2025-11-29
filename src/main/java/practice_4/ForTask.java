package practice_4;

public class ForTask {
    //1. Вывод чисел от 1 до 100, делящихся на 3
    public void divideThree() {
        for (int i = 1; i <= 100; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }

        }
    }

    //2. Сумма чисел от 1 до n
    public int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //3. Таблица умножения для числа
    public void multiplicationTable(int m) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(m + " x " +  i + " = " + m * i);
        }

    }

    //4. Проверка на простое число
    public boolean simpleNumber(int someNumber) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(someNumber); i++) {
            if (someNumber%i == 0) {
                isPrime = false;
            }
        }
        return isPrime;

    }

    //5. Вывод чисел от 1 до 10
    public void numbersTen() {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }
    }


}
