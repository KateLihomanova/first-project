package practice_4;
import java.util.Scanner;
public class DoWhileTask {
    //1. Запрос положительного числа
    public void positiveNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите положительное число: ");
            number = sc.nextInt();
        } while (number <= 0);
    }

    //2. Проверка пароля
    public void password() {
        Scanner sc = new Scanner(System.in);
        String pass;
        do {
            System.out.print("Введите пароль: ");
            pass = sc.nextLine();
            if (!pass.equals("abc")) {
                System.out.println("Вы ввели неверный пароль. Попробуйте ещё раз!");
            }
        } while (!pass.equals("abc"));

    }
    //3. Вывод чисел от 1 до 10 с использованием do-while
    public void numberToTen() {
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 10);

    }
    //4. Завершение программы по команде "exit"
    public void waitForExit() {
        Scanner sc = new Scanner(System.in);
        String command;
        do {
            System.out.print("Жду команду: ");
            command = sc.nextLine();
            if (!command.equals("exit")) {
                System.out.println("Продолжаю работу!");
            }
        } while (!command.equals("exit"));
        System.out.println("Завершаю работу!");

    }
    //5. Подсчёт количества цифр в числе
    public void countNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число для подсчета цифр в нем: ");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1;
        }
        do {
            number /= 10;
            count++;
        } while (number > 0);

        System.out.println("Количество цифр в числе: " + count);

        }


    }

