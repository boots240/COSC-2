/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimohammedassignment2;

import java.util.Scanner;

/**
 *
 * @author alimo
 */
public class AliMohammedAssignment2
{

        public static void main(String[] args) 
        {
            // declare the keyboard scanner
            Scanner keyboard = new Scanner(System.in);
            
            //declaring name variable 
            String name;
            //declaring age variable
            int age;
            //declaring city variable
            String city;
            //declaring state variable
            String state;
            //declaring college variable
            String college;
            //declaring degree variable
            String degree;
            //declaring gpa variable
            float gpa;
            //declaring profession variable
            String profession;
            //declaring name variable
            
            //asking user for name 
            System.out.println("What is your name?");
            
            //reads the name inputted   
            name = keyboard.nextLine();
            
            //asking user for their age 
            System.out.println("How old are you?");
            
            //reads the age inputted 
            age = keyboard.nextInt();
            
            //asking user what city they live in
            System.out.println("What city do you live in?");
                
            //consumes next line
            keyboard.nextLine();
            
            //reads the city inputted 
            city = keyboard.nextLine();
            
            //asking user what state they live in
            System.out.println("What state do you live in?");
            
            //reads the state inputted 
            state = keyboard.nextLine();
            
            //asking user what college they went to
            System.out.println("What college do you go to?");
            
            //reads the college inputted
            college = keyboard.nextLine();
           
            //asking user what degree they are prusuing
            System.out.println("What degree are you pursuing?");
            
            //reads the degree inputted
            degree = keyboard.nextLine();
            
            //asking user what their GPA is 
            System.out.println("What is your gpa?");
            
            //reads the GPA inputted
            gpa = keyboard.nextFloat();
            
            //asking user what their profession is 
            System.out.println("What is your profession?");
            
            //consumes next line
            keyboard.nextLine();
            
            //reads the profession inputted
            profession = keyboard.nextLine();
            
            //prints an extra line
            System.out.println("\n");
            
            //prints out paragraph based on data given from user
            System.out.println("There once was a person named " + name + " who lived in " + city + ", " + state + ". " + "In February 2023, at the age of " + age + ",\n" + name +
                    "went to college at " + college + " to pursuit a degree in/of " + degree + ". " + name + " graduated with a " + gpa + " grade average and" + "\n" + "went to work as a " 
                    + profession + ". " + name + " had a happy and successful life.");
        }
    
}
