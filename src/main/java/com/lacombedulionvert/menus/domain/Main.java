package com.lacombedulionvert.menus.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your Meals: ");
        Scanner scanner = new Scanner(System.in);
        List dishes = readDishes(scanner);
        List dishNumberByName = new Recap().getDishNumberByName(dishes);
        dishNumberByName.forEach(System.out::println);

    }

    private static List readDishes(Scanner scanner) {
        List dishes = new ArrayList();
        while (scanner.hasNext()) {
            String username = scanner.nextLine();
            dishes.add(username);
        }
        return dishes;
    }
}

