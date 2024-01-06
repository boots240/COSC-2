/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimohammedassignment9;

/**
 *
 * @author alimo
 */
public class AliMohammedDog extends AliMohammedPet
{
    //A string field that holds the animal specific pattern
    private String pattern;

    
    //A constructor with 5 parameters
    public AliMohammedDog(String newname,String newcolor,int newage,float newweight,String newpattern) 
    {
        super( newname, "Dog", newcolor, newage,newweight); 
        pattern = newpattern;
  
    }
    
    //Override the superclass method to output “Woof”
    @Override
    public void sound()
    {
        System.out.println("WooF"); 
    }
    
    //A void method that outputs “Barking…”
    public void bark()
    {
        System.out.println("Barking...");
    }
    
    //A void method that outputs “Fetching…”
    public void fetch()
    {
        System.out.println("Fetching");
    }
    
    //A void method that outputs “Running”
    public void run()
    {
       System.out.println("Running");
    }
    
    //Overrides the superclass toString method to add the “, PATTERN=pattern” to the superclass string
    @Override
     public String toString()
    {
         return super.toString()+", PATTERN = " + pattern; 
    }
 
}
