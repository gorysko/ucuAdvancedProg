/**
 * Created by gorysko on 10/24/17.
 */

import javax.swing.*;
import  java.util.Random;

public class GuessGame {


    private static void printBestScore(int score, int times) {
        JFrame frame = new JFrame("Result GueesGame");
        JOptionPane.showMessageDialog(frame, "\"Goodbye. Your overall " +
                "guessscore was:" + score/times);
    }

    private static int getInputNUmber() {
        JFrame frame = new JFrame("InputDialog GueesGame");
        String numberString = JOptionPane.showInputDialog(frame, "What's " +
                "your number?");
        return Integer.parseInt(numberString);
    }


    public  static  void main(String[] args) {
        int bestGuess = 0;
        int retries = 0;
        int difference = Integer.MAX_VALUE;
        Random random = new Random();
        int secretNumber = random.nextInt(Integer.MAX_VALUE);
        JFrame frame = new JFrame("Dialog GueesGame");

         while (retries < 3) {
             int guessNumber = getInputNUmber();
             if (guessNumber < secretNumber) {
                 JOptionPane.showMessageDialog(frame, "Wrong input, your number is lover, try again");
                 int tmpDiff = Math.abs(secretNumber - guessNumber);
                 if (tmpDiff < difference) {
                     difference = tmpDiff;
                     bestGuess = guessNumber;
                 }

             } else if (guessNumber > secretNumber) {
                 JOptionPane.showMessageDialog(frame, "Wrong input, your number is higher, try again");
                 int tmpDiff = Math.abs(secretNumber - guessNumber);
                 if (tmpDiff < difference) {
                     difference = tmpDiff;
                     bestGuess = guessNumber;
                 }
             } else  if (guessNumber == secretNumber) {
                 printBestScore(bestGuess, retries);
             }
             retries++;
         }
        printBestScore(bestGuess, retries);
    }
}
