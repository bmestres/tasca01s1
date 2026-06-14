package tascaS102.nivell03;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleReader {
    private static final Scanner inputScanner = new Scanner(System.in);

    /* Ensure correct input format for integers. Handles negative values
    by showing error message
     */
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

    /* Ensure correct input format for strings. Handles strings with numbers
    by showing a non-allowed message
     */
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
