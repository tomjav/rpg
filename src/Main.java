public class Main {

    public static void main(String[] args) {

        Knight knight = new Knight("Grzybatronix", 1400, 100, 5);
        Palladin palladyn = new Palladin("Rafonix", 1200, 50, 10);

        Arena arena = new Arena(knight, palladyn);
        arena.startWalki();
    }
}
