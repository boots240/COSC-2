
package alimohammedassignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author alimo
 */
public class AliMohammedArray 
{
    //An integral field that stores the number of values used from the Names array
    private int Number;
    
    //A partial array of strings field that store a list of names.
    private String[] Names;
   
   
    //initializes all the elements from the Names array with empty strings and the Number with 0.
    public AliMohammedArray()
    {
        Names = new String[400];
        for (int i = 0;i<Names.length;i++)
        {
            Names[i]= "";
        }
        
        
        Number = 0;
    }
     
    //Adds the fonts from the txt file into an Array 
    public void Add() throws FileNotFoundException
    {
      
     File file = new File("Assignment7Data.txt ");
     
     if(!file.exists())
     {
         System.out.println("File does not exist");
     }

     Scanner inputfile = new Scanner (file);
     while(inputfile.hasNext())
     {
         Names[Number] = inputfile.nextLine();
         Number++;
     }
     
     inputfile.close();

    }
    
    //gets the element from a specified position in the Array 
    public String Get(int N)
    {
  
        if (N < 0 || N >= Number )
        {
            return " ";
        }
  
        return Names[N];    
    }
    
    //A void method with an int N and a string S as parameters that replace the element from the position N with S, or output an error message
    public void Set(int N,String S)
    {
        if (N < 0 || N >= Number) 
        {
            System.out.println("Error: Out of bound"); 
        } 
        else 
        { 
            Names[N] = S; 
        }   
    }
    //an int method that uses sequencial search and returns where the parameter s is located in the Array 
    public int Search(String S)
    {
        int i;
        
        for(i=0;i<Number ;i++)
        {
            if (Names[i].equals(S))
                return i;
        }
        
        return 0;

    }
    //Sorts the array into alphabetic order 
    public void Sort()
    {
         int i;
         for (i=0;i< Number - 1;i++)
         {
            int min = i;
            for(int k = i+1;k<Number;k++)
            {
                if(Names[k].compareTo(Names[min])<0)
                {
                min = k;    
                }
            }
            String sorted = Names[i]; 
            Names[i] = Names[min]; 
            Names[min] = sorted;
         }
       
   
    }
    
    
    //A string method that returns a string with this format: “Names=[Names0, Names1, …., NamesNumber-1] ” where Names k is the element from position k in Names array.

    public String ToString()
    {
        String arrayprint = "Names [";
        
        int i;
        for(i=0;i<Number-1;i++)
        {
            arrayprint = arrayprint +Names[i] + ", ";
        }
        
        arrayprint = arrayprint+ Names[Number-1 ] + "]";
        
        return arrayprint;
       
    }
 
}
