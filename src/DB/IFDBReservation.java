package DB;
import java.util.ArrayList;

import Model.*;



public interface IFDBReservation {
   
    public ArrayList<Reservation> getAllReservations();
    public Reservation searchReservationId(int reservationId);
    public int createReservation(Reservation reservation);
    public int insertReservationLine(ReservationLine reservationLine, int reservationId);
	public int deleteReservation(int reservationId);
	public  Reservation searchReservationGusestId(int guestId);
	public ArrayList<Reservation> showAllReservations();
	public ArrayList<Reservation>searchReservationsCheckIn(String checkIn);
	public Reservation searchReservationRoomId(int roomId);
    
}
