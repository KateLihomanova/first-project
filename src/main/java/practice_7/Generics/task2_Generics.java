package practice_7.Generics;

import java.util.ArrayList;
import java.util.List;

public class task2_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>(List.of(2,3,4,5,6));
        printArray(mylist);

    }
    public static <T> void printArray(ArrayList<T> list) {
        for (T i : list){
            System.out.println(i);
        }

    }
}
