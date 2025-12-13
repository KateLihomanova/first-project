package practice_12;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {

    @Test
    void testValidAddGrade() {
        GradeService<Integer> newService = new GradeService<>();
        newService.addGrade(new StudentGrade<>("Kate", "math", 5));
        assertEquals(1, newService.getGrades().size());
    }

    @Test
    void testInvalidGrade() {
        GradeService<Integer> newService = new GradeService<>();
        assertThrows(InvalidGradeException.class, () -> newService.addGrade(new StudentGrade<>("Kate", "math", -4)));

    }

    @Test
    void testAverageGrade() {
        GradeService<Integer> newService = new GradeService<>();
        newService.addGrade(new StudentGrade<>("Kate", "math", 5));
        newService.addGrade(new StudentGrade<>("Anna", "math", 3));
        double avgGrade = newService.getAverageGrade("math");
        assertEquals(4, avgGrade);
    }

    @Test
    void testAverageGradeNoSubject() {
        GradeService<Integer> newService = new GradeService<>();
        newService.addGrade(new StudentGrade<>("Kate", "math", 5));
        assertThrows(IllegalArgumentException.class, () -> newService.getAverageGrade("biology"));

    }
}
