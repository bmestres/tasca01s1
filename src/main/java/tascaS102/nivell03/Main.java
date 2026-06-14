package tascaS102.nivell03;

public class Main {
    /* This program prompts the user to enter rows and sits per row of a cinema room. Then allows to choose
    * among a set of options that include reserve seats, cancel reservations as well as displaying the state of
    * reservations on screen */
    static void main(String[] args) {

        System.out.println(Message.U_WELCOME);
        int numRows = ConsoleReader.readInt(Message.U_ENTER_ROWS);
        int numSitsPerRow = ConsoleReader.readInt(Message.U_ENTER_SITS_PER_RAW);

        ReservationService service = new ReservationService(numRows, numSitsPerRow);
        ConsoleUI console = new ConsoleUI(service);

        console.start();
    }
}
