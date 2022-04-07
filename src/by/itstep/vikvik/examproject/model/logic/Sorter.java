package by.itstep.vikvik.examproject.model.logic;

import by.itstep.vikvik.examproject.model.entity.Basket;
import by.itstep.vikvik.examproject.model.entity.abstracts.Product;
import by.itstep.vikvik.examproject.model.exception.ProductIndexOutOfBoundException;

public class Sorter {
    public static void sortByPriceAsc(Basket basket) {
        try {
            for (int i = 0; i < basket.getSize() - 1; i++) {
                for (int j = 0; j < basket.getSize() - 1 - i; j++) {
                    if (basket.get(j).getPrice() > basket.get(j + 1).getPrice()) {
                        Product temp = basket.get(j);
                        basket.set(j, basket.get(j + 1));
                        basket.set(j + 1, temp);
                    }
                }
            }
        }catch(ProductIndexOutOfBoundException exception){
            //...
        }
    }

    public static void sortByNameAsc(Basket basket) {
        String s;
        try {
            for (int i = 0; i < basket.getSize() - 1; i++) {
                for (int j = 0; j < basket.getSize() - 1 - i; j++) {
                    if (basket.get(j).toString().compareTo(basket.get(j + 1).toString()) > 0) {
                        Product temp = basket.get(j);
                        basket.set(j, basket.get(j + 1));
                        basket.set(j + 1, temp);
                    }
                }
            }
        }catch(ProductIndexOutOfBoundException exception){
            //...
        }
    }

    public static void sortByNameDesc(Basket basket) {
        String s;
        try {
            for (int i = 0; i < basket.getSize() - 1; i++) {
                for (int j = 0; j < basket.getSize() - 1 - i; j++) {
                    if (basket.get(j).toString().compareTo(basket.get(j + 1).toString()) < 0) {
                        Product temp = basket.get(j);
                        basket.set(j, basket.get(j + 1));
                        basket.set(j + 1, temp);
                    }
                }
            }
        }catch(ProductIndexOutOfBoundException exception){
            //...
        }
    }
}
