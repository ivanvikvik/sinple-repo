package by.itstep.vikvik.examproject.model.logic;

import by.itstep.vikvik.examproject.model.entity.Basket;
import by.itstep.vikvik.examproject.model.entity.Bread;
import by.itstep.vikvik.examproject.model.entity.Milk;
import by.itstep.vikvik.examproject.model.entity.Orange;
import by.itstep.vikvik.examproject.model.entity.abstracts.Product;
import by.itstep.vikvik.examproject.model.exception.ProductIndexOutOfBoundException;

public class ShopAssistance {
    public static double calcTotalPrice(Basket basket) {
        double total = 0;

        try {
            for (int i = 0; i < basket.getSize(); i++) {
                Product product = basket.get(i);
                total += product.getPrice();
            }

        } catch (ProductIndexOutOfBoundException exc) {
            System.err.println(exc);
        }

        return total;
    }

    public static Product getMaxPriceProduct(Basket basket) {
        int index = 0;
        Product product = null;

        try {
            for (int i = 0; i < basket.getSize(); i++) {
                if (basket.get(index).getPrice() < basket.get(i).getPrice()) {
                    index = i;
                }
            }
            product = basket.get(index);

        } catch (ProductIndexOutOfBoundException e) {
            //...``
        }

        return product;
    }

    public static Milk getMaxFatMilk(Basket basket) {
        double maxFat = Double.MIN_VALUE;
        int index = -1;
        Milk milk = null;

        try {
            for (int i = 0; i < basket.getSize(); i++) {
                Product product = basket.get(i);

                if (product instanceof Milk) {
                    Milk t = (Milk)product;
                    if (t.getFat() > maxFat) {
                        maxFat = t.getFat();
                        index = i;
                    }
                }
            }

            if (index != -1) {
                milk = (Milk) basket.get(index);
            }

        } catch (ProductIndexOutOfBoundException e) {
            //...``
        }

        return milk;
    }

}
