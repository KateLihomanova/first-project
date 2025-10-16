package practice_2;

public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    String getName() {
        return this.name;
    }
    String getSubject() {
        return this.subject;
    }
    void setName(String newName) {
        this.name = newName;
    }
    void setSubject(String newSubject) {
        this.subject = subject;
    }
    void printInfo() {
        System.out.println("Имя учителя: " + this.name + " Его предмет: " + this.subject);
    }
}
