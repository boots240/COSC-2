/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimohammedassignment3;



/**
 *
 * @author alimo
 */



public class AliMohammedPet
{
     
    //feild for name 
    
     private String name;
    
     //feilds for type 
    private String type;
    
     //feilds for age 
    private int age;
    
     //feilds for weight 
    private double weight;
    
     //feilds for color 
    private String color;
   
    /**
     * this method asks the user for the name of their pet 
     * @param newname the name of the animal
     */

    public void setName(String newname)
 {
     name = newname;
 }
    
    /**
     * the getter method returns the name of the users pet
     * @return 
     */
        
 public String getName()
 {  
     //returns the age
     return name;   
 }
 
     /**
     * this method asks the user what type of animal they have 
     * @param newtype the type of animal the user has
     */

     public void setType(String newtype)
 {
      type = newtype;
 }
    
    /**
     * the getter method returns the type of animal the user has
     * @return type 
     */
    
    
 public String getType()
 {  
     //returns the type of animal
     return type;   
 }
 
     /**
     * this method asks the user for the age of their pet 
     * @param newage the age of the animal
     */

      public void setAge(int newage)
 {
            age = newage;
 }
    
    /**
     * this getter method returns the age of the users pet
     * @return 
     */

 public int getAge()
 {  
     return age;   
 }
 
 
      /**
     * this method asks the user how heavy their pet is
     * @param newweight the weight of the animal 
     */

      public void setWeight(double newweight)
      {   
            weight = newweight;
      }
    
    /**
     * this getter method returns the weight of the pet
     * @return 
     */

 public double getWeight()
 {  
     return weight;   
 }
 
     /**
     * this method asks the user what color their pet is  
     * @param newcolor the color of the pet 
     */

     public void setColor(String newcolor)
 {       
            color = newcolor;
 }
    
    /**
     * the getter method returns the color of the animal
     * @return 
     */

 public String getColor()
 {  
     return color;   
 }
 
 
 
 
 
 
 
 
 
 
}
