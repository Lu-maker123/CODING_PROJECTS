/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ims;

import java.util.ArrayList;

public class Inventory {
    // store list of product objects
    private ArrayList<Product> products;
    
    // initialize products field
    public Inventory(){
        products = new ArrayList<Product>();
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public void removeProduct(Product product) {
        products.remove(product);
    }
    
    public void chechLowInventory() {
        for (Product product : products) {
        if (product.getQuantity() <= 100) {
                System.out.print(product.getName() + " is running low on stock. Current quantity: " + product.getQuantity());
            }
        }
    }
}
