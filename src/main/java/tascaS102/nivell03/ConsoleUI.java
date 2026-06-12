package tascaS102.nivell03;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {

    private static Scanner scannerInput = new Scanner(System.in);

    // Attributes
    private ReservationService service;
    // Constructor
    public ConsoleUI(ReservationService service){
        this.service = service;
    }

    public void start(){
        boolean exit = false;

        do{
            System.out.println(Message.U_MENU_DISPLAY);
            try {
                int userSel = ConsoleReader.readInt(Message.U_OPTION_SELECTION);

                if (userSel < 0 || userSel > 5) {
                    throw new OutOfRangeValueException();
                }
                MenuOption menuSel = MenuOption.values()[userSel - 1];

                switch (menuSel) {
                    case M_SHOW_ALL_BOOKED_SITS: {
                        showBookedSits();

                        break;
                    }
                    case M_SHOW_SITS_PER_PERSON: {

                        break;
                    }
                    case M_BOOK_SIT: {

                    }
                    case M_CANCEL_BOOKING: {

                        break;
                    }
                    case M_CANCEL_ALL_USER_BOOKING: {

                        break;
                    }
                    case M_EXIT: {
                        exit = true;
                        break;
                    }
                }
            }catch(OutOfRangeValueException e){
                    System.out.println(e.getMessage());
                }
        } while(!exit);
    }

    // Display data methods
    private void showBookedSits(){

        try{
            List<Seat>bookedSits = service.getAllSeats();

            System.out.println(Message.U_RESERVATION_LIST);
            for(int i = 0; i < bookedSits.size();i++){
                System.out.printf("*    %d)  %s                        *\n", i + 1, bookedSits.get(i));
            }
        }catch(EmptySeatListException e){
            System.out.println(e.getMessage());
        }
    }

    private void showSitsPerPerson(){

        // String personName = ConsoleReader.

    }

    private void promptBookSeat(){

    }

    private void promptCancelSeat(){

    }

    private void cancelAllByPerson(){

    }



}
