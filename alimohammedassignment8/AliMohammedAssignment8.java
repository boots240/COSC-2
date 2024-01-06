/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimohammedassignment8;

import java.util.Scanner;

/**
 *
 * @author alimo
 */
public class AliMohammedAssignment8
{
   
 public static void main(String[] args)
 {
     //A string variable that the users password will be fed into 
     String password;
     
     //variable used for checking
     int passed = 0;
     
     //prompts the user to enter a password
     System.out.println("Please enter a password that is at least 10 characters long," +
                "containing least one uppercase letter, at least one lowercase letter,"+ 
                " at least one of the following symbols: #, $, &, *, ^, +, -, or @" +
                " containing at least one digit, and should start with a letter");
     
     
     
     //do while loop used for executing the checks on the inputed password
     do
     {
         
       //allows user to type in password
      Scanner keyboard = new Scanner(System.in);
      password = keyboard.nextLine(); 
      
      //variables used for counting weather or not the requirment was met
     int lengthcount = 10;
     int lettercount = 0;
     int Uppercount = 0;
     int Lowercount = 0;
     int digitcount = 0;
     int specialcount = 0;
     
     //for loop used to check every character in the string 
    for(int i=0;i<password.length();i++)
    {
        char passkey = password.charAt(i); //assigning the the varable ito a char string called passkey 

        if(Character.isUpperCase(passkey)) //checking for upper case
             Uppercount++;
         if(Character.isLowerCase(passkey))//checking for lower case 
            Lowercount++;
         if(Character.isDigit(passkey))//checking for digit 
            digitcount++;
         if (passkey == '#' || passkey == '$' || passkey == '&' || passkey == '*' || passkey == '^' 
                || passkey == '+' ||passkey == '-' ||passkey == '@' ) //checks for special character 
            specialcount++;
 
    }
    
     char lettercheck = password.charAt(0); //assigning the first character in the string to a variable 
     
     //if statement used to check if all requirments are met and if so it prints out a Statement to the user
     //if there is a problem with the password then in the else section it has print statements to let the user know 
     if (Uppercount > 0 && Lowercount > 0 && digitcount > 0 && password.length()>=10 && Character.isLetter(lettercheck)
            && specialcount > 1)
    {
        System.out.println("!!Password Created!!");
        passed = 1; 
    }
     else 
     {       
    if (Uppercount < 1 )
        System.out.println("You need at least one uppercase letter");
    if (Lowercount < 1 )
        System.out.println("You need at least one lowercase letter");
    if (digitcount < 1 )
        System.out.println("You need at least one digit");
    if (password.length() < 10 )
        System.out.println("password needs to be at least 10 characters ");
    if (!Character.isLetter(lettercheck) )
        System.out.println("first character needs to be a letter ");
    if (specialcount < 1)
        System.out.println("You need to use one of the following symbols: #, $, &, *, ^, +, -, or @ ");
     }

    
    
     
     
     }while(passed == 0); //will keep going unitl passed equals 1
      
 }


}
