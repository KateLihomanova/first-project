package design_patterns.fabricmethod_Weapon;

public class Gun implements Weapon {
    @Override
    public void attack() {
        System.out.println("Оружие аттакует пулями");
    }
}
