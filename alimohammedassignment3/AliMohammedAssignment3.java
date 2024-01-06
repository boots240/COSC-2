/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimohammedassignment3;

/**
 *
 * @author alimo
 */

import java.util.Scanner;



public class AliMohammedAssignment3 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //creating instance
        AliMohammedPet pet = new AliMohammedPet();
        
        //calling the getters to get the values from the attributes
        String name = pet.getName();
        String type = pet.getType();
        int age = pet.getAge();
        double weight = pet.getWeight();
        String color = pet.getColor();
        

            // declare the keyboard scanner
            Scanner keyboard = new Scanner(System.in);  
            
            //asks the user the name of their pet
            System.out.println("What is your pets name?");
            //reads value
            name = keyboard.nextLine();
            
            //asks the user the type of animal they have           
            System.out.println("What type of animal is your pet?");
            //reads value
            type = keyboard.nextLine();
            
            //asks the user the age of their pet          
            System.out.println("How old is your pet?");
            //reads value
            age = keyboard.nextInt();
            
            //consumes next line
            keyboard.nextLine();
            
             //asks the user the weight of their pet          
            System.out.println("How heavy is your pet?");
            //reads value
            weight = keyboard.nextDouble();
            
            //consumes next line
            keyboard.nextLine();
            
            //asks the user the type of animal they have           
            System.out.println("What color is your pet?");
            //reads value
            color = keyboard.nextLine();

        //stores the values given from the user   
        pet.setName(name);
        pet.setType(type);
        pet.setAge(age);
        pet.setWeight(weight);
        pet.setColor(color);
        
        //spits out the collected values to the user 
        System.out.println("The name of your pet is: " + pet.getName() + "\n" + "Your pet is a: " 
                + pet.getType() + "\n" + "your pet is: " + pet.getAge() + " yrs old " + "\n" + 
                "Your pet is: " + pet.getWeight() + " lbs " + "\n" + "your pet is the color: " 
                + pet.getColor());

    }
    
}
