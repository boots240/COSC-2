/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alimohammedassignment5;

import java.util.Random;

/**
 *
 * @author alimo
 */
public class AliMohammedCoin 
{
    private String name;
    private String side;
    private int num;
    
    public AliMohammedCoin()
    {
        
        side  = "heads";
        //creates a random object  
      Random N = new Random();
      
      
       num = N.nextInt(4);
       
       
       if (num == 0)
       {
           name = "penny";
       }
       if (num == 1)
       {
           name = "nickel";
       }
       if (num == 2)
       {
           name = "dime";
       }
       if (num == 3)
       {
           name = "quarter";
       }
       if (num == 4)
       {
           name = "dollar";
       }
    }
       
    
    public void Toss()
    {
        int toss;
         Random N = new Random();
         
          toss = N.nextInt(2);
          
          if(toss == 0)
          {
              side = "heads";
          }
          else if(toss == 1)
          {
              side = "tails";
          }
    }
    
    public float Value()
    {
        float value = 0;
        
        if (name == "penny")
       {
           value  = (float) .01;
       }
       if (name == "nickel")
       {
           value = (float) .05;
       }
       if (name == "dime")
       {
           value  = (float) .10;
       }
       if (name == "quarter")
       {
           value  = (float) .25;
       }
       if (name == "dollar")
       {
           value  = (float) 1.0;
       }
        
       return value;
    }
    
    public boolean Headsup()
    {
        if(side == "heads")
            return true;
        else if (side == "tails")
            return false; 
        return false;
    }
    
    
    public void Output()
    {
           System.out.println(name + "-" + side);
    }

}
