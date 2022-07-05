package lessone8;

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    public Cat() {
        this("Cat");
    }

    void purr() {
        System.out.println(name + " purrs");
    }

    public void makeNoise() {
        purr();
    }
}
