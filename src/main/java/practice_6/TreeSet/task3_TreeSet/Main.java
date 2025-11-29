package practice_6.TreeSet.task3_TreeSet;

public class Main {
    public static void main(String[] args) {
        task3_TreeSet task3 = new task3_TreeSet();
        task3.addMinMaxSet(9);
        task3.addMinMaxSet(12);
        task3.addMinMaxSet(8);
        task3.addMinMaxSet(3);
        task3.addMinMaxSet(6);

        task3.higher(10);
        task3.lower(0);
    }
}
