package by.itstep.vikvik.examproject.model.entity;

import by.itstep.vikvik.examproject.model.entity.abstracts.Product;

public class Milk extends Product {
    private double volume;
    private double fat;

    public Milk() {
    }

    public Milk(double volume, double fat, double price) {
        super(price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        if (volume > 0) {
            this.volume = volume;
        }
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        if (fat > 0) {
            this.fat = fat;
        }
    }

    @Override
    public String toString() {
        return "Milk{" +
                "volume = " + volume +
                ", fat = " + fat +
                ", "+ super.toString() +
                '}';
    }
}
