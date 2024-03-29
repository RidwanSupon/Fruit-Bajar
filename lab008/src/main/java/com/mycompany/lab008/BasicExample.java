/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab008;

import java.util.Scanner;
public class BasicExample {



    public static void main(String args[]){
        
   
    System.out.println("Enter two values");
    Scanner value = new Scanner(System.in);
    try{
    int x = value.nextInt();
    int y = value.nextInt();
    int z = x/y;
    System.out.println(z);
   }
   catch(Exception e){
       System.out.println("Error ");
       e.printStackTrace();
       System.out.println(e);
       
   }
   }
}
    

