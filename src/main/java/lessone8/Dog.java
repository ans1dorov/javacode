package lessone8;


public class Dog extends Animal {

    public Dog(String name) {
        super(name);

    }

    public Dog() {

        this("Dog");
    }

    void bark() {
        System.out.println(name + " barks");
    }

    public void makeNoise() {
        bark();
    }

}
