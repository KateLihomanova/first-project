package practice_6.LinkedHashMap.task2_LinkedHashMap;

import java.util.LinkedHashMap;

public class task2_LinkedHashMap {
    private LinkedHashMap<String, Integer> phoneBook;

    public task2_LinkedHashMap() {
        this.phoneBook = new LinkedHashMap<>();
    }

    public void addNamePhone(String name, int phone) {
        phoneBook.put(name, phone);
    }

    public void findContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        }
        else {
            System.out.println("Такого контакта нет в записной книжке");
        }
    }
}
