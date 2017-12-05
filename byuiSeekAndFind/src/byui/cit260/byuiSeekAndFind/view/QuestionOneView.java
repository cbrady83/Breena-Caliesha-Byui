/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiSeekAndFind.view;

import byui.cit260.byuiSeekAndFind.control.QuestionControl;
import byui.cit260.byuiSeekAndFind.exception.QuestionControlException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author calie
 */
class QuestionOneView {

    private static int randomStudent;
    private static int randomTextbook;
    private static int randomAmount;

    void displayQuestionOneView() {
        boolean endView = false;
        do {
            String[] inputs = this.getInputs();
            if (inputs[0].toUpperCase().equals("Q")
                    || inputs.length < 1
                    || inputs == null) {
                return;
            }

            endView = doAction(inputs);
        } while (!endView);

    }

    private String[] getInputs() {
        String[] inputs = new String[1];
        Random randomNumber = new Random();
        randomStudent = randomNumber.nextInt(8) + 2;
        randomTextbook = randomNumber.nextInt(3) + 2;
        randomAmount = randomNumber.nextInt(100);
        System.out.println(randomStudent + " students are going to buy textbooks. "
                + "They each need " + randomTextbook + " textbooks. If each textbook costs $"
                + randomAmount + ", how much will be spent on textbooks total?");

        boolean valid = false;
        while (!valid) {

            Scanner userInputs = new Scanner(System.in);
            String userAnswer;
            //^ Int ?
            System.out.println("Enter your answer:");
            userAnswer = userInputs.nextLine().trim();

            if (userAnswer.length() < 1) {
                System.out.println("Enter a value");
                continue;
            }
            inputs[0] = userAnswer;
            valid = true;
        }

        return inputs;
    }

    private String getHintInput() {
        String input = new String();
        System.out.println("? = Give me a hint"
                + "\nH = Number of hints remaining"
                + "\nQ = Quit"
                + "\nOR"
                + "\nHit any other key to see your results");

        boolean valid = false;
        while (!valid) {

            Scanner userInputs = new Scanner(System.in);
            String userAnswer;
            System.out.println("Enter a letter");
            userAnswer = userInputs.nextLine().trim();

            if (userAnswer.length() < 1) {
                System.out.println("Enter a value");
                continue;
            }
            input = userAnswer;
            valid = true;
        }

        return input;
    }

    private boolean doAction(String[] inputs) {
        String questionItem = inputs[0];
        questionItem = questionItem.toUpperCase();
        String userLetter = this.getHintInput();
        switch (userLetter) {
            case "H":
                numberHints();
                break;
            case "?":
                showHint();
                break;
            case "Q":
                return true;

        }

        String value = inputs[0];
        int answer = 0;
        try {
            answer = Integer.parseInt(value);
        } catch (NumberFormatException nf) {
            System.out.println("You must enter a integer");
        }

        try {
            QuestionControl.calcQuestionAnswerCost(randomStudent, randomTextbook, randomAmount, answer);
            System.out.println("*******************************************************"
                    + "\nCONGRATULATIONS!!! You avoided the trap!"
                    + "\n*******************************************************");
        } catch (QuestionControlException ex) {
            System.out.println(ex.getMessage());
        }
        return true;
    }

    private void numberHints() {
        System.out.println("number of Hints");
    }

    private void showHint() {
        System.out.println("Hint");
    }

}
