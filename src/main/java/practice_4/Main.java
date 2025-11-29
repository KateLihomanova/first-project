package practice_4;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        //Задачи на if-else
        //1. Определение знака числа
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        IfElseTask newTask = new IfElseTask();
        System.out.println(newTask.checkNumber(number));

        // 2. Поиск наибольшего из двух чисел
        System.out.println("Введите числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(newTask.maxNumber(a, b));

        // 3. Вывод оценки по шкале 1–5
        System.out.println("Введите числа от 1 до 5:");
        int rating = sc.nextInt();
        System.out.println(newTask.checkRating(rating));

        // 4. Проверка на чётность
        System.out.println("Введите число:");
        int num = sc.nextInt();
        System.out.println(newTask.checkParity(num));

        // 5. Определение размера скидки по возрасту
        System.out.println("Введите ваш возраст:");
        int age = sc.nextInt();
        System.out.println(newTask.checkSale(age));

        // 6. Оценка результата теста по баллам
        System.out.println("Введите ваш балл от 0 до 100:");
        int mark = sc.nextInt();
        System.out.println(newTask.checkMark(mark));

        //Задачи на switch
        //1. Вывод дня недели по номеру
        SwitchTask swTask = new SwitchTask();
        System.out.println("Введите число для дня недели:");
        int numOfDay = sc.nextInt();
        System.out.println(swTask.numberForDay(numOfDay));

        //2. Стоимость билета по дню недели
        System.out.println("Введите день недели в цифровом эквиваленте для того чтобы узнать стоимость билета:");
        int numberOfDay = sc.nextInt();
        System.out.println(swTask.priceOfTicket(numberOfDay));

        //3. Перевод числовых оценок в буквенные (A–F)
        System.out.println("Введите балл от 0 до 100:");
        int markForChar = sc.nextInt();
        System.out.println(swTask.charOfMarks(markForChar));

        //4. Обработка текстовых команд
        System.out.print("Введите одну из команд: start, stop, restart или status ");
        sc.nextLine();
        String command = sc.nextLine();
        System.out.println(swTask.message(command));

        //5. Простой калькулятор с использованием switch
        System.out.print("Введите два числа: ");
        int numeral_1 = sc.nextInt();
        int numeral_2 = sc.nextInt();
        System.out.print("Введите математический оператор: ");
        sc.nextLine();
        String operation = sc.nextLine();
        System.out.println(swTask.calculate(numeral_1, numeral_2, operation));

        //Задачи на for
        //1. Вывод чисел от 1 до 100, делящихся на 3
        ForTask taskFor = new ForTask();
        taskFor.divideThree();

        //2. Сумма чисел от 1 до n
        System.out.print("Введите число для вычисления суммы всех чисел от 1 до вашего числа: ");
        int n = sc.nextInt();
        System.out.println(taskFor.sumOfNumbers(n));

        //3. Таблица умножения для числа
        System.out.print("Введите число для вывода таблицы умножения: ");
        int m = sc.nextInt();
        taskFor.multiplicationTable(m);

        //4. Проверка на простое число
        System.out.print("Введите число для того чтобы узнать простое оно или нет: ");
        int someNumber = sc.nextInt();
        System.out.println((taskFor.simpleNumber(someNumber)) ? "Простое" : "Не простое");

        //5. Вывод чисел от 1 до 10
        taskFor.numbersTen();

        //Задачи на while
        //1. Вычисление факториала с помощью while
        WhileTask newWhileTask = new WhileTask();
        System.out.println("Введите число для подсчета его факториала: ");
        int factorialNumber = sc.nextInt();
        System.out.println(newWhileTask.factorial(factorialNumber));

        //2. Вывод всех чётных чисел до заданного
        System.out.print("Введите число, чтобы вывести все четные числа в диапазоне от 1 до вашего числа: ");
        int k = sc.nextInt();
        newWhileTask.evenNumbers(k);

        //3. Обратный отсчёт от введённого числа до 1
        System.out.print("Введите число для обратного отсчета: ");
        int startNumber = sc.nextInt();
        newWhileTask.countdown(startNumber);

        //Задачи на do-while
        //1. Запрос положительного числа
        DoWhileTask doWhile = new DoWhileTask();
        doWhile.positiveNumber();

        //2. Проверка пароля
        doWhile.password();

        //3. Вывод чисел от 1 до 10 с использованием do-while
        doWhile.numberToTen();

        //4. Завершение программы по команде "exit"
        doWhile.waitForExit();

        //5. Подсчёт количества цифр в числе
        doWhile.countNumber();

        //Задачи на break и continue
        //1. Сумма чисел до первого отрицательного (использовать break)
        BreakContinueTask newBCTask = new BreakContinueTask();
        newBCTask.sumNumbers();
        //2. Пропуск чисел, делящихся на 3 (использовать continue)
        newBCTask.SkipNumbersDivisibleByThree();

        //3. Вывод только положительных чисел (использовать continue)
        newBCTask.onlyPositiveNumber();

        //4. Ввод строк до команды "stop" (использовать break)
        newBCTask.commandStop();









    }

}
