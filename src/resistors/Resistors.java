/*
    Matthew Ludwig
    2 March 2019
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
        + "Seperate each with hyphens");
        String [] colourCode = inputColour.split("-"); 
        String [] resistorValue = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"}; 
        inputColour.toLowerCase();
        
    }
    
}

// Get the value of the first two resistance colours
//Set the value of the third to be the first two digits X10^colourindex
//Print the value of the resistance
