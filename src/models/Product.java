/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author mac
 */
public class Product implements Comparable, Comparator {

    private String name;
    private double price;
    private String unit;

    public Product() {
    }

    public Product(String name, double price, String unit) {
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // same reference
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        // same reference AND same name AND same price
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", unit=").append(unit);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        Product other = (Product) o;
        double k = this.price - other.price;
        if (k > 0) {
            return (1);
        }
        if (k < 0) {
            return (-1);
        }
        return (0);
    }

    @Override
    public int compare(Object o1, Object o2) {

        return (0);
    }

}
