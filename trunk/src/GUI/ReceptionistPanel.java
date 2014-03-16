
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


public class ReceptionistPanel extends javax.swing.JFrame {

   


	private String reservationStatus;
	
    public ReceptionistPanel() {
    	setResizable(false);
    	setVisible(true);
		setTitle("Receptionist Menu");
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
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel104.setBounds(10, 335, 47, 17);
        jScrollPane16 = new javax.swing.JScrollPane();
        jScrollPane16.setBounds(0, 364, 692, 258);
        jTable11 = new javax.swing.JTable();
        jLabel91 = new javax.swing.JLabel();
        jLabel91.setBounds(10, 6, 79, 15);
        jLabel92 = new javax.swing.JLabel();
        jLabel92.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel92.setBounds(10, 31, 44, 28);
        jLabel94 = new javax.swing.JLabel();
        jLabel94.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel94.setBounds(10, 71, 62, 14);
        jLabel97 = new javax.swing.JLabel();
        jLabel97.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel97.setBounds(10, 97, 44, 28);
        jLabel98 = new javax.swing.JLabel();
        jLabel98.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel98.setBounds(10, 132, 95, 14);
        jLabel99 = new javax.swing.JLabel();
        jLabel99.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel99.setBounds(10, 192, 79, 14);
        jTextField53 = new javax.swing.JTextField();
        jTextField53.setBounds(109, 95, 162, 28);
        jTextField55 = new javax.swing.JTextField();
        jTextField55.setBounds(109, 125, 162, 29);
        jButton7 = new javax.swing.JButton();
        jButton7.setBounds(189, 285, 115, 28);
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator12.setBounds(0, 326, 1344, 10);
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

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel104.setText("Events");

        
        jScrollPane16.setViewportView(jTable11);
        
       displayAllEventsTable = new String[ 20][9];
       displayAllEventsColumns = new String[]{"Event No.","Event","Date","Start Time","End Time",
        		"Description", "Max. Participants","Status","Employee Name"};
        jTable11.setModel(new DefaultTableModel(displayAllEventsTable, displayAllEventsColumns));
        

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setText("Create Event");

        jLabel92.setText("Date");

        jLabel94.setText("Time From");

        jLabel97.setText("Type");

        jLabel98.setText("Max participants");

        jLabel99.setText("Description");

        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });

        jButton7.setText("Create");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              createEvent();
            }
        });
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
        jTextField48 = new javax.swing.JTextField();
        jTextField48.setBounds(118, 114, 57, 31);
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
        jButton30 = new javax.swing.JButton();
        jButton30.setBounds(532, 287, 110, 37);
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
                                                                                                        
                                                                                                                jButton30.setText("Change Status");
                                                                                                                jButton30.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                        changeFacilityStatus();
                                                                                                                    }
                                                                                                                });
                                                                                                                
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
                                                                                                                                jPanel12.add(jButton30);
                                                                                                                                jPanel12.add(jButton29);
                                                                                                                                jPanel12.add(jScrollPane13);
                                                                                                                                
                                                                                                                                JScrollPane scrollPane = new JScrollPane();
                                                                                                                                scrollPane.setBounds(10, 64, 349, 47);
                                                                                                                                jPanel12.add(scrollPane);
                                                                                                                                
                                                                                                                                table_1 = new JTable();
                                                                                                                                scrollPane.setViewportView(table_1);
                                                                                                                                table_1.setModel(new DefaultTableModel(findReservationRoomIdFacilityTable, findReservationRoomIdFacilityColum));
                                                                                                                                
                                                                                                                                
                                                                                                                                
                                                                                                                                textField_3 = new JTextField();
                                                                                                                                textField_3.setBounds(71, 30, 105, 31);
                                                                                                                                jPanel12.add(textField_3);
                                                                                                                                textField_3.setColumns(10);
                                                                                                                                
                                                                                                                                JLabel lblRoomNo = new JLabel(" Room No.");
                                                                                                                                lblRoomNo.setBounds(10, 44, 60, 14);
                                                                                                                                jPanel12.add(lblRoomNo);
                                                                                                                                
                                                                                                                                JButton btnFind = new JButton("Find");
                                                                                                                                btnFind.setBounds(182, 30, 89, 31);
                                                                                                                                btnFind.addActionListener(new ActionListener() {
                                                                                                                                	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                	findReservationRoomIdFacility();
                                                                                                                                	}
                                                                                                                                });
                                                                                                                                jPanel12.add(btnFind);
                                                                                                                                
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
                                                                                                                                
                                                                                                                                textField_4 = new JTextField();
                                                                                                                                textField_4.setBounds(72, 419, 105, 28);
                                                                                                                                textField_4.setColumns(10);
                                                                                                                                jPanel12.add(textField_4);
                                                                                                                                
                                                                                                                                label = new JLabel(" Room No.");
                                                                                                                                label.setBounds(11, 426, 60, 14);
                                                                                                                                jPanel12.add(label);
                                                                                                                                
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
                                                                                                                                                                                                                                                                jPanel10 = new javax.swing.JPanel();
                                                                                                                                                                                                                                                                jScrollPane6 = new javax.swing.JScrollPane();
                                                                                                                                                                                                                                                                jScrollPane6.setBounds(10, 25, 729, 298);
                                                                                                                                                                                                                                                                jTable6 = new javax.swing.JTable();
                                                                                                                                                                                                                                                                jLabel65 = new javax.swing.JLabel();
                                                                                                                                                                                                                                                                jLabel65.setBounds(10, 415, 56, 16);
                                                                                                                                                                                                                                                                jLabel67 = new javax.swing.JLabel();
                                                                                                                                                                                                                                                                jLabel67.setBounds(10, 443, 35, 16);
                                                                                                                                                                                                                                                                jTextField37 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                jTextField37.setBounds(78, 409, 120, 28);
                                                                                                                                                                                                                                                                jTextField37.setEditable(false);
                                                                                                                                                                                                                                                                jTextField38 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                jTextField38.setBounds(78, 465, 120, 28);
                                                                                                                                                                                                                                                                jComboBox1 = new javax.swing.JComboBox();
                                                                                                                                                                                                                                                                jComboBox1.setBounds(78, 438, 120, 26);
                                                                                                                                                                                                                                                                jLabel70 = new javax.swing.JLabel();
                                                                                                                                                                                                                                                                jLabel70.setBounds(10, 499, 63, 16);
                                                                                                                                                                                                                                                                jButton25 = new javax.swing.JButton();
                                                                                                                                                                                                                                                                jButton25.setBounds(108, 759, 95, 28);
                                                                                                                                                                                                                                                                jSeparator4 = new javax.swing.JSeparator();
                                                                                                                                                                                                                                                                jSeparator4.setBounds(6, 371, 751, 6);
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                jScrollPane6.setViewportView(jTable6);
                                                                                                                                                                                                                                                                jTable6.setModel(new DefaultTableModel(roomsData,roomsColumns));
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                jLabel65.setText("Room No.");
                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                        jLabel67.setText("Status");
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                jTextField37.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                                                                                                                        jTextField37ActionPerformed(evt);
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                });
                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                        jTextField38.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                                                                                                                                jTextField38ActionPerformed(evt);
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        });
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                jComboBox1.setModel(new DefaultComboBoxModel(new String[] { "---------------------", "available", "occupied", "under repair" }));
                                                                                                                                                                                                                                                                                                                jComboBox1.addItemListener(new ItemListener(){
                                                                                                                                                                                                                                                                                                                	public void itemStateChanged(ItemEvent e ) {
                                                                                                                                                                                                                                                                                                                		String status1 = (String)jComboBox1.getSelectedItem();
                                                                                                                                                                                                                                                                                                                		status = status1;
                                                                                                                                                                                                                                                                                                                	}
                                                                                                                                                                                                                                                                                                                	
    							                                                                   
																				});       
                                                                                                                                                                                                                                                                                                                


                                                                                                                                                                                                                                                                                                                                        jLabel70.setText("Description");
                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                jButton25.setText("Save");
                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                JLabel lblPrice = new JLabel();
                                                                                                                                                                                                                                                                                                                                                lblPrice.setBounds(10, 471, 53, 16);
                                                                                                                                                                                                                                                                                                                                                lblPrice.setText("Price");
                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                       textArea = new JTextArea();
                                                                                                                                                                                                                                                                                                                                                                                       textArea.setBounds(78, 493, 166, 104);
                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                       JButton btnUpdate = new JButton("Update");
                                                                                                                                                                                                                                                                                                                                                                                       btnUpdate.setBounds(78, 609, 166, 28);
                                                                                                                                                                                                                                                                                                                                                                                       btnUpdate.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                                                                                                                       	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                                                                                                                                                                                                                                                                       		
                                                                                                                                                                                                                                                                                                                                                                                       		updateRoom();
                                                                                                                                                                                                                                                                                                                                                                                       		
                                                                                                                                                                                                                                                                                                                                                                                       	}
                                                                                                                                                                                                                                                                                                                                                                                       });
                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                       JButton btnUpdate_1 = new JButton("Update Cleaning Status");
                                                                                                                                                                                                                                                                                                                                                                                       btnUpdate_1.setBounds(108, 323, 166, 36);
                                                                                                                                                                                                                                                                                                                                                                                       btnUpdate_1.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                                                                                                                       	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                                                                                                                                                                                                                                                                       		updateCleaningStatus();
                                                                                                                                                                                                                                                                                                                                                                                       	}
                                                                                                                                                                                                                                                                                                                                                                                       });
                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                       btnRefreshInfo = new JButton("Refresh Info");
                                                                                                                                                                                                                                                                                                                                                                                       btnRefreshInfo.setBounds(10, 323, 95, 36);
                                                                                                                                                                                                                                                                                                                                                                                       btnRefreshInfo.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                                                                                                                       	public void actionPerformed(ActionEvent e) {
                                                                                                                                                                                                                                                                                                                                                                                       		refreshRoomsInfo();
                                                                                                                                                                                                                                                                                                                                                                                       	}
                                                                                                                                                                                                                                                                                                                                                                                       });
                                                                                                                                                                                                                                                                                                                                                                                               jPanel6 = new javax.swing.JPanel();
                                                                                                                                                                                                                                                                                                                                                                                               jScrollPane22 = new javax.swing.JScrollPane();
                                                                                                                                                                                                                                                                                                                                                                                               jScrollPane22.setBounds(6, 35, 456, 353);
                                                                                                                                                                                                                                                                                                                                                                                               jTable15 = new javax.swing.JTable();
                                                                                                                                                                                                                                                                                                                                                                                               jLabel73 = new javax.swing.JLabel();
                                                                                                                                                                                                                                                                                                                                                                                               jLabel73.setBounds(6, 6, 64, 17);
                                                                                                                                                                                                                                                                                                                                                                                               jSeparator14 = new javax.swing.JSeparator();
                                                                                                                                                                                                                                                                                                                                                                                               jSeparator14.setBounds(6, 336, 0, 10);
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               jTable15 = new JTable();
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               allPackagesTable = new String[10] [4];
                                                                                                                                                                                                                                                                                                                                                                                               allPackagesColum = new String[]{"Package ID","Description","Discount","Status"};
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                                       jTable15.setModel(new DefaultTableModel(allPackagesTable,allPackagesColum));
                                                                                                                                                                                                                                                                                                                                                                                                    		   
                                                                                                                                                                                                                                                                                                                                                                                                       jScrollPane22.setViewportView(jTable15);
                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                               jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                                                                                                                                                                                                                                                                                                               jLabel73.setText("Packages");
                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                               jTabbedPane1.addTab("Packages", jPanel6);
                                                                                                                                                                                                                                                                                                                                                                                                                                                               jPanel6.setLayout(null);
                                                                                                                                                                                                                                                                                                                                                                                                                                                               jPanel6.add(jLabel73);
                                                                                                                                                                                                                                                                                                                                                                                                                                                               jPanel6.add(jScrollPane22);
                                                                                                                                                                                                                                                                                                                                                                                                                                                               jPanel6.add(jSeparator14);
                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                                                                                               JButton btnDisplayAll = new JButton("Display All");
                                                                                                                                                                                                                                                                                                                                                                                                                                                               btnDisplayAll.addActionListener(new ActionListener() {
                                                                                                                                                                                                                                                                                                                                                                                                                                                               	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                               	displayAllPackages();
                                                                                                                                                                                                                                                                                                                                                                                                                                                               	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                               });
                                                                                                                                                                                                                                                                                                                                                                                                                                                               btnDisplayAll.setBounds(0, 401, 90, 28);
                                                                                                                                                                                                                                                                                                                                                                                                                                                               jPanel6.add(btnDisplayAll);
                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                               jTabbedPane1.addTab("Rooms", jPanel10);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.setLayout(null);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jScrollPane6);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jButton25);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jLabel65);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jComboBox1);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jTextField37);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(btnRefreshInfo);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(btnUpdate_1);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jSeparator4);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jLabel67);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(lblPrice);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jTextField38);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(jLabel70);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(btnUpdate);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(textArea);
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               JLabel lblUpdateRoomInfo = new JLabel();
                                                                                                                                                                                                                                                                                                                                                                                               lblUpdateRoomInfo.setText("Update Room Info");
                                                                                                                                                                                                                                                                                                                                                                                               lblUpdateRoomInfo.setFont(new Font("Tahoma", Font.BOLD, 14));
                                                                                                                                                                                                                                                                                                                                                                                               lblUpdateRoomInfo.setBounds(10, 371, 173, 43);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(lblUpdateRoomInfo);
                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                               lblRooms = new JLabel();
                                                                                                                                                                                                                                                                                                                                                                                               lblRooms.setText("Rooms");
                                                                                                                                                                                                                                                                                                                                                                                               lblRooms.setFont(new Font("Tahoma", Font.BOLD, 14));
                                                                                                                                                                                                                                                                                                                                                                                               lblRooms.setBounds(10, 0, 129, 28);
                                                                                                                                                                                                                                                                                                                                                                                               jPanel10.add(lblRooms);
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
                                                                                                                                                                                                                                                                                        	public void actionPerformed(ActionEvent arg0) {
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel15, GroupLayout.PREFERRED_SIZE, 1350, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel15, GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        jPanel3.setLayout(jPanel3Layout);
        jPanel15.setLayout(null);
        jPanel15.add(jSeparator12);
        jPanel15.add(jLabel91);
        jPanel15.add(jLabel94);
        jPanel15.add(jLabel99);
        jPanel15.add(jButton7);
        jPanel15.add(jLabel98);
        jPanel15.add(jLabel97);
        jPanel15.add(jTextField53);
        jPanel15.add(jTextField55);
        jPanel15.add(jLabel104);
        jPanel15.add(jScrollPane16);
        jPanel15.add(jLabel92);
        
        textField_10 = new JTextField();
        textField_10.setBounds(109, 63, 69, 28);
        jPanel15.add(textField_10);
        textField_10.setColumns(10);
        
        textField_11 = new JTextField();
        textField_11.setBounds(202, 62, 69, 29);
        jPanel15.add(textField_11);
        textField_11.setColumns(10);
        
        JLabel lblStaffId = new JLabel("Staff CPR");
        lblStaffId.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblStaffId.setBounds(10, 166, 62, 14);
        jPanel15.add(lblStaffId);
        
        textField_12 = new JTextField();
        textField_12.setBounds(108, 159, 163, 28);
        jPanel15.add(textField_12);
        textField_12.setColumns(10);
        
        JButton btnNewButton = new JButton("Events");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		displayAllEvents();
        	}
        });
        jPanel5 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton17.setBounds(0, 210, 161, 38);
        jButton17.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        
        	createGuest();
        		
        	}
        });
        jLabel38 = new javax.swing.JLabel();
        jLabel38.setBounds(6, 43, 102, 14);
        jLabel39 = new javax.swing.JLabel();
        jLabel39.setBounds(6, 73, 102, 23);
        jLabel40 = new javax.swing.JLabel();
        jLabel40.setBounds(393, 278, 102, 23);
        jLabel41 = new javax.swing.JLabel();
        jLabel41.setBounds(6, 141, 102, 23);
        jLabel42 = new javax.swing.JLabel();
        jLabel42.setBounds(279, 39, 102, 23);
        jLabel43 = new javax.swing.JLabel();
        jLabel43.setBounds(289, 107, 102, 23);
        jLabel44 = new javax.swing.JLabel();
        jLabel44.setBounds(279, 141, 102, 23);
        jTextField14 = new javax.swing.JTextField();
        jTextField14.setBounds(114, 35, 147, 28);
        jTextField15 = new javax.swing.JTextField();
        jTextField15.setBounds(114, 69, 147, 28);
        jTextField16 = new javax.swing.JTextField();
        jTextField16.setBounds(114, 103, 147, 28);
        jTextField18 = new javax.swing.JTextField();
        jTextField18.setBounds(114, 137, 147, 28);
        jTextField19 = new javax.swing.JTextField();
        jTextField19.setBounds(387, 137, 147, 28);
        jTextField20 = new javax.swing.JTextField();
        jTextField20.setBounds(387, 103, 147, 28);
        jTextField21 = new javax.swing.JTextField();
        jTextField21.setBounds(387, 69, 147, 28);
        jLabel45 = new javax.swing.JLabel();
        jLabel45.setBounds(6, 6, 122, 17);
        jButton18 = new javax.swing.JButton();
        jButton18.setBounds(177, 210, 134, 38);
        jButton18.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		AllGuests guests = new AllGuests();
        		
        	}
        });
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator3.setBounds(425, 301, 0, 10);
        jLabel46 = new javax.swing.JLabel();
        jLabel46.setBounds(6, 269, 93, 17);
        jTextField22 = new javax.swing.JTextField();
        jTextField22.setBounds(6, 317, 174, 28);
        jLabel37 = new javax.swing.JLabel();
        jLabel37.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel37.setBounds(6, 295, 122, 16);
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane10.setBounds(6, 379, 328, 132);
        jTable7 = new javax.swing.JTable();
        
        
        jScrollPane10.setViewportView(jTable7);
        jTable7.setModel(new DefaultTableModel(upData,upDataColumns));
        
        
        
        
        
        
        jButton19 = new javax.swing.JButton();
        jButton19.setBounds(177, 317, 52, 28);
        jLabel47 = new javax.swing.JLabel();
        jLabel47.setBounds(6, 107, 102, 23);
        jLabel48 = new javax.swing.JLabel();
        jLabel48.setBounds(393, 312, 102, 23);
        jLabel49 = new javax.swing.JLabel();
        jLabel49.setBounds(393, 380, 102, 23);
        jLabel50 = new javax.swing.JLabel();
        jLabel50.setBounds(393, 414, 102, 23);
        jTextField23 = new javax.swing.JTextField();
        jTextField23.setBounds(501, 274, 149, 28);
        jTextField24 = new javax.swing.JTextField();
        jTextField24.setBounds(501, 308, 149, 28);
        jTextField25 = new javax.swing.JTextField();
        jTextField25.setBounds(501, 342, 149, 28);
        jTextField26 = new javax.swing.JTextField();
        jTextField26.setBounds(501, 376, 149, 28);
        jTextField27 = new javax.swing.JTextField();
        jTextField27.setBounds(501, 410, 149, 28);
        jButton20 = new javax.swing.JButton();
        jButton20.setBounds(393, 449, 257, 40);
        jLabel87 = new javax.swing.JLabel();
        jLabel87.setBounds(6, 175, 102, 23);
        jTextField49 = new javax.swing.JTextField();
        jTextField49.setBounds(114, 171, 147, 28);
        jLabel96 = new javax.swing.JLabel();
        jLabel96.setBounds(279, 73, 102, 23);
        jTextField50 = new javax.swing.JTextField();
        jTextField50.setBounds(387, 35, 147, 28);
        jLabel102 = new javax.swing.JLabel();
        jLabel102.setBounds(393, 346, 102, 23);
        
                jButton17.setText("Create");
                
                        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                        jLabel38.setText("First Name(s)");
                        
                                jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                jLabel39.setText("Family Names(s)");
                                
                                        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                        jLabel40.setText("Address");
                                        
                                                jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                jLabel41.setText("Country");
                                                
                                                        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                        jLabel42.setText("CPR");
                                                        
                                                                jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                jLabel43.setText("Phone");
                                                                
                                                                        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                        jLabel44.setText("Travel agency");
                                                                        
                                                                                jTextField14.addActionListener(new java.awt.event.ActionListener() {
                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                        jTextField14ActionPerformed(evt);
                                                                                    }
                                                                                });
                                                                                
                                                                                        jTextField21.addActionListener(new java.awt.event.ActionListener() {
                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                jTextField21ActionPerformed(evt);
                                                                                            }
                                                                                        });
                                                                                        
                                                                                                jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                jLabel45.setText("Create new guest");
                                                                                                
                                                                                                        jButton18.setText("View All Guests");
                                                                                                        
                                                                                                                jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                jLabel46.setText("Update guest");
                                                                                                                
                                                                                                                        jLabel37.setText("Search Guest by CPR");
                                                                                                                        
                                                                                                                                jTable7.setModel(new DefaultTableModel(
                                                                                                                                	new Object[][] {
                                                                                                                                	},
                                                                                                                                	new String[] {
                                                                                                                                	}
                                                                                                                                ));
                                                                                                                                jScrollPane10.setViewportView(jTable7);
                                                                                                                                
                                                                                                                                        jButton19.setText("Find");
                                                                                                                                        jButton19.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                findGuest();
                                                                                                                                            }
                                                                                                                                        });
                                                                                                                                        
                                                                                                                                                jLabel47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                jLabel47.setText("Address");
                                                                                                                                                
                                                                                                                                                        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                        jLabel48.setText("Country");
                                                                                                                                                        
                                                                                                                                                                jLabel49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                jLabel49.setText("E-mail");
                                                                                                                                                                
                                                                                                                                                                        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                        jLabel50.setText("Phone");
                                                                                                                                                                        
                                                                                                                                                                                jTextField25.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                        jTextField25ActionPerformed(evt);
                                                                                                                                                                                    }
                                                                                                                                                                                });
                                                                                                                                                                                
                                                                                                                                                                                        jButton20.setText("Update");
                                                                                                                                                                                        jButton20.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                               updateGuest();
                                                                                                                                                                                            }
                                                                                                                                                                                        });
                                                                                                                                                                                        
                                                                                                                                                                                                jLabel87.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                jLabel87.setText("City");
                                                                                                                                                                                                
                                                                                                                                                                                                        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                        jLabel96.setText("E-mail");
                                                                                                                                                                                                        
                                                                                                                                                                                                                jTextField50.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                                        jTextField50ActionPerformed1(evt);
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                });
                                                                                                                                                                                                                
                                                                                                                                                                                                                        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                        jLabel102.setText("City");
                                                                                                                                                                                                                        
                                                                                                                                                                                                                        textField = new JTextField();
                                                                                                                                                                                                                        textField.setVisible(false);
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
                                                                                                                                                                                                                                                                                                        jTextField61 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                                                        jTextField61.setBounds(88, 22, 136, 28);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jTextField61);
                                                                                                                                                                                                                                                                                                        jTextField62 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                                                        jTextField62.setBounds(88, 52, 136, 28);
                                                                                                                                                                                                                                                                                                        jTextField62.setEditable(false);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jTextField62);
                                                                                                                                                                                                                                                                                                        jTextField63 = new javax.swing.JTextField();
                                                                                                                                                                                                                                                                                                        jTextField63.setBounds(87, 85, 136, 31);
                                                                                                                                                                                                                                                                                                        jTextField63.setEditable(false);
                                                                                                                                                                                                                                                                                                        jPanel13.add(jTextField63);
                                                                                                                                                                                                                                                                                                        jButton35 = new javax.swing.JButton();
                                                                                                                                                                                                                                                                                                        jButton35.setBounds(0, 263, 136, 32);
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
                                                                                                                        
                                                                                                                        JButton btnViewWaitingList = new JButton("View Waiting List");
                                                                                                                        btnViewWaitingList.setBounds(456, 221, 121, 28);
                                                                                                                        jPanel13.add(btnViewWaitingList);
                                                                                                                        
                                                                                                                        btnAdd = new JButton("Add to booking");
                                                                                                                        btnAdd.setBounds(143, 116, 136, 31);
                                                                                                                        jPanel13.add(btnAdd);
                                                                                                                        jTextField65 = new javax.swing.JTextField();
                                                                                                                        jTextField65.setBounds(88, 163, 136, 28);
                                                                                                                        jPanel13.add(jTextField65);
                                                                                                                        jTextField65.setEditable(false);
                                                                                                                        
                                                                                                                        JButton btnAddToWaiting = new JButton();
                                                                                                                        btnAddToWaiting.setText("Add to waiting list");
                                                                                                                        btnAddToWaiting.setBounds(143, 263, 136, 32);
                                                                                                                        jPanel13.add(btnAddToWaiting);
                                                                                                                        
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
                                                                                                                        btnViewWaitingList.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent arg0) {
                                                                                                                        	WaitingList wList = new WaitingList();
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        btnEvents.addActionListener(new ActionListener() {
                                                                                                                        	public void actionPerformed(ActionEvent e) {
                                                                                                                        		
                                                                                                                        		displayAllEvents();
                                                                                                                        		
                                                                                                                        	}
                                                                                                                        });
                                                                                                                        

                                                                                                                        jTextField62.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                               jTextField50ActionPerformed(evt);
                                                                                                                           }
                                                                                                                        });
                                                                                                                                                                                                                        textField.setBounds(916, 204, 120, 28);
                                                                                                                                                                                                                        textField.setEditable(false);
                                                                                                                                                                                                                        textField.setColumns(10);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                jTabbedPane1.addTab("Guests", jPanel5);
                                                                                                                                                                                                                                jPanel5.setLayout(null);
                                                                                                                                                                                                                                jPanel5.add(jButton18);
                                                                                                                                                                                                                                jPanel5.add(jLabel45);
                                                                                                                                                                                                                                jPanel5.add(jLabel46);
                                                                                                                                                                                                                                jPanel5.add(jLabel37);
                                                                                                                                                                                                                                jPanel5.add(jTextField22);
                                                                                                                                                                                                                                jPanel5.add(jButton19);
                                                                                                                                                                                                                                jPanel5.add(jScrollPane10);
                                                                                                                                                                                                                                jPanel5.add(jButton20);
                                                                                                                                                                                                                                jPanel5.add(jLabel49);
                                                                                                                                                                                                                                jPanel5.add(jTextField26);
                                                                                                                                                                                                                                jPanel5.add(jLabel48);
                                                                                                                                                                                                                                jPanel5.add(jTextField24);
                                                                                                                                                                                                                                jPanel5.add(jLabel50);
                                                                                                                                                                                                                                jPanel5.add(jTextField27);
                                                                                                                                                                                                                                jPanel5.add(jLabel102);
                                                                                                                                                                                                                                jPanel5.add(jTextField25);
                                                                                                                                                                                                                                jPanel5.add(jLabel40);
                                                                                                                                                                                                                                jPanel5.add(jTextField23);
                                                                                                                                                                                                                                jPanel5.add(textField);
                                                                                                                                                                                                                                jPanel5.add(jLabel87);
                                                                                                                                                                                                                                jPanel5.add(jTextField49);
                                                                                                                                                                                                                                jPanel5.add(jLabel41);
                                                                                                                                                                                                                                jPanel5.add(jTextField18);
                                                                                                                                                                                                                                jPanel5.add(jLabel47);
                                                                                                                                                                                                                                jPanel5.add(jTextField16);
                                                                                                                                                                                                                                jPanel5.add(jLabel39);
                                                                                                                                                                                                                                jPanel5.add(jLabel38);
                                                                                                                                                                                                                                jPanel5.add(jTextField14);
                                                                                                                                                                                                                                jPanel5.add(jTextField15);
                                                                                                                                                                                                                                jPanel5.add(jLabel96);
                                                                                                                                                                                                                                jPanel5.add(jTextField21);
                                                                                                                                                                                                                                jPanel5.add(jLabel43);
                                                                                                                                                                                                                                jPanel5.add(jLabel44);
                                                                                                                                                                                                                                jPanel5.add(jLabel42);
                                                                                                                                                                                                                                jPanel5.add(jTextField20);
                                                                                                                                                                                                                                jPanel5.add(jTextField50);
                                                                                                                                                                                                                                jPanel5.add(jTextField19);
                                                                                                                                                                                                                                jPanel5.add(jButton17);
                                                                                                                                                                                                                                jPanel5.add(jSeparator3);
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                separator_5 = new JSeparator();
                                                                                                                                                                                                                                separator_5.setBounds(6, 260, 1350, 2);
                                                                                                                                                                                                                                jPanel5.add(separator_5);
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                separator_6 = new JSeparator();
                                                                                                                                                                                                                                separator_6.setOrientation(SwingConstants.VERTICAL);
                                                                                                                                                                                                                                separator_6.setBounds(362, 269, 1, 2);
                                                                                                                                                                                                                                jPanel5.add(separator_6);
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                JSeparator separator_7 = new JSeparator();
                                                                                                                                                                                                                                separator_7.setOrientation(SwingConstants.VERTICAL);
                                                                                                                                                                                                                                separator_7.setBounds(352, 260, 11, 432);
                                                                                                                                                                                                                                jPanel5.add(separator_7);
                                                                                                                                        jPanel2 = new javax.swing.JPanel();
                                                                                                                                        jLabel14 = new javax.swing.JLabel();
                                                                                                                                        jLabel14.setBounds(20, 11, 161, 24);
                                                                                                                                        jSeparator2 = new javax.swing.JSeparator();
                                                                                                                                        jSeparator2.setBounds(6, 36, 1350, 10);
                                                                                                                                        jLabel17 = new javax.swing.JLabel();
                                                                                                                                        jLabel17.setBounds(29, 93, 25, 15);
                                                                                                                                        jLabel18 = new javax.swing.JLabel();
                                                                                                                                        jLabel18.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                        jLabel18.setBounds(66, 69, 115, 16);
                                                                                                                                        jButton8 = new javax.swing.JButton();
                                                                                                                                        jButton8.setBounds(169, 445, 124, 40);
                                                                                                                                        jTextField10 = new javax.swing.JTextField();
                                                                                                                                        jTextField10.setBounds(66, 86, 152, 28);
                                                                                                                                        jButton9 = new javax.swing.JButton();
                                                                                                                                        jButton9.addActionListener(new ActionListener() {
                                                                                                                                        	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                        	findReservationByCpr();
                                                                                                                                        	}
                                                                                                                                        });
                                                                                                                                        jButton9.setBounds(224, 82, 80, 32);
                                                                                                                                        jButton10 = new javax.swing.JButton();
                                                                                                                                        jButton10.setBounds(20, 445, 125, 40);
                                                                                                                                        jScrollPane8 = new javax.swing.JScrollPane();
                                                                                                                                        jScrollPane8.setBounds(14, 126, 350, 91);
                                                                                                                                        jLabel25 = new javax.swing.JLabel();
                                                                                                                                        jLabel25.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                        jLabel25.setBounds(20, 293, 71, 23);
                                                                                                                                        jLabel26 = new javax.swing.JLabel();
                                                                                                                                        jLabel26.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                        jLabel26.setBounds(20, 257, 56, 24);
                                                                                                                                        jLabel27 = new javax.swing.JLabel();
                                                                                                                                        jLabel27.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                        jLabel27.setBounds(20, 328, 43, 24);
                                                                                                                                        jLabel28 = new javax.swing.JLabel();
                                                                                                                                        jLabel28.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                        jLabel28.setBounds(20, 392, 125, 24);
                                                                                                                                        jLabel29 = new javax.swing.JLabel();
                                                                                                                                        jLabel29.setFont(new Font("SansSerif", Font.BOLD, 12));
                                                                                                                                        jLabel29.setBounds(20, 364, 90, 16);
                                                                                                                                        
                                                                                                                                                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                                                                                                jLabel14.setText("Check In / Check Out");
                                                                                                                                                
                                                                                                                                                        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                                                                                                                                                        jLabel17.setText("CPR");
                                                                                                                                                        
                                                                                                                                                                jLabel18.setText("Find booking by CPR");
                                                                                                                                                                
                                                                                                                                                                        jButton8.setText("Check Out");
                                                                                                                                                                        jButton8.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                checkOut();
                                                                                                                                                                            }
                                                                                                                                                                        });
                                                                                                                                                                        
                                                                                                                                                                                jButton9.setText("Find");
                                                                                                                                                                                
                                                                                                                                                                                        jButton10.setText("Check In");
                                                                                                                                                                                        jButton10.addActionListener(new java.awt.event.ActionListener() {
                                                                                                                                                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                                                                                                                checkIn();
                                                                                                                                                                                            }
                                                                                                                                                                                        });
                                                                                                                                                                                        
   	jTable4 = new JTable();
   	jTable4.setModel(new DefaultTableModel(findResData,findResColumns));
   	jScrollPane8.setViewportView(jTable4);
   	
   	        jTable4.addMouseListener(new MouseAdapter() { 
   	            public void mouseClicked(MouseEvent e) { 
   	
   	                        e.consume(); 
   	                    JTable target = (JTable)e.getSource(); 
   	                   int row = target.getSelectedRow(); 
   	                    
   	                   if(e.getClickCount()==1){ 
   	                	   
   	                	   ReservationController reservationCtr = new ReservationController();
   	                	
   	                	   int dayIn = Integer.valueOf((findResData [row][4]).substring(8,10));
   	                	   int dayOut = Integer.valueOf((findResData [row][5]).substring(8,10));
   	                	   
   	                	  // System.out.println(reservationCtr.searchReservationId(11).getDeposit());
   	                	   textField_20.setText(findResData [row][3]);
   	                	   String resId = textField_20.getText();
   	                	   int reservId = Integer.parseInt(resId);
   	                	   
   	                	   textField_9.setText(findResData [row][6]);
   	                	   textField_16.setText(String.valueOf((dayOut - dayIn)+1));
   	                	   textField_17.setText(String.valueOf(reservationCtr.searchReservationId(reservId).getDeposit()));
   	                	   textField_18.setText(String.valueOf(reservationCtr.searchReservationId(reservId).getTotalPrice()));
   	                	   textField_19.setText(String.valueOf(Double.parseDouble(textField_18.getText())- (Double.parseDouble(textField_17.getText()))));
   	
   	                   } 
   	
   	            } 
   	         });
   	        
   	                jLabel25.setText("No. of Nights");
   	                
   	                        jLabel26.setText("Room No.");
   	                        
   	                                jLabel27.setText("Deposit");
   	                                
   	                                        jLabel28.setText("Remaining Amount");
   	                                        
   	                                                jLabel29.setText("Total Amount");
   	                                                
   	                                                        jTabbedPane1.addTab("Check In / Check Out", jPanel2);
   	                                                        jPanel2.setLayout(null);
   	                                                        jPanel2.add(jLabel14);
   	                                                        jPanel2.add(jLabel18);
   	                                                        jPanel2.add(jTextField10);
   	                                                        jPanel2.add(jLabel17);
   	                                                        jPanel2.add(jButton9);
   	                                                        jPanel2.add(jScrollPane8);
   	                                                        jPanel2.add(jLabel26);
   	                                                        jPanel2.add(jLabel25);
   	                                                        jPanel2.add(jLabel29);
   	                                                        jPanel2.add(jLabel27);
   	                                                        jPanel2.add(jLabel28);
   	                                                        jPanel2.add(jButton10);
   	                                                        jPanel2.add(jButton8);
   	                                                        jPanel2.add(jSeparator2);
   	                                                        
   	                                                        textField_9 = new JTextField();
   	                                                        textField_9.setEditable(false);
   	                                                        textField_9.setBounds(157, 257, 122, 28);
   	                                                        jPanel2.add(textField_9);
   	                                                        textField_9.setColumns(10);
   	                                                        
   	                                                        textField_16 = new JTextField();
   	                                                        textField_16.setEditable(false);
   	                                                        textField_16.setBounds(157, 288, 122, 28);
   	                                                        jPanel2.add(textField_16);
   	                                                        textField_16.setColumns(10);
   	                                                        
   	                                                        textField_17 = new JTextField();
   	                                                        textField_17.setEditable(false);
   	                                                        textField_17.setBounds(157, 322, 122, 28);
   	                                                        jPanel2.add(textField_17);
   	                                                        textField_17.setColumns(10);
   	                                                        
   	                                                        textField_18 = new JTextField();
   	                                                        textField_18.setEditable(false);
   	                                                        textField_18.setBounds(157, 358, 122, 28);
   	                                                        jPanel2.add(textField_18);
   	                                                        textField_18.setColumns(10);
   	                                                        
   	                                                        textField_19 = new JTextField();
   	                                                        textField_19.setEditable(false);
   	                                                        textField_19.setBounds(157, 392, 122, 28);
   	                                                        jPanel2.add(textField_19);
   	                                                        textField_19.setColumns(10);
   	                                                        
   	                                                        textField_20 = new JTextField();
   	                                                        textField_20.setEditable(false);
   	                                                        textField_20.setBounds(157, 226, 122, 28);
   	                                                        jPanel2.add(textField_20);
   	                                                        textField_20.setColumns(10);
   	                                                        
   	                                                        JLabel lblReservationNo_1 = new JLabel("Reservation No.");
   	                                                        lblReservationNo_1.setFont(new Font("SansSerif", Font.BOLD, 12));
   	                                                        lblReservationNo_1.setBounds(20, 229, 90, 16);
   	                                                        jPanel2.add(lblReservationNo_1);
        btnNewButton.setBounds(0, 623, 105, 28);
        jPanel15.add(btnNewButton);
        
        dateChooser_6 = new JDateChooser();
        dateChooser_6.setBounds(107, 31, 164, 28);
        jPanel15.add(dateChooser_6);
        
        JLabel lblTo = new JLabel("To");
        lblTo.setFont(new Font("SansSerif", Font.BOLD, 12));
        lblTo.setBounds(179, 68, 38, 16);
        jPanel15.add(lblTo);
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea4.setBounds(108, 192, 196, 92);
        jPanel15.add(jTextArea4);
        
                jTextArea4.setColumns(20);
                jTextArea4.setRows(5);

        jTabbedPane1.addTab("Events", jPanel3);

        getAllFacilitiesTable = new String [ getAllFacilitiesRows][0];
        getAllFacilitiesColum = new String [] {"Facility Number", "Facility type", "Capacity", "Status","Price"};
        findReservationRoomIdFacilityTable = new String [findReservationRoomIdFacilityCprTableRows][0];
        findReservationRoomIdFacilityColum = new String [] {"Room No.", "First Name", "Last Name", "Reservation No."};
        cancelFacilityTable = new String [cancelFacilityRows][0];
        cancelFacilityColum = new String [] {"First Name", "Last Name", "Reservation No.","Facility","Date","Time"};
        jPanel9 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane5.setBounds(6, 38, 437, 433);
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel22.setBounds(6, 6, 105, 18);
        jTextField11 = new javax.swing.JTextField();
        jTextField11.setBounds(468, 56, 156, 28);
        jLabel21 = new javax.swing.JLabel();
        jLabel21.setBounds(468, 35, 156, 15);
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane7.setBounds(468, 97, 844, 78);
        jTable3 = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton11.setBounds(627, 52, 62, 32);
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator6.setBounds(455, 0, 30, 686);
        jLabel31 = new javax.swing.JLabel();
        jLabel31.setBounds(468, 6, 132, 17);
        jLabel32 = new javax.swing.JLabel();
        jLabel32.setBounds(468, 233, 49, 14);
        jLabel33 = new javax.swing.JLabel();
        jLabel33.setBounds(467, 259, 57, 27);
        jTextField13 = new javax.swing.JTextField();
        jTextField13.setEditable(false);
        jTextField13.setBounds(536, 187, 122, 28);
        jLabel34 = new javax.swing.JLabel();
        jLabel34.setBounds(468, 195, 33, 14);
        jButton12 = new javax.swing.JButton();
        jButton12.setBounds(659, 187, 94, 28);
        jLabel35 = new javax.swing.JLabel();
        jLabel35.setBounds(468, 298, 102, 23);
        jLabel36 = new javax.swing.JLabel();
        jLabel36.setBounds(468, 332, 102, 23);
        jButton16 = new javax.swing.JButton();
        jButton16.setBounds(536, 367, 122, 28);
        jButton16.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		updateReservationLine();
        		
        	}
        });
        
        
                jScrollPane5.setViewportView(jTable1);
                jTable1.setModel(new DefaultTableModel(allReservationsTable, allReservationsColum));
                
                
                        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                        jLabel22.setText("All reservations");
                        
                                jTextField11.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jTextField11ActionPerformed(evt);
                                    }
                                });
                                
                                        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                                        jLabel21.setText("Search by reservation ID");
                                        
                                              
                                                jScrollPane7.setViewportView(jTable3);
                                                jTable3.setModel(new DefaultTableModel(
                                                	new Object[][] {
                                                	},
                                                	new String[] {
                                                		"Line No.", "Room No.", "Reservation No.", "Last Name", "CPR", "Check-In", "Check-Out", "Adult No.", "Child No."
                                                	}
                                                ));
                                                
                                                        jButton11.setText("Find");
                                                        jButton11.addActionListener(new java.awt.event.ActionListener() {
                                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                            	findUpdateReservation();
                                                            }
                                                        });
                                                        
                                                                jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
                                                                
                                                                        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                                                        jLabel31.setText("Update reservation");
                                                                        
                                                                                jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                jLabel32.setText("Check In");
                                                                                
                                                                                        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                        jLabel33.setText("Check Out");
                                                                                        
                                                                                                jTextField13.addActionListener(new java.awt.event.ActionListener() {
                                                                                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                                                                        jTextField13ActionPerformed(evt);
                                                                                                    }
                                                                                                });
                                                                                                
                                                                                                        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                        jLabel34.setText("Room");
                                                                                                        
                                                                                                                jButton12.setText("Select room");
                                                                                                                
                                                                                                                        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                        jLabel35.setText("No. Child");
                                                                                                                        
                                                                                                                                jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                jLabel36.setText("No. Adults");
                                                                                                                                
                                                                                                                                        jButton16.setText("Update");
                                                                                                                                        
                                                                                                                                        JButton btnShowAllReservations = new JButton("Show All Reservations");
                                                                                                                                        btnShowAllReservations.setBounds(6, 483, 151, 49);
                                                                                                                                        btnShowAllReservations.addActionListener(new ActionListener() {
                                                                                                                                        	public void actionPerformed(ActionEvent arg0) {
                                                                                                                                        		displayAllReservation();
                                                                                                                                        	}
                                                                                                                                        });
                                                                                                                                        
                                                                                                                                        textField_5 = new JTextField();
                                                                                                                                        textField_5.setBounds(536, 294, 122, 28);
                                                                                                                                        textField_5.setColumns(10);
                                                                                                                                        
                                                                                                                                        textField_6 = new JTextField();
                                                                                                                                        textField_6.setBounds(536, 328, 122, 28);
                                                                                                                                        textField_6.setColumns(10);
                                                                                                                                        
                                                                                                                                                jTabbedPane1.addTab("Reservations", jPanel9);
                                                                                                                                                jPanel9.setLayout(null);
                                                                                                                                                jPanel9.add(jLabel31);
                                                                                                                                                jPanel9.add(jLabel21);
                                                                                                                                                jPanel9.add(jTextField11);
                                                                                                                                                jPanel9.add(jButton11);
                                                                                                                                                jPanel9.add(jScrollPane7);
                                                                                                                                                jPanel9.add(jButton16);
                                                                                                                                                jPanel9.add(jLabel36);
                                                                                                                                                jPanel9.add(textField_6);
                                                                                                                                                jPanel9.add(jLabel34);
                                                                                                                                                jPanel9.add(jTextField13);
                                                                                                                                                jPanel9.add(jLabel35);
                                                                                                                                                jPanel9.add(textField_5);
                                                                                                                                                jPanel9.add(jLabel32);
                                                                                                                                                jPanel9.add(jLabel33);
                                                                                                                                                jPanel9.add(jButton12);
                                                                                                                                                jPanel9.add(jLabel22);
                                                                                                                                                jPanel9.add(btnShowAllReservations);
                                                                                                                                                jPanel9.add(jScrollPane5);
                                                                                                                                                jPanel9.add(jSeparator6);
                                                                                                                                                
                                                                                                                                                dateChooser_7 = new JDateChooser();
                                                                                                                                                dateChooser_7.setBounds(536, 219, 132, 28);
                                                                                                                                                jPanel9.add(dateChooser_7);
                                                                                                                                                
                                                                                                                                                dateChooser_8 = new JDateChooser();
                                                                                                                                                dateChooser_8.setBounds(536, 258, 132, 28);
                                                                                                                                                jPanel9.add(dateChooser_8);
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
        	public void actionPerformed(ActionEvent arg0) {
        		setVisible(false);
            	LogIn logIn = new LogIn();
        	}
        });
        jMenu1.add(mntmLogOut);

        jMenu3.setText("Exit");
        jMenuBar1.add(jMenu3);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Exit");
        mntmNewMenuItem.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	System.exit(0);
        	}
        });
        jMenu3.add(mntmNewMenuItem);

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

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                                                                    

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            
                                                      

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            
                     

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

                                        

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            
                                     

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTextField50ActionPerformed1(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
   private void changeFacilityStatus(){
	   
	   Facility facility = new Facility();
	   dbFacility = new DBFacility();
	   
	
	   facility=dbFacility.searchFacilityId(fID); 
	   if(facility.getStatus().equals ("Available")) {
	   facility.setStatus("Closed");
	   }
	   else {
		   facility.setStatus("Available");
	   }
	   
	   
	   dbFacility.updateFacility(facility);
	   
	   displayAllFacilities();
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
    
   private void findFacilityCancel() { 
        
        
        
        reservationCtr =  new ReservationController(); 
        reserv =  new Reservation();  
                   
        reserv =  reservationCtr.searchReservationFRoomId(Integer.parseInt(textField_4.getText())); 
     
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
    
    
    
    
    
    private void findReservationRoomIdFacility() { 
        
        try { 
        
       UserController userCtr = new UserController(); 
       ReservationController reservationCtr = new ReservationController(); 
        
   
       findReservationRoomIdFacilityCprTableRows = reservationCtr.searchReservationRoomId(Integer.parseInt(textField_3.getText())).getReservationLines().size(); 
        
       findReservationRoomIdFacilityTable = new String [findReservationRoomIdFacilityCprTableRows][4]; 
      findReservationRoomIdFacilityColum = new String [] {"Room No.", "First Name", "Last Name", "Reservation No."}; 
       
          for(int i=0; i< findReservationRoomIdFacilityCprTableRows; i ++) { 
       
      String roomNo = String.valueOf(reservationCtr.searchReservationRoomId(Integer.parseInt(textField_3.getText())).getReservationLines().get(i).getRoom().getRoomId()); 
      String fName = reservationCtr.searchReservationRoomId(Integer.parseInt(textField_3.getText())).getGuest().getfName(); 
      String lName = reservationCtr.searchReservationRoomId(Integer.parseInt(textField_3.getText())).getGuest().getlName(); 
      String reservationId = String.valueOf(reservationCtr.searchReservationRoomId(Integer.parseInt(textField_3.getText())).getReservationId()); 
       
       
       
     
     findReservationRoomIdFacilityTable [0][0] = roomNo;  
     findReservationRoomIdFacilityTable [0][1] =  fName; 
     findReservationRoomIdFacilityTable [0][2] = lName; 
     findReservationRoomIdFacilityTable [0][3] = reservationId; 
       
          }   
        
     table_1.setModel(new DefaultTableModel(findReservationRoomIdFacilityTable, findReservationRoomIdFacilityColum)); 

     table_1.addMouseListener(new MouseAdapter() {  
         public void mouseClicked(MouseEvent e) {  
   
                     e.consume();  
                 JTable target = (JTable)e.getSource();  
                int row = target.getSelectedRow();  
                  
                if(e.getClickCount()==1){  
            
                
                
             String resId1 = findReservationRoomIdFacilityTable [row][3]; 
             
          
          jTextField48.setText(resId1); 
              
              
                                  
                }  
                 

       
         }  
      }); 
        } 
        catch(Exception e) { 
              
             JOptionPane.showMessageDialog(null,"Please type correct Room ID !"); 
              
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
    
    
    public void updateRoom() {
    	try {
    	RoomController roomCtr = new RoomController();
    	room = new Room();
    	String id = jTextField37.getText();
    	int roomId = Integer.parseInt(id);
    	room = roomCtr.searchRoomsId(roomId);
    	
    	
    	room.setDescription(textArea.getText());
    	double price1 = Double.parseDouble(jTextField38.getText());
    	room.setPrice(price1);
    	room.setStatus(status);
    	
    	roomCtr.updateRoomStatus(room);
    	roomCtr.updateRoomPrice(room);
    	roomCtr.updateRoomDescription(room);
    	
    	JOptionPane.showMessageDialog(null,"Room No." + roomId  + " was updated");
    
    }
    catch(Exception e){
    	JOptionPane.showMessageDialog(null,"Please type correct data !");
    }
    	
    }
    
    
    public void updateCleaningStatus() {
    	
    	try {
    		
    	RoomController roomCtr = new RoomController();
    	room = new Room();
    	String id = jTextField37.getText();
    	
    	int roomId = Integer.parseInt(id);
    	room = roomCtr.searchRoomsId(roomId);
        roomCtr.updateRoomCleaningStatus(room);   
        refreshRoomsInfo();
        int month = (cal.getTime().getMonth()) + 1;
        int year = (cal.getTime().getYear()) + 1900;
        
        JOptionPane.showMessageDialog(null,MessageFormat.format("Room No.{0} has been cleaned on {1}", roomId,
				cal.getTime().getDate()+ "." + month + "." +year));
        
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"Update cleaning status failed!");
    	}
    	
    	
    }
    
    

    public void refreshRoomsInfo() {
    	
    	try {
	  
	  final RoomController roomCtr = new RoomController();
	  roomsRows =  roomCtr.getAllRoom().size();
	  roomsData = new String [roomsRows][6]; 
	  roomsColumns = new String [] {"Room No.", "Type", "Status", "Decription", "Price", "Last Cleaned"} ;
   
	  
	  ArrayList<Room> list =  new ArrayList<Room> ();
	  list = roomCtr.getAllRoom();
	  
	  for(int i=0 ; i<roomsRows; i++) {
		  
		  String roomId = String.valueOf (list.get(i).getRoomId());
		  String type =  list.get(i).getRoomType();
		  String status = list.get(i).getStatus();
		  String description = list.get(i).getDescription();
		  String price = String.valueOf (list.get(i).getPrice());
		  String lastClean =  list.get(i).getLastClean();
		  
		  
		  roomsData [i][0] = roomId ; 
		  roomsData [i][1] = type ; 
		  roomsData [i][2] = status ; 
		  roomsData [i][3] = description ; 
		  roomsData [i][4] = price ; 
		  roomsData [i][5] = lastClean ; 
		  
		  
	  }
	  
	  jTable6.setModel(new DefaultTableModel(roomsData,roomsColumns));
  	jTable6.addMouseListener(new MouseAdapter() { 
          public void mouseClicked(MouseEvent e) { 
   
                      e.consume(); 
                  JTable target = (JTable)e.getSource(); 
                 int row = target.getSelectedRow(); 
                  
                 if(e.getClickCount()==1){ 
            
                
                
                	 String roomId1 = roomsData [row][0];
                	 int roomId = Integer.parseInt(roomId1);
                	 
                	 
              jTextField37.setText(String.valueOf(roomCtr.searchRoomsId(roomId).getRoomId()));
             jTextField38.setText(String.valueOf(roomCtr.searchRoomsId(roomId).getPrice()));
             textArea.setText(roomCtr.searchRoomsId(roomId).getDescription());
             
             String currentStatus = roomCtr.searchRoomsId(roomId).getStatus();
              jComboBox1.setSelectedItem(currentStatus);
              
                                  
                 } 
                 

       
          } 
       });
    	}
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"Refreshing rooms failed!");
    	}
  }
    
    

    public void updateGuest() {
    	try{
    	String cpr = textField.getText();
    	UserController ctr = new UserController();
    	Guest guest = ctr.searchGuest(cpr);
    	
    	
    	guest = ctr.searchGuest(cpr);
    	
    	guest.setAddress(jTextField23.getText());
    	guest.setCountry(jTextField24.getText());
    	guest.setCity(jTextField25.getText());
    	guest.setEmail(jTextField26.getText());
    	guest.setPhone (jTextField27.getText());
    	
    	
    	ctr.updateGuest(guest);
    	

        jTextField23.setText(null);
        jTextField24.setText(null);
        jTextField25.setText(null);
        jTextField26.setText(null);
        jTextField27.setText(null);
        textField.setText(null);
        
        JOptionPane.showMessageDialog(null,"Guest infromation was updated ");
    	}
    	catch (Exception e) {
    		JOptionPane.showMessageDialog(null,"Please type correct data !");
    	}
    	
    }
    
    public void findGuest(){
    	try {
    	final String cprs=jTextField22.getText();
    	
    	final UserController ctr = new UserController();
    	upDataRows = 1;
    	upData = new String [upDataRows][5];
    	upDataColumns = new String [] {"First Name","Last name","CPR","Country","City"};
    	
    	String fname = ctr.searchGuest(cprs).getfName();
    	final String lname = ctr.searchGuest(cprs).getlName();
    	String cpr = cprs;
    	String country = ctr.searchGuest(cprs).getCountry();
    	String city = ctr.searchGuest(cprs).getCity();
    	
    	upData[0][0] =fname ;
    	upData[0][1] =lname ;
    	upData[0][2] =cpr ;
    	upData[0][3] =country ;
    	upData[0][4] =city ;

    	jTable7.setModel(new DefaultTableModel(upData,upDataColumns));
    	jTable7.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
     
                        e.consume(); 
                    JTable target = (JTable)e.getSource(); 
                   int row = target.getSelectedRow(); 
                    
                   if(e.getClickCount()==1){ 
              
                	  
                	   
                jTextField23.setText(ctr.searchGuest(cprs).getAddress());
                jTextField24.setText(ctr.searchGuest(cprs).getCountry());
                jTextField25.setText(ctr.searchGuest(cprs).getCity());
                jTextField26.setText(ctr.searchGuest(cprs).getEmail());
                jTextField27.setText(ctr.searchGuest(cprs).getPhone());
                textField.setText(ctr.searchGuest(cprs).getCpr());
                
                
                                    
                   } 
                   

         
            } 
         });
    	}
    	
    
    	catch(Exception e) {
    		JOptionPane.showMessageDialog(null,"No information found ! ");
    	}
    	

    }
    
    public void createGuest(){
try {
    	Guest guest =  new Guest();
    	DBUser dbUser = new DBUser();
    	
    	
    	
    	String fname = jTextField14.getText();
    	String lname = jTextField15.getText();
    	String uname = (fname.substring(0, 3) + lname.substring(0, 3));
    	
    	
    	String address = jTextField16.getText();
    	String country = jTextField18.getText();
    	String city =jTextField49.getText();
    	String phone = jTextField20.getText();
    	String scpr = jTextField50.getText();
    	String pass =  (scpr.substring(0, 6));
    	
    	String username = uname;
    	String password = pass;
    	String email = jTextField21.getText();
    	String type="guest";
    	String travelAgency = jTextField19.getText();
    	String guestType="single";
    	
    	
    	if(travelAgency.equals("")) {
    		
    		
    		guest.setfName(fname);
        	guest.setlName(lname);
        	guest.setAddress(address);
        	guest.setCountry(country);
        	guest.setCity(city);
        	guest.setPhone(phone);
        	guest.setUsername(username);
        	guest.setPassword(password);
        	guest.setEmail(email);
        	guest.setType(type);
        	guest.setGuestType(guestType);
        	guest.setCpr(scpr);
        	
        	UserController ctr =  new UserController();
        	
        	ctr.createGuest(guest);
    		
    	
    	}
    	
    	else {
    		
    	int travelAgencyId = Integer.parseInt(travelAgency);
    	
    	guest.setTravelAgency(dbUser.searchTravelAgencyId(travelAgencyId));
    	guest.setfName(fname);
    	guest.setlName(lname);
    	guest.setAddress(address);
    	guest.setCountry(country);
    	guest.setCity(city);
    	guest.setPhone(phone);
    	guest.setUsername(username);
    	guest.setPassword(password);
    	guest.setEmail(email);
    	guest.setType(type);
    	guest.setGuestType(guestType);
    	guest.setCpr(scpr);
    	
    	UserController ctr =  new UserController();
    	ctr.createGuest(guest);
    	}
    	
    	jTextField14.setText(null);
        jTextField15.setText(null);
    	jTextField16.setText(null);
    	jTextField18.setText(null);
    	jTextField49.setText(null);
    	jTextField20.setText(null);
    	jTextField21.setText(null);
    	jTextField50.setText(null);
    	jTextField19.setText(null);
    	
    	JOptionPane.showMessageDialog(null,"The guest " + guest.getfName() + " " + guest.getlName()+  " was created");
}
catch(Exception e) {
	JOptionPane.showMessageDialog(null,"Please type correct data");
}
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
    
    
    	public void displayAllReservation(){
    		
    		
    		
    		ReservationController reservationCtr = new ReservationController();
    		
    			allReservationsRows =  reservationCtr.showAllReservations().size();
    			allReservationsTable = new String [allReservationsRows][5]; 
    			allReservationsColum = new String[]{"Reservation Id","First Name","Last Name","Check-In", "Check-Out"};
    		  
   
    			ArrayList<Reservation> list = new ArrayList<Reservation>();
    			list = reservationCtr.showAllReservations();
    			
    		  for(int i=0 ; i< allReservationsRows; i++) {

    			  String rId = String.valueOf (list.get(i).getReservationId());
    			  String fName =  list.get(i).getGuest().getfName();
    			  String lName =  list.get(i).getGuest().getlName();
    			  String checkIn =  list.get(i).getReservationLines().get(0).getCheckIn();
    			  String checkOut =  list.get(i).getReservationLines().get(0).getCheckOut();
    			  
    			  
    			  allReservationsTable [i][0] = rId ; 
    			  allReservationsTable [i][1] = fName ; 
    			  allReservationsTable [i][2] = lName ; 
    			  allReservationsTable [i][3] = checkIn ; 
    			  allReservationsTable [i][4] = checkOut ; 
    		
    			  
    			  
    		  }
    		  
    		  jTable1.setModel(new DefaultTableModel(allReservationsTable,allReservationsColum));
    	}
    	    
    	 
    
 
	public void findUpdateReservation(){
		try{
		
		final ReservationController reservCtr = new ReservationController();
      	String rN = jTextField11.getText();
    	Reservation reservation =  new Reservation ();
    	
    	updateReservationRows = reservCtr.searchReservationId(Integer.parseInt(rN)).getReservationLines().size();
    	updateReservationTable = new String [updateReservationRows][9];
    	updateReservationColumns = new String[]{"Line No.","Room No.","Reservation No.","Last Name","CPR",
        		"Check-In", "Check-Out","Adult No.","Child No."};
    	
    	reservation = reservCtr.searchReservationId(Integer.parseInt(rN));
    	
    	if(reservation==null) {
			JOptionPane.showMessageDialog(null,"Please type correcto reservation ID ");
		}
    	
    	for(int i=0; i < updateReservationRows; i++) {
    		
    		
    				
    		
    		String lineNumber = String.valueOf((reservation.getReservationLines().get(i).getReservationLineId()));
    		
    		String roomNumber = String.valueOf(reservation.getReservationLines().get(i).getRoom().getRoomId());
    		String reservN = String.valueOf(reservation.getReservationId());
    		String ln = reservation.getGuest().getlName();
    		String cpr = reservation.getGuest().getCpr();
    		String checkIn =reservation.getReservationLines().get(i).getCheckIn();
    		String checkOut = reservation.getReservationLines().get(i).getCheckOut();
    		String adultN =String.valueOf(reservation.getReservationLines().get(i).getAdultNo());
    		String childN = String.valueOf(reservation.getReservationLines().get(i).getChildrenNo());
    		
    		updateReservationTable[i][0] = lineNumber;
    		updateReservationTable[i][1] = roomNumber;
    		updateReservationTable[i][2] = reservN;
    		updateReservationTable[i][3] = ln;
    		updateReservationTable[i][4] = cpr;
    		updateReservationTable[i][5] = checkIn;
    		updateReservationTable[i][6] = checkOut;
    		updateReservationTable[i][7] = adultN;
    		updateReservationTable[i][8] = childN;
    		
    		
    	}
    	
    	jTable3.setModel(new DefaultTableModel(updateReservationTable, updateReservationColumns));
     	jTable3.addMouseListener(new MouseAdapter() { 
            public void mouseClicked(MouseEvent e) { 
     
                        e.consume(); 
                    JTable target = (JTable)e.getSource(); 
                   int row = target.getSelectedRow(); 
                    
                   if(e.getClickCount()==1){ 

                  
                   rlnId = Integer.parseInt(updateReservationTable [row][0]);
                   updateResId = updateReservationTable [row][2];
                   jTextField13.setText(updateReservationTable [row][1]);
                   textField_5.setText(updateReservationTable[row][8]);
                   textField_6.setText(updateReservationTable[row][7]);

                                    
                   } 
      
            } 
         });	
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Please type correct reservation ID ");
		}
	}

	public void updateReservationLine(){
		try {
		roomCtr = new RoomController();
		reservationCtr = new ReservationController();
		rLine = new ReservationLine();
		
				 for(int i = 0; i< reservationCtr.searchReservationId(Integer.parseInt(updateResId)).
						 getReservationLines().size();i++) {

			 if( reservationCtr.searchReservationId(Integer.parseInt(updateResId)).getReservationLines().get(i).
					 getReservationLineId()==rlnId){
				 
				
			 rLine = reservationCtr.searchReservationId(Integer.parseInt(updateResId)).getReservationLines().get(i);
			 
			    java.util.Date utilStartDate = dateChooser_7.getDate(); 
		    	java.sql.Date start = new java.sql.Date(utilStartDate.getTime());
		    	String in = start.toString();
		    	
		    	java.util.Date utilStartDate2 = dateChooser_8.getDate(); 
		    	java.sql.Date start2 = new java.sql.Date(utilStartDate2.getTime());
		    	String out = start2.toString();

			 
			 String room = jTextField13.getText();
			 rLine.setRoom(roomCtr.searchRoomsId(Integer.parseInt(room)));
			 rLine.setCheckIn(in);
			 rLine.setCheckOut(out);
			 rLine.setChildrenNo(Integer.parseInt(textField_5.getText()));
			 rLine.setAdultNo(Integer.parseInt(textField_6.getText()));
	
		    reservationCtr.updateReservationLine(rLine);
		    
		    }
		 }
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Please type correct reservation ID ");
		}
	}

	
	public void createEvent(){
		try{
		userCtr = new UserController();
		eventCtr =  new EventController();
		event = new Event();
		
		java.util.Date utilStartDate = dateChooser_6.getDate(); 
    	java.sql.Date start = new java.sql.Date(utilStartDate.getTime());
    	String startDate = start.toString();

		event.setDate(startDate);
		event.setDescription(jTextArea4.getText());
		event.setStaff(userCtr.searchStaffCpr(textField_12.getText()));
		event.setStatus("pending");
		event.setTimeFrom(textField_10.getText());
		event.setTimeTo(textField_11.getText());
		event.setTotalParticipants(Integer.parseInt(jTextField55.getText()));
		event.setType(jTextField53.getText());
		
		eventCtr.insertEvent(event);
		
		JOptionPane.showMessageDialog(null,"The Event was created! ");
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Please type correct data ");
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
    		
    		jTable11.setModel(new DefaultTableModel(displayAllEventsTable, displayAllEventsColumns));
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
	      
	    	
			
			displayEReservationsRows = eventCtr.getAllEventReservations().size();
			displayEReservationsTable = new String [15+displayEReservationsRows][9];
			displayEReservationsColumns = new String[]{"First Name", "Last Name", "CPR", "Status","Number of Participants",
	        		"Event","Event Id","Date","Start Time"};
	    	
	  
	    	
	    	for(int i=0; i < displayEReservationsRows; i++) {
	    		
	    		
	    		String fn = eventCtr.getAllEventReservations().get(i).getGuest().getfName();
	    		String ln = eventCtr.getAllEventReservations().get(i).getGuest().getlName();
	    		String cpr =eventCtr.getAllEventReservations().get(i).getGuest().getCpr();
	    		String guestStatus = eventCtr.getAllEventReservations().get(i).getStatus();
	    		String np = String.valueOf(eventCtr.getAllEventReservations().get(i).getNp());
	    		String eventType =eventCtr.getAllEventReservations().get(i).getEvent().getType();
	    		String date = eventCtr.getAllEventReservations().get(i).getEvent().getDate();
	    		String time =eventCtr.getAllEventReservations().get(i).getEvent().getTimeFrom();
	    		String eventId = String.valueOf(eventCtr.getAllEventReservations().get(i).getEvent().getEventId());
	    		
	    		displayEReservationsTable[i][0] = fn;
	    		displayEReservationsTable[i][1] = ln;
	    		displayEReservationsTable[i][2] = cpr;
	    		displayEReservationsTable[i][3] = guestStatus;
	    		displayEReservationsTable[i][4] = np;
	    		displayEReservationsTable[i][5] = eventType;
	    		displayEReservationsTable[i][6] = eventId;
	    		displayEReservationsTable[i][7] = date;
	    		displayEReservationsTable[i][8] = time;
	    		
	    		table_4.setModel(new DefaultTableModel(displayEReservationsTable, displayEReservationsColumns));
	    		
	    		
	    		
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
		
	
		private void findReservationByCpr() {
			
			
			try {
			ReservationController reservationCtr = new ReservationController();
			UserController userCtr = new UserController();
			
			int guestId = userCtr.searchGuest(jTextField10.getText()).getUserId();
			
			 	findResRows =  1;
			 	findResData = new String [findResRows + 10][7]; 
			 	findResColumns= new String[]{"First Name","Last Name","CPR","Reservation ID","From","To","Room No"};
			  
			  for(int i=0 ; i< findResRows; i++) {

				  String fName = reservationCtr.searchReservationGusestId(guestId).getGuest().getfName();
				  String lName = reservationCtr.searchReservationGusestId(guestId).getGuest().getlName();
				  String cpr = reservationCtr.searchReservationGusestId(guestId).getGuest().getCpr();
				  String resId =  (String.valueOf(reservationCtr.searchReservationGusestId(guestId).getReservationId()));
				  String checkIn =  reservationCtr.searchReservationGusestId(guestId).getReservationLines().get(0).getCheckIn();
				  String checkOut =  reservationCtr.searchReservationGusestId(guestId).getReservationLines().get(0).getCheckOut();
				  String roomNo =  (String.valueOf(reservationCtr.searchReservationGusestId(guestId).getReservationLines().get(0).getRoom().getRoomId()));
				  
				  findResData [i][0] = fName ; 
				  findResData [i][1] = lName ; 
				  findResData [i][2] = cpr; 
				  findResData [i][3] = resId; 
				  findResData [i][4] = checkIn; 
				  findResData [i][5] = checkOut; 
				  findResData [i][6] = roomNo; 
			
				  
			  }
			  
			  jTable4.setModel(new DefaultTableModel(findResData,findResColumns));
			  
			}
			catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Please type correct data ! ");
		}
		}

			
		
		private void checkIn() {
			try {
			Reservation reservation = new Reservation();
			
			reservationCtr = new ReservationController();
			reservation = reservationCtr.searchReservationId(Integer.parseInt(textField_20.getText()));
			reservation.setStatusId("confirmed");
			
			reservationCtr.updateReservationStatus(reservation);
			
			Room room = new Room();
			roomCtr = new RoomController();
			room = roomCtr.searchRoomsId(Integer.parseInt(textField_9.getText()));
			room.setStatus("occupied");
			
			roomCtr.updateRoomStatus(room);
			JOptionPane.showMessageDialog(null,"The room was Cheked In. ");
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Problem with the connection ");
			}
		}
    
		private void checkOut() {
			try {
			Reservation reservation = new Reservation();
			
			reservationCtr = new ReservationController();
			reservation = reservationCtr.searchReservationId(Integer.parseInt(textField_20.getText()));
			reservation.setStatusId("expired");
			
			reservationCtr.updateReservationStatus(reservation);
			
			Room room = new Room();
			roomCtr = new RoomController();
			room = roomCtr.searchRoomsId(Integer.parseInt(textField_9.getText()));
			room.setStatus("available");
			
			roomCtr.updateRoomStatus(room);
			JOptionPane.showMessageDialog(null,"The room is checked Out. ");
		}
		
		catch(Exception e) {
			JOptionPane.showMessageDialog(null,"Problem with the connection ");
		}
		}
		
		private void displayAllPackages() {
			

			
			ReservationController reserCtr = new ReservationController();
	      
	    	
			reserCtr.getAllPackages();
			allPackagesRows = reserCtr.getAllPackages().size();
			allPackagesTable = new String [allPackagesRows + 8][4];
			allPackagesColum = new String[]{"Package ID","Description","Discount","Status"};
	    	
	  
	    	
	    	for(int i=0; i < allPackagesRows; i++) {
	    		
	    		
	    		
	    		
	    		String packId =  String.valueOf(reserCtr.getAllPackages().get(i).getPackageId());
	    		String descr = reserCtr.getAllPackages().get(i).getDescription();
	    		String disc = String.valueOf(reserCtr.getAllPackages().get(i).getDiscount());
	    		String status = reserCtr.getAllPackages().get(i).getStatus();
	    		
	    		allPackagesTable[i][0] = packId;
	    		allPackagesTable[i][1] = descr;
	    		allPackagesTable[i][2] = disc;
	    		allPackagesTable[i][3] = status;
	    		
	    		
	    	}
	    	
	    	jTable15.setModel(new DefaultTableModel(allPackagesTable, allPackagesColum));
	    	jTable15.addMouseListener(new MouseAdapter() { 
    	          public void mouseClicked(MouseEvent e) { 
    	   
    	                      e.consume(); 
    	                  JTable target = (JTable)e.getSource(); 
    	                 int row = target.getSelectedRow(); 
    	                  
    	                 if(e.getClickCount()==1){ 
    	            
    	                
    	                
    	                	 String packageId1 = allPackagesTable[allPackagesRows][0];
    	                	 packageId = Integer.parseInt(packageId1);
    	                	 
    	        
    	                                
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
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private JTextField jTextField12_1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private Calendar cal = Calendar.getInstance();
    
    
    private String [] [] upData;
    private int upDataRows;
    private String[] upDataColumns;
    private JTextField textField;
    
    private String [] [] roomsData;
    private String [] roomsColumns;
    private int roomsRows;
    private JButton btnRefreshInfo;
    private JTextArea textArea;
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
    private JTable table_1;
    private JTextField textField_3;
    private JTable table_2;
    private JTextField textField_4;
    private JLabel label;
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
  	private JTextField textField_5;
  	private JTextField textField_6;
  	private JTextField textField_10;
  	private JTextField textField_11;
  	private JTextField textField_12;
  	private JSeparator separator;
  	private JSeparator separator_1;
  	private JSeparator separator_2;
  	private JSeparator separator_3;
  	private JLabel lblRooms;
  	private JSeparator separator_5;
  	private JSeparator separator_6;
  	private JButton btnAdd;
  	private String eventGuestCpr;
  	private int eventId;
  	private JTable table_4;
  	private JTextField textField_14;
  	private JTextField textField_15;
  	public JDateChooser dateChooser_6;
  	private String instructor;
  	private JSpinField spinField_1;
  	private JTextField textField_9;
  	private JTextField textField_16;
  	private JTextField textField_17;
  	private JTextField textField_18;
  	private JTextField textField_19;
  	
  	 private int findResRows;
	 private String [][] findResData ; 
	 private String []  findResColumns;
	 private JTextField textField_20;
	 
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
	    private JSpinField spinField_3;
	    private JSpinField spinField_4;
	    private  JDateChooser dateChooser_7;
	    private JDateChooser dateChooser_8;
	    private JMenuItem mntmLogOut;
}


