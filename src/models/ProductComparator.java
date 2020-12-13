/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Comparator;

/**
 *
 * @author mac
 */
public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (o1.compareTo(o2));
    }

    @Override
    public Comparator<Product> thenComparing(Comparator<? super Product> other) {
        return Comparator.super.thenComparing(other); //To change body of generated methods, choose Tools | Templates.
    }

}
