package practice_11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DebugTask8 {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(0.1 * 3).setScale(1, RoundingMode.DOWN);
        BigDecimal b = BigDecimal.valueOf(0.3);
        if (a.compareTo(b) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
