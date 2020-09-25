/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicejava;

/**
 *
 * @author  arda_
 */
public class Week1 {

    /**
     * @param arguments the command line arguments
     */
    public static void main(String[] arg) {
        // TODO code application logic here1
        System.out.println("Hello world");
        System.out.println(arg[0]);
        int firstNum = Integer.parseInt (arg[0]);
        int secondNum = Integer.parseInt(arg[1]);
        
        
        if (firstNum > 10 && secondNum > 10){
            System.out.println("Both of the numbes are bigger than 10");
            
        } else if (firstNum > 10 || secondNum > 10) {
            System.out.println("One of the numbers is bigger than 10");
            
        }else{
            System.out.println("None of the numbers is bigger than 16");
        }
    }
    
}
