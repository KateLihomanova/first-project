package practice_4;

public class IfElseTask {
    public String checkNumber(int number) {
        String typeNumber = "";
        if (number > 0) {
            typeNumber = "Число положительное";
        }
        else if (number < 0) {
            typeNumber = "Число отрицательное";
        }
        else {
            typeNumber = "Число равно нулю";
        }
        return typeNumber;
    }
    // 2. Поиск наибольшего из двух чисел
    public int maxNumber(int a, int b) {
        return Math.max(a, b);
    }
    //  3. Вывод оценки по шкале 1–5
    public String checkRating(int rating) {
        String description = "";
        if (rating == 5) {
            description = "Отлично";
        }
        else if (rating == 4) {
            description = "Хорошо";
        }
        else if (rating == 3) {
            description = "Удовлетворительно";
        }
        else if ((rating == 2) || (rating == 1)){
            description = "Удовлетворительно";
        }
        else {
            description = "Такой оценки не сущесвтует";
        }
        return description;
    }

    // 4. Проверка на чётность
    public String checkParity (int num) {
        if (num % 2 == 0) {
            return "Четное";
        }
        else {
            return "Нечетное";
        }
    }

    // 5. Определение размера скидки по возрасту
    public String checkSale (int age) {
        String sizeSale = "У вас нет скидки";
        if (age < 18) {
            sizeSale = "Ваша скидка 22%";
        }
        if (age >= 65) {
            sizeSale = "Ваша скидка 30%";
        }
        return sizeSale;
    }

    // 6. Оценка результата теста по баллам
    public String checkMark(int mark) {
        String description = "";
        if (mark >= 90) {
            description = "Отлично";
        }
        else if ((75 <= mark) && (mark <= 89)) {
            description = "Хорошо";
        }
        else if ((60 <= mark) &&  (mark <= 79)) {
            description = "Удовлетворительно";
        }
        else {
            description = "Неудовлетворительно";
        }
        return description;
    }


}
