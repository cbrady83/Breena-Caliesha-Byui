/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiSeekAndFind.view;

import byuiseekandfind.ByuiSeekAndFind;
import java.awt.Point;

/**
 *
 * @author breen
 */
class ViewLocationPlayers extends View{

    Point youLocation = ByuiSeekAndFind.getPlayer().getActor().You.getCoordinates();
    

    public String[] getInputs() {

        String[] inputs = new String[1];
        this.console.println("=================================================================================================================================="
                + "\nYour current Location is: "
                + youLocation
                + "\nQ - Quit"
                + "\n==================================================================================================================================");

        inputs[0] = this.getInput("\nReturn to Game Menu");

        return inputs;
    }

    public boolean doAction(String[] inputs) {
        String viewLocationPlayers = inputs[0];
        viewLocationPlayers = viewLocationPlayers.toUpperCase();

        switch (viewLocationPlayers) {
            case "Q":
                return true;
            default:
                ErrorView.display("ViewLocationPlayers", "Invalid menu item.");
        }

        return false;
    }
    
}
