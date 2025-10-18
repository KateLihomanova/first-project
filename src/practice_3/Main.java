package practice_3;

public class Main {
    public static void main(String[] args){
        Company newPerson = new Company(82, "Ivan");
        Company newPerson2 = new Company(43, "Maria");
        Company.companyName = "Saby";
        System.out.println(Company.companyName);

        System.out.println(MathConstants.calculateCircleArea(5.4));
        System.out.println(MathConstants.calculateCircumference(3.2));

        GameSettings newGame = new GameSettings("Football", 5);
        GameSettings newGame1 = new GameSettings("GTA", 4);
        GameSettings.setMaxPlayers(8);
        newGame.addPlayer();
        newGame.printGameStatus();

        Person newHuman = new Person("Ivan", "Ivanov", "908-98-76");
        newHuman.printPersonInfo();


    }
}
