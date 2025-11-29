package practice_5.task1;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Zoo zoo = new Zoo();
        zoo.setNewAnimal(elephant);
        zoo.showAnimalBahavior();
    }
}
