package tascaS102.nivell02;

public class Message {

    // Prompt user messages
    public static final String ENTER_BYTE = "Enter one byte:";
    public static final String ENTER_INT = "Enter an integer:";
    public static final String ENTER_FLOAT = "Enter your float value:";
    public static final String ENTER_DOUBLE = "Enter your double value:";
    public static final String ENTER_CHARACTER = "Enter your letter";
    public static final String ENTER_STRING = "Enter your text";
    public static final String ENTER_BOOLEAN = "Enter your answer: Yes (y) or No (n)";

    // Exception messages
    public static final String EXCEPTION_FORMAT_ERROR = "Format error. Try again.";
    public static final String EXCEPTION_ONE_CHAR = "Input is too long. Enter just one letter.";
    public static final String EXCEPTION_SHORT_STRING = "Your word needs to be at least 3 letters long. Try again.";
    public static final String EXCEPTION_YES_NO = "Only letters (y) and (n) are accepted. Try again.";

    // Result messages
    public static final String RESULT_BYTE = "Entered %d\n";
    public static final String RESULT_INT = "Entered %d\n";
    public static final String RESULT_FLOAT = "Entered %.2f\n";
    public static final String RESULT_DOUBLE = "Entered %2f\n";
    public static final String RESULT_CHARACTER = "Entered %c\n";
    public static final String RESULT_STRING = "Entered %s\n";
    public static final String RESULT_BOOLEAN = "Entered %b\n";

    // Status messages
    public static final String E_SUCCESS = "Success";
}
