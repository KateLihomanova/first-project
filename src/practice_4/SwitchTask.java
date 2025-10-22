package practice_4;

public class SwitchTask {
    //1. Вывод дня недели по номеру
    public String numberForDay(int day) {
        String nameOfDay;
        switch (day) {
            case 1 -> nameOfDay = "Понедельник";
            case 2 -> nameOfDay = "Вторник";
            case 3 -> nameOfDay = "Среда";
            case 4 -> nameOfDay = "Четверг";
            case 5 -> nameOfDay = "Пятница";
            case 6 -> nameOfDay = "Суббота";
            case 7 -> nameOfDay = "Воскресенье";
            default -> nameOfDay = "Такого дня недели не существует";

        }
        return nameOfDay;
    }

    //2. Стоимость билета по дню недели
    public String priceOfTicket(int day) {
        String price = "300 рублей";
        switch (day) {
            case 1 -> price = price;
            case 2 -> price = price;
            case 3 -> price = price;
            case 4 -> price = price;
            case 5 -> price = price;
            case 6 -> price = "450 рублей";
            case 7 -> price = "450 рублей";
            default -> price = "Такого дня недели нет";
        }
        return price;
    }
    //3. Перевод числовых оценок в буквенные (A–F)
    public String charOfMarks(int mark) {
        return switch ((mark / 10)) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
    //4. Обработка текстовых команд
    public String message(String command) {
        String descriptionCommand = "";
        switch (command) {
            case "start":
                descriptionCommand = "Система запущена";
                break;
            case "stop":
                descriptionCommand = "Система остановлена";
                break;
            case "restart":
                descriptionCommand = "Система перезапущена";
                break;
            case "status":
                descriptionCommand = "Статус системы";
                break;
            default:
                descriptionCommand = "Такой команды нет";
        }
        return descriptionCommand;
    }

    //5. Простой калькулятор с использованием switch
    public int calculate(int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                }
                else {
                    throw new RuntimeException("На ноль делить нельзя!");
                }
                break;
        }
        return result;
    }

}
