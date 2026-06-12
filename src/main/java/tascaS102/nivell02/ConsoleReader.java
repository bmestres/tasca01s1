package tascaS102.nivell02;

import java.util.InputMismatchException;
import java.util.Scanner;

// Prompt user and check input. Show an error message until the input is correct, then stores input.
public class ConsoleReader {

    private static Scanner inputScanner = new Scanner(System.in);

    // Prompts user tu input byte and returns value
    public static byte readByte(String message){

        byte formatedByte = 0;
        boolean correctInput = false;

        do {
        System.out.println(Message.ENTER_BYTE);

        try {
            formatedByte = inputScanner.nextByte();
            inputScanner.nextLine();
            correctInput = true;

        } catch (InputMismatchException e) {
            System.out.println(Message.EXCEPTION_FORMAT_ERROR);
            inputScanner.nextLine();
        }
        } while(!correctInput);
        System.out.println(Message.E_SUCCESS);
        return formatedByte;
    }

    // Prompts user to input an integer and returns value
    public static int readInt(String message){
        int formatedInt = 0;
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_INT);
            try {
                formatedInt = inputScanner.nextInt();
                inputScanner.nextLine();
                correctInput = true;

            } catch (InputMismatchException e) {
                System.out.println(Message.EXCEPTION_FORMAT_ERROR);
                inputScanner.nextLine();
            }
        }while(!correctInput);
        System.out.println(Message.E_SUCCESS);
        return formatedInt;
    }

    // Prompts user to input float and returns value
    public static float readFloat(String message){

            float formatedFloat = 0;
            boolean correctInput = false;

            do{
                System.out.println(Message.ENTER_FLOAT);

                try {
                    formatedFloat = inputScanner.nextFloat();
                    inputScanner.nextLine();
                    correctInput = true;

                } catch (InputMismatchException e) {
                    System.out.println(Message.EXCEPTION_FORMAT_ERROR);
                    inputScanner.nextLine();
                }
            }while (!correctInput);

        System.out.println(Message.E_SUCCESS);
        return formatedFloat;
    }
    // Prompts user to input a double and returns value
    public static double readDouble(String message){

        double formatedDouble = 0;
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_DOUBLE);

            try{
                formatedDouble = inputScanner.nextDouble();
                inputScanner.nextLine();
                correctInput = true;

            } catch(InputMismatchException e){
                System.out.println(Message.EXCEPTION_FORMAT_ERROR);
                inputScanner.nextLine();
            }
        }while(!correctInput);
        System.out.println(Message.E_SUCCESS);
        return formatedDouble;
    }

    // Prompts user to input character and returns value
    public static char readChar(String message){
        char formatedChar = 0;
        boolean correctInput = false;

        do {
            System.out.println(Message.ENTER_CHARACTER);
            String userInput = inputScanner.nextLine();

            try {
                if (userInput.length() != 1) {
                    throw new MultipleCharacterException();
                }
                formatedChar = userInput.charAt(0);
                correctInput = true;

            } catch (MultipleCharacterException e) {
                System.out.println(e.getMessage());
            }
        } while (!correctInput);

        System.out.println(Message.E_SUCCESS);
        return formatedChar;
    }
    // Prompts user to input a word and returns string
    public static String readString(String message){

        String formatedString = "";
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_STRING);

            try{
                String userInput = inputScanner.nextLine();
                if(userInput.length() < 3){
                    throw new ShortStringException();
                }
                formatedString = userInput;
                correctInput = true;

            }catch(ShortStringException e){
                System.out.println(e.getMessage());
            }
        }while(!correctInput);

        System.out.println(Message.E_SUCCESS);
        return formatedString;
    }
    // Prompts user for a boolean and returns value
    public static boolean readYesNo(String message){
        boolean formatedBool = false;
        boolean correctInput = false;

        do{
            System.out.println(Message.ENTER_BOOLEAN);
            String userInput = inputScanner.nextLine();

            try{
                if(!userInput.equals("y") && !userInput.equals("n")){
                    throw new YesNoException();
                }

                if(userInput.equals("y")){
                    formatedBool = true;
                }
                correctInput = true;

            }catch(YesNoException e) {
                System.out.println(e.getMessage());
            }
        }while (!correctInput);

        System.out.println(Message.E_SUCCESS);
        return formatedBool;
    }
}
