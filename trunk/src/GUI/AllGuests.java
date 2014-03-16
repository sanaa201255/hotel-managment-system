package GUI;



import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.UserController;

public class AllGuests {

	private JFrame frmAllOrders;
	private JTable table;
	private String [][] data;
	private String[] columns ;
	private int rows;

	 
	public AllGuests() {
		initialize();
		display();
	}

	private void initialize() {
		
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllGuests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    
		
		
		
		frmAllOrders = new JFrame();
		frmAllOrders.setTitle("All Registered Guests");
		frmAllOrders.setVisible(true);
		frmAllOrders.setBounds(100, 100, 749, 482);
		frmAllOrders.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 733, 432);
		frmAllOrders.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		data= new String [rows][10];
	    columns =new String[] {"First Name", "Last Name", "Address", "Country", "City", "E-mail", "Phone", "Username", "Password", "CPR"} ;
	    table.setModel(new DefaultTableModel(data,columns));

	    
	    
	    
	}
	
	public void display() {
		
		UserController ctr = new UserController();

		rows = ctr.getAllGuest().size();
		data = new String [rows] [10];
        columns = new String[]{"First Name", "Last Name", "Address", "Country", "City", "E-mail", "Phone", "Username", "Password", "CPR"} ;
	   
	    
for(int i = 0;i<rows ;i++) {
    		
    		String fName = ctr.getAllGuest().get(i).getfName();
    		String lName = ctr.getAllGuest().get(i).getlName();
    		String address = ctr.getAllGuest().get(i).getAddress();
    		String country = ctr.getAllGuest().get(i).getCountry();
    		String city = ctr.getAllGuest().get(i).getCity();
    		String email = ctr.getAllGuest().get(i).getEmail();
    		String phone = ctr.getAllGuest().get(i).getPhone();
    		String username = ctr.getAllGuest().get(i).getUsername();
    		String password = ctr.getAllGuest().get(i).getPassword();
    		String cpr = ctr.getAllGuest().get(i).getCpr();
    		
    		
    		data[i][0]= fName;
    		data[i][1]= lName;
    		data[i][2]= address;
    		data[i][3]=  country;
    		data[i][4]= city;
    		data[i][5]= email;
    		data[i][6]= phone;
    		data[i][7]= username;
    		data[i][8]= password;
    		data[i][9]= cpr;

    	}
    	
    	table.setModel(new DefaultTableModel(data,columns));
    }
	
}
