/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.GroceryProduct;
import models.Human;
import models.ProcessedGroceryProduct;
import models.ProcessedShoppingList;

/**
 *
 * @author mac
 */
public interface IGroceryStore {
    // Product apples [1.80] X quantity [3] = 5.40

    // step 2 - Grocery employee processes the order
    // calculates per item
    List<ProcessedGroceryProduct> processOrder(Human employee, Human customer,
            List<GroceryProduct> shoppingList);

    // calculates total
    double calculateTotal(List<ProcessedGroceryProduct> processedShoppingList);

    ProcessedShoppingList payOrder(Human employee, Human customer,
            List<ProcessedGroceryProduct> processedShoppingList, double totalAmount);

}
