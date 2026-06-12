package tascaS102.nivell03;

import java.util.ArrayList;
import java.util.List;

public class ReservationService {

    // Attributes
    private final int rows;
    private final int sitsPerRaw;
    private final ArrayList<Seat> theaterSeats;

    // Reservation service constructor
    public ReservationService(int rows, int columns) {
        this.rows = rows;
        this.sitsPerRaw = columns;
        this.theaterSeats = new ArrayList<>();
    }

    // Reserve a new seat
    public void reserveSeat(int row, int seat, String name) {

        validateSeatPosition(row, seat);
        validateSeatAvailability(row, seat);

        Seat newSeat = new Seat(row, seat, name);
        this.theaterSeats.add(newSeat);
    }

    // Removes reservation given row and seat number
    public void cancelSit(int row, int seat) {

        validateSeatPosition(row, seat);

        int i = 0;
        boolean deleted = false;

        Seat targetSeat = new Seat(row, seat, "");

        while (!deleted && i < this.theaterSeats.size()) {
            if (this.theaterSeats.get(i).equals(targetSeat)) {
                this.theaterSeats.remove(i);
                deleted = true;
            }
            i++;
        }
        if (!deleted) {
            throw new SeatAlreadyEmptyException();
        }
    }

    // Cancel all person's reservations given its name
    public void cancelAllByPerson(String name) {

        int initialSize = this.theaterSeats.size();

        for (int i = initialSize - 1; i >= 0; i--) {
            if (this.theaterSeats.get(i).getPersonName().equalsIgnoreCase(name)) {
                this.theaterSeats.remove(i);
            }
        }
        if (initialSize == this.theaterSeats.size()) {
            throw new PersonNotFoundException();
        }
    }

    // Return list with all sits
    public List<Seat> getAllSeats() {

        if(this.theaterSeats.isEmpty()){
            throw new EmptySeatListException();
        }
        return this.theaterSeats;
    }

    // Return list with all seats booked by a given person
    public List<Seat> getSeatsByPerson(String name) {
        ArrayList<Seat> seatsByPerson = new ArrayList<>();

        for (int i = 0; i < this.theaterSeats.size(); i++) {
            Seat currSeat = this.theaterSeats.get(i);
            if (currSeat.getPersonName().equalsIgnoreCase(name)) {
                seatsByPerson.add(currSeat);
            }
        }
        if (seatsByPerson.isEmpty()) {
            throw new PersonNotFoundException();
        }
        return seatsByPerson;
    }

    // Auxiliary validation methods
    private void validateSeatPosition(int row, int seat) {
        if (row < 1 || row > this.rows || seat < 1 || seat > this.sitsPerRaw) {
            throw new InvalidSeatPositionException();
        }
    }

    private void validateSeatAvailability(int row, int seat) {
        Seat targetSeat = new Seat(row, seat, "");
        int i = 0;

        while(i < this.theaterSeats.size()){
            if(theaterSeats.get(i).equals(targetSeat)){
                throw new SeatAlreadyTakenException();
            }
            i++;
        }
    }
}
