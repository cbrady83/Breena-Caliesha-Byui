/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiSeekAndFind.control;

/**
 *
 * @author breen
 */
public class QuestionControl {
    public static double calcQuestionAnswer(double height, double base1, 
            double base2, double answer) {
        if (height < 0 ) {
            return -1;
        }
        if (base1 < 0) {
            return -1;
        }
        if (base2 < 0) {
            return -1;
        }
        double area = (base1 + base2) / 2 * height;
        if (answer == area){
            return 1;
        }
        return 0;
        
    }
    
    public static double calcQuestionAnswerVolume(double height, double length, 
            double width, double answer) {
        if (height < 0 ) {
            return -1;
        }
        if (length < 0) {
            return -1;
        }
        if (width < 0) {
            return -1;
        }
        double volume = width*height*length;
        if (answer == volume){
            return 1;
        }
        return 0;
    }

    public static double calcQuestionAnswerCost( double numberStudent, double numberTextbook, double cost, double answer) {
        
                if (numberStudent < 0) {
                    return -1;
                    }
                if (numberTextbook < 0) {
                    return -1;
                    }
                if (cost < 0) {
                    return -1;
                    }
            double totalCost = numberStudent * numberTextbook * cost;
		if (answer == totalCost) {
                    return 1;
                    }
                    return 0;
            }
    
}