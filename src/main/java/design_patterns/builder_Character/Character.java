package design_patterns.builder_Character;

public class Character {
    private double health;
    private double damage;
    private String armor;
    private String magic;

    public Character(double health, double damage, String armor, String magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "Персонаж имеет запас здоровья " + health + ", может наносить урон на " + damage + ", его броня это - " + armor + ", а магия: " + magic;
    }
}
