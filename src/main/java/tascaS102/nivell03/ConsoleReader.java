package tascaS102.nivell03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static Scanner inputScanner = new Scanner(System.in);

    // Prompts user to input an integer and returns value
    public static int readInt(String message) {
        int formatedInt = 0;
        boolean correctFormat = false;

        do{
            try {
                System.out.println(message);
                formatedInt = inputScanner.nextInt();
                inputScanner.nextLine();

                if(formatedInt < 0){
                    throw new NegativeValueException();
                }
                correctFormat = true;
            } catch (InputMismatchException e) {
                System.out.println(Message.E_FORMAT_ERROR);
                inputScanner.nextLine();
            } catch(NegativeValueException e) {
                System.out.println(Message.E_NEGATIVE_VALUE);
            }
        }while(!correctFormat);

        return formatedInt;
    }
}
