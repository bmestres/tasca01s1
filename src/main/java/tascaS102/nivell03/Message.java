package tascaS102.nivell03;
// Array of program messages
public class Message {

    // User messages
    public static final String U_WELCOME = "Welcome!";
    public static final String U_ENTER_ROWS = "Enter number of rows:";
    public static final String U_ENTER_SITS_PER_RAW = "Enter number of sits per row:";
    public static final String U_OPTION_SELECTION = "Choose an option:";
    public static final String U_ENTER_PERSON = "Enter person's name:";
    public static final String U_ENTER_ROW = "Enter row:";
    public static final String U_ENTER_SEAT_NUMBER = "Enter seat number:";
    public static final String U_GOODBYE = "Ending program\nGoodbye!";

    public static final String U_MENU_DISPLAY = """
               *==========================================*
               *                 MENU                     *
               *    1) Show all booked sits               *
               *    2) Show all sits booked by a person   *
               *    3) Book a sit                         *
               *    4) Cancel s sit reservation           *
               *    5) Cancel all bookings from a person  *
               *    6) Exit                               *
               *==========================================*
               """;
    public static final String U_RESERVATION_LIST = """
            *=========================================*
                          RESERVATION LIST
            """;
    public static final String U_PERSON_SEATS = """
            *=========================================*
                           PERSON'S SEATS
            """;
    // Error messages
    public static final String E_FORMAT_ERROR = "Format error.";
    public static final String E_NEGATIVE_VALUE = "Entered value must not be negative.";
    public static final String E_OUT_OF_RANGE_VALUE = "Out of range value. Choose (1 - 6)";
    public static final String E_INVALID_SIT_POSITION = "Invalid seat. Enter a valid seat.";
    public static final String E_STRING_WITH_NUMBERS = "Text must not include numbers.";
    public static final String E_SEAT_ALREADY_TAKEN = "The seat is already taken. Choose a different sit";
    public static final String E_SEAT_ALREADY_EMPTY = "The seat is empty";
    public static final String E_PERSON_NOT_FOUND = "Person not found.";
    public static final String E_EMPTY_SEAT_LIST = "No reservations found.";
    public static final String E_SUCCESS = "Success.";

}
