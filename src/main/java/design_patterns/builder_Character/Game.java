package design_patterns.builder_Character;

public class Game {
    public static void main(String[] args) {
        CharacterBuilder builder = new CharacterBuilder();

        Character character = builder.setHealth(90)
                .setDamage(23)
                .setArmor("щит")
                .setMagic("черная")
                .build();

        System.out.println(character.toString());
    }
}
