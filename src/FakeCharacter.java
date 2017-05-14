public class FakeCharacter implements Wojownik {
    @Override
    public void hit(Character wojownik) {
        System.out.println("fake");
    }
}
