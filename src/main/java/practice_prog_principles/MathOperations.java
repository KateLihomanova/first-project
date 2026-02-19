package practice_prog_principles;


public class MathOperations {
    public int add (int... numbers) {
        int sum = 0;
        for (int i : numbers){
            sum = sum + i;
        }
        return sum;
    }

}
