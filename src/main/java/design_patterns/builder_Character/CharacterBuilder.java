package design_patterns.builder_Character;

public class CharacterBuilder {
    private double health;
    private double damage;
    private String armor;
    private String magic;

    public CharacterBuilder setHealth(double health) {
        this.health = health;
        return this;
    }

    public CharacterBuilder setDamage(double damage) {
        this.damage = damage;
        return this;
    }

    public CharacterBuilder setArmor(String armor) {
        this.armor = armor;
        return this;
    }

    public CharacterBuilder setMagic(String magic) {
        this.magic = magic;
        return this;
    }

    public Character build() {
        return new Character(health, damage, armor, magic);
    }
}
