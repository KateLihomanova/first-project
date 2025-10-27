package practice_5.task8;

public class Main {
    public static void main(String[] args) {
        Museum newMuseum = new Museum();
        Exhibit newSculpture = new Sculpture();
        Exhibit newManuscript = new Manuscript();
        newMuseum.setNewObject(newSculpture);
        newMuseum.showExhibit();
        newMuseum.setNewObject(newManuscript);
        newMuseum.showExhibit();
    }
}
