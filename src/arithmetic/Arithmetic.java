/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;
import jdk.internal.org.jline.utils.DiffHelper;


public class Arithmetic 
{

    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
       Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        r.setX(Sc.nextInt());

        System.out.println("Enter the second number: ");
        r.setY(Sc.nextInt());
        
        
        
    }
}

