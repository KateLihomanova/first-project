package practice_4;

public class WhileTask {
    //1. Вычисление факториала с помощью while
    public int factorial(int someNum) {
        int i = 1;
        int result = 1;
        while (i <= someNum) {
            result = result * i;
            i++;
        }
        return result;
    }

    //2. Вывод всех чётных чисел до заданного
    public void evenNumbers(int someNumber) {
        int i = 1;
        while (i <= someNumber) {
            if (i%2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //3. Обратный отсчёт от введённого числа до 1
    public void countdown(int startNumber) {
        while (startNumber >= 1) {
            System.out.println(startNumber);
            startNumber = startNumber - 1;
        }
    }
}
