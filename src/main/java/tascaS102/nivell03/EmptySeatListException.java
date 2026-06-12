package tascaS102.nivell03;

public class EmptySeatListException extends RuntimeException {
    public EmptySeatListException()
    {
        super(Message.E_EMPTY_SEAT_LIST);
    }
}
