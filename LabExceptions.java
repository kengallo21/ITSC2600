/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexceptions;

import java.util.*;
import java.util.InputMismatchException;
import java.io.*;
import java.io.FileNotFoundException;

/**
 *
 * @author kennethgallo
 */
public class LabExceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        //addUserInput();
        //System.out.println(addUserInput());
        //System.out.println(divideUserInput());
        divideFromFile();

    }

    /**
     *
     * @return
     */
    public static int addUserInput() {

        //Create scanner to get intput
        Scanner userInputScanner = new Scanner(System.in);

        boolean done1 = true;
        boolean done2 = true;
        int sum;
        
        int a = 0;
        int b = 0;

        do {
            
            try {
            
            System.out.println("Please enter an integer");
            int inputA = userInputScanner.nextInt();
            
            a += inputA;
            
            done1 = false;
            
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                userInputScanner.next();
            }
        } while(done1);
        
        do{    
            try {
                
            System.out.println("Please enter 2nd integer");
           
            int inputB = userInputScanner.nextInt();
            b += inputB;
            
            done2 = false;
            
            
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                userInputScanner.next();
            }
        
        } while (done2);
        
        sum = a + b;

        return sum;

    }

    public static int divideUserInput(){
        int a = 0;
        int b = 0;
        int quotient = 0;
        boolean done1 = true;
        boolean done2 = true;
        //boolean done3 = true;
        
        
        Scanner userInputScanner = new Scanner(System.in);
                
        
        
        //System.out.println("Please Enter the denominator");
        //int inputB = userInputScanner.nextInt();
        
        
        //b = inputB;
        
        do{
            try{
                System.out.println("Please Enter the numerator");
                int inputA = userInputScanner.nextInt();
                a = inputA;
                done1 = false;
            }
            catch(InputMismatchException e){
                System.out.println("Invalid Input");
                userInputScanner.next();
                
            } 
            } while(done1);
        
        do{    
            try {
                
            System.out.println("Please Enter the denominator");
           
            int inputB = userInputScanner.nextInt();
            b = inputB;
            
            done2 = false;
            
            
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                userInputScanner.next();
            }
        
        } while (done2);
        
        if(b == 0){
            System.out.println("Cannot divide by zero (0)");
            int inputB = userInputScanner.nextInt();
            b = inputB;    
        }
        
        
        return quotient = a / b;
    }
    
    public static void divideFromFile() //throws FileNotFoundException
    {
        String x = "";
        String y = "";
        double quot = 0;
        
        String fileName;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter file name");
        fileName = userInput.nextLine();
        
        try{
            File myFile = new File(fileName);
            Scanner fileScan = new Scanner(myFile);
            
            while(fileScan.hasNext()){
                x = fileScan.nextLine();
                y = fileScan.nextLine();
            }
            double a = Double.parseDouble(x);
            double b = Double.parseDouble(y);
            
            quot = a / b;
            
            System.out.println(quot);
            
        } catch (FileNotFoundException e){
            System.out.println("Cannot find the file");
            fileName = userInput.nextLine();

        }
        }
        
    }
    

