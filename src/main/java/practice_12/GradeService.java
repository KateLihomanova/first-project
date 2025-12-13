package practice_12;

import java.util.ArrayList;
import java.util.List;

public class GradeService <T extends Number> {
    private List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if(grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка должна быть больше нуля");
        }
        grades.add(grade);

    }

    public synchronized double getAverageGrade(String subject) {
        return grades.stream()
                .filter(g ->
                        g.getSubject().equalsIgnoreCase(subject))
                .mapToDouble(g -> g.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new
                        IllegalArgumentException("Нет оценок по предмету: " + subject));
    }

    public List<StudentGrade<T>> getGrades() {
        return List.copyOf(grades);
    }

}

