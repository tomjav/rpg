import java.util.Random;

public class Mag extends Character {

    public Mag(String name, int hp, int mana, int strength) {
        super(name, hp, mana, strength);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem magiem");
    }

    @Override
    public void hit(Character wojownik) {
        Random random = new Random();
        int wysolowanaLiczba = random.nextInt(30);
        wojownik.setHp(wojownik.getHp() - wysolowanaLiczba);
        System.out.println("Zaatakowalem " + wysolowanaLiczba);
    }
}
