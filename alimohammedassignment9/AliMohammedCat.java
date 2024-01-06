/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimohammedassignment9;

/**
 *
 * @author alimo
 */
public class AliMohammedCat extends AliMohammedPet
{
    private String marking; //A string field that holds the animal specific markings

    
    // A constructor with 5 parameters that sets the marking to the marking
    // value and uses the superclass constructor to set the 5 superclass fields to the other 5 parameter values.
   public AliMohammedCat(String newname,String newcolor
          ,int newage,float newweight,String newmarking) 
    {
        super( newname, "cat", newcolor, newage,newweight);
        
        marking = newmarking;
    }

   
    //Overrides the superclass method so it outputs “Meow"
    @Override
    public void sound()
    {
       System.out.println("Meow");  
    }
    
    //A void method that outputs “Purring…”
    public void purr()
    {
       System.out.println("Purring...");
    }
    
    //A void method that outputs “Jumping…”
    public void jumping()
    {
       System.out.println("Jumping...");
    }
    
    //A void method that outputs “Meowing…”
    public void meow()
    {
       System.out.println("Meowing...");
    }
    
    //A void method that outputs “Running…”
    public void run()
    {
       System.out.println("Running...");
    }
    
    //Overrides the superclass toString method to add the “, MARKING=marking” to the superclass string
    @Override
    public String toString()
    { 
        return super.toString() + ", MARKING = " + marking;
                
    }
    

}
