package practice_6.LinkedHashMap.task2_LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        task2_LinkedHashMap task2 = new task2_LinkedHashMap();
        task2.addNamePhone("Kate", 8908);
        task2.addNamePhone("Bob", 1234);
        task2.addNamePhone("Ivan", 7865);

        task2.findContact("Kate");
        task2.findContact("Maria");

    }
}
