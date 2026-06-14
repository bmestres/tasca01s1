package tascaS102.nivell03;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(){
        super(Message.E_PERSON_NOT_FOUND);
    }

}
