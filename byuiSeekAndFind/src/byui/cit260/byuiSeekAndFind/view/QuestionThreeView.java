/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiSeekAndFind.view;

import byui.cit260.byuiSeekAndFind.control.QuestionControl;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author calie
 */
class QuestionThreeView {
    
//    A = ((a+b)/2)*h
    
//    private static int randomHeight;
//    private static int randomLength;
//    private static int randomWidth;
//    
    void displayQuestionThreeView() {
        System.out.println("question three called");
//             boolean endView = false;
//        do {
//            String[] inputs = this.getInputs();
//            if (inputs[0].toUpperCase().equals("Q") || 
//                    inputs.length < 1 || 
//                    inputs == null) {   
//                return;
//            }
//            
//         endView = doAction(inputs);
//        } while (!endView);
//
    }
//
//    private String[] getInputs() {
//                        String[] inputs = new String[1];
//            Random randomNumber = new Random();
//            randomHeight = randomNumber.nextInt(8) +2;
//            randomLength = randomNumber.nextInt(3) +2;
//            randomWidth = randomNumber.nextInt(100);
//        System.out.println("A room has a hight of " + randomHeight
//                + " and length of " + randomLength + " and a width of " 
//                + randomWidth + " what is the valume of the room?" 
//                + "\n*Type H to know how many hints you have left, or ? to get a hint.*");
//
//        boolean valid = false;
//        while(!valid) {
//       
//            Scanner userInputs = new Scanner(System.in);
//            String userAnswer;
//            //^ Int ?
//            System.out.println("Enter your answer:");
//            userAnswer = userInputs.nextLine().trim();
//
//            if(userAnswer.length() < 1) {
//                System.out.println("Enter a value");
//                continue;
//            }
//            inputs[0] = userAnswer;
//            valid = true;
//        }
//        
//        return inputs;
//    }
//
//    
//    private String getHintInput() {
//                        String input = new String();
//        System.out.println( "? = Give me a hint"
//                + "\nH = Number of hints remaining"
//                + "\nQ = Quit"
//                + "\nOR"
//                + "\nHit any other key to see your results");
//
//        boolean valid = false;
//        while(!valid) {
//       
//            Scanner userInputs = new Scanner(System.in);
//            String userAnswer;
//            //^ Int ?
//            System.out.println("Enter letter");
//            userAnswer = userInputs.nextLine().trim();
//
//            if(userAnswer.length() < 1) {
//                System.out.println("Enter a value");
//                continue;
//            }
//            input = userAnswer;
//            valid = true;
//        }
//        
//        return input;
//    }
//    
//    private boolean doAction(String[] inputs) {
//        String questionItem = inputs[0];
//        questionItem = questionItem.toUpperCase(); 
//        String userLetter = this.getHintInput();
//         switch (userLetter) {
//             case "H" : numberHints();
//                break;
//             case "?" : showHint();
//                break;
//             case "Q" : return true;
//             
//    }
//         
//         String value = inputs[0];
//         int answer = Integer.parseInt(value);
//         int result = QuestionControl.calcQuestionAnswerVolume(randomHeight, randomLength, randomWidth, answer);
//         switch (result) {
//            case -1: System.out.println("An error occurred with the length, Width, or Height.");
//                break;
//            case 0: System.out.println("------------------------------------------------------" 
//                    + "\nYour Answer is incorrect, you lost a life! " 
//                    + "\nThe correct answer was: " 
//// get actual answer
//                    + "answer" 
//                    + "\nYou have " + "#" + " lives remaining."
//                    + "\n------------------------------------------------------");
//// get the number of lives^
//                break;
//            default: System.out.println("*******************************************************" 
//                    + "\nCONGRATULATIONS!!! You avoided the trap!"
//                    + "\n*******************************************************");
//             
//        }
//                 
//            return true;
//        }
//
//    private void numberHints() {
//        System.out.println("number of Hints");
//    }
//
//    private void showHint() {
//        System.out.println("Hint");
//    }
//    
}
