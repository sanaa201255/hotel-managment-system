package GUI;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;


import Controller.UserController;
import Model.TravelAgency;
import Model.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn extends javax.swing.JFrame {

	private Object GuestPanel;
	private GUI.GuestPanel guest;
	private GUI.GuestPanel guestPanel;
	
	
	
	public LogIn() {
		setResizable(false);
		setTitle("Log In ");
        initComponents();

    }

    
    private void initComponents() {
    	setVisible(true);
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	logIn();
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(0);
        	}
        });
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");

       
       

        jButton1.setText("Log In");

        jButton2.setText("Exit");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Welcome to Marroco Holdiday Center");

        jLabel4.setText("Please enter your username and password:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(62)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(2)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jLabel1)
        								.addComponent(jLabel2))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jTextField1)
        								.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        								.addGap(18)
        								.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jLabel4)))
        					.addPreferredGap(ComponentPlacement.RELATED, 26, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jLabel3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(18)
        			.addComponent(jLabel4)
        			.addGap(11)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addGap(29))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void logIn(){
    	User user =  new User();
    	
    	String username = jTextField1.getText();
		String password = jPasswordField1.getText();
    	UserController userCtr = new UserController();
    	
    	userCtr.logIn(username, password);
    	int us = userCtr.logIn(username, password);
    	userCtr.searchUserId(us);
    	String one = "guest";
    	String two = "staff";
    	String three = "travelAgency";
    	
    	user=userCtr.searchUserId(us);
    	
    	try {
    	if((username.equals("admin")) && (password.equals("admin"))) {
    		AdminPanel adminPanel = new AdminPanel();
    		setVisible(false);
    		
    	}
    	else if ((username.equals(username)) && (password.equals(password)) && (user.getType().equals(one))) {
    		
    		GuestPanel guestPanel = new GuestPanel(userCtr.searchUserId(us).getUserId());
			setVisible(false);
    }
		else if ((username.equals(username)) && (password.equals(password)) && (user.getType().equals(three))) {
			TravelAgencyPanel travelAgency = new TravelAgencyPanel();
			setVisible(false);
			
    }
		else if ((username.equals(username)) && (password.equals(password)) && (user.getType().equals(two))) {
		
			if((userCtr.searchStaffId(us).getPosition().equals("receptionist"))) {
			ReceptionistPanel receptionistPanel = new ReceptionistPanel();
			setVisible(false);
			}
			
			else if((userCtr.searchStaffId(us).getPosition().equals("manager"))) {
				ManagerPanel managerPanel = new ManagerPanel();
				setVisible(false);
			}
			
			
		}
		
		 
        
    }
    catch(Exception e){
    	JOptionPane.showMessageDialog(null,
    		    "Please type correct username and password !","Error", JOptionPane.ERROR_MESSAGE);
    	System.out.println(e);
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
   
}
