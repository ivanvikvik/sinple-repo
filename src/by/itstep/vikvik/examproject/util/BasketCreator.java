package by.itstep.vikvik.examproject.util;

import by.itstep.vikvik.examproject.model.entity.Basket;
import by.itstep.vikvik.examproject.model.entity.Bread;
import by.itstep.vikvik.examproject.model.entity.Milk;
import by.itstep.vikvik.examproject.model.entity.Orange;
import by.itstep.vikvik.examproject.model.entity.abstracts.Product;

import java.util.Random;

public class BasketCreator {
    public static final int PRODUCT_COUNT = 3;

    public static final double MAX_MILK_PRICE = 5.0;
    public static final double MIN_MILK_PRICE = 1.0;

    public static final String[] flours = {"Best", "First", "Second"};
    public static final String[] colors = {"White", "Black", "Grey"};

    private static Random random;

    static {
        random = new Random();
    }

    public static Basket create(int count) {
        Basket basket = new Basket();

        for (int i = 0; i < count; i++) {
            basket.add(getProduct());
        }

        return basket;
    }

    public static Product getTypeProduct(int type){

        double price = random.nextDouble() % MAX_MILK_PRICE + MIN_MILK_PRICE;
        double fat = random.nextDouble() % 10;
        double volume = random.nextDouble() % 5000;

        Product product = new Milk(volume, fat, price);

        switch(type) {
            case 0: {
                String color = colors[random.nextInt(colors.length)];
                String flour = flours[random.nextInt(flours.length)];
                product = new Bread();
            } break;
            case 1: {

                product = new Orange();
            } break;
        }

        return product;
    }

    private static Product getProduct(){
        int type = random.nextInt(PRODUCT_COUNT);
        return getTypeProduct(type);
    }

    public static Basket create() {
        Basket basket = new Basket();

        //...

        return basket;
    }
}
