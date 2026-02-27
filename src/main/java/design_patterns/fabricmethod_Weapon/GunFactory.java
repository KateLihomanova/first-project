package design_patterns.fabricmethod_Weapon;

public class GunFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon() {
        return new Gun();
    }
}
