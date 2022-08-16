package lessone10;

import java.util.HashMap;
import java.util.Map;

import static java.awt.SystemColor.text;

/**
 * Создать класс Abbreviations. У него должны быть следующие методы:
 * void addAbbreviation(String abbreviation, String explanation) - добавляет новую аббревиатуру и ее расшифровку
 * boolean hasAbbreviation(String abbreviation) - true, если аббревиатура была уже добавлена
 * String findExplanationFor(String abbreviation) - возвращает расшифровку аббревиатуры
 * void printAbbreviations() - печатает все аббревиатуры, без расшифровки
 * void printAbbreviationsWhere(String text) - печатает аббревиатуры, которые содержат text, без расшифровки
 * void printExplanationOfAbbreviationsWhere(String text) - печатает расшифровки для аббревиатур, которые содержат text
 * В методе main протестировать класс.
 *
 * @author Maxim Tereshchenko
 */

public class Abbreviations {


    private final Map<String, String> map = new HashMap<>();

    void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    boolean hasAbbreviation(String abbreviation) {
        return map.containsKey(abbreviation);
    }

    String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }

    void printAbbreviations() {
        for (String abbreviation : map.keySet()) {
            System.out.println(abbreviation);
        }
    }

    void printAbbreviationsWhere(String text) {
        for (String abbreviation : map.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(abbreviation);
            }
        }

    }

    void printExplanationOfAbbreviationsWhere(String text) {
        for (String abbreviation : map.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(map.get(abbreviation));
            }
        }


    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("СССР", "Союз советских социалистических республик");
        abbreviations.addAbbreviation("KDA", "Kill Death Assist");
        abbreviations.addAbbreviation("MVP", "Most Valuable Player");

        System.out.println("abbreviations.hasAbbreviation(\"СССР\") = " + abbreviations.hasAbbreviation("СССР"));
        System.out.println("abbreviations.hasAbbreviation(\"KDA\") = " + abbreviations.hasAbbreviation("KDA"));
        System.out.println("abbreviations.hasAbbreviation(\"kda\") = " + abbreviations.hasAbbreviation("kda"));
        System.out.println("abbreviations.hasAbbreviation(\"MVP\") = " + abbreviations.findExplanationFor("MVP"));
        abbreviations.printAbbreviations();
        abbreviations.printAbbreviationsWhere("D");
        abbreviations.printExplanationOfAbbreviationsWhere("VP");
        abbreviations.printExplanationOfAbbreviationsWhere("СССР");


    }
}
