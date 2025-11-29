package practice_2;

public class StudentGroup {
    String groupName;
    int studentCount;

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }
    String getGroupName() {
        return this.groupName;
    }
    int getStudentCount() {
        return this.studentCount;
    }
    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }
    void setStudentCount(int newCount){
        this.studentCount = newCount;
    }
    void printInfo(){
        System.out.println("Имя группы: " + this.groupName + " Количество студентов: " + this.studentCount);
    }
}
