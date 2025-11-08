package practice_7.Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4_Exceptoin {
    public static void main(String[] args) {
        validAddress("kate@nobugs.ru");
        validAddress("kate@mail.ru");

    }
    public static void validAddress(String address){
        Pattern pattern = Pattern.compile("@nobugs\\.ru$");
        Matcher matcher = pattern.matcher(address);
        if (matcher.find()) {
            System.out.println("Вы ввели валидный адрес!");
        }
        else {
            try {
                throw new AddressException("Ваш адресс не валиден!");
            } catch (AddressException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
