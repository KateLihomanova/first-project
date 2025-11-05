package practice_6.ArrayList.task2_ArrayList;

import java.util.ArrayList;

public class task2_ArrayList {
    private ArrayList<Integer> evenNumbers;

    public task2_ArrayList(){
        this.evenNumbers = new ArrayList<>();
    }

    public void addNumber(int num){
        evenNumbers.add(num);
    }

    public void printEvenNumbers(){
        evenNumbers.forEach(
                num -> {
                    if (num%2 == 0){
                        System.out.println(num);
                    }
                });
    }
}
