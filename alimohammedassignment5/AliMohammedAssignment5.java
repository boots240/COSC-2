/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimohammedassignment5;

import java.util.Random;

/**
 * 
 * @author alimo
 */
public class AliMohammedAssignment5
{
     
    public static float AliMohammedGame()
    {
        float totalscore =0;
        AliMohammedCoin AliMohammedCoinObject = new AliMohammedCoin();

        int i;
        for(i=0;i<=10;i++)
        {
            AliMohammedCoinObject.Toss();
            AliMohammedCoinObject.Output();
            AliMohammedCoinObject.Headsup();
            
            
            if(AliMohammedCoinObject.Headsup() == true)
            {
               totalscore = totalscore + AliMohammedCoinObject.Value(); 
            }
            
            
        }
        System.out.printf("Your score is: %.2f", totalscore);
        System.out.print("\n");
        return totalscore;
    }
      
      

    
    public static void main(String[] args) 
    {
       int i;
        for(i=0;i<=20;i++)
        {
            AliMohammedGame();

        }
 
   }
    
}
