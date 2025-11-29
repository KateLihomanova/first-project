package practice_6.ArrayList.task5_ArrayList;

import java.util.ArrayList;

public class task5_ArrayList {
    private ArrayList<Integer> mylist;

    public task5_ArrayList() {
        this.mylist = new ArrayList<>();
    }

    public void addNumbers(int numbers) {
        mylist.add(numbers);
    }

    public void findMaxNum() {
        int maxNum = 0;
        for (int i: mylist) {
            if (i >= maxNum) {
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
}
