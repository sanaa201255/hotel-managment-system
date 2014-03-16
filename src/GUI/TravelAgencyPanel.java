/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Controller.*;
import DB.DBEventReservation;
import DB.DBFacility;
import DB.DBUser;
import Model.*;
import Model.Event;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.*;
import java.awt.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;


public class TravelAgencyPanel extends javax.swing.JFrame {

   


	private String reservationStatus;
	/**
     * Creates new form MainWindow
     */
    public TravelAgencyPanel() {
    	setResizable(false);
		setTitle("Travel Agency Menu");
		setVisible(true);
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

  
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jTextField17 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTable4 = new javax.swing.JTable();
        jTable5 = new javax.swing.JTable();
        upData = new String[upDataRows][0];
        upDataColumns = new String[] {"First Name","Last name","CPR","Country","City"};
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jTextField12 =  new JTextField();
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTextField17.setText("jTextField17");

        jLabel59.setText("jLabel59");

        jTextField33.setText("jTextField33");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
       displayAllEventsTable = new String[ 20][9];
       displayAllEventsColumns = new String[]{"Event No.","Event","Date","Start Time","End Time",
        		"Description", "Max. Participants","Status","Employee Name"};
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane2.setBounds(409, 77, 603, 220);
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(380, 329, 129, 28);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(20, 46, 102, 23);
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	findGuestCprBooking();
        	}
        });
        jButton1.setBounds(595, 28, 88, 39);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(678, 480, 43, 26);
        jButton4 = new javax.swing.JButton();
        jButton4.setBounds(693, 28, 130, 40);
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator1.setBounds(0, 323, 1108, 9);
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(20, 614, 138, 27);
        jButton3 = new javax.swing.JButton();
        jButton3.setBounds(173, 277, 162, 34);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(20, 188, 102, 23);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(20, 101, 102, 23);
        jLabel16 = new javax.swing.JLabel();
        jLabel16.setBounds(20, 426, 102, 23);
        jTextField8 = new javax.swing.JTextField();
        jTextField8.setBounds(409, 44, 180, 28);
        jTextField7 = new javax.swing.JTextField();
        jTextField7.setBounds(126, 217, 162, 28);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(21, 487, 102, 23);
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBounds(126, 72, 162, 28);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBounds(20, 395, 102, 23);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setBounds(126, 101, 162, 28);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setBounds(126, 130, 162, 28);
        jTextField5 = new javax.swing.JTextField();
        jTextField5.setBounds(126, 159, 162, 28);
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setBounds(21, 458, 102, 23);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(20, 217, 102, 23);
        jLabel19 = new javax.swing.JLabel();
        jLabel19.setBounds(20, 363, 102, 23);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(20, 130, 102, 23);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(20, 160, 102, 23);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(126, 43, 162, 28);
        jTextField6 = new javax.swing.JTextField();
        jTextField6.setBounds(126, 188, 162, 28);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(20, 74, 102, 23);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(408, 1, 240, 43);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(14, 1, 173, 43);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(36, 521, 189, 81);
        jTextPane1 = new javax.swing.JTextPane();
        jButton5 = new javax.swing.JButton();
        jButton5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		ConfirmedReservation cr =  new ConfirmedReservation(); 
                clearResDetails();
        	}
        });
        jButton5.setBounds(380, 602, 172, 39);
        jButton6 = new javax.swing.JButton();
        jButton6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	deleteReservation();
        	}
        });
        jButton6.setBounds(560, 602, 150, 39);
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane3.setBounds(380, 369, 330, 229);
        jTextPane2 = new javax.swing.JTextPane();
        jTextPane2.setEditable(false);
        jButton14 = new javax.swing.JButton();
        jButton14.setBounds(20, 277, 151, 34);
        jTextField12_1 = new javax.swing.JTextField();
        jTextField12_1.setEditable(false);
        jTextField12_1.setBounds(93, 486, 51, 28);
        jButton15 = new javax.swing.JButton();
        jButton15.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		
        		AvailableRoomsBooking availableRoomsBooking = new AvailableRoomsBooking();
        		
        	}
        });
        jButton15.setBounds(156, 486, 114, 24);
        
                jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                jPanel1.setPreferredSize(new java.awt.Dimension(908, 622));
                jPanel1.setLayout(null);
                
                        
                  
                        
                        jScrollPane2.setViewportView(jTable2);
                        jTable2.setModel(new DefaultTableModel(bookSearchCprTable,bookSearchCprTableColum));
                        

                        jPanel1.add(jScrollPane2);
                        
                                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                jLabel1.setText("Reservation status");
                                jPanel1.add(jLabel1);
                                
                                        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                        jLabel2.setText("First Name(s)");
                                        jPanel1.add(jLabel2);
                                        
                                                jButton1.setText("Find");
                                                jPanel1.add(jButton1);
                                                
                                                        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                        jPanel1.add(jLabel5);
                                                        
                                                                jButton4.setText("Create customer");
                                                                jButton4.addActionListener(new java.awt.event.ActionListener() {
                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                    	new CreateGuest().setVisible(true);
                                                                    }
                                                                });
                                                                jPanel1.add(jButton4);
                                                                jPanel1.add(jSeparator1);
                                                                
                                                                        jButton2.setText("Add to reservation");
                                                                        jButton2.addActionListener(new java.awt.event.ActionListener() {
                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                addReservationLine();
                                                                            }
                                                                        });
                                                                        jPanel1.add(jButton2);
                                                                        
                                                                                jButton3.setText("Delete from reservation");
                                                                                jPanel1.add(jButton3);
                                                                                
                                                                                        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                        jLabel3.setText("Phone");
                                                                                        jPanel1.add(jLabel3);
                                                                                        
                                                                                                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                jLabel4.setText("Address");
                                                                                                jPanel1.add(jLabel4);
                                                                                                        
                                                                                                                jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                jLabel16.setText("No. Child");
                                                                                                                jPanel1.add(jLabel16);
                                                                                                                jPanel1.add(jTextField8);
                                                                                                                jPanel1.add(jTextField7);
                                                                                                                
                                                                                                                        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                        jLabel12.setText("Room");
                                                                                                                        jPanel1.add(jLabel12);
                                                                                                                        jPanel1.add(jTextField2);
                                                                                                                        
                                                                                                                                jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                jLabel13.setText("Check Out");
                                                                                                                                jPanel1.add(jLabel13);
                                                                                                                                jPanel1.add(jTextField3);
                                                                                                                                jPanel1.add(jTextField4);
                                                                                                                                jPanel1.add(jTextField5);
                                                                                                                                
                                                                                                                                        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                        jLabel15.setText("No. Adults");
                                                                                                                                        jPanel1.add(jLabel15);
                                                                                                                                        
                                                                                                                                                jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                jLabel7.setText("Travel agency");
                                                                                                                                                jPanel1.add(jLabel7);
                                                                                                                                                
                                                                                                                                                        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                        jLabel19.setText("Check In ");
                                                                                                                                                        jPanel1.add(jLabel19);
                                                                                                                                                        
                                                                                                                                                                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                jLabel8.setText("Country");
                                                                                                                                                                jPanel1.add(jLabel8);
                                                                                                                                                                        
                                                                                                                                                                                jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                jLabel9.setText("E-mail");
                                                                                                                                                                                jPanel1.add(jLabel9);
                                                                                                                                                                                jPanel1.add(jTextField1);
                                                                                                                                                                                jPanel1.add(jTextField6);
                                                                                                                                                                                
                                                                                                                                                                                        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                        jLabel6.setText("Family Names(s)");
                                                                                                                                                                                        jPanel1.add(jLabel6);
                                                                                                                                                                                        
                                                                                                                                                                                                jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                                                                                                jLabel10.setText("Search customer by CPR");
                                                                                                                                                                                                jPanel1.add(jLabel10);
                                                                                                                                                                                                
                                                                                                                                                                                                        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                                                                                                        jLabel11.setText("Customer Info");
                                                                                                                                                                                                        jPanel1.add(jLabel11);
                                                                                                                                                                                                        
                                                                                                                                                                                                                jScrollPane1.setViewportView(jTextPane1);
                                                                                                                                                                                                                
                                                                                                                                                                                                                        jPanel1.add(jScrollPane1);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                jButton5.setText("Save");
                                                                                                                                                                                                                                jPanel1.add(jButton5);
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                        jButton6.setText("Cancel");
                                                                                                                                                                                                                                        jPanel1.add(jButton6);
                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                jScrollPane3.setViewportView(jTextPane2);
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        jPanel1.add(jScrollPane3);
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                jButton14.setText("Add to reservation");
                                                                                                                                                                                                                                                                jButton14.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                                                                                        addReservation();
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                                                                                                               jTable15 = new javax.swing.JTable();
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               allPackagesTable = new String[10] [4];
                                                                                                                                                                                                                                                                                                                                                                                               allPackagesColum = new String[]{"Package ID","Description","Discount","Status"};
                                                                                                                                                                                                                                                                jPanel1.add(jButton14);
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                                                                        jPanel1.add(jTextField12_1);
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                jButton15.setText("Select Room");
                                                                                                                                                                                                                                                                                jPanel1.add(jButton15);
                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                        jTabbedPane1.addTab("Booking", jPanel1);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        dateChooser = new JDateChooser();
                                                                                                                                                                                                                                                                                        dateChooser.setBounds(93, 362, 162, 26);
                                                                                                                                                                                                                                                                                        jPanel1.add(dateChooser);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        dateChooser_1 = new JDateChooser();
                                                                                                                                                                                                                                                                                        dateChooser_1.setBounds(93, 391, 162, 28);
                                                                                                                                                                                                                                                                                        jPanel1.add(dateChooser_1);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        JLabel lblCpr_1 = new JLabel();
                                                                                                                                                                                                                                                                                        lblCpr_1.setText("CPR");
                                                                                                                                                                                                                                                                                        lblCpr_1.setFont(new Font("Tahoma", Font.BOLD, 11));
                                                                                                                                                                                                                                                                                        lblCpr_1.setBounds(20, 247, 102, 23);
                                                                                                                                                                                                                                                                                        jPanel1.add(lblCpr_1);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        textField_1 = new JTextField();
                                                                                                                                                                                                                                                                                        textField_1.setBounds(127, 247, 161, 28);
                                                                                                                                                                                                                                                                                        jPanel1.add(textField_1);
                                                                                                                                                                                                                                                                                        textField_1.setColumns(10);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        btnClear = new JButton("Clear");
                                                                                                                                                                                                                                                                                        btnClear.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                                                                                                                                                                                        	
                                                                                                                                                                                                                                                                                        		clearResDetails();
                                                                                                                                                                                                                                                                                        	}
                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                        btnClear.setBounds(181, 614, 107, 27);
                                                                                                                                                                                                                                                                                        jPanel1.add(btnClear);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        JLabel lblReservationNo = new JLabel("Reservation No.");
                                                                                                                                                                                                                                                                                        lblReservationNo.setFont(new Font("Tahoma", Font.BOLD, 13));
                                                                                                                                                                                                                                                                                        lblReservationNo.setBounds(20, 337, 138, 14);
                                                                                                                                                                                                                                                                                        jPanel1.add(lblReservationNo);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        textField_2 = new JTextField();
                                                                                                                                                                                                                                                                                        textField_2.setEditable(false);
                                                                                                                                                                                                                                                                                        textField_2.setBounds(126, 330, 51, 27);
                                                                                                                                                                                                                                                                                        jPanel1.add(textField_2);
                                                                                                                                                                                                                                                                                        textField_2.setColumns(10);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        separator_3 = new JSeparator();
                                                                                                                                                                                                                                                                                        separator_3.setOrientation(SwingConstants.VERTICAL);
                                                                                                                                                                                                                                                                                        separator_3.setBounds(361, 1, 2, 323);
                                                                                                                                                                                                                                                                                        jPanel1.add(separator_3);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        JSeparator separator_4 = new JSeparator();
                                                                                                                                                                                                                                                                                        separator_4.setOrientation(SwingConstants.VERTICAL);
                                                                                                                                                                                                                                                                                        separator_4.setBounds(331, 323, 4, 363);
                                                                                                                                                                                                                                                                                        jPanel1.add(separator_4);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        spinField_3 = new JSpinField();
                                                                                                                                                                                                                                                                                        spinField_3.setBounds(93, 421, 102, 28);
                                                                                                                                                                                                                                                                                        jPanel1.add(spinField_3);
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                        spinField_4 = new JSpinField();
                                                                                                                                                                                                                                                                                        spinField_4.setBounds(93, 453, 102, 28);
                                                                                                                                                                                                                                                                                        jPanel1.add(spinField_4);
                
                allReservationsTable = new String[ allReservationsRows][0];
                allReservationsColum = new String[]{"Reservation Id","First Name","Last Name","Check-In", "Check-Out"};
                                                
                                                updateReservationTable = new String[ updateReservationRows][9];
                                                updateReservationColumns = new String[]{"Line No.","Room No.","Reservation No.","Last Name","CPR",
                                                		"Check-In", "Check-Out","Adult No.","Child No."};

        getAllFacilitiesTable = new String [ getAllFacilitiesRows][0];
        getAllFacilitiesColum = new String [] {"Facility Number", "Facility type", "Capacity", "Status","Price"};
        findReservationRoomIdFacilityTable = new String [findReservationRoomIdFacilityCprTableRows][0];
        findReservationRoomIdFacilityColum = new String [] {"Room No.", "First Name", "Last Name", "Reservation No."};
        cancelFacilityTable = new String [cancelFacilityRows][0];
        cancelFacilityColum = new String [] {"First Name", "Last Name", "Reservation No.","Facility","Date","Time"};
   	findResData = new String[7] [9];
   	findResColumns = new String[]{"First Name","Last Name","CPR","Reservation ID","From","To","Room No"};
    	findResData = new String[7] [9];
       	findResColumns = new String[]{"First Name","Last Name","CPR","Reservation ID","From","To","Room No"};
        roomsData = new String [roomsRows][0];
        roomsColumns = new String [] {"Room No.", "Type", "Status", "Decription", "Price", "Last Cleaned"};
                                                                                                                        
                                                                                                                       
                                                                                                                        displayEReservationsTable = new String[ 20][10];
                                                                                                                        displayEReservationsColumns = new String[]{"First Name", "Last Name", "CPR", "Status","Number of Participants",
                                                                                                                        		"Event","Event Id","Date","Start Time", "Event Status"};
        
        displayAllEventsTable = new String[ 20][9];
        displayAllEventsColumns = new String[]{"Event No.","Event","Date","Start Time","End Time",
         		"Description", "Max. Participants","Status","Employee Name"};
        bookSearchCprTable = new String [bookSearchCprTableRows][1];
        bookSearchCprTableColum = new String [] {"First Name","Last Name","CPR"};

        jMenu1.setText("Log Out");
        jMenuBar1.add(jMenu1);
        
        mntmLogOut = new JMenuItem("Log Out");
        mntmLogOut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
            	LogIn logIn = new LogIn();
        	}
        });
        jMenu1.add(mntmLogOut);

        jMenu3.setText("Exit");
        jMenuBar1.add(jMenu3);
        
        mntmExit = new JMenuItem("Exit");
        mntmExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	System.exit(0);
        	}
        });
        jMenu3.add(mntmExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTabbedPane1)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 722, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(101, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        jTabbedPane1.getAccessibleContext().setAccessibleName("Booking");

        pack();
        
       
    }// </editor-fold>
                                                      

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            
    
    
    
    
    private class AvailableRoomsBooking {

    	private JFrame frame;
    	private JTable table;
    	private String [][] data;
    	private String []columns;
    	private int rows;
    	
    	
    	public AvailableRoomsBooking() {
    		initialize();
    	}

    	private void initialize() {
    		
    		final RoomController roomCtr = new RoomController();
    		rows = roomCtr.getAllRoom().size();
    		
    		frame = new JFrame();
    		frame.setBounds(100, 100, 748, 406);
    		frame.getContentPane().setLayout(null);
    		frame.setVisible(true);
    		
    		JScrollPane scrollPane = new JScrollPane();
    		scrollPane.setBounds(10, 11, 712, 344);
    		frame.getContentPane().add(scrollPane);
    		
    		table = new JTable();
    		scrollPane.setViewportView(table);
    		data = new String [rows] [6];
    		columns = new String [] {"Room No.", "Type", "Status", "Decription", "Price", "Last Cleaned"};
    	
    		
    		for(int i=0; i< rows; i ++) {
    			
    			  String roomId = String.valueOf (roomCtr.getAllRoom().get(i).getRoomId());
    			  String type =  roomCtr.getAllRoom().get(i).getRoomType();
    			  String status = roomCtr.getAllRoom().get(i).getStatus();
    			  String description = roomCtr.getAllRoom().get(i).getDescription();
    			  String price = String.valueOf (roomCtr.getAllRoom().get(i).getPrice());
    			  String lastClean =  roomCtr.getAllRoom().get(i).getLastClean();
    			  
    			  
    			  data [i][0] = roomId ; 
    			  data [i][1] = type ; 
    			  data [i][2] = status ; 
    			  data [i][3] = description ; 
    			  data [i][4] = price ; 
    			  data [i][5] = lastClean ; 
    			
    			
    		}
    		
    		table.setModel(new DefaultTableModel(data,columns));
    		table.addMouseListener(new MouseAdapter() { 
                public void mouseClicked(MouseEvent e) { 
         
                            e.consume(); 
                        JTable target = (JTable)e.getSource(); 
                       int row = target.getSelectedRow(); 
                        
                       if(e.getClickCount()==1){ 
                  
                      
                      
                    String roomId1 = data [row][0];
                   int roomId = Integer.parseInt(roomId1);
                    
                 setSelectedRoomToBooking(roomCtr.searchRoomsId(roomId));
                 jTextPane1.setText(roomCtr.searchRoomsId(roomId).getDescription());
                 frame.setVisible(false);  
                    
                                        
                       } 
             
                } 
             });
    	}
    }
    
   private void addReservationLine() {
    	
    	ReservationLine roomLine = new ReservationLine();
    	ReservationController reservationCtr= new ReservationController();
    	RoomController roomCtr = new RoomController();
    	Reservation reservation =  new Reservation();
    	java.util.Date utilStartDate = dateChooser.getDate(); 
    	java.sql.Date checkInDate = new java.sql.Date(utilStartDate.getTime());
    	String checkIn = checkInDate.toString();
    	
    	
    	java.util.Date utilStartDate2 = dateChooser_1.getDate(); 
    	java.sql.Date checkOutDate = new java.sql.Date(utilStartDate2.getTime());
    	String checkOut = checkOutDate.toString();
    	
    	
    	int child = spinField_3.getValue();
    	int adult = spinField_4.getValue();

    	
    	roomLine= new ReservationLine();
    	roomLine.setRoom(roomCtr.searchRoomsId(Integer.parseInt(jTextField12_1.getText())));
    	roomLine.setChildrenNo(child);
    	roomLine.setAdultNo(adult);
    	roomLine.setCheckIn(checkIn);
    	roomLine.setCheckOut(checkOut);
    	
    	reservation = reservationCtr.searchReservationRoomId(roomLine.getRoom().getRoomId());
    	
    	String rlDateIn = roomLine.getCheckIn() ;
    	String rlDateOut = roomLine.getCheckOut();
    	
    	
    	Date resLineDateIn= Date.valueOf(rlDateIn);
    	Date resLineOutDat = Date.valueOf(rlDateOut);
    	
    	int compareDate = resLineDateIn.compareTo(resLineOutDat);
    	
    	if(compareDate>0){
    		
    		JOptionPane.showMessageDialog(null,"Please type correct dates !");
    		
    		roomLine.setCheckIn("0");
    	}
    	
    	for(int i=0; reservation.getReservationLines().size()>i;i++){
    		
    		 
    		
    	String chD = reservation.getReservationLines().get(i).getCheckIn() ;
    	String chopD = reservation.getReservationLines().get(i).getCheckOut();
    	
    	String chOD = roomLine.getCheckOut() ;
    	
    	Date inDat= Date.valueOf(chD);
    	Date outDat = Date.valueOf(chOD);
    	
    	int compare = inDat.compareTo(outDat);
    	
    	
    	if(compare<0 && reservation.getStatusId().equals("pending")){
        	
    		JOptionPane.showMessageDialog(null,"The room is occupied from :"+ inDat+ " to: "+chopD+ " !");
    		roomLine.setRoom(null);
    		i = 100; 
        }
    	
    	
    	}
    	
    	if (roomLine.getRoom().getStatus().equals("occupied")){
    		
    		JOptionPane.showMessageDialog(null,"The room is occupied!");
    		
    		roomLine.setRoom(null);
    		
    	}
    	
    	
    	reservationCtr.insertRerservationine(roomLine,Integer.parseInt(textField_2.getText()));
    	
    	reservation = reservationCtr.searchReservationId(Integer.parseInt(textField_2.getText()));
    	
    	double p = 0 ; 
    	double d =0;
    	
    	for(int i=0; reservation.getReservationLines().size()>i;i++){
    		
    		d= (d+((reservation.getReservationLines().get(i).getRoom().getPrice())/2));
    		p= (p+((reservation.getReservationLines().get(i).getRoom().getPrice())));
    	
    		reservation.setDeposit(d);
    		reservation.setTotalPrice(p);

    	}
    	
    	reservationCtr.updateReservation(reservation);
    	
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

   
    	jTextPane2.setText(reservationStatus + resLines+ rPrice);
    	
    }
    
    

    
    
    private void setSelectedRoomToBooking(Room room) {
    	
          this.room = room;
    		String SelectedRoom = String.valueOf(room.getRoomId());
    		jTextField12_1.setText(SelectedRoom);
    		
    
    }
    
    
    private void addReservation() {                                          
        
    	Reservation reservation =  new Reservation();
    	ReservationController reservationCtr = new ReservationController();
    	UserController userCtr = new UserController();
    	Guest guest = new Guest();
    	
    	
    	guest = userCtr.searchGuest(textField_1.getText());
    	
    	reservation.setGuest(guest);
    	reservation.setStatusId("pending");
    	reservation.setTotalPrice(0);
    	reservation.setDeposit(0);
    	reservation.setPackageId(0);
    	
    	reservationCtr.createReservation(reservation);
    	
    	textField_2.setText(String.valueOf(reservationCtr.getMaxReservationId()));
    	
    	reservationStatus =String.format( "Reservation ID: %s %nFirst Name: %s %nLastName: %s%n " +
    			"__________________________________________%n" ,
    	String.valueOf(reservationCtr.getMaxReservationId()),
		reservation.getGuest().getfName(),reservation.getGuest().getlName());

    	jTextPane2.setText(reservationStatus);
    } 
    
    public void findGuestCprBooking() {
    	
      	final UserController userCtr = new UserController();
      	String cpr = jTextField8.getText();
    	
    	bookSearchCprTableRows = userCtr.searchMultiGuestCpr(cpr).size();
    	bookSearchCprTable = new String [bookSearchCprTableRows][3];
    	bookSearchCprTableColum = new String []{"First Name","Last Name","CPR"};
    	
    	for(int i=0; i < bookSearchCprTableRows; i++) {
    		
    		
    		String fName = userCtr.searchMultiGuestCpr(cpr).get(i).getfName();
    		String lName = userCtr.searchMultiGuestCpr(cpr).get(i).getlName();
    		String cpr1 = userCtr.searchMultiGuestCpr(cpr).get(i).getCpr();
    		
    		bookSearchCprTable[i][0] = fName;
    		bookSearchCprTable[i][1] = lName;
    		bookSearchCprTable[i][2] = cpr1;
    		
    	}
    	
    	jTable2.setModel(new DefaultTableModel(bookSearchCprTable, bookSearchCprTableColum));
     	jTable2.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
     
                        e.consume(); 
                    JTable target = (JTable)e.getSource(); 
                   int row = target.getSelectedRow(); 
                    
                   if(e.getClickCount()==1){ 
              
                  
                  
                  	 String cpr2 = bookSearchCprTable [row][2];
                 
                  	
                jTextField1.setText(userCtr.searchGuest(cpr2).getfName());
                jTextField2.setText(userCtr.searchGuest(cpr2).getlName());
                jTextField3.setText(userCtr.searchGuest(cpr2).getAddress());
                jTextField4.setText(userCtr.searchGuest(cpr2).getCountry());
                jTextField5.setText(userCtr.searchGuest(cpr2).getEmail());
                jTextField6.setText(userCtr.searchGuest(cpr2).getPhone());
                if(userCtr.searchGuest(cpr2).getTravelAgency() != null ) {
                jTextField7.setText(userCtr.searchGuest(cpr2).getTravelAgency().getTravelAgencyName());
                }
                
                textField_1.setText(userCtr.searchGuest(cpr2).getCpr());
                
                
                
                                    
                   } 
                   

         
            } 
         });
    	
    	
    }
    
   public void clearResDetails(){ 
        
        
        jTextField1.setText(null); 
        jTextField2.setText(null); 
        jTextField3.setText(null); 
        jTextField4.setText(null); 
        jTextField5.setText(null); 
        jTextField6.setText(null); 
        jTextField7.setText(null); 
        textField_1.setText(null); 
        textField_2.setText(null); 
        spinField_3.setValue(0); 
        spinField_4.setValue(0); 
        jTextField12_1.setText(null); 
        jTextPane1.setText(null); 
        jTextPane2.setText(null); 
         
   }
   
     public void deleteReservation(){ 
       
       reservationCtr =  new ReservationController(); 
       reservationCtr.deleteReservation(reservationCtr.getMaxReservationId()); 
       clearResDetails(); 
        
  }
		
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private JTextField jTextField12_1;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private Calendar cal = Calendar.getInstance();
    
    
    private String [] [] upData;
    private int upDataRows;
    private String[] upDataColumns;
    
    private String [] [] roomsData;
    private String [] roomsColumns;
    private int roomsRows;
    private String status;
    private  Room room ;
    
    private String [][] bookSearchCprTable;
    private String [] bookSearchCprTableColum;
    private int bookSearchCprTableRows;
    private JTextField textField_1;
    private JButton btnClear;
    
    private JTextField textField_2;
    
    private String childNo;
    private String adultNo;
    
    private JDateChooser dateChooser ;
    private JDateChooser dateChooser_1;
    
    private JDateChooser dateChooser_4;
    private JDateChooser dateChooser_5;

    private String [][] findReservationRoomIdFacilityTable;
    private String [] findReservationRoomIdFacilityColum;
    private int findReservationRoomIdFacilityCprTableRows;
    private String facilityTimeZone;
    
    
    private int fID;
    private String [][] getAllFacilitiesTable;
    private String [] getAllFacilitiesColum;
    private int getAllFacilitiesRows;
    
    
    private JDateChooser dateChooser_3 ;
    
    private String [][] cancelFacilityTable;
    private String [] cancelFacilityColum;
    private int cancelFacilityRows;
    
    private String [][] allReservationsTable;
    private String [] allReservationsColum;
    private int allReservationsRows;
    
    
    
    private String [][] updateReservationTable;
    private String [] updateReservationColumns;
    private int updateReservationRows;
    
    private String [][] displayAllEventsTable;
    private String [] displayAllEventsColumns;
    private int displayAllEventsRows;
    
    private String [][] displayEReservationsTable;
    private String []  displayEReservationsColumns;
    private int  displayEReservationsRows;
    
    
  	private  String gFLID;
  	private int rlnId;
  	private String updateResId;
  	private JSeparator separator_3;
  	private String eventGuestCpr;
  	private int eventId;
  	private String instructor;
  	
  	 private int findResRows;
	 private String [][] findResData ; 
	 private String []  findResColumns;
	 
	    private ReservationController reservationCtr;
		private DBFacility dbFacility;
		private ReservationLine rLine;
		private Reservation reserv;
		private RoomController roomCtr;
		private EventController eventCtr;
		private Event event;
		private UserController userCtr;
		private DBUser dbUser;
		private Guest guest;
		private DBEventReservation dbEreservation;
		private EventReservation eReservation;
		private EventReservation eventReservation;
		private Packages packages;
		private int packageId;
		

	    private String [][] allPackagesTable;
	    private String [] allPackagesColum;
	    private int allPackagesRows;
	    private JSpinField spinField_3;
	    private JSpinField spinField_4;
	    private JMenuItem mntmLogOut;
	    private JMenuItem mntmExit;
}


