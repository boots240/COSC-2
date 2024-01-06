/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimohammedassignment9;

/**
 *
 * @author alimo
 */
public abstract class AliMohammedPet 
{
   private String name; //A private string field that holds the name of the pet 
    
    private String type; //A string field that holds the type of animal that the pet is
    
    private int age;//An integral field that holds the age of the pet in years
    
    private float weight;//A floating-point field the holds the weight of the pet
    
    private String color;//A string field that store the color of the Pet
    
    
    //A no-arg constructor that initializes the string fields with empty string and numerical fields with 0
    public AliMohammedPet() 
    {
        name = " ";
        type = " ";
        color = " ";
        age  = 0;
        weight = 0;     
    }
    
    //A constructor with 5 parameters that initializes the 5 fields with the values from the 5 parameters
    public AliMohammedPet(String newname,String newtype,String newcolor,int newage,float newweight) 
    {
        name = newname;
        type = newtype;
        color = newcolor;
        age  = newage;
        weight = newweight;   
    }
   //A void method with 5 parameters that initializes the 5 fields with the values from the 5 parameters.
    public void set(String newname,String newtype,String newcolor,int newage,float newweight)
    {
        name = newname;
        type = newtype;
        color = newcolor;
        age  = newage;
        weight = newweight;  
    }
    
    //A void method that outputs “Eating…”
    public void eat()
    {
        System.out.println("Eating...");
    }
    
    //A void method that outputs “Sleeping…”
    public void sleep()
    {
      System.out.println("Sleeping...");
    }
    
    //a void method that outputs a message o the console
    public void story()
    {
        System.out.println( "There once was a " + color + " " + type + " called " + name + " who lived in Dallas, Texas\n" +
         "in May 2023, when " + name + " was " + age + " years old. " + name + " was a happy " + weight + "-pound " + type);
    }
    
    //An abstract void method that output the sound the pet makes
    public abstract void sound();
    
    //A method that returns a string in the format listed below
    public String toString()
    {
         String info = "TYPE = " + type + ", NAME = " + name + ", AGE = " + age + ", WEIGHT = " + weight + ", COLOR = " + color;
         
         return info;   
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
