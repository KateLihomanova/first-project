package design_patterns.fabricmethod_Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Меч атакует лезвием");
    }
}
