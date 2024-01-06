/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimohammedassignment4;

/**
 *
 * @author alimo
 */
public class AliMohammedAssignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //declaring the numberpoints variable 
        int NumberPoints;
        
        //creating instances for Dice 1,Dice 2, and Dice 3
       AliMohammedDice Dice1 = new AliMohammedDice();

       AliMohammedDice Dice2 = new AliMohammedDice(1);
       
       AliMohammedDice Dice3 = new AliMohammedDice(3);
       
     //setting the value of dice 2 to 6
      Dice2.setValue(6);
      
      
      //outputing the amount the user rolled for Dice 1,Dice 2, and Dice 3 
     System.out.print("You rolled a: ");
     Dice1.OutputDiceValue();
     Dice1.OutputDiceName();
     Dice1.OutputDiceDrawing();
     
     System.out.print("You rolled a: ");
     Dice2.OutputDiceValue();
     Dice2.OutputDiceName();
     Dice2.OutputDiceDrawing();
     
     System.out.print("You rolled a: ");
     Dice3.OutputDiceValue();
     Dice3.OutputDiceName();
     Dice3.OutputDiceDrawing();
     
     //Adding up the total number of points the user rolled and storing it into the variable NumberPoints
     NumberPoints = Dice1.GetValue() + Dice2.GetValue() + Dice3.GetValue();
     
     //outputting the total number of points the user rolled
     System.out.println("!!!!You rolled a total of: " + NumberPoints + " POINTS!!!!!");
     
    }
     
}
