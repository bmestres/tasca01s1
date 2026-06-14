package tascaS102.nivell03;

import java.util.Objects;

public class Seat {

    // Sit attributes
    private final int row;
    private final int seatNum;
    private final String personName;

    // Constructor
    public Seat(int row, int seat, String personName){
        this.row = row;
        this.seatNum = seat;
        this.personName = personName;
    }

    // Getters
    public String getPersonName(){
        return this.personName;
    }

    // Returns true if the given seat's row and seat number match with the instance of seat
    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if(!(o instanceof Seat)){
            return false;
        }
        Seat seat = (Seat) o;
        return this.row == seat.row && this.seatNum == seat.seatNum;
    }

    // Shows seat's row, seat number and person in a readable manner
    @Override
    public String toString() {
        return String.format("Row: %d\nSeat: %d\nPerson: %s\n", this.row, this.seatNum, personName);
    }

    // Returns hash code for row and seat number
    @Override
    public int hashCode() {
        return Objects.hash(row, seatNum);
    }
}
