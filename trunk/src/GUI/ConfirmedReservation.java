package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import Model.*;

import Controller.ReservationController;

public class ConfirmedReservation {

	private JFrame frmConfirmedReservation;
	private ReservationController rc;
	private Reservation reservation ;
	
	public ConfirmedReservation(){
		
		initialize();
		
	}

	
	private void initialize() {
		
		
		
		frmConfirmedReservation = new JFrame();
		frmConfirmedReservation.setVisible(true);
		frmConfirmedReservation.setTitle("Confirmed Reservation");
		frmConfirmedReservation.setBounds(100, 100, 425, 383);
		frmConfirmedReservation.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 35, 337, 310);
		frmConfirmedReservation.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		rc = new ReservationController();
		
		int resId = rc.getMaxReservationId();
		
		reservation = new  Reservation();
		
		reservation = rc.searchReservationId(resId);
		
		
		String reservationStatus =String.format( "Reservation ID: %s%nFirst Name: %s%nLastName: %s%n" +
				"CPR: %s%nAddress : %s%nUsername : %s%nPassword : %s%n " +
    			"__________________________________________%n" ,
    	String.valueOf(rc.getMaxReservationId()),
		reservation.getGuest().getfName(),reservation.getGuest().getlName(),reservation.getGuest().getCpr(),
		reservation.getGuest().getAddress(),reservation.getGuest().getUsername(),reservation.getGuest().getPassword());
		
		
    	String rPrice =String.format("Deposit: %s%nTotal Amount: %s%n " ,
		 String.valueOf((reservation.getDeposit())),String.valueOf(reservation.getTotalPrice()));

    	String resLines= "";

    	
    	for(int i = 0; reservation.getReservationLines().size()>i;i++){
    		
    
    		String rls =String.format("Room Number:%s %nTotal Guest:  %s %nCheck In: %s%n" +
    				"Check Out: %s%n " +
    				"__________________________________________%n" ,
    		String.valueOf(reservation.getReservationLines().get(i).getRoom().getRoomId()),
    		String.valueOf(((reservation.getReservationLines().get(i).getAdultNo()+reservation.getReservationLines().get(i).getChildrenNo()))),
    		reservation.getReservationLines().get(i).getCheckIn(),
    		reservation.getReservationLines().get(i).getCheckOut());
    		resLines = resLines+rls ;
    }

   
    	textArea.setText(reservationStatus + resLines+ rPrice);
    	
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
