package by.itstep.vikvik.examproject.model.entity;

import by.itstep.vikvik.examproject.model.entity.abstracts.Product;
import by.itstep.vikvik.examproject.model.exception.ProductIndexOutOfBoundException;

public class Basket {
    private Product[] products;

    public Basket() {
        products = new Product[0];
    }

    public Basket(Product[] products) {
        this.products = products;
    }

    public Product get(int index) throws ProductIndexOutOfBoundException {
        if (index >= 0 && index < products.length) {
            return products[index];
        } else {
            throw new ProductIndexOutOfBoundException();
        }
    }

    public void set(int index, Product product) throws ProductIndexOutOfBoundException{
        if (index >= 0 && index < products.length && product != null) {
            products[index] = product;
        } else {
            throw new ProductIndexOutOfBoundException();
        }
    }

    public int getSize(){
        return products.length;
    }

    public void add(Product product) {
        Product[] temp = new Product[products.length + 1];
        int i = 0;
        for (; i < products.length; i++) {
            temp[i] = products[i];
        }
        temp[i] = product;
        products = temp;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of products:\n");

        for (Product product: products) {
            builder.append(product).append("\n");
        }

        return builder.toString();
    }
}
