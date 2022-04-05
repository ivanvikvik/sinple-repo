package by.itstep.vikvik.examproject.model.logic;

import by.itstep.vikvik.examproject.model.entity.Basket;
import by.itstep.vikvik.examproject.model.entity.Bread;
import by.itstep.vikvik.examproject.model.entity.Milk;
import by.itstep.vikvik.examproject.model.entity.Orange;
import static org.junit.Assert.*;
import org.junit.Test;

public class ShopAssistanceTest {
    @Test
    public void testCalcTotalPricePositive(){
        Basket basket = new Basket();

        basket.add(new Milk(1000, 3.5, 2.5));
        basket.add(new Orange(200, 2000, 4.0));
        basket.add(new Bread("White", "Best", 2.5));

        double expected = 9.0;

        double actual = ShopAssistance.calcTotalPrice(basket);

        assertEquals(expected, actual, 0);

    }
}
