package interfaces;

import java.util.List;
import models.GroceryProduct;
import models.GroceryStore;
import models.ProcessedShoppingList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mac
 */
public interface IHuman {

    // step 1 - Ann gives the order
    List<GroceryProduct> order(GroceryStore store, List<GroceryProduct> shoppingList);

    // step 3
    void pays(ProcessedShoppingList processedShoppingList);

}
