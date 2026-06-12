package tascaS102.nivell03;

import java.util.InputMismatchException;
import java.util.Scanner;

// Check format correctness
public class ConsoleReader {
    private static Scanner inputScanner = new Scanner(System.in);

    // Prompt user for integer value and return value if format is correct
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

    // Prompt user for a string and return string if format is correct
    public static String readString(String message){
        String formatedString = "";
        boolean correctFormat = false;

        do{
            try{
                System.out.println(message);
                formatedString = inputScanner.nextLine();

                if(formatedString.matches(".*\\d.*")){
                    throw new StringWithNumbersException();
                }
                correctFormat = true;
            }catch(InputMismatchException e){
                System.out.println(Message.E_FORMAT_ERROR);
            }catch(StringWithNumbersException e){
                System.out.println(e.getMessage());
            }
        }while(!correctFormat);
        return formatedString;
    }
}
