/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alimohammedassignment9;

/**
 *
 * @author alimo
 */
public class AliMohammedAssignment9 
{

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
      //creating instances for classes
      AliMohammedCat cat1 = new AliMohammedCat("bobby","Red", 2 ,45,"stripes");
      AliMohammedCat cat2 = new AliMohammedCat("toby","green", 3 ,22,"stripes");  
      AliMohammedDog dog = new AliMohammedDog("billy","White",4,33,"spots");
      
     
     //demonstrating all class and inherited methods
     
     //cat1
     System.out.println("Cat 1");
     System.out.println("---------");
     cat1.eat();
     cat1.sleep();
     cat1.sound();
     cat1.purr();
     cat1.jumping();
     cat1.meow();
     cat1.run();
     System.out.println(cat1.toString());
     cat1.story();
     
     System.out.println();
     
     //cat2
     System.out.println("Cat 2");
     System.out.println("---------");
     cat2.eat();
     cat2.sleep();
     cat2.sound();
     cat2.purr();
     cat2.jumping();
     cat2.meow();
     cat2.run();
     System.out.println(cat2.toString());
     cat2.story();
     
     System.out.println();
     
     //dog
     System.out.println("dog");
     System.out.println("---------");
     dog.eat();
     dog.sleep();
     dog.sound();
     dog.bark();
     dog.fetch();
     dog.run();
     System.out.println(dog.toString());
     dog.story();
     
     
     
     
     
      
      
      
    }
    
}
