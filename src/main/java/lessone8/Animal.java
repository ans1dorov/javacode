package lessone8;

/**
 * Создать абстрактный класс Animal. У него должен быть конструктор, принимающий имя.
 * У него должны быть методы: String name() - возвращает имя, void eat() - печатает 'X eats',
 * void sleep() - печатает 'X sleeps', где X - имя животного.
 * Создать класс Dog, который наследуется от Animal. У него должен быть конструктор, принимающий
 * имя, и конструктор без параметров, который устанавливает имя 'Dog'.
 * У него должен быть дополнительный метод void bark() - который печатает 'X barks',
 * где X - имя животного.
 * Создать класс Cat, который наследуется от Animal. У него должен быть конструктор, принимающий
 * имя, и конструктор без параметров, который устанавливает имя 'Cat'.
 * У него должен быть дополнительный метод void purr() - который печатает 'X purrs',
 * где X - имя животного.
 * Создать интерфейс NoiseCapable, который имеет метод void makeNoise(). Реализовать интерфейс
 * в Dog и Cat, используя их методы bark() и purr().
 * В методе main посмотреть: какие объекты в переменные какого типа можно присвоить и какие методы будут тогда доступны.
 *
 * @author Maxim Tereshchenko
 */

interface NoiseCapable {
    void makeNoise();

}

abstract class Animal implements NoiseCapable {
    String name;

    Animal(String name) {
        this.name = name;

    }


    void eat() {
        System.out.println(name + " eats");
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }

    String name() {
        return name;

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.makeNoise();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.purr();
        cat.makeNoise();
    }
}


