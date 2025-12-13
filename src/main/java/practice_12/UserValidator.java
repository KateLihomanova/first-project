package practice_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static boolean validationEnabled = true;

    public void validator(User user) {
        if (!validationEnabled) {
            return;
        }
        else {
            validateName(user.getName());
            validateAge(user.getAge());
            validateEmail(user.getEmail());
        }
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidUserException("Имя не должно быть пустым");
        }
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        }
    }
    private void validateAge(int age) {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть в пределах от 18 до 100");
        }
    }
    private void validateEmail(String email) {
        Pattern pattern = Pattern.compile("@nobugs\\.ru$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.find()) {
            throw new InvalidUserException("Неверный email");
        }

    }
}
