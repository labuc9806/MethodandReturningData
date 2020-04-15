/*
 * Launa Bucher-Austin
 * This program will present the user with the option of performing 10 different math operations or exiting the program. 
 * April 14 2020
 */
package myfirstsubroutine;

import java.util.Scanner;

/**
 *
 * @author launa
 */
public class MyFirstSubroutine {

    /**
     * @param n1
     * @param n2
     * @return 
     */
    
    public static int Areaofsquare (int n1, int n2)
    {
        int area = n1*n2;
        return (area);
    }
    
    public static int Speed (int n1, int n2)
    {
        int speed = n1/n2;
        return (speed);
    }
    
    public static int Areaoftriangle (int n1, int n2)
    {
        int area = n1*n2/2;
        return (area);
    }
    
    public static int Average (int n1, int n2)
    {
        int average = n1+n2;
        average = average/2;
        return (average);
    }
    
    public static int Acceleration (int n1, int n2)
    {
        int acceleration = n1/n2;
        return (acceleration);
    }
   public static int Squareroot (int n1)
   {
       int squareroot = n1*n1;
       return (squareroot);
   }
   
   public static int Multiply (int n1, int n2)
   {
       int multiple = n1*n2;
       return (multiple);
   }
           
   public static int Divide (int n1, int n2)
   {
       int divide = n1/n2;
       return (divide);
   }
    
   public static int Addition (int n1, int n2)
   {
       int add = n1+n2;
       return (add);
   }
   
   public static int Subtraction (int n1, int n2)
   {
       int sub = n1 - n2;
       return (sub);
   }
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in) ;
        int response;
        System.out.println("Please choose an option :");
        System.out.println("1. Find the area of square");
        System.out.println("2. Find the speed of an object");
        System.out.println("3. Find the area of a triangle");
        System.out.println("4. Find the average of two numbers");
        System.out.println("5. Find the acceleration of an object");
        System.out.println("6. Find the square root of a number.");
        System.out.println("7. Multiply two numbers");
        System.out.println("8. Divide two numbers");
        System.out.println("9. Add two numbers");
        System.out.println("10. Subtract two numbers");
        System.out.println("11. Exit");
        
        System.out.println("Pick option :");
        response = keyedInput.nextInt();
        
        if (response == 1)
        {
            System.out.println("Enter square's length : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter square's height : ");
            int num2 = keyedInput.nextInt();
            System.out.println(Areaofsquare (num1,num2));
        }
        
        if (response == 2)
        {
            System.out.println("Enter Distance : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter time : ");
            int num2 = keyedInput.nextInt();
            System.out.println(Speed (num1, num2));
        }
        
        if (response == 3)
        {
            System.out.println("Enter the triangle's base : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter the triangle's height : ");
            int num2 = keyedInput.nextInt();
            System.out.println(Areaoftriangle (num1, num2));
            
        }
        
        if (response == 4)
        {
            System.out.println("Enter a number : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter a second number :");
            int num2 = keyedInput.nextInt();
            System.out.println(Average (num1, num2));
            
        }
        
        if (response == 5)
        {
            System.out.println("Enter velocity : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter time : ");
            int num2 = keyedInput.nextInt();
            System.out.println(Acceleration (num1, num2));
        }
        
        if (response == 6)
        {
            System.out.println("Enter a number : ");
            int num1 = keyedInput.nextInt();
            System.out.println(Squareroot (num1));
        }
        
        if (response == 7)
        {
            System.out.println("Enter a number : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter a second number :");
            int num2 = keyedInput.nextInt();
            System.out.println(Multiply (num1, num2));
        }
        
        if (response == 8)
        {
          System.out.println("Enter a number : ");
          int num1 = keyedInput.nextInt();
          System.out.println("Enter a second number :");
          int num2 = keyedInput.nextInt();  
            System.out.println(Divide (num1, num2));
        }
        
        if (response == 9)
        {
            System.out.println("Enter a number : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter a second number :");
            int num2 = keyedInput.nextInt();
            System.out.println(Addition (num1, num2));
        }
        
        if (response == 10)
        {
            System.out.println("Enter a number : ");
            int num1 = keyedInput.nextInt();
            System.out.println("Enter a second number :");
            int num2 = keyedInput.nextInt();
            System.out.println(Subtraction (num1, num2));
        }
        if (response == 11)
        {
            System.out.println("Goodbye!");
        }
       
    }
    
}
