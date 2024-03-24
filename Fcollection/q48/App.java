package Fcollection.q48;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(
                Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'));
        LinkedList<Character> invertedList = new LinkedList<>();
        ListIterator<Character> listIterator = list.listIterator();

        while(listIterator.hasNext()) {
            listIterator.next();
        }

        while(listIterator.hasPrevious()) {
            invertedList.add(listIterator.previous());
        }

        System.out.println("Lista original: " + list);
        System.out.println("lista invertida: " + invertedList);
    }
}