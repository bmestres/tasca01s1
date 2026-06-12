package tascaS102.nivell03;

public class NegativeValueException extends RuntimeException{
    public NegativeValueException(){
        super(Message.E_NEGATIVE_VALUE);
    }
}