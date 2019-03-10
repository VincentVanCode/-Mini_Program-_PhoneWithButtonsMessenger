package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        //read buttonPushed
        int commandsCount = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 0; i < commandsCount; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            //find the number of digits
            int digits = 0;
            for (int j = number; j > 0; j /= 10) {
                digits++;
            }

            //find the MAIN NUmber
            int mainNumber = 0;
            for (int k = 0; k < digits - 1; k++) {
                number /= 10;
                mainNumber = number;
            }
            //System.out.println(digits);
            //System.out.println(mainNumber);

            //find the offset of the number
            int offset = (mainNumber - 2) * 3;
            if (mainNumber == 8 || mainNumber == 9) {
                offset++;
            }

            int letterIndex = (offset + digits - 1);
            int letterCode = letterIndex + 97;

            char letter = (char) letterCode;
            if (mainNumber == 0) {
                letter = (char) (mainNumber + 32);
            }
            message += letter;

        }
        System.out.println(message);

    }
}
