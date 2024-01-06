/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimohammedassignment4;

import java.util.Random;

/**
 *
 * @author alimo
 */
public class AliMohammedDice
{
    //declaring the value feild that holds the value of the face value of the dice
  private int Value;
  
  //Constructor that generates a random number from 1-6
  public AliMohammedDice()
  {
      //creates a random object  
      Random N = new Random();
      
      //stores a random number from 1-6 into the feild value
      Value = N.nextInt(6)+1;
  }
  
  //Constructor with a parameter that checks if the number N is between 1-6
  //and then if its not prints an error message 
  public AliMohammedDice(int N)
  {
      if (N >= 1 && N <= 6)
          Value = N;
      else
      {
          System.out.println("Error occured, value is now set to one");
          Value = 1;
      }
          
  }
  
  //Method checking whether the number N is between 1 and 6
  //and then if its not prints an error message 
  public void setValue(int N)
  {
      if (N >= 1 && N <= 6)
          Value = N;
      else
      {
          System.out.println("Error occured, value is now set to one");
          Value = 1;
      }
  }
  
  //method that returns the value of the dice
  public int GetValue()
  {
      return Value;
  }
  //metho that outputs the vlace of the dice in numerical form
  public void OutputDiceValue()
  {   
          System.out.println(Value);
  }  
    
  
  //method that outputs the value of the dice text
  public void OutputDiceName()
  {
      if (Value == 1)
          System.out.println("ONE");
      else 
          if (Value == 2)
          System.out.println("TWO");
      else 
          if (Value == 3)
          System.out.println("THREE");
      else 
          if (Value == 4)
          System.out.println("FOUR");
      else 
          if (Value == 5)
          System.out.println("FIVE");
      else 
          if (Value == 6)
          System.out.println("SIX");
  }
  
  //method that outputs an image of the value
  public void OutputDiceDrawing()
  {
      
      if (Value == 1)
      {
          System.out.println("+-------+");
          System.out.println("|       |");
          System.out.println("|   O   |");
          System.out.println("|       |");
          System.out.println("+-------+");
          System.out.println("--------------");
      }
      else 
          if (Value == 2)
          {
          System.out.println("+------+");
          System.out.println("| O    |");
          System.out.println("|      |");
          System.out.println("|    O |");
          System.out.println("+------+");
          System.out.println("--------------");
          }
      else 
          if (Value == 3)
          {  
          System.out.println("+-------+");
          System.out.println("|  O    |");
          System.out.println("|   O   |");
          System.out.println("|    O  |");
          System.out.println("+-------+");
          System.out.println("--------------");
          }
      else 
          if (Value == 4)
          {
          System.out.println("+------+");
          System.out.println("| O  O |");
          System.out.println("|      |");
          System.out.println("| O  O |");
          System.out.println("+------+");
          System.out.println("--------------");
          }
      else 
          if (Value == 5)
          {
          System.out.println("+-------+");
          System.out.println("| O   O |");
          System.out.println("|   O   |");
          System.out.println("| O   O |");
          System.out.println("+-------+");
          System.out.println("--------------");
          }
      else 
          if (Value == 6)
          {
          System.out.println("+-----+");
          System.out.println("|O O O|");
          System.out.println("|O O O|");
          System.out.println("|O O O|");
          System.out.println("+-----+");
          System.out.println("--------------");
          }
      
  }

}
