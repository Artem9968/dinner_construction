package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> menu;

    DinnerConstructor() {
        menu = new HashMap<>();
    }

    void addNewDish(String dishType, String dishName) {
        if (menu.containsKey(dishType)) {
            ArrayList<String> dishTypes = menu.get(dishType);
            dishTypes.add(dishName);
        } else {
            ArrayList<String> dishTypes = new ArrayList<>();
            dishTypes.add(dishName);
            menu.put(dishType, dishTypes);
            System.out.println("Блюдо было успешно добавлено");
        }
    }

    void printDishes() {

        for (String dishType : menu.keySet()) {
            System.out.println(dishType);
            System.out.println(menu.get(dishType));
        }

        System.out.println("Меню выведено!");
    }
     void randomMenu(int numerOfCombos, ArrayList<String> combos) {
         Random random = new Random();
        ArrayList<String> randomDishes = new ArrayList<>();
         for (int i = 0; i < numerOfCombos; i++) {
             for (String typeDish :combos) {

             }

         }
     }

}
