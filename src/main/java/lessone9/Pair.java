package lessone9;

/**
 * Создать интерфейс Pair<L,R> c двумя generic параметрами. Интерфейс содержит два метода:
 * L left(); - возвращает первый элемент, R right(); - возвращает второй элемент.
 * Создать класс ComparablePair<T> - пара элементов, которые можно сравнить. Должен содержать метод
 * boolean isLeftGreaterThanRight() - true, если левый элемент больше чем правый.
 * Создать класс StringPair, который представляет собой пару строчек, наследующийся от ComparablePair<String>.
 * Протестировать поведение классов в main.
 *
 * @author Maxim Tereshchenko
 */
interface Pair<L, R> {
    L left();

    R right();

}

class ComparablePair<T extends ComparablePair<T>> {
    private final T left;
    private final T right;

    ComparablePair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T left() {
        return left;
    }

    public T right() {
        return right;
    }


    boolean isLeftGreaterThanRight() {
        return left.compareTo(right);
    }

    private boolean compareTo(T right) {
    }

}

class StringPair extends ComparablePair<String> {
    StringPair(String left, String right){
        super(left, right);
    }


}


