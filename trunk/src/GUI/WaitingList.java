package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import Controller.EventController;
import Model.EventReservation;
import Model.EventWaitingListQueue;

public class WaitingList {

	private JFrame frmEventWaitingList;
	private JTable table;
	private String [][] getWaitingListTable;
    private String [] getWaitingListColum;
    private int getWaitingListRows;

	public WaitingList() {
		initialize();
		
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(WaitingList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	}

	private void initialize() {
		frmEventWaitingList = new JFrame();
		frmEventWaitingList.setTitle("Event Waiting List");
		frmEventWaitingList.setBounds(100, 100, 742, 572);
		frmEventWaitingList.getContentPane().setLayout(null);
		frmEventWaitingList.setVisible(true);
		JLabel lblEventsWainingList = new JLabel("Events Waiting List");
		lblEventsWainingList.setBounds(10, 11, 168, 21);
		lblEventsWainingList.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmEventWaitingList.getContentPane().add(lblEventsWainingList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 43, 706, 393);
		frmEventWaitingList.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		System.out.println("syzdava eController ");
		EventController eController = new EventController();
		System.out.println("syzdava eResObj ");
		EventReservation eResObj =  new EventReservation();
		System.out.println("syzdava tablicata ");
		
		getWaitingListRows = eController.getWaitingList().size();
		getWaitingListTable = new String[getWaitingListRows] [6];
		getWaitingListColum = new String[]{"Event","Date","Time","Number of paricipants","First Name", "Last Name"};
		
		System.out.println("syzdava for loopa ");
		
		EventWaitingListQueue<EventReservation>  queue = new EventWaitingListQueue<EventReservation> ();
		queue =  eController.getWaitingList();
		
		for(int i=0; i < getWaitingListRows; i++) {
		
    		
			eResObj =queue.get();
		
			
			String eventType = eResObj.getEvent().getType();
    		String date =eResObj.getEvent().getDate();
    		String timeS = eResObj.getEvent().getTimeFrom().substring(0, 5);
    		String np = String.valueOf(eResObj.getNp());
    		String fName =eResObj.getGuest().getfName();
    		String lName =eResObj.getGuest().getlName();
    

    		
    		getWaitingListTable[i][0] = eventType;
    		getWaitingListTable[i][1] = date;
    		getWaitingListTable[i][2] = timeS;
    		getWaitingListTable[i][3] = np;
    		getWaitingListTable[i][4] = fName;
    		getWaitingListTable[i][5] = lName;

    	}
		
		
		 table.setModel(new DefaultTableModel(getWaitingListTable, getWaitingListColum));
		 
		 JButton btnDeleteFromWaiting = new JButton("Delete from waiting list");
		 btnDeleteFromWaiting.setBounds(10, 447, 168, 32);
		 frmEventWaitingList.getContentPane().add(btnDeleteFromWaiting);
		
	}
}
