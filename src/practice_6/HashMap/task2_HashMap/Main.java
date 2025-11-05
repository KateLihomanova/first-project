package practice_6.HashMap.task2_HashMap;

public class Main {
    public static void main(String[] args) {
        task2_HashMap task2 = new task2_HashMap();
        task2.addKeyValue("Kate", 22);
        task2.addKeyValue("Ivan", 23);
        task2.addKeyValue("Bob", 18);

        task2.containsName("Alex");
        task2.containsName("Kate");
    }
}
