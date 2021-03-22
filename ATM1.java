/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ATM {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
        
      
        int pin;
        int attempts;
        
        attempts = 3;
        
        System.out.println("Welcome to Reed's Credit Union!");
        System.out.println("");
        System.out.println("Please enter your four digit pin");
       
        
        //if(pin.equals("1234"));
        //break;
        
        while (attempts > 0)
        {
        System.out.println("Enter your pin: ");
        pin = scnr.nextInt();
        if (pin == 1234)
        {
            System.out.println("Your Pin is correct");
            break;
        }
        else if (pin != 1234)
        {
            System.out.println("Your PIN is incorrect");
            attempts--;
            if(attempts == 0)
            {
                System.out.println("Your bank card is blocked");
            }
      
    }
    

