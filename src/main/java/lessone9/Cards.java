package lessone9;

/**
 * Создать класс Suit - масть CLUB, DIAMOND, HEART, SPADE.
 * Создать класс Card - игральная карта, который содержит поля: стоимость (1-14) и масть.
 * Переопределить у него метод String toString(), чтобы возвращалась строка вида 'CLUB 10'.
 * При этом вместо стоимости 11 должно быть J, 12 - Q, 13 - K, 14 -A, например 'HEART A'.
 * Реализовать интерфейс Comparable таким образом, чтобы карты сравнивались по масти
 * (club > diamond > heart > spade), а потом по стоимости.
 * В main создать массив карт, отсортировать его (например, пузырьковым методом), напечатать
 * отсортированный массив.
 *
 * @author Maxim Tereshchenko
 */

/**пересмотреть решение*/

enum Suit {
    CLUB,
    DIAMOND,
    HEART,
    SPADE
}


class Card implements Comparable<Card> {
    int value;
    Suit suit;

    Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int compareTo(Card card) {
        var bySuit = suit.compareTo(card.suit);
        if (bySuit != 0) {
            return bySuit;
        }
        return value- card.value;
    }

    public String toString() {
        String valueString = "";
        switch (value) {
            case 11:
                valueString = "J";
                break;
            case 12:
                valueString = "Q";
                break;
            case 13:
                valueString = "K";
                break;
            case 14:
                valueString = "A";
                break;
            default:
                valueString = "" + valueString;
        }
        return suit.toString() + " " + valueString;
    }
}

class Cards {
    public static void main(String[] args) {
        Card[] cards = new Card[]{
                new Card(1,Suit.CLUB),
                new Card(2, Suit.DIAMOND),
                new Card(10, Suit.CLUB),
                new Card(5, Suit.SPADE),
                new Card(15, Suit.HEART)

        };
        boolean isSwapped;
        do{
            isSwapped = false;
            for (int i = 1; i < cards.length; i++){
                if (cards[i].compareTo(cards[i-1])<0){
                    Card temp = cards[i];
                    cards[i]=cards[i-1];
                    cards[i-1]= temp;
                    isSwapped=true;
                }
            }
        } while (isSwapped);
        for (Card card:cards){
            System.out.println(card);

        }
    }
}
