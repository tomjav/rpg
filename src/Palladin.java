import java.util.Random;

public class Palladin extends Character {

    public Palladin(String name, int hp, int mana, int strength) {
        super(name, hp, mana, strength);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem Palladynem");
    }

    @Override
    public void hit(Character wojownik) {
        Random random = new Random();
        int wysolowanaLiczba = random.nextInt(40) + 40;
        wojownik.setHp(wojownik.getHp() - wysolowanaLiczba);
        System.out.println("Zaatakowalem " + wysolowanaLiczba);
    }
}
