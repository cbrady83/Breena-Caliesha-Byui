/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiSeekAndFind.view;

import byuiseekandfind.ByuiSeekAndFind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author calie
 */
public abstract class View implements ViewInterface {
    
    private String message;
    
    protected final BufferedReader keyboard = ByuiSeekAndFind.getInFile();
    protected final PrintWriter console = ByuiSeekAndFind.getOutFile();

    public View() {
    }

    @Override
    public void display() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs == null
                    || inputs[0].toUpperCase().equals("Q")
                    || inputs.length < 1
                    ) {
                return;
            }

            endView = doAction(inputs);
        } while (!endView);

    }

    @Override
    public String getInput(String promptMessage) {
        boolean valid = false;
        while (!valid) {

            String value = null;
            this.console.println(promptMessage);
            try {
                value = this.keyboard.readLine().trim();
            } catch (IOException ex) {
                ErrorView.display("View", "Error Getting input");
            }

            if (value.length() < 1) {
                ErrorView.display("View", "You must enter a value.");
                continue;
            }
            return value;

        }
        return null;
    }

}
