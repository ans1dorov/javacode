package lessone6.homeWork;

//Создать класс Whistle. Добавить поле String sound.
//Создать конструктор Whistle(String whistleSound), который сохраняет whistleSound в sound.
//Создать метод void sound() в классе Whistle, который печатает звук из поля sound.

public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        sound = whistleSound;


    }



    public static void main(String[] args) {
        Whistle whistle1 = new Whistle("beep");
        Whistle whistle2 = new Whistle("mooo");
        whistle1.sound();
        whistle2.sound();

    }
    void sound(){
        System.out.println(sound);
    }


}
