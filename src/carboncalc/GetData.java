/*
 * Licensed under:
 * La compania de ganando aka Sheldon Cooper for POTUS
 *
 */

package carboncalc;

/*
 *
 * @author Anand Pant 
 * plus.google.com/+AnandPant 
 * theapant@gmail.com
 * 
 */

import java.util.Scanner;

public class GetData {
    static Scanner value = new Scanner(System.in);
    static Scanner pregunta = new Scanner(System.in);
    
    public void askQuestion() {
        String input;
        while(true) {
            
        System.out.println("Type the number of Carbons in the Molecule: ");
        int x = value.nextInt();
        int y = 2 * x + 2;
        
           
         if (x > 10) 
            System.out.println("You failed, the number entered is greater than 10");
         if (x < 1) 
           System.out.println("You failed, the number entered is less than 1"); 
        
            
        
        
          else {
           if (x == 1)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called methane.");
           if (x == 2)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called ethane.");
           if (x == 3)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called propane.");
           if (x == 4)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called butane.");
           if (x == 5)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called pentane.");
           if (x == 6)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called hexane.");
           if (x == 7)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called heptane.");
           if (x == 8)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called octane.");
           if (x == 9)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called nonane.");
           if (x == 10)
                System.out.println("This Carbon Chain has " + x + " Carbon and "+ y +
                        " Hydrogen atoms, it is called decane.");
           
          System.out.println("Do you want to calculate another one?" + " (Y or N)");
          input = pregunta.next();  
          if (input.equalsIgnoreCase("N")) break;
          
         }
      }
   }
}
