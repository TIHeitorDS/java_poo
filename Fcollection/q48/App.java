package Fcollection.q48;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        LinkedList<Character> characters = new LinkedList<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        LinkedList<Character> charactersCopy;

        charactersCopy = inverse(characters);

        for (Character character : charactersCopy) {
            System.out.println(character);
        }
    }

    public static LinkedList<Character> inverse(LinkedList<Character> list) {
        LinkedList<Character> element = new LinkedList<>();
        ListIterator<Character> iterator = list.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        while (iterator.hasPrevious()) {
            element.add(iterator.previous());
        }

        return element;
    }
}