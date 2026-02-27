package design_patterns.fabricmethod_Weapon;

public class BowFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Bow();
    }
}
