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
public class ProcessedShoppingList {

    List<ProcessedGroceryProduct> processedShoppingList;
    double amount;

    public ProcessedShoppingList() {

    }

    public double getAmount() {
        return (this.amount);
    }

}
