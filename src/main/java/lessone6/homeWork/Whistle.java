package lessone6.homeWork;

//Создать класс Whistle. Добавить поле String sound.
//Создать конструктор Whistle(String whistleSound), который сохраняет whistleSound в sound.
//Создать метод void sound() в классе Whistle, который печатает звук из поля sound.

public class Whistle {
    String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;


    }


    public String toString() {
        return sound;
    }


    public static void main(String[] args) {
        Whistle sound1 = new Whistle("beep");
        Whistle sound2 = new Whistle("mooo");
        System.out.println(sound1.sound);
        System.out.println(sound2.sound);

    }

}
