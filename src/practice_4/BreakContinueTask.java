package practice_4;
import java.util.Scanner;
public class BreakContinueTask {
    //1. Сумма чисел до первого отрицательного (использовать break)
    public void sumNumbers() {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;
        while (true) {
            System.out.println("Введите число: ");
            number = sc.nextInt();
            if (number < 0) break;
            sum = sum + number;
        }
        System.out.println(sum);

    }

    //2. Пропуск чисел, делящихся на 3 (использовать continue)
    public void SkipNumbersDivisibleByThree() {
        for (int i = 1; i <= 20; i++) {
            if (i%3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    //3. Вывод только положительных чисел (использовать continue)
    public void onlyPositiveNumber() {
        Scanner sc = new Scanner(System.in);
        int num;
        int count = 0;
        do {
            System.out.println("Введите число: ");
            num = sc.nextInt();
            if (num < 0) continue;
            System.out.println("Ваше число: " + num);
            count++;
        } while (count <= 3);

    }
    //4. Ввод строк до команды "stop" (использовать break)
    public void commandStop() {
        Scanner sc = new Scanner(System.in);
        String command;
        while (true){
            System.out.println("Введите команду: ");
            command = sc.nextLine();
            if (command.equals("stop")) break;

        }
        System.out.println("Программа завершена!");

    }



}
