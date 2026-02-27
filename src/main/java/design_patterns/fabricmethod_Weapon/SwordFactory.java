package design_patterns.fabricmethod_Weapon;

public class SwordFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
