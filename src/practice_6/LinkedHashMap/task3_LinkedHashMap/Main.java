package practice_6.LinkedHashMap.task3_LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        task3_LinkedHashMap task3 = new task3_LinkedHashMap();
        task3.addHistory("23", "https://example.com/page1");
        task3.addHistory("33", "https://example.com/page2");
        task3.addHistory("43", "https://example.com/page3");
        task3.addHistory("53", "https://example.com/page4");
        task3.addHistory("63", "https://example.com/page5");
        task3.addHistory("73", "https://example.com/page6");
        task3.addHistory("83", "https://example.com/page7");
        task3.addHistory("93", "https://example.com/page8");
        task3.addHistory("103", "https://example.com/page9");
        task3.addHistory("203", "https://example.com/page10");
        task3.addHistory("303", "https://example.com/page11");

        task3.printHistory();

    }
}
