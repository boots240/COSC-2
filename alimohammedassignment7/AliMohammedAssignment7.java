package alimohammedassignment7;

import java.io.FileNotFoundException;

/**
 *
 * @author alimo
 */
public class AliMohammedAssignment7
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        //an object for AliMohammedArrayNames for the class AliMohammedArray
        AliMohammedArray AliMohammedArrayNames = new AliMohammedArray();
        
        //Add Method 
        AliMohammedArrayNames.Add();
        //Makes space in the output
        System.out.println( " " );
        
        //ToString Method 
        String ArrayToString = AliMohammedArrayNames.ToString();
        System.out.println("AFTER ADD: " + ArrayToString);
        
        //Makes space in the output
        System.out.println( " " );
        
        //get method to get element from postion 15
        System.out.println("Elemnt form postion 15: " + AliMohammedArrayNames.Get(15));
        
        //setting postion 0 into my name 
        AliMohammedArrayNames.Set(0,"Ali Mohammed");
        
        //Makes space in the output
        System.out.println( " " );
        
        //toString for After Set 
        System.out.println("AFTER SET: " + AliMohammedArrayNames.ToString());
        
        //Makes space in the output
        System.out.println( " " );
        
        //Search method with parameter “Courier New” that find and prints its position in the array
        System.out.println(" Font Courier New Found in Position: " + AliMohammedArrayNames.Search("Courier New")); 
        
        //Sort method to sort the array AAliMohammedeArrayNames 
        AliMohammedArrayNames.Sort();

        //Makes space in the output
        System.out.println( " " );
        
        //toString gets the string version of AliMohammedArray
        System.out.println("AFTER SORT: " + AliMohammedArrayNames.ToString());
        
    }
    
}
