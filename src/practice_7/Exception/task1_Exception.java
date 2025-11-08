package practice_7.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task1_Exception {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("data.txt"));
        }
        catch (IOException е) {
            System.err.println("Файл не найден");
        }
    }
}

