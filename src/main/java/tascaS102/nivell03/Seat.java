package tascaS102.nivell03;

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
        String.format("Row: %d\nSeat: %d\nPerson: %s\n", row, seat, personName);
        return super.toString();
    }
}
