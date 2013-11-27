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
 import javax.swing.JOptionPane;

public class Welcome {
    public void sayWelcome() {
        JOptionPane.showMessageDialog(null, "Hello and thank you for "
                + "using this application. It will allow you to name "
                + "the first ten standard Carbon Molecules, by simply "
                + "specifying the number of carbons. Enjoy!", "Welcome", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
