// Demonstração da coleção ArrayList<T> genérica
package Yextras.arrays;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("green");
        colors.add(0, "red");

        System.out.print("Display elements in array list: ");
        for (int i = 0; i < colors.size(); i++) {
            System.out.printf("%s ", colors.get(i));
        }

        System.out.println();

        colors.add("blue");
        colors.add("red");

        display(colors, "Display elements in array list with forEach: ");

        colors.remove(3);

        display(colors, "new arrayList: ");
    }

    public static void display(ArrayList<String> colors, String header) {
        System.out.print(header);
        for (String color : colors) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }
}