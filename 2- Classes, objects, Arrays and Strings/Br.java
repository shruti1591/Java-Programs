//Write a java program to understand how to take input using BufferedReader class


import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
class Br  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name);         
    } 
} 