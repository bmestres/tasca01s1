package tascaS102.nivell03;

public class SeatAlreadyEmptyException extends RuntimeException{
    public SeatAlreadyEmptyException(){
        super(Message.E_SIT_ALREADY_TAKEN);
    }
}
