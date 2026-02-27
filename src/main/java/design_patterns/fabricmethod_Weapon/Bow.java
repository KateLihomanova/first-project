package design_patterns.fabricmethod_Weapon;

public class Bow implements Weapon {
    @Override
    public void attack() {
        System.out.println("Лук атакует стрелами");
    }
}
