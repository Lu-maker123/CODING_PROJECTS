/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dice;
import java.util.*;
/**
 *
 * @author user
 */
public class DIce {
    //input and variable for dice number
    Scanner scan = new Scanner(System.in);
    int Dice;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DIce game = new DIce();
        game.menu();
    }
    
    //output for numbers between 1 to 6 on dice
    void Roll(){
        Random roll = new Random();
        int name = roll.nextInt(6 - 1 + 1) + 1;
        System.out.println(name);
    }
    
    void menu(){
    //choice to choose between playing or exiting program
    Scanner scan = new Scanner(System.in);
    System.out.println("1-Roll");
    System.out.println("2-Exit");
    System.out.println("Please choose: ");
    int choose = scan.nextInt();
    // while and if loops if user makes choices
    boolean gamble = false;
    while (!gamble){
    if (choose == 1){
        Roll();
        System.out.println("Do u want to roll again?");
        var again = scan.next();
        if ("Y".equals(again)){
            Roll();
        }
        else if ("N".equals(again)){
            gamble = true;
        }
    }
    
    else if (choose == 2){
        System.out.println("Thank you for playing");
        gamble = true;
    }
    }
    
    }
    
}
    

