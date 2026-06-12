package tascaS102.nivell03;

public class InvalidSeatPositionException extends RuntimeException{
    public InvalidSeatPositionException(){
        super(Message.E_INVALID_SIT_POSITION);
    }
}
