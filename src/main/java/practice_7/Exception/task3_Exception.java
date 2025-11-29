package practice_7.Exception;

public class task3_Exception {
    public static void main(String[] args) throws AgeException{
        validAge(189);

    }
    public static void validAge(int age) throws AgeException{
        if ((age < 0) || (age > 150)) {
            throw new AgeException("Вы ввели невалидный возраст!");
        }
        else {
            System.out.println("Ваш возраст валиден!");
        }
    }
}
