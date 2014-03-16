
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
import javax.swing.JOptionPane;
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
import java.util.ArrayList;
import java.util.Calendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JSpinField;


public class GuestPanel extends javax.swing.JFrame {

   

	private int guestId;
	private String reservationStatus;
	private ReservationController reservCtr;
	
    public GuestPanel(int guestId) {
    	
    	 try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
    	
    	this.guestId=guestId;
    	setResizable(false);
		setTitle("Guest Menu");
		setVisible(true);
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        reservCtr =  new  ReservationController();
    }

    
    
    public GuestPanel() {
    	
   	 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuestPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   	
 
   	setResizable(false);
		setTitle("Guest Menu");
		setVisible(true);
       initComponents();
       setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
       reservCtr =  new  ReservationController();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setAlignmentX(Component.LEFT_ALIGNMENT);
        jPanel12 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jLabel72.setBounds(10, 147, 70, 23);
        jLabel72.setFont(new Font("SansSerif", Font.BOLD, 12));
        jScrollPane13 = new javax.swing.JScrollPane();
        jScrollPane13.setBounds(392, 43, 598, 234);
        jTable9 = new javax.swing.JTable();
        jLabel76 = new javax.swing.JLabel();
        jLabel76.setBounds(10, 122, 105, 14);
        jLabel76.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel77 = new javax.swing.JLabel();
        jLabel77.setBounds(10, 222, 60, 14);
        jLabel77.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel78 = new javax.swing.JLabel();
        jLabel78.setBounds(10, 263, 70, 14);
        jLabel78.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel79 = new javax.swing.JLabel();
        jLabel79.setBounds(10, 187, 98, 14);
        jLabel79.setFont(new Font("SansSerif", Font.BOLD, 12));
        jTextField43 = new javax.swing.JTextField();
        jTextField43.setBounds(118, 147, 136, 31);
        jComboBox8 = new javax.swing.JComboBox();
        jComboBox8.setBounds(118, 302, 70, 31);
        jLabel81 = new javax.swing.JLabel();
        jLabel81.setBounds(10, 310, 83, 14);
        jLabel81.setFont(new Font("SansSerif", Font.BOLD, 12));
        jButton26 = new javax.swing.JButton();
        jButton26.setBounds(118, 345, 131, 31);
        jButton26.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		bookFacility();
        	}
        });
        jLabel82 = new javax.swing.JLabel();
        jLabel82.setBounds(391, 2, 144, 17);
        jButton27 = new javax.swing.JButton();
        jButton27.setBounds(10, 602, 131, 31);
        jButton27.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		deleteFacilityLine();
        	}
        });
        
        reservCtr =  new ReservationController();
        jTextField48 = new javax.swing.JTextField();
        jTextField48.setBounds(118, 114, 57, 31);
        jTextField48.setText(String.valueOf(reservCtr.searchReservationGusestId(guestId).getReservationId())) ;
        jTextField48.setEditable(false);
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator7.setBounds(329, 2, 8, 0);
        jButton29 = new javax.swing.JButton();
        jButton29.setBounds(397, 287, 105, 37);
        jButton29.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		displayAllFacilities();
        		
        	}
        });
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator11.setBounds(979, 257, 0, 12);
        jLabel101 = new javax.swing.JLabel();
        jLabel101.setBounds(0, 2, 157, 17);
        
                jLabel72.setText("Facility ");
                
                jTable9.setModel(new DefaultTableModel(getAllFacilitiesTable , getAllFacilitiesColum));
                
                jScrollPane13.setViewportView(jTable9);
                
                        jLabel76.setText("Reservation No");
                        
                                jLabel77.setText("Date");
                                
                                        jLabel78.setText("Time");
                                        
                                                jLabel79.setText("No. of people");
                                                
                                                        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--------", "Yes", "No" }));
                                                        jComboBox8.addItemListener(new ItemListener() {
                                                        public void itemStateChanged(ItemEvent e) {
                                                           String number1 = (String)jComboBox8.getSelectedItem();
              	                                                    instructor = number1;
                                                            	}                                                                                                      	
                                                             });
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                        
                                                                jLabel81.setText("Instructor");
                                                                
                                                                        jButton26.setText("Book Facility");
                                                                        
                                                                                jLabel82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                jLabel82.setText("Facilities Information");
                                                                                
                                                                                        jButton27.setText("Cancel booking");
                                                                                        
                                                                                                jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
                                                                                                
                                                                                                        jButton29.setText("Show");
                                                                                                                
                                                                                                                        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                        jLabel101.setText("Book facility to a guest");
                                                                                                                        
                                                                                                                                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                                                                                                                                jPanel4Layout.setHorizontalGroup(
                                                                                                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addGap(19)
                                                                                                                                			.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, 1000, GroupLayout.PREFERRED_SIZE)
                                                                                                                                			.addContainerGap(95, Short.MAX_VALUE))
                                                                                                                                );
                                                                                                                                jPanel4Layout.setVerticalGroup(
                                                                                                                                	jPanel4Layout.createParallelGroup(Alignment.LEADING)
                                                                                                                                		.addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                                			.addContainerGap()
                                                                                                                                			.addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, 671, GroupLayout.PREFERRED_SIZE)
                                                                                                                                			.addContainerGap(116, Short.MAX_VALUE))
                                                                                                                                );
                                                                                                                                jPanel4.setLayout(jPanel4Layout);
                                                                                                                                jPanel12.setLayout(null);
                                                                                                                                jPanel12.add(jButton26);
                                                                                                                                jPanel12.add(jButton27);
                                                                                                                                jPanel12.add(jLabel72);
                                                                                                                                jPanel12.add(jLabel76);
                                                                                                                                jPanel12.add(jLabel79);
                                                                                                                                jPanel12.add(jLabel77);
                                                                                                                                jPanel12.add(jLabel78);
                                                                                                                                jPanel12.add(jLabel81);
                                                                                                                                jPanel12.add(jTextField48);
                                                                                                                                jPanel12.add(jTextField43);
                                                                                                                                jPanel12.add(jComboBox8);
                                                                                                                                jPanel12.add(jLabel101);
                                                                                                                                jPanel12.add(jSeparator7);
                                                                                                                                jPanel12.add(jSeparator11);
                                                                                                                                jPanel12.add(jLabel82);
                                                                                                                                jPanel12.add(jButton29);
                                                                                                                                jPanel12.add(jScrollPane13);
                                                                                                                                
                                                                                                                                final JComboBox comboBox = new JComboBox();
                                                                                                                                comboBox.setBounds(118, 260, 136, 31);
                                                                                                                                comboBox.setModel(new DefaultComboBoxModel(new String[] {"-------------------", "8:00 - 9:00", "9:00 - 10:00 ", "10:00 - 11:00 ", "11:00 - 12:00 ", "12:00 - 13:00 ", "13:00 - 14:00 ", "14:00 - 15:00 ", "15:00 - 16:00 ", "16:00 - 17:00 ", "17:00 - 18:00 ", "18:00 - 19:00 ", "19:00 - 20:00 "}));
                                                                                                                                jPanel12.add(comboBox);
                                                                                                                                
                                                                                                                                comboBox.addItemListener(new ItemListener() {
                                                                                                                                	

			public void itemStateChanged(ItemEvent e) {
                                                                                                                                		String number1 = (String)comboBox.getSelectedItem();
                                                                                                                                		facilityTimeZone = number1;
                                                                                                                                	}
                                                                                                                                	
                                                                                                                                });
                                                                                                                                
                                                                                                                                table_2 = new JTable();
                                                                                                                                table_2.setBounds(12, 447, 287, 0);
                                                                                                                                jPanel12.add(table_2);
                                                                                                                                
                                                                                                                                button = new JButton("Find");
                                                                                                                                button.setBounds(183, 419, 89, 26);
                                                                                                                                button.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                		
                                                                                                                                		findFacilityCancel();
                                                                                                                                		
                                                                                                                                	}
                                                                                                                                });
                                                                                                                                jPanel12.add(button);
                                                                                                                                
                                                                                                                                scrollPane_1 = new JScrollPane();
                                                                                                                                scrollPane_1.setBounds(10, 453, 362, 148);
                                                                                                                                jPanel12.add(scrollPane_1);
                                                                                                                                
                                                                                                                                table_3 = new JTable();
                                                                                                                                scrollPane_1.setViewportView(table_3);
                                                                                                                                table_3.setModel(new DefaultTableModel(cancelFacilityTable, cancelFacilityColum));
                                                                                                                                
                                                                                                                                dateChooser_2 = new JDateChooser();
                                                                                                                                dateChooser_2.setBounds(118, 218, 136, 33);
                                                                                                                                jPanel12.add(dateChooser_2);
                                                                                                                                
                                                                                                                                JLabel lblCancelFacilityBoking = new JLabel();
                                                                                                                                lblCancelFacilityBoking.setBounds(10, 396, 157, 17);
                                                                                                                                lblCancelFacilityBoking.setText("Cancel facility booking");
                                                                                                                                lblCancelFacilityBoking.setFont(new Font("Tahoma", Font.BOLD, 14));
                                                                                                                                jPanel12.add(lblCancelFacilityBoking);
                                                                                                                                
                                                                                                                                separator = new JSeparator();
                                                                                                                                separator.setBounds(10, 382, 362, 2);
                                                                                                                                jPanel12.add(separator);
                                                                                                                                
                                                                                                                                separator_1 = new JSeparator();
                                                                                                                                separator_1.setBounds(371, 2, 8, 2);
                                                                                                                                separator_1.setOrientation(SwingConstants.VERTICAL);
                                                                                                                                jPanel12.add(separator_1);
                                                                                                                                
                                                                                                                                separator_2 = new JSeparator();
                                                                                                                                separator_2.setBounds(371, 6, 14, 378);
                                                                                                                                separator_2.setOrientation(SwingConstants.VERTICAL);
                                                                                                                                jPanel12.add(separator_2);
                                                                                                                                
                                                                                                                                
                                                                                                                                
                                                                                                                               spinField_1 = new JSpinField();
                                                                                                                                spinField_1.setBounds(118, 184, 131, 31);
                                                                                                                                jPanel12.add(spinField_1);
                                                                                                                                
                                                                                                                                        jTabbedPane1.addTab("Facilities", jPanel4);
                                                                                                                                                                                                                                                                                                                                                                                               jTable15 = new javax.swing.JTable();
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               allPackagesTable = new String[10] [4];
                                                                                                                                                                                                                                                                                                                                                                                               allPackagesColum = new String[]{"Package ID","Description","Discount","Status"};
                
                allReservationsTable = new String[ allReservationsRows][0];
                allReservationsColum = new String[]{"Reservation Id","First Name","Last Name","Check-In", "Check-Out"};
                                                
                                                updateReservationTable = new String[ updateReservationRows][9];
                                                updateReservationColumns = new String[]{"Line No.","Room No.","Reservation No.","Last Name","CPR",
                                                		"Check-In", "Check-Out","Adult No.","Child No."};
                                                                                                                                                                                                                        jPanel13 = new javax.swing.JPanel();
                                                                                                                                                                                                                        jPanel17 = new javax.swing.JPanel();
                                                                                                                                                                                                                        jPanel17.setBounds(291, 0, 939, 217);
                                                                                                                                                                                                                        jScrollPane21 = new javax.swing.JScrollPane();
                                                                                                                                                                                                                        jScrollPane21.setBounds(6, 30, 776, 187);
                                                                                                                                                                                                                        jTable14 = new javax.swing.JTable();
                                                                                                                                                                                                                        jLabel106 = new javax.swing.JLabel();
                                                                                                                                                                                                                        jLabel106.setBounds(6, 0, 47, 17);
                                                                                                                                                                                                                        jLabel86 = new javax.swing.JLabel();
                                                                                                                                                                                                                        jLabel86.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                                                                                                        jLabel86.setBounds(10, 170, 50, 14);
                                                                                                                                                                                                                        jLabel88 = new javax.swing.JLabel();
                                                                                                                                                                                                                        jLabel88.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                                                                                                        jLabel88.setBounds(10, 55, 66, 22);
                                                                                                                                                                                                                        jLabel89 = new javax.swing.JLabel();
                                                                                                                                                                                                                        jLabel89.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                                                                                                        jLabel89.setBounds(10, 89, 65, 22);
                                                                                                                                                                                                                        jLabel90 = new javax.swing.JLabel();
                                                                                                                                                                                                                        jLabel90.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                                                                                                        jLabel90.setBounds(10, 29, 50, 14);
                                                                                                                                                                                                                        jLabel93 = new javax.swing.JLabel();
                                                                                                                                                                                                                        jLabel93.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                                                                                                        jLabel93.setBounds(10, 196, 80, 22);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                jScrollPane21.setViewportView(jTable14);
                                                                                                                                                                                                                                jTable14.setModel(new DefaultTableModel(
                                                                                                                                                                                                                                	new Object[][] {
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                		{null, null, null, null, null, null, null, null, null},
                                                                                                                                                                                                                                	},
                                                                                                                                                                                                                                	new String[] {
                                                                                                                                                                                                                                		"Event No.", "Event", "Date", "Start Time", "End Time", "Description", "Max. Participants", "Status", "Employee Name"
                                                                                                                                                                                                                                	}
                                                                                                                                                                                                                                ));
                                                                                                                                                                                                                                jTable14.getColumnModel().getColumn(6).setPreferredWidth(107);
                                                                                                                                                                                                                                jTable14.getColumnModel().getColumn(8).setPreferredWidth(111);
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                                                                                                                                        jLabel106.setText("Events");
                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                        jTable14.addMouseListener(new MouseAdapter() { 
                                                                                                                                                                                                                                            public void mouseClicked(MouseEvent e) { 
     
                                                                                                                                                                                                                                                        e.consume(); 
                                                                                                                                                                                                                                                    JTable target = (JTable)e.getSource(); 
                                                                                                                                                                                                                                                   int row = target.getSelectedRow(); 
                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                   if(e.getClickCount()==1){ 

                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                   jTextField65.setText(displayAllEventsTable[row][1]);
                                                                                                                                                                                                                                                   eventId = Integer.parseInt(displayAllEventsTable[row][0]);
                                                                                                                                                                                                                                                   eventGuestCpr = (displayAllEventsTable[row][2]);

                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                   } 
      
                                                                                                                                                                                                                                            } 
                                                                                                                                                                                                                                         });	
                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                jLabel86.setText("Event");
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        jLabel88.setText("First Name");
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                jLabel89.setText("Last Name");
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                        jLabel90.setText("CPR");
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                jLabel93.setText("No. of people");
                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                        jTabbedPane1.addTab("Book Event", jPanel13);
                                                                                                                                                                                                                                                                                                        jPanel13.setLayout(null);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jLabel86);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jLabel90);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jLabel89);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jLabel88);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jLabel93);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jPanel17);
                                                                                                                                                                                                                                                                                                        jPanel17.setLayout(null);
                                                                                                                                                                                                                                                                                                        jPanel17.add(jLabel106);
                                                                                                                                                                                                                                                                                                        jPanel17.add(jScrollPane21);
                                                                                                                                                                                                                                                                                                        reservCtr =  new ReservationController();
                                                                                                                                                                                                                                                                                                        jTextField61 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                                                        jTextField61.setBounds(88, 22, 136, 28);
                                                                                                                                                                                                                                                                                                        jTextField61.setText(reservCtr.
                                                                                                                                                                                                                                                                                                        searchReservationGusestId(guestId).getGuest().getCpr());
                                                                                                                                                                                                                                                                                                        reservCtr =  new ReservationController();
                                                                                                                                                                                                                                                                                                        jPanel13.add(jTextField61);
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                        jTextField62 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                                                        jTextField62.setBounds(88, 52, 136, 28);
                                                                                                                                                                                                                                                                                                        jTextField62.setEditable(false);
                                                                                                                                                                                                                                                                                                        jTextField62.setText(reservCtr.
                                                                                                                                                                                                                                                                                                                searchReservationGusestId(guestId).getGuest().getfName());
                                                                                                                                                                                                                                                                                                        jPanel13.add(jTextField62);
                                                                                                                                                                                                                                                                                                        reservCtr =  new ReservationController();
                                                                                                                                                                                                                                                                                                        jTextField63 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                                                        jTextField63.setBounds(87, 85, 136, 31);
                                                                                                                                                                                                                                                                                                        jTextField63.setEditable(false);
                                                                                                                                                                                                                                                                                                        jTextField63.setText(reservCtr.
                                                                                                                                                                                                                                                                                                                searchReservationGusestId(guestId).getGuest().getlName());
                                                                                                                                                                                                                                                                                                        jPanel13.add(jTextField63);
                                                                                                                                                                                                                                                                                                        jButton35 = new javax.swing.JButton();
                                                                                                                                                                                                                                                                                                        jButton35.setBounds(0, 263, 254, 32);
                                                                                                                                                                                                                                                                                                        jButton35.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                                                                                                                                                                                                        		
                                                                                                                                                                                                                                                                                                        		bookEvent();
                                                                                                                                                                                                                                                                                                        	}
                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                        jPanel13.add(jButton35);
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                jButton35.setText("Book event");
                                                                                                                                                                                                                                                                                                                        jLabel105 = new javax.swing.JLabel();
                                                                                                                                                                                                                                                                                                                        jLabel105.setBounds(6, 0, 80, 17);
                                                                                                                                                                                                                                                                                                                        jPanel13.add(jLabel105);
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                jLabel105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                                                                                                                                                                                                                                jLabel105.setText("Book Event");
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                JSeparator separator_8 = new JSeparator();
                                                                                                                                                                                                                                                                                                                                separator_8.setBounds(6, 340, 1350, 14);
                                                                                                                                                                                                                                                                                                                                jPanel13.add(separator_8);
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                JScrollPane scrollPane_2 = new JScrollPane();
                                                                                                                                                                                                                                                                                                                                scrollPane_2.setBounds(10, 354, 758, 265);
                                                                                                                                                                                                                                                                                                                                jPanel13.add(scrollPane_2);
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                table_4 = new JTable();
                                                                                                                                                                                                                                                                                                                                scrollPane_2.setViewportView(table_4);
                                                                                                                                                                                                                                                                                                                                table_4.setModel(new DefaultTableModel(displayEReservationsTable, displayEReservationsColumns));
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                table_4.addMouseListener(new MouseAdapter() { 
                                                                                                                                                                                                                                                                                                                                    public void mouseClicked(MouseEvent e) { 
                                                                                                     
                                                                                                                                                                                                                                                                                                                                                e.consume(); 
                                                                                                                                                                                                                                                                                                                                            JTable target = (JTable)e.getSource(); 
                                                                                                                                                                                                                                                                                                                                           int row = target.getSelectedRow(); 
                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                           if(e.getClickCount()==1){ 

                                                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                           textField_15.setText(displayEReservationsTable[row][1]);
                                                                                                                                                                                                                                                                                                                                           textField_14.setText(displayEReservationsTable[row][5]);
                                                                                                                                                                                                                                                                                                                                           eventId = Integer.parseInt(displayEReservationsTable[row][6]);
                                                                                                                                                                                                                                                                                                                                           eventGuestCpr = (displayEReservationsTable[row][2]);

                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                           } 
                                                                                                      
                                                                                                                                                                                                                                                                                                                                    } 
                                                                                                                                                                                                                                                                                                                                 });
                                                                                                                        
                                                                                                                        JLabel lblNewLabel = new JLabel("Update Reservation");
                                                                                                                        lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 15));
                                                                                                                        lblNewLabel.setBounds(815, 349, 238, 31);
                                                                                                                        jPanel13.add(lblNewLabel);
                                                                                                                        
                                                                                                                        JLabel lblNumberOfParticipants = new JLabel("No. Of People");
                                                                                                                        lblNumberOfParticipants.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                        lblNumberOfParticipants.setBounds(815, 459, 128, 29);
                                                                                                                        jPanel13.add(lblNumberOfParticipants);
                                                                                                                        
                                                                                                                        JButton btnUpdate_2 = new JButton("Update");
                                                                                                                        btnUpdate_2.setBounds(907, 505, 105, 32);
                                                                                                                        btnUpdate_2.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                        		updateEventReservation();
                                                                                                                        		
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        jPanel13.add(btnUpdate_2);
                                                                                                                        
                                                                                                                        JButton btnDeleteFrom = new JButton("Delete");
                                                                                                                        btnDeleteFrom.setBounds(170, 631, 121, 28);
                                                                                                                        btnDeleteFrom.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                        		
                                                                                                                        		deleteEventReservation();
                                                                                                                        		
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        jPanel13.add(btnDeleteFrom);
                                                                                                                        
                                                                                                                        textField_14 = new JTextField();
                                                                                                                        textField_14.setBounds(897, 426, 115, 29);
                                                                                                                        jPanel13.add(textField_14);
                                                                                                                        textField_14.setColumns(10);
                                                                                                                        
                                                                                                                        textField_15 = new JTextField();
                                                                                                                        textField_15.setBounds(897, 386, 115, 28);
                                                                                                                        jPanel13.add(textField_15);
                                                                                                                        textField_15.setColumns(10);
                                                                                                                        
                                                                                                                        JLabel lblNewLabel_1 = new JLabel("Guest Name");
                                                                                                                        lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                        lblNewLabel_1.setBounds(815, 392, 70, 17);
                                                                                                                        jPanel13.add(lblNewLabel_1);
                                                                                                                        
                                                                                                                        JLabel lblEvent = new JLabel("Event");
                                                                                                                        lblEvent.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                        lblEvent.setBounds(815, 433, 46, 14);
                                                                                                                        jPanel13.add(lblEvent);
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                                        JButton btnEvents = new JButton("Display All Events");
                                                                                                                        btnEvents.setBounds(301, 221, 143, 28);
                                                                                                                        jPanel13.add(btnEvents);
                                                                                                                        
                                                                                                                        btnAdd = new JButton("Add to booking");
                                                                                                                        btnAdd.setBounds(143, 116, 136, 31);
                                                                                                                        jPanel13.add(btnAdd);
                                                                                                                        jTextField65 = new javax.swing.JTextField();
                                                                                                                        jTextField65.setBounds(88, 163, 136, 28);
                                                                                                                        jPanel13.add(jTextField65);
                                                                                                                        jTextField65.setEditable(false);
                                                                                                                        
                                                                                                                        JSeparator separator_10 = new JSeparator();
                                                                                                                        separator_10.setBounds(10, 154, 271, 14);
                                                                                                                        jPanel13.add(separator_10);
                                                                                                                        
                                                                                                                        JSeparator separator_11 = new JSeparator();
                                                                                                                        separator_11.setOrientation(SwingConstants.VERTICAL);
                                                                                                                        separator_11.setBounds(282, -4, 9, 344);
                                                                                                                        jPanel13.add(separator_11);
                                                                                                                        
                                                                                                                        separator_12 = new JSeparator();
                                                                                                                        separator_12.setBounds(10, 229, 271, 2);
                                                                                                                        jPanel13.add(separator_12);
                                                                                                                        
                                                                                                                        JButton btnNewButton_1 = new JButton("All Event Reservations");
                                                                                                                        btnNewButton_1.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent arg0) {
                                                                                                                        		displayAllEReservations();
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        btnNewButton_1.setBounds(10, 631, 155, 28);
                                                                                                                        jPanel13.add(btnNewButton_1);
                                                                                                                        
                                                                                                                        JSeparator separator_13 = new JSeparator();
                                                                                                                        separator_13.setOrientation(SwingConstants.VERTICAL);
                                                                                                                        separator_13.setBounds(780, 340, 9, 346);
                                                                                                                        jPanel13.add(separator_13);
                                                                                                                        
                                                                                                                        spinField = new JSpinField();
                                                                                                                        spinField.setBounds(88, 195, 136, 28);
                                                                                                                        jPanel13.add(spinField);
                                                                                                                        
                                                                                                                       spinField_2 = new JSpinField();
                                                                                                                        spinField_2.setBounds(897, 460, 115, 28);
                                                                                                                        jPanel13.add(spinField_2);
                                                                                                                        btnAdd.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                        		
                                                                                                                        		findGuestCpr();
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        btnEvents.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                        		
                                                                                                                        		displayAllEvents();
                                                                                                                        		
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        

                                                                                                                       
                                                                                                                          

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
        
        JMenuItem mntmExit = new JMenuItem("Exit");
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
                    
                 frame.setVisible(false);  
                    
                                        
                       } 
             
                } 
             });
    	}
    }
    
    
    public void setGuestId( int guestId){
    	
    	
    	this.guestId= guestId;
    	
    }
    
   public int getGuestId(){
    	
    	
    	return guestId;
    	
    }
    
    
    
    private void findFacilityCancel() { 
        
        
        
        reservationCtr =  new ReservationController(); 
        reserv =  new Reservation();  
                   
        reserv =  reservationCtr.searchReservationFGuestId(guestId); 
     
        cancelFacilityRows= reserv.getFacilityLines().size(); 
          cancelFacilityTable = new String [cancelFacilityRows][7]; 
          cancelFacilityColum = new String []{"First Name", "Last Name", "Reservation No.","Facility","Date","Time","ID"}; 
   
           
          for(int i=0; i < cancelFacilityRows; i++) { 
                
                
 
               String fN = reserv.getGuest().getfName(); 
               String lN = reserv.getGuest().getlName(); 
               String reservation = String.valueOf(reserv.getReservationId()); 
               String facility = reserv.getFacilityLines().get(i).getFacility().getFacilityType(); 
               String date = reserv.getFacilityLines().get(i).getFacilityDate(); 
                String time = reserv.getFacilityLines().get(i).getFacilityTime(); 
                String fLID = String.valueOf(reserv.getFacilityLines().get(i).getFacilityLineId()); 
                 
                 
                 
               cancelFacilityTable[i][0] = fN; 
               cancelFacilityTable[i][1] = lN; 
               cancelFacilityTable[i][2] = reservation; 
               cancelFacilityTable[i][3] = facility; 
               cancelFacilityTable[i][4] = date; 
               cancelFacilityTable[i][5] = time; 
               cancelFacilityTable[i][6] = fLID; 
 
          } 
          
     table_3.setModel(new DefaultTableModel(cancelFacilityTable,cancelFacilityColum)); 
      
     table_3.addMouseListener(new MouseAdapter() {  
         public void mouseClicked(MouseEvent e) {  
   
                     e.consume();  
                 JTable target = (JTable)e.getSource();  
                int row = target.getSelectedRow();  
                  
                if(e.getClickCount()==1){  
            
                
                
                    gFLID = cancelFacilityTable [row][6]; 
                     
                     
              
                }  
                 
 
       
         }  
      }); 
 
    }

    

    
    public void deleteFacilityLine(){ 
        
        try{ 
         
         reservationCtr =  new ReservationController(); 
         reservationCtr.deleteFacilityLine(Integer.valueOf(gFLID)); 

                          
                        JOptionPane.showMessageDialog(null,"Facility reservation was deleted!"); 
                            } 
              catch(Exception e){ 
                                 JOptionPane.showMessageDialog(null,"Error! Please try again!"); 
                                  
                            } 
                          
                          
                        findFacilityCancel(); 
         
         
         
   }
    
    
    private void displayAllFacilities(){
    
    	
    	reservationCtr =  new ReservationController();
    	
    	
    	
      	
    	
    	getAllFacilitiesRows = reservationCtr.getAllFacilities().size();
    	getAllFacilitiesTable = new String [getAllFacilitiesRows][5];
    	getAllFacilitiesColum = new String []{"Facility Number", "Facility type", "Capacity", "Status","Price"};
    	
    	for(int i=0; i < getAllFacilitiesRows; i++) {
    		
    		
    		String fN = String.valueOf(reservationCtr.getAllFacilities().get(i).getFacilityId());
    		String fType = reservationCtr.getAllFacilities().get(i).getFacilityType();
    		String capacity = reservationCtr.getAllFacilities().get(i).getCapacity();
    		String status = reservationCtr.getAllFacilities().get(i).getStatus();
    		String price = String.valueOf(reservationCtr.getAllFacilities().get(i).getFacilityPrice());
    		
    		getAllFacilitiesTable[i][0] = fN;
    		getAllFacilitiesTable[i][1] = fType;
    		getAllFacilitiesTable[i][2] = capacity;
    		getAllFacilitiesTable[i][3] = status;
    		getAllFacilitiesTable[i][4] = price;
    		
    		
    	}
    	
    	jTable9.setModel(new DefaultTableModel(getAllFacilitiesTable,getAllFacilitiesColum));
     	jTable9.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
     
                        e.consume(); 
                    JTable target = (JTable)e.getSource(); 
                   int row = target.getSelectedRow(); 
                    
                   if(e.getClickCount()==1){ 
              
                  
                	   fID =Integer.parseInt(getAllFacilitiesTable [row][0]);
                  	 String fType = getAllFacilitiesTable [row][1];
                 
                  	jTextField43.setText(fType);
                  	 
                }

            } 
         });
    	
    }
    
    
    
    private void bookFacility(){ 
        
        
        FacilityLine facilityLine = new FacilityLine(); 
        ReservationController reservationCtr= new ReservationController(); 
         
        int users = spinField_1.getValue(); 
         
        java.util.Date utilStartDate = dateChooser_2.getDate();  
        java.sql.Date date = new java.sql.Date(utilStartDate.getTime()); 
        String fDate = date.toString(); 
   
         
        facilityLine= new FacilityLine(); 
        facilityLine.setFacility(reservationCtr.searchFacilityId(fID)); 
        facilityLine.setFacilityDate(fDate); 
        facilityLine.setFacilityTime(facilityTimeZone); 
        facilityLine.setNoOfUsers(users); 
        facilityLine.setInstructor(instructor); 
         

         String day = String.valueOf(cal.getTime().getDate()); 
         String month = String.valueOf((cal.getTime().getMonth()) + 1); 
       String year = String.valueOf((cal.getTime().getYear()) + 1900); 
        
        
        
       if(day.length()==1){ 
             
            day =("0"+day);  
       } 
        
       if(month.length()==1){ 
             
            month =("0"+month);  
       } 
          
        
        
          
         String cDate = (year+ "-" + month + "-" +day); 
     
          
         Date currentDate= Date.valueOf(cDate); 
        Date bookedDate = Date.valueOf(fDate); 

        int compareDate = bookedDate.compareTo(currentDate); 
         
        int diffInDays = (int)( (bookedDate.getTime() - currentDate.getTime())  
               / (1000 * 60 * 60 * 24) ); 
         
         
        if(diffInDays>7|| compareDate<0){ 
              
             JOptionPane.showMessageDialog(null,"You can book facility only 1 week ahead!"); 
             facilityLine=null; 
        } 
        else{ 
         
         
        if(((reservationCtr.checkFacility(fID, fDate, facilityTimeZone))+1)>Integer.valueOf(facilityLine.getFacility().getCapacity())){ 

             JOptionPane.showMessageDialog(null,"This " + facilityLine.getFacility().getFacilityType()+ 
                       " is not available on  " + facilityLine.getFacilityDate()+" between" + 
                       facilityLine.getFacilityTime()); 
             facilityLine=null; 
        } 

         
        else{ 
              
             if((reservationCtr.checkBookedFacilitiesDay(Integer.parseInt(jTextField48.getText()), fDate))>4){ 
                  System.out.println((reservationCtr.checkBookedFacilitiesDay(Integer.parseInt(jTextField48.getText()),fDate))); 
                 JOptionPane.showMessageDialog(null,"You have already reached the maximum facility reservations!"); 
                 facilityLine=null; 
                   
                   
             } 
              
              
             if((reservationCtr.checkBookedFacilitiesTime(Integer.parseInt(jTextField48.getText()), fDate,facilityTimeZone))>0){ 
                  System.out.println((reservationCtr.checkBookedFacilitiesDay(Integer.parseInt(jTextField48.getText()),fDate))); 
                 JOptionPane.showMessageDialog(null,"You have already booked facility for this time interval!"); 
                 facilityLine=null; 
                   
    
             } 
              
         
              
            System.out.println(diffInDays); 
         
              
             reservationCtr.insertFacilityLine(facilityLine, Integer.parseInt(jTextField48.getText())); 
             JOptionPane.showMessageDialog(null,facilityLine.getFacility().getFacilityType()+ 
                       " was booked for " + facilityLine.getFacilityDate()+" between" + 
                       facilityLine.getFacilityTime()); 
              
        } 
        } 
        }
	
	public void displayAllEvents(){
		
		
		final EventController eventCtr = new EventController();
      
    	
		eventCtr.getAllEvents();
		displayAllEventsRows = ListEvents.size();
    	displayAllEventsTable = new String [15+displayAllEventsRows][9];
    	displayAllEventsColumns = new String[]{"Event No.","Event","Date","Start Time","End Time",
        		"Description", "Max. Participants","Status","Employee Name"};
    	
  
    	
    	for(int i=0; i < displayAllEventsRows; i++) {
    		
    
    		String eventId = String.valueOf((eventCtr.getAllEvents().get(i).getEventId()));
    		
    		String eventType = eventCtr.getAllEvents().get(i).getType();
    		String date =eventCtr.getAllEvents().get(i).getDate();
    		String timeS = eventCtr.getAllEvents().get(i).getTimeFrom().substring(0, 5);
    		String timeE = eventCtr.getAllEvents().get(i).getTimeTo().substring(0, 5);
    		String descr =eventCtr.getAllEvents().get(i).getDescription();
    		String maxP = String.valueOf((eventCtr.getAllEvents().get(i).getTotalParticipants()));
    		String status =eventCtr.getAllEvents().get(i).getStatus();
    		String empName = eventCtr.getAllEvents().get(i).getStaff().getlName();
    		
    		displayAllEventsTable[i][0] = eventId;
    		displayAllEventsTable[i][1] = eventType;
    		displayAllEventsTable[i][2] = date;
    		displayAllEventsTable[i][3] = timeS;
    		displayAllEventsTable[i][4] = timeE;
    		displayAllEventsTable[i][5] = descr;
    		displayAllEventsTable[i][6] = maxP;
    		displayAllEventsTable[i][7] = status;
    		displayAllEventsTable[i][8] = empName;
    		
    		
    		jTable14.setModel(new DefaultTableModel(displayAllEventsTable, displayAllEventsColumns));
    		
    		
    	}
    	
	}
    	
		public void findGuestCpr(){
			try{
			dbUser = new DBUser();
			guest = new Guest();
			
			guest = dbUser.searchGuestCpr(jTextField61.getText());
			
			jTextField62.setText(guest.getfName());
			jTextField63.setText(guest.getlName());
			JOptionPane.showMessageDialog(null,"Customer was added ");
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Please type correct CPR ! ");
			}
		}
		
		
		public void bookEvent(){
			try{
			
			userCtr = new UserController();
			eventCtr = new EventController();
			eReservation = new EventReservation();
			int users = spinField.getValue();
			eReservation.setEvent(eventCtr.searchEventId(eventId));
			eReservation.setGuest(userCtr.searchGuest(jTextField61.getText()));
			eReservation.setNp(users);
			
	

			if((eventCtr.checkeventMembersNumber(eventId)+users)>
					eventCtr.searchEventId(eventId).getTotalParticipants()){
				
				if(eReservation.getNp()>eventCtr.searchEventId(eventId).getTotalParticipants()){
					
					eReservation= null;
				}
				
				eReservation.setStatus("waiting");
				eventCtr.createEventReservation(eReservation);
				
				
				jTextField61.setText(null);
				jTextField62.setText(null);
				jTextField63.setText(null);
				jTextField65.setText(null);
				spinField.setValue(0);
				
				JOptionPane.showMessageDialog(null,"An event reservation was added to the waiting list ");
				
			}
			
			else{
				eReservation.setStatus("booked");
				eventCtr.createEventReservation(eReservation);
				
				jTextField61.setText(null);
				jTextField62.setText(null);
				jTextField63.setText(null);
				jTextField65.setText(null);
				spinField.setValue(0);
				JOptionPane.showMessageDialog(null,"An event was booked ");
				
			}
			
			

			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Error! The event was not booked ! ");
			}
		}
		
	
		
	
	public void displayAllEReservations(){
		
		final EventController eventCtr = new EventController();
		ReservationController rc =  new ReservationController();
		
		displayEReservationsRows = eventCtr.getAllEventReservationsGuest().size();
		displayEReservationsTable = new String [15+displayEReservationsRows][9];
		displayEReservationsColumns = new String[]{"First Name", "Last Name", "CPR", "Status","Number of Participants",
        		"Event","Event Id","Date","Start Time"};
    	
    	
		ArrayList<EventReservation> list = new ArrayList<EventReservation>();
		list=   eventCtr.getAllEventReservationsGuest();
		int r=0;
    	for(int i=0; i < displayEReservationsRows; i++) {
    	
    		if(list.get(i).getGuest().getCpr().
    				equals(rc.searchReservationGusestId(guestId).getGuest().getCpr())){
    			
    			
    		String fn = list.get(i).getGuest().getfName();
    		String ln = list.get(i).getGuest().getlName();
    		String cpr =list.get(i).getGuest().getCpr();
    		String guestStatus = list.get(i).getStatus();
    		String np = String.valueOf(list.get(i).getNp());
    		String eventType =list.get(i).getEvent().getType();
    		String date = list.get(i).getEvent().getDate();
    		String time =list.get(i).getEvent().getTimeFrom();
    		String eventId = String.valueOf(list.get(i).getEvent().getEventId());
    		
    		displayEReservationsTable[r][0] = fn;
    		displayEReservationsTable[r][1] = ln;
    		displayEReservationsTable[r][2] = cpr;
    		displayEReservationsTable[r][3] = guestStatus;
    		displayEReservationsTable[r][4] = np;
    		displayEReservationsTable[r][5] = eventType;
    		displayEReservationsTable[r][6] = eventId;
    		displayEReservationsTable[r][7] = date;
    		displayEReservationsTable[r][8] = time;
    		r++;
    		
    		table_4.setModel(new DefaultTableModel(displayEReservationsTable, displayEReservationsColumns));
    		
    				}
    		
    	}
    	
	}
    	
    	
    	public void updateEventReservation(){
    		try{
    		userCtr =  new UserController();
    		eventReservation = new EventReservation();
    		eventCtr = new EventController();
    		
    		int users = spinField_2.getValue();
    		
    		eventReservation = eventCtr.searchEventReservation(eventId,userCtr.searchGuest(eventGuestCpr).getUserId());
    		eventReservation.setNp(users);

    		eventCtr.updateEventReservation(eventReservation);
    		
    		displayAllEReservations();
    		JOptionPane.showMessageDialog(null,"The event reservation was updated");
    		}
    		catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Please type correct data ! ");
			}
    	}
		
		public void deleteEventReservation(){
			
			
			eventCtr = new EventController();
			userCtr =  new UserController();
			
			Guest guest =  new Guest();
			guest= userCtr.searchGuest(eventGuestCpr);

			EventReservation eRes = new EventReservation();
			try{
			
			eventCtr.deleteEventReservation(eventId, guest.getUserId());
			JOptionPane.showMessageDialog(null,"The event reservation was deleted");
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Error! The event reservation was not deleted");
			}
			
			EventWaitingListQueue<EventReservation> waitingList = new EventWaitingListQueue<EventReservation>();
			waitingList=	eventCtr.getWaitingList();
	
			
			
			for(int i=0;waitingList.size()>i;i++){
				
				eRes = waitingList.get();
			
			if( eRes.getEvent().getEventId()==eventId && 
					eRes.getEvent().getTotalParticipants()>=(eventCtr.checkeventMembersNumber(eventId) + 
							eRes.getNp())){
				
				eRes.setStatus("booked");
				
				eventCtr.updateEventReservationStatus(eRes);
				
			}
			
			}
			
		
			displayAllEReservations();

		
		
		
	
			
		}
		


    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton35;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField65;
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
    
    private String childNo;
    private String adultNo;
    private JTable table_2;
    private JButton button;
    private JScrollPane scrollPane_1;
    private JTable table_3;
    
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
    private JDateChooser dateChooser_2;
    
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
  	private JSeparator separator;
  	private JSeparator separator_1;
  	private JSeparator separator_2;
  	private JButton btnAdd;
  	private String eventGuestCpr;
  	private int eventId;
  	private JTable table_4;
  	private JTextField textField_14;
  	private JTextField textField_15;
  	private String instructor;
  	private JSpinField spinField_1;
  	
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
	    private JSeparator separator_12;
	    private JSpinField spinField;
	    private JSpinField spinField_2;
	    private JMenuItem mntmLogOut;
}		


