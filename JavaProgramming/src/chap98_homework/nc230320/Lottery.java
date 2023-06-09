package chap98_homework.nc230320;

import java.util.Arrays;
import java.util.Random;


public class Lottery {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[7]; // 6 numbers and 1 bonus number will be drawn in the lottery
        int maxNumber = 45; // the maximum number in the lottery
        Random random = new Random(); // to generate random numbers
        
        // Generate the winning lottery numbers
        for (int i = 0; i < 6; i++) {
            int number;
            do {
                number = random.nextInt(maxNumber) + 1; // generate a random number between 1 and 45
            } while (contains(lotteryNumbers, number)); // make sure the number is not already in the array
            lotteryNumbers[i] = number;
        }
        
        // Generate the bonus number
        int bonusNumber;
        do {
            bonusNumber = random.nextInt(maxNumber) + 1; // generate a random number between 1 and 45
        } while (contains(lotteryNumbers, bonusNumber)); // make sure the number is not already in the array
        lotteryNumbers[6] = bonusNumber;
        
        // Print the lottery numbers
        System.out.println("The lottery numbers are:");
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (i == lotteryNumbers.length - 1) {
                System.out.println("Bonus: " + bonusNumber); // print the bonus number separately
            } else {
                System.out.print(lotteryNumbers[i] + " "); // print the winning numbers
            }
        }
    }
    
    // Helper method to check if an array contains a number
    private static boolean contains(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }
}