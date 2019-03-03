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
        String inputColour;
        inputColour = JOptionPane.showInputDialog("What is your resistor colour code?" + "\n"
        + "Seperate each colour with hyphens"); 
        String [] resistorCode = {"Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", 
        "Violet", "Grey", "White"};
         String [] inputText = inputColour.split("-");
         int resistorValue = inputText.length;  // Will delete this
         System.out.println(resistorValue);  // Prints out the number of colours
    }
    
    /**
     *
     * @param inputColour
     * @param resistorCode
     * @return
     */
    public int value (String[] resistorCode) {  //returns the digits of the resistor
            int resistorValue = 0;
            for (int i = 0; i < resistorCode.length; i++) {
                if (resistorCode[i].equalsIgnoreCase("Black")) {
                    resistorValue += 0;                                // might require resistorValue(i), for the 3 colours                                               
                }
                else if (resistorCode[i].equalsIgnoreCase("Brown")) {
                    resistorValue += 1;
                }
                else if (resistorCode[i].equalsIgnoreCase("Red")) {
                    resistorValue += 2;
                }
                else if (resistorCode[i].equalsIgnoreCase("Orange")) {
                    resistorValue += 3;
                }
                else if (resistorCode[i].equalsIgnoreCase("Yellow")) {
                    resistorValue += 4;
                }
                else if (resistorCode[i].equalsIgnoreCase("Green")) {
                    resistorValue += 5;
                }
                else if (resistorCode[i].equalsIgnoreCase("Blue")) {
                    resistorValue += 6;
                }
                else if (resistorCode[i].equalsIgnoreCase("Violet") || resistorCode[i].equalsIgnoreCase
                ("Purple")) {
                    resistorValue += 7;
                }
                else if (resistorCode[i].equalsIgnoreCase("Grey")) {
                    resistorValue += 8;
                }
                else if (resistorCode[i].equalsIgnoreCase("White")) {
                    resistorValue += 9;
                }    
        }
    return resistorValue;  
    }
    /*
    public static int totalResistance() {
        
    } */
}

// Get the value of the first two resistance colours
//Set the value of the third to be the first two digits X10^colourindex
//Print the value of the resistance
