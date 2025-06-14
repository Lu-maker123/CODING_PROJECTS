/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ims;

/**
 *
 * @author user
 */
public class Product {
    //store name of product
    private String name;
    //quantity of products
    private int quantity;
    
    // initialize name and quantiy
    public Product(String name, int quantity) {
        // assign name parameter to name field
        this.name = name;
        // assaign quantity parameter to quanity field
        this.quantity = quantity;
    }
    
    
    // method to get name field
    public String getName(){
        // return name value
        return name;
    }
    
    // method to set name field
    public void setName(String name){
        //assign name parameter to name field
        this.name = name;
    }
    
    // method to get quantity field
    public int getQuantity(){
        // return quantity valie
        return quantity;
    }
    
    // method to set quantity field
    public void setQuantity(int quantity){
        // assign quantity parameter to quanity field
        this.quantity = quantity;
    }
}
