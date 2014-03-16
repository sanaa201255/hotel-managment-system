
package GUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import Controller.UserController;
import DB.DBUser;
import Model.Guest;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.JFrame;

public class CreateGuest extends javax.swing.JFrame {

    private JFrame createGuest;
	private UserController ctr;
	
    public CreateGuest() {
    	setResizable(false);
        initComponents();
    }

   
    private void initComponents() {

    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    	createGuest = new JFrame();
    	createGuest.setVisible(true);
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel13 = new javax.swing.JLabel();
        jLabel13.setFont(new Font("SansSerif", Font.BOLD, 12));
        jLabel14 = new javax.swing.JLabel();
        jLabel14.setFont(new Font("SansSerif", Font.BOLD, 12));
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        		createGuest();
        		
        	
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        clear();
        	
        	}
        });

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel4");

        jLabel7.setText("jLabel7");

        jLabel10.setText("jLabel10");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jLabel3.setText("Last Name");

        jLabel5.setText("First Name");

        jLabel6.setText("Country");

        jLabel8.setText("City");

        jLabel9.setText("Address");

        jLabel11.setText("Email");

        jLabel12.setText("Phone");

        jLabel13.setText("CPR");

        jLabel14.setText("Travel Agency");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jButton1.setText("Create");

        jButton2.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(41)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel13)
        				.addComponent(jLabel9)
        				.addComponent(jLabel6)
        				.addComponent(jLabel8)
        				.addComponent(jLabel11)
        				.addComponent(jLabel12)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(jLabel5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jLabel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addComponent(jLabel14))
        			.addGap(48)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(33)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jTextField5))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel6))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextField11)
        						.addComponent(jLabel12))
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        					.addGap(27)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jTextField4))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel14))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2))
        			.addGap(70))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    
    private void createGuest() {
        	Guest guest =  new Guest();
        	DBUser dbUser = new DBUser();   	
        	String fname = jTextField10.getText();
        	String lname = jTextField5.getText();
        	String uname = (fname.substring(0, 3) + lname.substring(0, 3));
        	
        	
        	String address = jTextField8.getText();
        	String country = jTextField7.getText();
        	String city =jTextField6.getText();
        	String phone = jTextField11.getText();
        	String scpr = jTextField4.getText();
        	String pass =  (scpr.substring(0, 6));
        	
        	String username = uname;
        	String password = pass;
        	String email = jTextField9.getText();
        	String type="guest";
        	String travelAgency = jTextField3.getText();
        	
        	
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
        	JOptionPane.showMessageDialog(null,"The guest " + guest.getfName() + " " + guest.getlName()+  " was created");
        	createGuest.setVisible(false);
   }
    
    
    	private void clear () {
    	
    	jTextField4.setText(null);
        jTextField5.setText(null);
    	jTextField6.setText(null);
    	jTextField8.setText(null);
    	jTextField9.setText(null);
    	jTextField10.setText(null);
    	jTextField11.setText(null);
    	jTextField2.setText(null);
    	jTextField3.setText(null);
    	jTextField7.setText(null);
    	
    	
    	
    }
    
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    
    
    // End of variables declaration
}
