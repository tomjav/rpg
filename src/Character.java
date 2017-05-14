public abstract class Character implements Wojownik {

    protected String name;
    protected int hp;
    protected int mana;
    protected int strength;

    public Character(String name, int hp, int mana, int strength) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void przedstawSie(){
        System.out.println("Jestem bezimienny");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
