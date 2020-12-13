/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author mac
 */
public class GroceryStore {

    private String name;
    private Human owner;
    private List<Product> products;

    public GroceryStore() {
    }

    public GroceryStore(String name, Human owner, List<Product> products) {
        this.name = name;
        this.owner = owner;
        this.products = products;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroceryStore{name=").append(name);
        sb.append(", owner=").append(owner);
        sb.append(", products=").append(products);
        sb.append('}');
        return sb.toString();
    }

}
