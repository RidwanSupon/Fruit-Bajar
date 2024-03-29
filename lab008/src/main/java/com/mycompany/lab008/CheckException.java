//not solve
package com.mycompany.lab008;
import java.io.*;
//import java.util.*;
public class CheckException {
    public static void main(String[] args){
        
    FileInputStream data=null;
    try {
    data = new FileInputStram("/media/ridwan/Storage/testt/text.txt");
    }
    catch(Exception e){
        System.out.println("file not found");
    }
    int x;
    try{
       while((x=data.read())!=-1){
           System.out.println((char)x);
           data.close();
            
            }   
    }
    catch(IOException ioe){
       System.out.println("I/O exception occured ");
      }    
    }