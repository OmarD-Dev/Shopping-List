package com.pluralsight;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ShoppingList {
    public static void main(String[] args) {
        String[] items ={"Oranges", "Bread", "Shampoo","Juice","KitKats","Febreeze", "Water Bottle", "Macbook Pro","Headphones","Plants"};
        for (int i = 1; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}