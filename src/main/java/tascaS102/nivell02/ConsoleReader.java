package tascaS102.nivell02;

import java.util.InputMismatchException;
import java.util.Scanner;

// Prompt user and check input. Show an error message until the input is correct
public class ConsoleReader {

    private static Scanner inputScanner = new Scanner(System.in);

    // Prompts user for input and returns byte value
    public static byte readByte(String message){

        byte formatedByte = 0;
        boolean correctInput = false;

        do {
        System.out.println("Enter a byte:");
        String userInput = inputScanner.nextLine();

        try {
            formatedByte = Byte.parseByte(userInput);
            inputScanner.nextLine();
            correctInput = true;

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            inputScanner.nextLine();
        }
        } while(!correctInput);
        return formatedByte;
    }


    // Prompts user for input and returns integer value
    public static int readInt(String message){
        int formatedInt = 0;
        boolean correctInput = false;

        do{
            System.out.println("Enter an integer:");
            String userInput = inputScanner.nextLine();

            try {
                formatedInt = Integer.parseInt(userInput);
                inputScanner.nextLine();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                inputScanner.nextLine();
            }
        }while(!correctInput);

        return formatedInt;
    }

    // Prompts user for input and returns float value
    public static float readFloat(String message){

            float formatedFloat = 0;
            boolean correctInput = false;

        System.out.println("Enter a float value:");
        String userInput = inputScanner.nextLine();

        try {
            formatedFloat = Float.parseFloat(userInput);
            inputScanner.nextLine();
            correctInput = true;

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            inputScanner.nextLine();
        } while (!correctInput);

        return formatedFloat;
    }
    // Prompts user for input and returns double value
    public static double readDouble(String message){

        double formatedDouble = 0;
        boolean correctInput = false;

        do{
            System.out.println("Enter a double value:");
            String userInput = inputScanner.nextLine();

            try{
                formatedDouble = Double.parseDouble(userInput);
                inputScanner.nextLine();
                correctInput = true;

            } catch(InputMismatchException e){
                System.out.println(e.getMessage());
                inputScanner.nextLine();
            }
        }while(!correctInput);

        return formatedDouble;
    }

    // Prompts user for input and returns character value
    public static char readChar(String message){
        char formatedChar = 0;
        boolean correctInput = false;

        System.out.println("Enter a character");

        try{
            char character = inputScanner.nextLine().charAt(0);
            correctInput = true;

        }catch(MultipleCharacterException e){
            System.out.println(e.getMessage());
        }while(!correctInput);

        return formatedChar;
    }

    public static String readString(String message){

    }


}
