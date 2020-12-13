/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnanngrocery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
//        Human john = new Human("John");
//        Human ann = new Human("Ann");
//
//        List<Product> products = new ArrayList<>(Arrays.asList(new Product[]{
//            new Product("Apple", 1.20d, "Kgr"),
//            new Product("Orange", 1.80d, "Kgr"),
//            new Product("Mango", 3.45d, "Item")
//
//        }));
//        /*
//        Arrays.asList(new Product[] {
//            new Product("Apple", 1.20d, "Kgr"), 
//            new Product("Orange", 1.80d, "Kgr"),
//            new Product("Mango", 3.45d, "Item")
//            
//        });
//         */
//        GroceryStore grocery = new GroceryStore("John's Grocery Store", john, products);
//
//        // shoppingList Ann
//        List<GroceryProduct> shoppingList = new ArrayList<>();
//        shoppingList.add(new GroceryProduct(grocery.getProducts().get(0), 3));
//        shoppingList.add(new GroceryProduct(grocery.getProducts().get(1), 1.5d));
//        shoppingList.add(new GroceryProduct(grocery.getProducts().get(2), 3));
//
//        // Ann's order
//        ann.order(grocery, shoppingList);
//
//        List<ProcessedGroceryProduct> processedGroceryList
//                = grocery.processOrder(john, ann, shoppingList);
//        double totalAmount = grocery.calculateTotal(processedGroceryList);
//
//        ProcessedShoppingList processedShoppingList
//                = grocery.payOrder(john, ann, processedGroceryList, totalAmount);
//        ann.pays(processedShoppingList);

        compare();

    }

    public static void compare() {
        List<Product> products = new ArrayList<>(Arrays.asList(new Product[]{
            new Product("Apple", 2.20d, "Kgr"),
            new Product("Orange", 1.80d, "Kgr"),
            new Product("Mango", 3.45d, "Item")

        }));

        List<Product> products2 = new ArrayList<>(Arrays.asList(new Product[]{
            new Product("Red Apple", 3.20d, "Kgr"),
            new Product("Orange", 1.80d, "2 Kgrs"),
            new Product("Soft Mango", 3.55d, "Item")

        }));
        Product p2 = new Product();
        p2 = products.get(0);
        System.out.println("products[0] against p2 == " + (products.get(0) == p2));
        System.out.println("products[0] against p2 equals " + (products.get(0).equals(p2)));

        System.out.println("compareTo products[0], p2 = " + products.get(0).compareTo(products2.get(0)));

    }

}
