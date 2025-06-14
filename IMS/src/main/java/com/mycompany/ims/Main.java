/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.Main to edit this template
 */
package com.mycompany.ims;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create main instance of inventory class
        Inventory inventory = new Inventory();
        
        Product product1 = new Product("Samsung remote", 150);
        Product product2 = new Product("Shining TV", 50);
        Product product3 = new Product("Gaming ASUS Laptop", 80);
        
        System.out.println("these products are in inventory: ");
        
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        
        System.out.println("\nCheck low inventory: ");
        
        inventory.chechLowInventory();
        
        System.out.println("\nRemove product 2 and product 3 out of inventory");
        
        inventory.removeProduct(product2);
        inventory.removeProduct(product3);
        
        System.out.println("\nCheck low inventory again: ");
        inventory.chechLowInventory();
    }
    
}
