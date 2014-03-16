
package GUI;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import Controller.FacilityController;
import Controller.ReservationController;
import Controller.RoomController;
import Controller.UserController;
import DB.DBUser;
import Model.Facility;
import Model.Guest;
import Model.Room;
import Model.Staff;
import Model.TravelAgency;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminPanel extends javax.swing.JFrame {

	
	

	public AdminPanel() {
		setResizable(false);
		setVisible(true);
		setTitle("Admin Menu");
        initComponents();
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
    }

    
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel16.setBounds(10, 53, 65, 15);
        jLabel18 = new javax.swing.JLabel();
        jLabel18.setBounds(10, 82, 69, 15);
        jLabel19 = new javax.swing.JLabel();
        jLabel19.setBounds(10, 111, 29, 15);
        jButton2 = new javax.swing.JButton();
        jButton2.setBounds(6, 143, 165, 33);
        jLabel20 = new javax.swing.JLabel();
        jLabel20.setBounds(10, 11, 117, 22);
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator3.setBounds(996, 166, 0, 10);
        jLabel44 = new javax.swing.JLabel();
        jLabel44.setBounds(10, 182, 137, 22);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(10, 215, 687, 369);
        jTable1 = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(0, 55, 60, 14);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(0, 94, 59, 14);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(0, 131, 46, 14);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(0, 170, 45, 14);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(0, 209, 22, 14);
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setBounds(0, 248, 34, 14);
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setBounds(0, 287, 38, 14);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(0, 326, 25, 14);
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setBounds(88, 245, 119, 28);
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setBounds(88, 515, 119, 28);
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setBounds(88, 284, 119, 28);
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setBounds(88, 323, 119, 28);
        jTextField8 = new javax.swing.JTextField();
        jTextField8.setBounds(90, 476, 119, 28);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(0, 362, 45, 14);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(0, 405, 81, 14);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(0, 431, 72, 28);
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setBounds(0, 479, 36, 14);
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setBounds(0, 518, 70, 14);
        jTextField9 = new javax.swing.JTextField();
        jTextField9.setBounds(88, 167, 119, 28);
        jTextField10 = new javax.swing.JTextField();
        jTextField10.setBounds(88, 206, 119, 28);
        jTextField11 = new javax.swing.JTextField();
        jTextField11.setBounds(88, 91, 119, 28);
        jTextField12 = new javax.swing.JTextField();
        jTextField12.setBounds(88, 128, 119, 28);
        jTextField13 = new javax.swing.JTextField();
        jTextField13.setBounds(88, 52, 119, 28);
        jLabel15 = new javax.swing.JLabel();
        jLabel15.setBounds(506, 10, 174, 16);
        jButton1 = new javax.swing.JButton();
        jButton1.setBounds(0, 561, 207, 43);
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		createStaff();
        	}
        });
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator1.setBounds(496, 0, 12, 640);
        jLabel21 = new javax.swing.JLabel();
        jLabel21.setBounds(0, 6, 113, 16);
        jLabel22 = new javax.swing.JLabel();
        jLabel22.setBounds(514, 59, 149, 14);
        jLabel23 = new javax.swing.JLabel();
        jLabel23.setBounds(241, 93, 59, 14);
        jLabel24 = new javax.swing.JLabel();
        jLabel24.setBounds(241, 132, 46, 14);
        jLabel25 = new javax.swing.JLabel();
        jLabel25.setBounds(241, 171, 45, 14);
        jLabel26 = new javax.swing.JLabel();
        jLabel26.setBounds(241, 210, 22, 14);
        jLabel27 = new javax.swing.JLabel();
        jLabel27.setBounds(241, 249, 22, 14);
        jLabel28 = new javax.swing.JLabel();
        jLabel28.setBounds(241, 288, 34, 14);
        jLabel29 = new javax.swing.JLabel();
        jLabel29.setBounds(241, 327, 35, 14);
        jLabel30 = new javax.swing.JLabel();
        jLabel30.setBounds(241, 366, 81, 14);
        jTextField17 = new javax.swing.JTextField();
        jTextField17.setBounds(332, 363, 119, 28);
        jTextField18 = new javax.swing.JTextField();
        jTextField18.setBounds(332, 324, 119, 28);
        jTextField19 = new javax.swing.JTextField();
        jTextField19.setBounds(332, 285, 119, 28);
        jTextField20 = new javax.swing.JTextField();
        jTextField20.setBounds(332, 246, 119, 28);
        jTextField21 = new javax.swing.JTextField();
        jTextField21.setBounds(332, 168, 119, 28);
        jTextField22 = new javax.swing.JTextField();
        jTextField22.setBounds(332, 129, 119, 28);
        jTextField23 = new javax.swing.JTextField();
        jTextField23.setBounds(332, 207, 119, 28);
        jTextField24 = new javax.swing.JTextField();
        jTextField24.setBounds(332, 90, 119, 28);
        jTextField25 = new javax.swing.JTextField();
        jTextField25.setBounds(332, 51, 119, 28);
        jButton3 = new javax.swing.JButton();
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	createGuest();
        	}
        });
        jButton3.setBounds(251, 562, 210, 40);
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator2.setBounds(225, 0, 12, 680);
        jLabel31 = new javax.swing.JLabel();
        jLabel31.setBounds(241, 11, 118, 16);
        jLabel32 = new javax.swing.JLabel();
        jLabel32.setBounds(241, 54, 60, 14);
        jLabel33 = new javax.swing.JLabel();
        jLabel33.setBounds(514, 94, 148, 19);
        jLabel34 = new javax.swing.JLabel();
        jLabel34.setBounds(514, 128, 59, 28);
        jLabel35 = new javax.swing.JLabel();
        jLabel35.setBounds(514, 165, 54, 30);
        jLabel36 = new javax.swing.JLabel();
        jLabel36.setBounds(514, 209, 54, 25);
        jLabel38 = new javax.swing.JLabel();
        jLabel38.setBounds(514, 248, 54, 25);
        jLabel39 = new javax.swing.JLabel();
        jLabel39.setBounds(514, 287, 54, 25);
        jLabel40 = new javax.swing.JLabel();
        jLabel40.setBounds(514, 326, 69, 25);
        jLabel41 = new javax.swing.JLabel();
        jLabel41.setBounds(514, 363, 84, 28);
        jLabel37 = new javax.swing.JLabel();
        jLabel37.setBounds(514, 394, 72, 36);
        jLabel42 = new javax.swing.JLabel();
        jLabel42.setBounds(514, 431, 57, 36);
        jLabel43 = new javax.swing.JLabel();
        jLabel43.setBounds(514, 479, 116, 22);
        jTextField26 = new javax.swing.JTextField();
        jTextField26.setBounds(639, 131, 119, 28);
        jTextField27 = new javax.swing.JTextField();
        jTextField27.setBounds(639, 170, 119, 28);
        jTextField28 = new javax.swing.JTextField();
        jTextField28.setBounds(639, 248, 119, 28);
        jTextField29 = new javax.swing.JTextField();
        jTextField29.setBounds(639, 94, 119, 28);
        jTextField30 = new javax.swing.JTextField();
        jTextField30.setBounds(639, 476, 119, 28);
        jTextField32 = new javax.swing.JTextField();
        jTextField32.setBounds(639, 439, 119, 28);
        jTextField34 = new javax.swing.JTextField();
        jTextField34.setBounds(639, 326, 119, 28);
        jTextField35 = new javax.swing.JTextField();
        jTextField35.setBounds(639, 287, 119, 28);
        jTextField36 = new javax.swing.JTextField();
        jTextField36.setBounds(639, 209, 119, 28);
        jTextField37 = new javax.swing.JTextField();
        jTextField37.setBounds(639, 59, 119, 28);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	createTravelAgency();
        	}
        });
        jButton4.setBounds(520, 562, 203, 40);
        
                jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                jLabel1.setText("First Name");
                
                        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                        jLabel2.setText("Last Name");
                        
                                jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                jLabel4.setText("Address");
                                
                                        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                        jLabel5.setText("Country");
                                        
                                                jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                jLabel6.setText("City");
                                                
                                                        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                        jLabel7.setText("E-Mail");
                                                        
                                                                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                jLabel8.setText("Phone ");
                                                                
                                                                        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                        jLabel9.setText("CPR ");
                                                                        
                                                                                jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                jLabel10.setText("Position");
                                                                                
                                                                                        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                        jLabel11.setText("Contract Start");
                                                                                        
                                                                                                jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                jLabel12.setText("Contract End");
                                                                                                
                                                                                                        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                        jLabel13.setText("Salary");
                                                                                                        
                                                                                                                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                jLabel14.setText("Office Phone");
                                                                                                                
                                                                                                                        jLabel15.setFont(new Font("Tahoma", Font.BOLD, 13)); // NOI18N
                                                                                                                        jLabel15.setText("Create Travel Agency User");
                                                                                                                        
                                                                                                                                jButton1.setText("Create");
                                                                                                                                
                                                                                                                                        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
                                                                                                                                        
                                                                                                                                                jLabel21.setFont(new Font("Tahoma", Font.BOLD, 13)); // NOI18N
                                                                                                                                                jLabel21.setText("Create Staff User");
                                                                                                                                                
                                                                                                                                                        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                        jLabel22.setText("First Name");
                                                                                                                                                        
                                                                                                                                                                jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                jLabel23.setText("Last Name");
                                                                                                                                                                
                                                                                                                                                                        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                        jLabel24.setText("Address");
                                                                                                                                                                        
                                                                                                                                                                                jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                jLabel25.setText("Country");
                                                                                                                                                                                
                                                                                                                                                                                        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                        jLabel26.setText("City");
                                                                                                                                                                                        
                                                                                                                                                                                                jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                jLabel27.setText("CPR");
                                                                                                                                                                                                
                                                                                                                                                                                                        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                        jLabel28.setText("E-Mail");
                                                                                                                                                                                                        
                                                                                                                                                                                                                jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                jLabel29.setText("Phone");
                                                                                                                                                                                                                
                                                                                                                                                                                                                        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                        jLabel30.setText("Travel Agency");
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                jButton3.setText("Create");
                                                                                                                                                                                                                                
                                                                                                                                                                                                                                        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                jLabel31.setFont(new Font("Tahoma", Font.BOLD, 13)); // NOI18N
                                                                                                                                                                                                                                                jLabel31.setText("Create Guest User");
                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                        jLabel32.setText("First Name");
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                jLabel33.setText("Last Name");
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                        jLabel34.setText("Address");
                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                jLabel35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                jLabel35.setText("Country");
                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                        jLabel36.setText("City");
                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                jLabel38.setText("E-Mail");
                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                        jLabel39.setText("Phone");
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                jLabel40.setText("Company ID");
                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                        jLabel41.setText("Contract Start ");
                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                jLabel37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                                jLabel37.setText("Contract End");
                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                                        jLabel42.setText("Comission");
                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                jLabel43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
                                                                                                                                                                                                                                                                                                                                                jLabel43.setText("Travel Agency Name");
                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                        jButton4.setText("Create");
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                dateChooser_2 = new JDateChooser();
                                                                                                                                                                                                                                                                                                                                                                dateChooser_2.setBounds(639, 366, 149, 28);
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                               dateChooser_3 = new JDateChooser();
                                                                                                                                                                                                                                                                                                                                                                dateChooser_3.setBounds(639, 404, 149, 28);
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                dateChooser = new JDateChooser();
                                                                                                                                                                                                                                                                                                                                                                dateChooser.setBounds(91, 396, 132, 28);
                                                                                                                                                                                                                                                                                                                                                                jPanel1.add(dateChooser);
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                dateChooser_1 = new JDateChooser();
                                                                                                                                                                                                                                                                                                                                                                dateChooser_1.setBounds(91, 431, 132, 28);
                                                                                                                                                                                                                                                                                                                                                                jPanel1.add(dateChooser_1);
                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                        jTabbedPane1.addTab("Create Users", jPanel1);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.setLayout(null);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel1);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField13);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel2);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField11);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel4);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField12);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel5);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField9);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel6);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField10);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel7);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField1);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel8);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField3);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel9);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField4);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel13);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField8);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel14);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField2);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jButton1);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel21);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel12);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel11);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel10);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jSeparator2);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel31);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel32);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField25);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel23);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField24);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel24);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField22);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel25);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField21);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel26);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField23);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel27);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField20);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel28);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField19);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel29);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField18);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel30);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField17);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jButton3);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jSeparator1);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel22);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField37);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel43);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField30);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jButton4);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel33);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel34);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel35);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel36);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel38);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel39);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel40);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel41);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel37);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel42);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(dateChooser_3);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField32);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField34);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField35);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField28);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField36);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField27);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField26);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jTextField29);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(dateChooser_2);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(jLabel15);
                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                        comboBox = new JComboBox();
                                                                                                                                                                                                                                                                                                                                                                        comboBox.setModel(new DefaultComboBoxModel(new String[] {"------------------------", "manager", "receptionist", "instructor "}));
                                                                                                                                                                                                                                                                                                                                                                        comboBox.setBounds(91, 358, 132, 26);
                                                                                                                                                                                                                                                                                                                                                                        jPanel1.add(comboBox);
                                                                                                                                                                                                                                                                                                                                                                        comboBox.addItemListener(new ItemListener() {
                                                                                                                                                                                                                                                                                                                                                                			public void itemStateChanged(ItemEvent e) {
                                                                                                                                                                                                                                                                                                                                                                				String pos = (String)comboBox.getSelectedItem();
                                                                                                                                                                                                                                                                                                                                                                				 position = pos;
                                                                                                                                                                                                                                                                                                                                                                			}
                                                                                                                                                                                                                                                                                                                                                                		});
        
        JPanel panel = new JPanel();
        jTabbedPane1.addTab("View Users", null, panel, null);
        panel.setLayout(null);
        
        scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(10, 11, 976, 395);
        panel.add(scrollPane_1);
        
        table_1 = new JTable();
        
        allUsersTable = new String[allUsersRows] [9];
        allUsersColum = new String[]{"First Name","Last Name","Username","Password","Type"};
        
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        	},
        	new String[] {
        		"First Name", "Last Name", "Username", "Password", "Type"
        	}
        ));
        scrollPane_1.setViewportView(table_1);
        
        JButton btnViewAllUsers = new JButton("View All Users");
        btnViewAllUsers.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	displayAllUsers();
        	}
        });
        btnViewAllUsers.setBounds(10, 493, 112, 65);
        panel.add(btnViewAllUsers);
        
        lblType = new JLabel("Type");
        lblType.setBounds(10, 66, 42, 14);
        
        lblCapacity = new JLabel("Capacity");
        lblCapacity.setBounds(10, 99, 63, 14);
        
        lblPrice = new JLabel("Price");
        lblPrice.setBounds(10, 130, 42, 14);
        
        textField_3 = new JTextField();
        textField_3.setBounds(73, 60, 103, 26);
        textField_3.setColumns(10);
        
        button = new JButton();
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	createFacility();	
        		
        	}
        });
        button.setBounds(27, 165, 149, 32);
        button.setText("Create");

        jTabbedPane1.addTab("Facilities", jPanel3);
        jPanel3.setLayout(null);
        jPanel3.add(lblCapacity);
        jPanel3.add(lblPrice);
        jPanel3.add(lblType);
        jPanel3.add(textField_3);
        jPanel3.add(button);
        
        JLabel lblCreateFacility = new JLabel("Create facility");
        lblCreateFacility.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblCreateFacility.setBounds(10, 11, 96, 26);
        jPanel3.add(lblCreateFacility);
        
        JLabel lblShowAllFacilities = new JLabel("Show All Facilities");
        lblShowAllFacilities.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblShowAllFacilities.setBounds(10, 220, 128, 26);
        jPanel3.add(lblShowAllFacilities);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 257, 526, 248);
        jPanel3.add(scrollPane);
        
        table = new JTable();
        
        getAllFacilitiesTable = new String[getAllFacilitiesRows] [9];
        getAllFacilitiesColum = new String[]{"Facility Number", "Facility type", "Capacity", "Status","Price"};
        
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        		{null, null, null, null, null},
        	},
        	new String[] {
        		"Facility Number", "Facility type", "Capacity", "Status", "Price"
        	}
        ));
        scrollPane.setViewportView(table);
        
        JButton btnS = new JButton("Show Al Facilities");
        btnS.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		showAllFacilities();
        	}
        });
        btnS.setBounds(142, 220, 128, 26);
        jPanel3.add(btnS);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 208, 961, 1);
        jPanel3.add(separator_2);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(73, 92, 103, 26);
        jPanel3.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(73, 123, 103, 26);
        jPanel3.add(textField_2);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setBounds(10, 210, 1159, 14);
        jPanel3.add(separator_3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Statistics", jPanel5);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("RoomType");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Description");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Price");

        jButton2.setText("Create");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoom();
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Create Room");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("View All Rooms");

        jTable1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        		{null, null, null, null, null, null},
        	},
        	new String[] {
        		"Room No.", "Type", "Status", "Decription", "Price", "Last Cleaned"
        	}
        ));
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(104);
        jScrollPane1.setViewportView(jTable1);
        
        
        
        JLabel lblDeleteRoom = new JLabel();
        lblDeleteRoom.setBounds(274, 11, 117, 22);
        lblDeleteRoom.setText("Delete Room");
        lblDeleteRoom.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        JLabel lblRoomNo = new JLabel();
        lblRoomNo.setBounds(274, 46, 65, 15);
        lblRoomNo.setText("Room No.");
        lblRoomNo.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	deleteRoom();
        	}
        });
        btnDelete.setBounds(287, 143, 165, 33);

        jTabbedPane1.addTab("Rooms", jPanel2);
        jPanel2.setLayout(null);
        jPanel2.add(lblDeleteRoom);
        jPanel2.add(lblRoomNo);
        jPanel2.add(btnDelete);
        jPanel2.add(jSeparator3);
        jPanel2.add(jLabel16);
        jPanel2.add(jButton2);
        jPanel2.add(jLabel20);
        jPanel2.add(jLabel18);
        jPanel2.add(jLabel19);
        jPanel2.add(jLabel44);
        jPanel2.add(jScrollPane1);
        
        JSeparator separator = new JSeparator();
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setBounds(254, 6, 8, 178);
        jPanel2.add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 182, 510, 2);
        jPanel2.add(separator_1);
        
        textField = new JTextField();
        textField.setBounds(91, 46, 122, 28);
        jPanel2.add(textField);
        textField.setColumns(10);
        
        textField_4 = new JTextField();
        textField_4.setBounds(91, 75, 122, 28);
        jPanel2.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setBounds(91, 104, 122, 28);
        jPanel2.add(textField_5);
        textField_5.setColumns(10);
        
        textField_6 = new JTextField();
        textField_6.setEditable(false);
        textField_6.setBounds(336, 39, 69, 28);
        jPanel2.add(textField_6);
        textField_6.setColumns(10);
        
        JButton btnViewAllRooms = new JButton("View All Rooms");
        btnViewAllRooms.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	viewAllRooms();
        	}
        });
        btnViewAllRooms.setBounds(6, 596, 121, 28);
        jPanel2.add(btnViewAllRooms);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jTabbedPane1, GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jTabbedPane1, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(45, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnLogOut_1 = new JMenu("Log Out");
        menuBar.add(mnLogOut_1);
        
        JMenuItem mntmLogOut = new JMenuItem("Log Out");
        mntmLogOut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	setVisible(false);
        	LogIn logIn = new LogIn();
        	}
        });
        mnLogOut_1.add(mntmLogOut);
        
        JMenu mnLogOut = new JMenu("Exit");
        menuBar.add(mnLogOut);
        
        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        mnLogOut.add(mntmExit);
    }// </editor-fold>

    

    private void createStaff() {
    	try {
        	Staff staff =  new Staff();
        	
        	
        	
        	String fname = jTextField13.getText();
        	String lname = jTextField11.getText();
        	String uname = (fname.substring(0, 3) + lname.substring(0, 3));
        	
        	
        	String address = jTextField12.getText();
        	String country = jTextField9.getText();
        	String city =jTextField10.getText();
        	String email = jTextField1.getText();
        	String phone = jTextField3.getText();
        	String scpr = jTextField4.getText();
        	String pass =  (scpr.substring(0, 6));
        	
        	
        	java.util.Date utilStartDate = dateChooser.getDate(); 
        	java.sql.Date checkInDate = new java.sql.Date(utilStartDate.getTime());
        	String checkIn = checkInDate.toString();
        	
        	
        	java.util.Date utilStartDate2 = dateChooser_1.getDate(); 
        	java.sql.Date checkOutDate = new java.sql.Date(utilStartDate2.getTime());
        	String checkOut = checkOutDate.toString();
        	
        	String oPhone = jTextField2.getText();
        	String username = uname;
        	
        	String type="staff";
        	
        	
        		
        		staff.setfName(fname);
            	staff.setlName(lname);
            	staff.setAddress(address);
            	staff.setCountry(country);
            	staff.setCity(city);
            	staff.setPhone(phone);
            	staff.setUsername(username);
            	staff.setPassword(pass);
            	staff.setEmail(email);
            	staff.setType(type);
            	staff.setPosition(position);
            	staff.setContractStart(checkIn);
            	staff.setContractEnd(checkOut);
            	staff.setSalary(Double.parseDouble(jTextField8.getText()));
            	staff.setOfficePhone(oPhone);
            	
            	
            	UserController ctr =  new UserController();
            	
            	ctr.insertStaff(staff);
        		
        	
        	
            	jTextField13.setText(null);
            	jTextField11.setText(null);
            	jTextField12.setText(null);
            	jTextField9.setText(null);
            	jTextField10.setText(null);
            	jTextField1.setText(null);
            	jTextField3.setText(null);
            	jTextField4.setText(null);
            	jTextField8.setText(null);
            	jTextField2.setText(null);
            	jTextField2.setText(null);
            	
        	JOptionPane.showMessageDialog(null,"The staff user " + staff.getfName() + " " + staff.getlName()+  " was created");
    }
   catch(Exception e) {
    	JOptionPane.showMessageDialog(null,"Please type correct data");
    }
        }
    	

    private void createGuest() {
    	try {
        	Guest guest =  new Guest();
        	DBUser dbUser = new DBUser();
        	
        	
        	
        	String fname = jTextField25.getText();
        	String lname = jTextField24.getText();
        	String uname = (fname.substring(0, 3) + lname.substring(0, 3));
        	
        	
        	String address = jTextField22.getText();
        	String country = jTextField21.getText();
        	String city =jTextField23.getText();
        	String phone = jTextField18.getText();
        	String scpr = jTextField20.getText();
        	String pass =  (scpr.substring(0, 6));
        	
        	String username = uname;
        	String password = pass;
        	String email = jTextField19.getText();
        	String type="guest";
        	String travelAgency = jTextField17.getText();
        	
        	
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
        	guest.setCpr(scpr);
        	
        	UserController ctr =  new UserController();
        	ctr.createGuest(guest);
        	}
        	
        	jTextField25.setText(null);
            jTextField24.setText(null);
        	jTextField22.setText(null);
        	jTextField21.setText(null);
        	jTextField23.setText(null);
        	jTextField20.setText(null);
        	jTextField19.setText(null);
        	jTextField18.setText(null);
        	jTextField17.setText(null);
        	
        	JOptionPane.showMessageDialog(null,"The guest " + guest.getfName() + " " + guest.getlName()+  " was created");
    }
    catch(Exception e) {
    	JOptionPane.showMessageDialog(null,"Please type correct data");
    }
        }
    
    private void createTravelAgency() {
    	try {
        	TravelAgency agency =  new TravelAgency();
        	
        	
        	
        	String fname = jTextField37.getText();
        	String lname = jTextField29.getText();
        	
        	
        	
        	String address = jTextField26.getText();
        	String country = jTextField27.getText();
        	String city =jTextField36.getText();
        	String email = jTextField28.getText();
        	String phone = jTextField35.getText();
        	String companyId = jTextField34.getText();
        	String pass =  (companyId.substring(0, 6));
        	String name = jTextField30.getText();
        	String uname = (name.substring(0, 3) + companyId.substring(0, 3));
        	
        	
        	java.util.Date utilStartDate = dateChooser_2.getDate(); 
        	java.sql.Date start = new java.sql.Date(utilStartDate.getTime());
        	String startDate = start.toString();
        	
        	
        	java.util.Date utilStartDate2 = dateChooser_3.getDate(); 
        	java.sql.Date end = new java.sql.Date(utilStartDate2.getTime());
        	String endDate = end.toString();
        	
        	
        	String username = uname;
        	
        	String type="travelAgency";
        	
        	
        		
        		agency.setfName(fname);
        		agency.setlName(lname);
        		agency.setAddress(address);
            	agency.setCountry(country);
            	agency.setCity(city);
            	agency.setCompanyId(companyId);
            	agency.setPhone(phone);
            	agency.setUsername(username);
            	agency.setPassword(pass);
            	agency.setEmail(email);
            	agency.setType(type);
            	agency.setTravelAgencyName(name);
            	agency.setContractStart(startDate);
            	agency.setContractEnd(endDate);
            	agency.setCommission(Integer.parseInt(jTextField32.getText()));
            	
            	
            	
            	UserController ctr =  new UserController();
            	
            	ctr.insertTravelAgency(agency);
        		
        	
        	
            	jTextField37.setText(null);
            	jTextField29.setText(null);
            	jTextField26.setText(null);
            	jTextField27.setText(null);
            	jTextField36.setText(null);
            	jTextField34.setText(null);
            	jTextField28.setText(null);
            	jTextField35.setText(null);
            	jTextField32.setText(null);
            	jTextField30.setText(null);
            	
        	JOptionPane.showMessageDialog(null,"The staff user " + agency.getfName() + " " + agency.getlName()+  " was created");
    }
   catch(Exception e) {
    	JOptionPane.showMessageDialog(null,"Please type correct data");
    }
        }
    
    private void displayAllUsers () {
    	
		
		final UserController userCtr = new UserController();
      
    	
		userCtr.getAllUsers();
		allUsersRows = userCtr.getAllUsers().size();
		allUsersTable = new String [allUsersRows][9];
		allUsersColum = new String[]{"First Name","Last Name","Username","Password","Type"};
    	
  
    	
    	for(int i=0; i < allUsersRows; i++) {
    		
    		
    		
    		
    		String fName = userCtr.getAllUsers().get(i).getfName();
    		String lName = userCtr.getAllUsers().get(i).getlName();
    		String username = userCtr.getAllUsers().get(i).getUsername();
    		String password = userCtr.getAllUsers().get(i).getPassword();
    		String type = userCtr.getAllUsers().get(i).getType();
    		
    		allUsersTable[i][0] = fName;
    		allUsersTable[i][1] = lName;
    		allUsersTable[i][2] = username;
    		allUsersTable[i][3] = password;
    		allUsersTable[i][4] = type;
    		
    		
    	}
    	
    	table_1.setModel(new DefaultTableModel(allUsersTable, allUsersColum));
	}
    
     private void createFacility() {
    	
 		facilityCtr =  new FacilityController();
 		facility = new Facility();
 		

 		facility.setFacilityType(textField_3.getText());
 		facility.setFacilityPrice(Double.parseDouble(textField_2.getText()));
 		facility.setCapacity(textField_1.getText());
 		facility.setStatus("Available");
 		
 		facilityCtr.insertFacility(facility);
    	 
    	 
     }
    	
     private void showAllFacilities() {
    	 
    	 reservationCtr =  new ReservationController();
     	
     	
     	
     	getAllFacilitiesRows = reservationCtr.getAllFacilities().size();
     	getAllFacilitiesTable = new String [getAllFacilitiesRows][9];
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
     	
     	table.setModel(new DefaultTableModel(getAllFacilitiesTable,getAllFacilitiesColum));
    	 
    	 
     }
     
     private void createRoom() {
    	 
    	roomCtr =  new RoomController();
  		room = new Room();
  		

  		room.setPrice(Double.parseDouble(textField_5.getText()));
  		room.setRoomType(textField.getText());
  		room.setDescription(textField_4.getText());
  		room.setStatus("Available");
  		
  		roomCtr.insertRoom(room);
    	 
     }
    
     private void deleteRoom() {
    	 try {
 	    	
	    	 String deleteId = textField_6.getText();
	    	 int id = Integer.parseInt(deleteId);
	    	 
	    	 
	    	 	roomController = new RoomController();
	    	 	roomController.deleteRoom(id);
		    	 JOptionPane.showMessageDialog(null,"  The room was deleted ! ");	
	     
	     }
	     catch(Exception ex) {
           	 JOptionPane.showMessageDialog(null," Please type correct Room No. !");
 }
}
     
     private void viewAllRooms() {
    	 try {
    		  
    		  final RoomController roomCtr = new RoomController();
    		  roomsRows =  roomCtr.getAllRoom().size();
    		  roomsData = new String [roomsRows][6]; 
    		  roomsColumns = new String [] {"Room No.", "Type", "Status", "Decription", "Price", "Last Cleaned"} ;
    	   
    		  
    		  for(int i=0 ; i<roomsRows; i++) {
    			  
    			  String roomId = String.valueOf (roomCtr.getAllRoom().get(i).getRoomId());
    			  String type =  roomCtr.getAllRoom().get(i).getRoomType();
    			  String status = roomCtr.getAllRoom().get(i).getStatus();
    			  String description = roomCtr.getAllRoom().get(i).getDescription();
    			  String price = String.valueOf (roomCtr.getAllRoom().get(i).getPrice());
    			  String lastClean =  roomCtr.getAllRoom().get(i).getLastClean();
    			  
    			  
    			  roomsData [i][0] = roomId ; 
    			  roomsData [i][1] = type ; 
    			  roomsData [i][2] = status ; 
    			  roomsData [i][3] = description ; 
    			  roomsData [i][4] = price ; 
    			  roomsData [i][5] = lastClean ; 
    			  
    			  
    		  }
    		  
    		  jTable1.setModel(new DefaultTableModel(roomsData,roomsColumns));
    	  	jTable1.addMouseListener(new MouseAdapter() { 
    	          public void mouseClicked(MouseEvent e) { 
    	   
    	                      e.consume(); 
    	                  JTable target = (JTable)e.getSource(); 
    	                 int row = target.getSelectedRow(); 
    	                  
    	                 if(e.getClickCount()==1){ 
    	            
    	                
    	                
    	                	 String roomId1 = roomsData [row][0];
    	                	 int roomId = Integer.parseInt(roomId1);
    	                	 
    	                	 
    	               textField_6.setText(String.valueOf(roomCtr.searchRoomsId(roomId).getRoomId()));
    	                                  
    	                 } 
    	                 

    	       
    	          } 
    	       });
    	    	}
    	    	catch(Exception e) {
    	    		JOptionPane.showMessageDialog(null,"Refreshing rooms failed!");
    	    	}
    	  }
    	 
    	 
    	 
     
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
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
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private JLabel lblType;
    private JLabel lblCapacity;
    private JLabel lblPrice;
    private JTextField textField_3;
    private JButton button;
    private JTable table;
    private JScrollPane scrollPane_1;
    private JTable table_1;
    private JTextField textField_1;
    private JTextField textField_2;
    public JDateChooser dateChooser_1;
    private JDateChooser dateChooser;
    private  JDateChooser dateChooser_2;
    private  JDateChooser dateChooser_3;
    
    private FacilityController facilityCtr;
    private Facility facility;
    
    private String [][] allUsersTable;
    private String [] allUsersColum;
    private int allUsersRows;
    
    private String [][] getAllFacilitiesTable;
    private String [] getAllFacilitiesColum;
    private int getAllFacilitiesRows;
    
    private ReservationController reservationCtr;
    private JTextField textField;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    

	private RoomController roomCtr;
	private Room room;
	private RoomController roomController;
	
	
	
	 private int roomsRows;
	 private String [][] roomsData ; 
	 private String []  roomsColumns;
	 
	 private String position;
	 private  JComboBox comboBox;
}
