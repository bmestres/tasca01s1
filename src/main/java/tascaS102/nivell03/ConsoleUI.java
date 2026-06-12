package tascaS102.nivell03;

import java.util.List;

public class ConsoleUI {

    // Attributes
    private final ReservationService service;

    // Constructor
    public ConsoleUI(ReservationService service) {
        this.service = service;
    }

    public void start() {
        boolean exit = false;

        do {
            System.out.println(Message.U_MENU_DISPLAY);
            try {
                int userSel = ConsoleReader.readInt(Message.U_OPTION_SELECTION);

                if (userSel < 1 || userSel > 6) {
                    throw new OutOfRangeValueException();
                }
                MenuOption menuSel = MenuOption.values()[userSel - 1];

                switch (menuSel) {
                    case M_SHOW_ALL_BOOKED_SITS: {
                        showBookedSits();
                        break;
                    }
                    case M_SHOW_SITS_PER_PERSON: {
                        showSeatsPerPerson();
                        break;
                    }
                    case M_BOOK_SIT: {
                        promptReserveSeat();
                        break;
                    }
                    case M_CANCEL_BOOKING: {
                        promptCancelSeat();
                        break;
                    }
                    case M_CANCEL_ALL_USER_BOOKING: {
                        promptCancelAllByPerson();
                        break;
                    }
                    case M_EXIT: {
                        System.out.printf(Message.U_GOODBYE);
                        exit = true;
                        break;
                    }
                }
            } catch (OutOfRangeValueException e) {
                System.out.println(e.getMessage());
            }
        } while (!exit);
    }

    // Display data methods
    private void showBookedSits() {
        try {
            List<Seat> bookedSits = service.getAllSeats();

            System.out.println(Message.U_RESERVATION_LIST);
            for (int i = 0; i < bookedSits.size(); i++) {
                System.out.printf("%d)\n%s\n", i + 1, bookedSits.get(i));
            }
            System.out.println("*=========================================*");
        } catch (EmptySeatListException e) {
            System.out.println(e.getMessage());
        }
    }

    private void showSeatsPerPerson() {
        String person = ConsoleReader.readString(Message.U_ENTER_PERSON);
        try {
            List<Seat>sits = service.getSeatsByPerson(person);

            System.out.println(Message.U_PERSON_SEATS);
            for(int i = 0; i < sits.size(); i++){
                System.out.printf("%d)\n%s\n",i + 1, sits.get(i));
            }
            System.out.println("*=========================================*");
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void promptReserveSeat() {
        int row = ConsoleReader.readInt(Message.U_ENTER_ROW);
        int col = ConsoleReader.readInt(Message.U_ENTER_SEAT_NUMBER);
        String person = ConsoleReader.readString(Message.U_ENTER_PERSON);

        try {
            service.reserveSeat(row, col, person);
            System.out.println(Message.E_SUCCESS);
        } catch (InvalidSeatPositionException | SeatAlreadyTakenException e) {
            System.out.println(e.getMessage());
        }
    }

    private void promptCancelSeat() {
        int row = ConsoleReader.readInt(Message.U_ENTER_ROW);
        int col = ConsoleReader.readInt(Message.U_ENTER_SEAT_NUMBER);

        try {
            service.cancelSit(row, col);
            System.out.println(Message.E_SUCCESS);
        } catch (InvalidSeatPositionException | SeatAlreadyEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    private void promptCancelAllByPerson() {
        String person = ConsoleReader.readString(Message.U_ENTER_PERSON);

        try {
            service.cancelAllByPerson(person);
            System.out.println(Message.E_SUCCESS);
        } catch (PersonNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
