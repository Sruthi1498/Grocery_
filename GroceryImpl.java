/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery;

import java.util.ArrayList;

public class GroceryImpl implements Grocery {

    ArrayList<Product> products = new ArrayList<>();
    private Product product;
    private int pid;

    @Override
    public void display() {

        products.forEach((_item) -> {
            System.out.println(
                    product.get_id() + "- "
                    + product.get_name() + " "
                    + product.get_price() + " ");
        });
    }

         @Override

    public void create() {

        String[] productNames = {"POTATO", "TOMATO", "ONION", "LADIES FINGER", "COCONUT"};
        Integer[] productPrice = {50, 90, 80, 50, 20};

        for (int i = 0; i < productNames.length; i++) {
            products.add(new Product(i + 1, productNames[i], productPrice[i]));
        }

    }

    public Product read(int pid) {
        for (Product product : products) {
            if (pid == Product.pid) {
                return product;
            }
        }
        return null;
       
    }

}
