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

        System.out.println("list original: ");

        for (Character character : characters) {
            System.out.print(character + " ");
        }

        System.out.println("\n\nlist invertida: ");

        for (Character character : charactersCopy) {
            System.out.print(character + " ");
        }
    }

    public static LinkedList<Character> inverse(LinkedList<Character> list) {
        ListIterator<Character> listIterator = list.listIterator();
        LinkedList<Character> copy = new LinkedList<>();

        while(listIterator.hasNext()) {
            listIterator.next();
        }

        while (listIterator.hasPrevious()) {
            copy.add(listIterator.previous());
        }

        return copy;
    }
}