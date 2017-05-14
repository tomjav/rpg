import java.util.Random;

public class Knight extends Character {

    public Knight(String name, int hp, int mana, int strength) {
        super(name, hp, mana, strength);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem knightem");
    }

    @Override
    public void hit(Character wojownik) {
        Random random = new Random();
        int wysolowanaLiczba = random.nextInt(50) + 50;
        wojownik.setHp(wojownik.getHp() - wysolowanaLiczba);
        System.out.println("Zaatakowalem " + wysolowanaLiczba);

    }
}
