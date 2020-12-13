/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mac
 */
public class ProcessedGroceryProduct extends GroceryProduct {

    private double amount;

    public ProcessedGroceryProduct() {
    }

    public ProcessedGroceryProduct(Product product, int quantity) {
        super(product, quantity);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProcessedGroceryProduct{amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }

}
