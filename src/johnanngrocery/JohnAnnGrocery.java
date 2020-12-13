/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnanngrocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.GroceryStore;
import models.Human;
import models.Product;

/**
 *
 * @author mac
 */
public class JohnAnnGrocery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human john = new Human("John");
        Human ann = new Human("Ann");

        List<Product> products = new ArrayList<>(Arrays.asList(new Product[]{
            new Product("Apple", 1.20d, "Kgr"),
            new Product("Orange", 1.80d, "Kgr"),
            new Product("Mango", 3.45d, "Item")

        }));
        /*
        Arrays.asList(new Product[] {
            new Product("Apple", 1.20d, "Kgr"), 
            new Product("Orange", 1.80d, "Kgr"),
            new Product("Mango", 3.45d, "Item")
            
        });
         */
        GroceryStore grocery = new GroceryStore("John's Grocery Store", john, products);

    }

}
