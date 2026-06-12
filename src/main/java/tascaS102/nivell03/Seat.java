package tascaS102.nivell03;

import java.util.Objects;

public class Seat {

    // Sit attributes
    private int row;
    private int seatNum;
    private String personName;

    // Constructor
    public Seat(int row, int seat, String personName){
        this.row = row;
        this.seatNum = seat;
        this.personName = personName;
    }

    // Getters
    public int getRow(){
        return this.row;
    }

    public int getSeatNum(){
        return this.seatNum;
    }

    public String getPersonName(){
        return this.personName;
    }

    // Setters
    public void setRow(int row){
        this.row = row;
    }

    public void setSeatNum(int seatNum){
        this.seatNum = seatNum;
    }

    public void setPersonName(String personName){
        this.personName = personName;
    }

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

    // Shows seat's information
    @Override
    public String toString() {
        return String.format("Row: %d\nSeat: %d\nPerson: %s\n", this.row, this.seatNum, personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, seatNum);
    }
}
