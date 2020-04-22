/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodsandclass;

import java.util.Scanner;

/**
 *
 * @author cacousins
 */
public class CalculatorMethod {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int userFirstNumber, userSecondNumber;
        
        //accepting user inputs
        System.out.print("Enter the first number : ");
        userFirstNumber = Integer.parseInt(input.nextLine());
        
        System.out.print("Enter the second number : ");
        userSecondNumber = Integer.parseInt(input.nextLine());
        
        //calling the addition method
         division(userFirstNumber,userSecondNumber);
         addition(userFirstNumber,userSecondNumber);
        
        
    }
    
    /*
        Method name:    addition()
        Purpose:        sum two numbers
        accepts:        two integers
        returns:        nothing
    */
    
    public static void addition(int number1, int number2){
        System.out.println("Addition >> " + (number1 + number2));
    }
    
    
    /*
        Method name:    subtraction()
        Purpose:        substract two numbers
        accepts:        two integers
        returns:        nothing
    */
    
    public static void subtraction(int number1, int number2){
        System.out.println("Substraction>> " + (number1 - number2));
    }
    
    /*
        Method name:    product()
        Purpose:        print prduct of two numbers
        accepts:        two integers
        returns:        nothing
    */
    
    public static void product(int number1, int number2){
        System.out.println("Product  >> " + (number1 * number2));
    }
    
    /*
        Method name:    division()
        Purpose:        produces the dividends of two num
        accepts:        two integers
        returns:        nothing
    */
    
    public static void division(int number1, int number2){
                
        try {
            System.out.println("Division  >> " + (number1 / number2));
        } catch (Exception e) {
            e.getMessage();
            System.out.println("you divided by zero");
        }
    }

}
