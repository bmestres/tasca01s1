package tascaS102.nivell03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUI {

    private static Scanner scannerInput = new Scanner(System.in);

    // Attributes
    private ReservationService service;

    // Constructor
    public ConsoleUI(ReservationService service){
        this.service = service;
    }
    // Read integer
    private int readInt(String message){
        int formatedInt = 0;
        boolean correctFormat = false;

        try{
            formatedInt = scannerInput.nextInt();
            scannerInput.nextLine();
            correctFormat = true;
        }catch(InputMismatchException e){
            System.out.println(Message.E_FORMAT_ERROR);
        }
        return formatedInt;
    }

    public void start(){

        int userSel = 0;
        boolean correctEntry = false;

        do{
            System.out.println(Message.U_MENU_DISPLAY);

        }while(!correctEntry);
    }

    public void displayMenu(){
        System.out.println("*=======================================*");
        System.out.println("*             OPTION MENU               *");
        System.out.println("*     1) Show all booked sits           *");
        System.out.println("*     2) Show all sits per person       *");
        System.out.println("*     3) Book a sit                     *");
        System.out.println("*     4) Cancel booking of sit          *");
        System.out.println("*     5) Cancel all person's bookings   *");
        System.out.println("*=======================================*");
    }
}
