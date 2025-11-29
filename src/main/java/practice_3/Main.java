package practice_3;

public class Main {
    public static void main(String[] args){
        Company newPerson = new Company(9, "Ivan");
        Company newPerson1 = new Company(4, "Anna");
        Company.companyName = "Saby";
        Company.printCompanyName();

        System.out.println(MathConstants.calculateCircleArea(5.8));
        MathConstants.calculateCircumference(7.7);

        GameSettings newGame = new GameSettings("GTA", 7);
        GameSettings newGame1 = new GameSettings("DOTA", 5);
        GameSettings.setMaxPlayers(7);
        newGame.addPlayer();
        newGame1.addPlayer();
        newGame.printGameStatus();
        newGame1.printGameStatus();






















        Person newHuman = new Person("Ivan", "Ivanov", "908-98-76");
        newHuman.printPersonInfo();


    }
}
