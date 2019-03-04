/*
    Matthew Ludwig
    4 March 2019
    This program converts a specified resistor colour code, into the corresponding
    resistance value.
 */

package resistors;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
         int resistorValue = 0;
         value(resistorValue);
    }
    
    /**
     *
     * @param resistorValue
     * @param resistorCode
     * @return
     */
    public static int value (int resistorValue) {  //returns the digits of the resistor
        String inputColour = JOptionPane.showInputDialog("What is your resistor colour code?" + "\n"
        + "Seperate each colour with hyphens"); 
        String [] inputText = inputColour.split("-"); // seperates each colour
        
            for (int i = 0; i < 3; i++) {    // asigns a value for each colour
                if (inputText[i].equalsIgnoreCase("Black")) {
                    resistorValue = 0;                                                       
                }
                else if (inputText[i].equalsIgnoreCase("Brown")) {
                    resistorValue = 1;
                }
                else if (inputText[i].equalsIgnoreCase("Red")) {
                    resistorValue = 2;
                }
                else if (inputText[i].equalsIgnoreCase("Orange")) {
                    resistorValue = 3;
                }
                else if (inputText[i].equalsIgnoreCase("Yellow")) {
                    resistorValue = 4;
                }
                else if (inputText[i].equalsIgnoreCase("Green")) {
                    resistorValue = 5;
                }
                else if (inputText[i].equalsIgnoreCase("Blue")) {
                    resistorValue = 6;
                }
                else if (inputText[i].equalsIgnoreCase("Violet") || inputText[i].equalsIgnoreCase
                ("Purple")) {
                    resistorValue = 7;
                }
                else if (inputText[i].equalsIgnoreCase("Grey")) {
                    resistorValue = 8;
                }
                else if (inputText[i].equalsIgnoreCase("White")) {
                    resistorValue = 9;
                }    
        }
     return resistorValue;
    }
    /*
    public static int totalResistance(int resistorValue) {
        
    } 
*/
}

// Get the value of the first two resistance colours
//Set the value of the third to be the first two digits X10^colourindex
//Print the value of the resistance
