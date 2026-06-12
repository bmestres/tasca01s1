package tascaS102.nivell03;
// Array of program messages
public class Message {

    // User messages
    public static final String U_WELCOME = "Welcome";
    public static final String U_ENTER_RAWS = "Enter number of raws:";
    public static final String U_ENTER_SITS_PER_RAW = "Enter number of sits per row:";
    public static final String U_OPTION_SELECTION = "Choose an option:";

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
    // Error messages
    public static final String E_FORMAT_ERROR = "Format error";
    public static final String E_NEGATIVE_VALUE = "Entered value must not be negative";
    public static final String E_OUT_OF_RANGE_VALUE = "Out of range value";
    public static final String E_INVALID_SIT_POSITION = "Invalid seat position";
    public static final String E_STRING_WITH_NUMBERS = "Text must not include numbers";
    public static final String E_SEAT_ALREADY_TAKEN = "Sit already taken";
}
