/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import interfaces.IGroceryStore;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mac
 */
public class GroceryProduct implements IGroceryStore {

    private Product product;
    private double quantity;

    public GroceryProduct() {
    }

    public GroceryProduct(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GroceryProduct other = (GroceryProduct) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroceryProduct{product=").append(product);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public List<ProcessedGroceryProduct> processOrder(Human employee, Human customer, List<GroceryProduct> shoppingList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calculateTotal(List<ProcessedGroceryProduct> processedShoppingList) {
        double sum = 0;
        for (ProcessedGroceryProduct processedGroceryProduct : processedShoppingList) {
            sum += processedGroceryProduct.getAmount();
        }
        return (sum);
    }

    @Override
    public ProcessedShoppingList payOrder(Human employee, Human customer, List<ProcessedGroceryProduct> processedShoppingList, double totalAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
