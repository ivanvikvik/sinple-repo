package by.itstep.vikvik.examproject.controller;

import by.itstep.vikvik.examproject.model.entity.Basket;
import by.itstep.vikvik.examproject.model.entity.Bread;
import by.itstep.vikvik.examproject.model.entity.Milk;
import by.itstep.vikvik.examproject.model.entity.Orange;
import by.itstep.vikvik.examproject.model.logic.ShopAssistance;
import by.itstep.vikvik.examproject.util.BasketCreator;
import by.itstep.vikvik.examproject.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input count of products: ");
        int count = scanner.nextInt();
        Basket basket = BasketCreator.create(count);

        double total = ShopAssistance.calcTotalPrice(basket);

        Printer.print(basket);
        Printer.print("\n\nTotal price = " + total);

    }
}
