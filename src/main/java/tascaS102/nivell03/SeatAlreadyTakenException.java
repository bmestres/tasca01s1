package tascaS102.nivell03;

public class SeatAlreadyTakenException extends RuntimeException {
    public SeatAlreadyTakenException()
    {
        super(Message.E_SEAT_ALREADY_TAKEN);
    }
}
