package calculator;

import java.util.Scanner; 

public class Calculator {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     //Define Variables
     int firstNumber = 6;
     int secondNumber = 2;
     int answer;
     //Definie operators
     int operator;
    System.out.println("Pick an operation");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("Operation:");
    operator = input.nextInt();
    
    /* if/else statements
    Account for all situations:
            What if user selects operator > 4?
            What if user divides by 0? */
    if (operator == 1){
           System.out.println (firstNumber + secondNumber);
    }
    else if (operator == 2) {
        System.out.println(firstNumber - secondNumber);
    }
    else if (operator == 3) {
        System.out.println(firstNumber * secondNumber);
    }
    else if (operator == 4) {
        if (secondNumber != 0) {
        System.out.println (firstNumber / secondNumber);
        }
        else {
            System.out.println("Undefined.");
        }
    }
    else {
        System.out.println("The number you typed is not valid.");
    }
    }
    }
    

