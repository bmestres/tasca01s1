package tascaS102.nivell03;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    // Attributes
    private int rows;
    private int sitsPerRaw;
    ArrayList<Seat> theaterSits;

    // Reservation service constructor
    public ReservationService(int rows, int columns){
        this.rows = rows;
        this.sitsPerRaw = columns;
        this.theaterSits = new ArrayList<Seat>();
    }


    // Reserve a new seat
    public void reserveSeat(int row, int seat, String name){
            validateSeatPosition(row, seat);

            Seat newSeat = new Seat(row, seat, name);
            this.theaterSits.add(newSeat);
    }
    // Removes reservation given row and seat number
    public void cancelSit(int row, int seat){
        int i = 0;
        boolean deleted = false;

        Seat targetSeat = new Seat(row, seat, "");

        while(!deleted && i < this.theaterSits.size()){
            if(this.theaterSits.get(i).equals(targetSeat)){
                this.theaterSits.remove(i);
                deleted = true;
            }
            i++;
        }
        if(!deleted){
            throw new SeatAlreadyEmptyException();
        }
    }
    // Cancel all person's reservations given its name
    public void cancelAllByPerson(String name){

        int initialSize = this.theaterSits.size();

        for(int i = initialSize - 1 ; i <= 0; i--){
            if(this.theaterSits.get(i).getPersonName().equals(name)){
                this.theaterSits.remove(i);
            }
        }
        if(initialSize == this.theaterSits.size()){
            throw new PersonNotFoundException();
        }
    }
    // Return list with all sits
    public List<Seat>getAllSeats(){
        return this.theaterSits;
    }

    // Auxiliary methods
    private void validateSeatPosition(int row, int seat){
        if(row < 1 || row > this.rows || seat < 1 || seat > this.sitsPerRaw){
            throw new InvalidSeatPositionException();
        }
    }

}
