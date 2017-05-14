import java.util.Random;

public class Arena {

    private Wojownik woj1;
    private Wojownik woj2;
    private int licznik = 0;

    public Arena(Wojownik woj1, Wojownik woj2) {
        this.woj1 = woj1;
        this.woj2 = woj2;
    }


    public void startWalki(){
        Random random = new Random();
        if(random.nextBoolean()){
            System.out.println("Zaczyna wojownik pierwszy");
            //rzutowanie
            uderzenie(woj1, woj2);

        }else{
            System.out.println("Zaczyna wojownik drugi");
            uderzenie(woj2, woj1);
        }
        return;
    }


    private void uderzenie(Wojownik woj1, Wojownik woj2){
        // rekurecnja, rekursja

        if(licznik++ % 2 == 0){
            woj1.hit((Character) woj2);
        }
        else {
            woj2.hit((Character) woj1);
        }

        Character character = (Character) woj1;
        Character character2 = (Character) woj2;

        if( character.getHp() <= 0 || character2.getHp() <= 0){
            //Warunkowy trójargumentowy operator ? :
            Character wygranyWojonwik = character.getHp() <= 0 ? character2 : character;
            System.out.println("Koniec walki wygrał wojownik " + wygranyWojonwik.getName());
            return;
        }
        uderzenie(woj1,woj2);
    }



}
