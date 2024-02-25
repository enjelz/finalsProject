package finalsProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;

public class RoomTypes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDispCheckIn;
	private JLabel lblDispCheckOut;
	private JLabel lblDispAdult;
	private JLabel lblDispChildren;
	private JLabel lblDispRoomType;
	private JLabel lblDispDaysOfStay;
	private static JLabel lblDispTotal;
	private JLabel lblBeforepm;
	private JLabel lblAddons;
	public JCheckBox chckbxBed;
	private JCheckBox chckbxPillow;
	private JCheckBox chckbxBlanket;
	static double total;
	static String addOn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RoomTypes frame = new RoomTypes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RoomTypes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1439, 591);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 220, 203));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCozyHotel = new JLabel("Cozy Hotel");
		lblCozyHotel.setBounds(468, 5, 126, 60);
		lblCozyHotel.setFont(new Font("Serif", Font.PLAIN, 26));
		contentPane.add(lblCozyHotel);
		
		JLabel lblNewLabel_1 = new JLabel("---------------------");
		lblNewLabel_1.setBounds(42, 134, 114, 104);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("---------------------");
		lblNewLabel_1_1_1_1_1.setBounds(42, 419, 114, 104);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("");
		lblNewLabel_3_4_2.setBounds(136, 239, 218, 13);
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3_4_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(1145, 79, 268, 455);
		panel.setBackground(new Color(241, 238, 223));
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblDispChildren = new JLabel("");
		lblDispChildren.setBounds(155, 236, 103, 13);
		panel.add(lblDispChildren);
		lblDispChildren.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDispChildren.setText("Children: "+checkInOut.children);
		
		lblDispAdult = new JLabel("");
		lblDispAdult.setBounds(46, 235, 99, 13);
		panel.add(lblDispAdult);
		lblDispAdult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDispAdult.setText("Adult: "+checkInOut.adult);
		
		JLabel lblNumberOfGuests = new JLabel("Number of Guests: ");
		lblNumberOfGuests.setBounds(26, 204, 168, 22);
		panel.add(lblNumberOfGuests);
		lblNumberOfGuests.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		
		JLabel lblCheckIn = new JLabel("Check-in");
		lblCheckIn.setBounds(26, 76, 72, 13);
		panel.add(lblCheckIn);
		lblCheckIn.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		
		JLabel lblCheckInTime = new JLabel("After 2:00PM");
		lblCheckInTime.setBounds(26, 100, 106, 13);
		panel.add(lblCheckInTime);
		lblCheckInTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		//panel
		lblDispCheckOut = new JLabel("");
		lblDispCheckOut.setBounds(126, 145, 126, 13);
		panel.add(lblDispCheckOut);
		lblDispCheckOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		lblDispCheckOut.setText(" to " + checkInOut.checkOutDate);
		
		lblDispCheckIn = new JLabel("");
		lblDispCheckIn.setBounds(26, 145, 97, 13);
		panel.add(lblDispCheckIn);
		lblDispCheckIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckIn.setHorizontalAlignment(SwingConstants.TRAILING);
		
		//CheckInDate display
		lblDispCheckIn.setText("" + checkInOut.checkInDate);
		
		lblDispRoomType = new JLabel("");
		lblDispRoomType.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispRoomType.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 13));
		lblDispRoomType.setBounds(10, 343, 248, 22);
		panel.add(lblDispRoomType);
		
		lblDispTotal = new JLabel("");
		lblDispTotal.setForeground(new Color(227, 98, 147));
		lblDispTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispTotal.setFont(new Font("Serif", Font.BOLD, 15));
		lblDispTotal.setBounds(26, 373, 226, 22);
		panel.add(lblDispTotal);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ContactInfo f4 = new ContactInfo();
				f4.setVisible(true);
			}
		});
		btnProceed.setBounds(81, 406, 113, 21);
		panel.add(btnProceed);
		
		lblDispDaysOfStay = new JLabel("");
		lblDispDaysOfStay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispDaysOfStay.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispDaysOfStay.setBounds(88, 169, 106, 24);
		panel.add(lblDispDaysOfStay);
		
		//display nights of stay
		if(checkInOut.numberOfDays == 1) {
			lblDispDaysOfStay.setText(checkInOut.numberOfDays+" night");
		}else {
			lblDispDaysOfStay.setText(checkInOut.numberOfDays+" nights");
		}
		
		
		JLabel lblYourStay = new JLabel("Your Stay:");
		lblYourStay.setBounds(21, 26, 121, 24);
		panel.add(lblYourStay);
		lblYourStay.setFont(new Font("Georgia", Font.PLAIN, 20));
		
		JLabel lblCheckout = new JLabel("Check-out");
		lblCheckout.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckout.setBounds(149, 76, 72, 13);
		panel.add(lblCheckout);
		
		lblBeforepm = new JLabel("Before 12:00PM");
		lblBeforepm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBeforepm.setBounds(148, 100, 97, 13);
		panel.add(lblBeforepm);
		
		
		
		lblAddons = new JLabel("Add-ons:");
		lblAddons.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblAddons.setBounds(26, 280, 72, 25);
		panel.add(lblAddons);
		
		JLabel lblDispAddOns = new JLabel("display of list of add-ons");
		lblDispAddOns.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDispAddOns.setBounds(95, 286, 157, 13);
		panel.add(lblDispAddOns);
        
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(205, 183, 169));
        panel_1.setBounds(22, 122, 828, 130);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblStandard = new JLabel("Standard");
        lblStandard.setBounds(145, 46, 114, 13);
        panel_1.add(lblStandard);
        lblStandard.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblCapStandard = new JLabel("Maximum of 1 person only.");
        lblCapStandard.setBounds(145, 62, 187, 13);
        panel_1.add(lblCapStandard);
        lblCapStandard.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JLabel lblRateStandard = new JLabel("P5,000.00");
        lblRateStandard.setBounds(366, 45, 114, 24);
        panel_1.add(lblRateStandard);
        lblRateStandard.setHorizontalAlignment(SwingConstants.CENTER);
        lblRateStandard.setFont(new Font("Sylfaen", Font.PLAIN, 14));
        
        JLabel lblStandardStatus = new JLabel("Available");
        lblStandardStatus.setBounds(535, 46, 100, 22);
        panel_1.add(lblStandardStatus);
        lblStandardStatus.setHorizontalAlignment(SwingConstants.CENTER);
        lblStandardStatus.setFont(new Font("Sylfaen", Font.PLAIN, 16));
        
        //booking of rooms
        
        JButton btnStandardBook = new JButton("BOOK");
        btnStandardBook.setBounds(703, 44, 85, 21);
        panel_1.add(btnStandardBook);
        btnStandardBook.setBackground(new Color(240, 240, 240));
        btnStandardBook.addActionListener(new ActionListener() {
        	
        	
        	public void actionPerformed(ActionEvent e) {
        		
        		lblDispRoomType.setText("Room Type: Standard");
        		total = (checkInOut.numberOfDays * 5000);
        		
        		
        		lblDispTotal.setText("Your total: " +String.format("P%,.2f",total));
        		
        		//enables the checkbox
        		chckbxBed.setEnabled(true);
                chckbxPillow.setEnabled(true);
                chckbxBlanket.setEnabled(true);
                
        		
        		
        	}
        });
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(224, 201, 169));
        panel_2.setForeground(new Color(255, 255, 255));
        panel_2.setBounds(21, 79, 829, 39);
        contentPane.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Room Details");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(74, 12, 126, 13);
        panel_2.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 15));
        
        JLabel lblRoomRate = new JLabel("Rate per Night");
        lblRoomRate.setBounds(359, 6, 121, 24);
        panel_2.add(lblRoomRate);
        lblRoomRate.setHorizontalAlignment(SwingConstants.CENTER);
        lblRoomRate.setFont(new Font("Georgia", Font.BOLD, 15));
        
        JLabel lblStatus = new JLabel("Status");
        lblStatus.setBounds(524, 6, 126, 24);
        panel_2.add(lblStatus);
        lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
        lblStatus.setFont(new Font("Georgia", Font.BOLD, 15));
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBackground(new Color(205, 183, 169));
        panel_1_1.setBounds(22, 263, 828, 130);
        contentPane.add(panel_1_1);
        panel_1_1.setLayout(null);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("---------------------");
        lblNewLabel_1_1_1.setBounds(20, 15, 114, 104);
        panel_1_1.add(lblNewLabel_1_1_1);
        
        JLabel lblCapDeluxe = new JLabel("Maximum of 2 persons only.");
        lblCapDeluxe.setBounds(144, 70, 187, 13);
        panel_1_1.add(lblCapDeluxe);
        lblCapDeluxe.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JLabel lblDeluxe = new JLabel("Deluxe");
        lblDeluxe.setBounds(144, 49, 114, 13);
        panel_1_1.add(lblDeluxe);
        lblDeluxe.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblRateDeluxe = new JLabel("P8,000.00");
        lblRateDeluxe.setBounds(370, 44, 114, 24);
        panel_1_1.add(lblRateDeluxe);
        lblRateDeluxe.setHorizontalAlignment(SwingConstants.CENTER);
        lblRateDeluxe.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JLabel lblStandardStatus_1_1 = new JLabel("Available");
        lblStandardStatus_1_1.setBounds(534, 49, 100, 22);
        panel_1_1.add(lblStandardStatus_1_1);
        lblStandardStatus_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblStandardStatus_1_1.setFont(new Font("Sylfaen", Font.PLAIN, 16));
        
        JButton btnDeluxeBook = new JButton("BOOK");
        btnDeluxeBook.setBounds(703, 47, 85, 21);
        panel_1_1.add(btnDeluxeBook);
        btnDeluxeBook.setBackground(new Color(240, 240, 240));
        btnDeluxeBook.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		
        		lblDispRoomType.setText("Room Type: Deluxe");
        		total = (checkInOut.numberOfDays * 8000);
        		
        		lblDispTotal.setText("Your total: " +String.format("P%,.2f",total));
        		
        		chckbxBed.setEnabled(true);
                chckbxPillow.setEnabled(true);
                chckbxBlanket.setEnabled(true);
               
        	}
        });
        
        JPanel panel_1_2 = new JPanel();
        panel_1_2.setBackground(new Color(205, 183, 169));
        panel_1_2.setBounds(22, 404, 828, 130);
        contentPane.add(panel_1_2);
        panel_1_2.setLayout(null);
        
        JLabel lblRateLuxury = new JLabel("P10,000.00");
        lblRateLuxury.setBounds(372, 49, 114, 24);
        panel_1_2.add(lblRateLuxury);
        lblRateLuxury.setHorizontalAlignment(SwingConstants.CENTER);
        lblRateLuxury.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JLabel lblMaximumOf = new JLabel("Maximum of 4 persons only.");
        lblMaximumOf.setBounds(140, 77, 187, 13);
        panel_1_2.add(lblMaximumOf);
        lblMaximumOf.setFont(new Font("Tahoma", Font.PLAIN, 12));
        
        JLabel lblLuxury = new JLabel("Luxury");
        lblLuxury.setBounds(140, 47, 114, 26);
        panel_1_2.add(lblLuxury);
        lblLuxury.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblStandardStatus_1_3 = new JLabel("Available");
        lblStandardStatus_1_3.setBounds(534, 54, 100, 22);
        panel_1_2.add(lblStandardStatus_1_3);
        lblStandardStatus_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblStandardStatus_1_3.setFont(new Font("Sylfaen", Font.PLAIN, 16));
        
        
        JButton btnLuxuryBook = new JButton("BOOK");
        btnLuxuryBook.setBounds(702, 52, 85, 21);
        panel_1_2.add(btnLuxuryBook);
        btnLuxuryBook.setBackground(new Color(240, 240, 240));
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(241, 238, 223));
        panel_3.setBounds(860, 79, 275, 455);
        contentPane.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblAdditionals = new JLabel("Additionals:");
        lblAdditionals.setFont(new Font("Georgia", Font.ITALIC, 16));
        lblAdditionals.setBounds(21, 22, 102, 24);
        panel_3.add(lblAdditionals);
        
        JLabel lblBed = new JLabel("P500.00");
        lblBed.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblBed.setBounds(166, 55, 59, 13);
        panel_3.add(lblBed);
        
        JLabel lblPilloP = new JLabel("P250.00");
        lblPilloP.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPilloP.setBounds(166, 77, 59, 13);
        panel_3.add(lblPilloP);
        
        JLabel lblBlanketP = new JLabel("P150.00");
        lblBlanketP.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblBlanketP.setBounds(166, 101, 59, 13);
        panel_3.add(lblBlanketP);
        
        JLabel lblMassageServices = new JLabel("Massage Services:");
        lblMassageServices.setFont(new Font("Georgia", Font.PLAIN, 16));
        lblMassageServices.setBounds(21, 125, 169, 24);
        panel_3.add(lblMassageServices);
        
        chckbxBed = new JCheckBox("Bed");
        chckbxBed.setBounds(53, 56, 80, 13);
        panel_3.add(chckbxBed);
        
        //block that disables the checkbox until the user books a room
        chckbxBed.setEnabled(false);
        //bedSelect = chckbxBed.isSelected();
        
        chckbxPillow = new JCheckBox("Pillow");
        chckbxPillow.setBounds(53, 102, 80, 13);
        panel_3.add(chckbxPillow);
        chckbxPillow.setEnabled(false);
        //pillowSelect = chckbxPillow.isSelected();
        
        chckbxBlanket = new JCheckBox("Blanket");
        chckbxBlanket.setBounds(53, 78, 80, 13);
        panel_3.add(chckbxBlanket);
        chckbxBlanket.setEnabled(false);
        
        JLabel lblonlyOneFor = new JLabel("*only one for each is allowed");
        lblonlyOneFor.setFont(new Font("Tahoma", Font.ITALIC, 10));
        lblonlyOneFor.setBounds(119, 29, 133, 13);
        panel_3.add(lblonlyOneFor);
        
        JRadioButton rdbtnSigMassage = new JRadioButton("Cozy Hotel Signature Massage");
        rdbtnSigMassage.setBounds(31, 161, 221, 23);
        panel_3.add(rdbtnSigMassage);
        
        JRadioButton rdbtnAroma = new JRadioButton("Aromatherapy Massage");
        rdbtnAroma.setBounds(31, 230, 221, 23);
        panel_3.add(rdbtnAroma);
        
        JLabel lblPhpFor = new JLabel("Php 2,000 for 60 minutes");
        lblPhpFor.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPhpFor.setBounds(106, 207, 146, 13);
        panel_3.add(lblPhpFor);
        
        JLabel lblDeets = new JLabel("Deets**");
        lblDeets.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDeets.setBounds(106, 191, 146, 13);
        panel_3.add(lblDeets);
        
        JLabel lblDeets_1 = new JLabel("Deets**");
        lblDeets_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDeets_1.setBounds(106, 260, 146, 13);
        panel_3.add(lblDeets_1);
        
        JLabel lblPhpFor_1 = new JLabel("Php 2,500 for 60 minutes");
        lblPhpFor_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPhpFor_1.setBounds(106, 276, 146, 13);
        panel_3.add(lblPhpFor_1);
        
        JRadioButton rdbtnTotalBodyGlow = new JRadioButton("Total Body Glow Massage");
        rdbtnTotalBodyGlow.setBounds(31, 300, 221, 23);
        panel_3.add(rdbtnTotalBodyGlow);
        
        JLabel lblDeets_1_1 = new JLabel("Apricot Scrub with Dead Sea Salt");
        lblDeets_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblDeets_1_1.setBounds(70, 330, 182, 13);
        panel_3.add(lblDeets_1_1);
        
        JLabel lblPhpFor_1_1 = new JLabel("Php 3,200 for 90 minutes");
        lblPhpFor_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblPhpFor_1_1.setBounds(106, 345, 146, 13);
        panel_3.add(lblPhpFor_1_1);
        
        JSpinner spinner = new JSpinner();
        spinner.setBounds(153, 384, 59, 20);
        panel_3.add(spinner);
        
        JLabel lblNumberOfGuests_1 = new JLabel("Number of Guests:");
        lblNumberOfGuests_1.setFont(new Font("Serif", Font.PLAIN, 12));
        lblNumberOfGuests_1.setBounds(53, 381, 102, 25);
        panel_3.add(lblNumberOfGuests_1);
        chckbxBlanket.addItemListener(new CheckBoxListener());
        chckbxPillow.addItemListener(new CheckBoxListener());
        
        	//buttons checkbox
			chckbxBed.addItemListener(new CheckBoxListener());
        btnLuxuryBook.addActionListener(new ActionListener() {
        
        	public void actionPerformed(ActionEvent e) {
        		
        		lblDispRoomType.setText("Room Type: Luxury");
        		total = (checkInOut.numberOfDays * 10000);
        		
        		lblDispTotal.setText("Your total: " +String.format("P%,.2f",total));
        		
    
        		chckbxBed.setEnabled(true);
                chckbxPillow.setEnabled(true);
                chckbxBlanket.setEnabled(true);
               
        	}
        });
	        
		
		
		
	}
	
	/*public void updateTotal() {
	    
	        lblDispTotal.setText("Your total: " + String.format("P%,.2f", total));
	    }*/
	 
	 
	private class CheckBoxListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            Object source = e.getItemSelectable();

            if (source == chckbxBed) {
                if (chckbxBed.isSelected()) {
                    total = total + 500;
                } else {
                    total = total - 500;
                }
            } else if (source == chckbxPillow) {
                if (chckbxPillow.isSelected()) {
                    total = total + 100;
                } else {
                    total = total - 100;
                }
            } else if (source == chckbxBlanket) {
                if (chckbxBlanket.isSelected()) {
                    total = total + 150;
                } else {
                    total = total - 150;
                }
            
            }
            lblDispTotal.setText("Your total: " + String.format("P%,.2f", total));
           // updateTotal(); // Update the label whenever a checkbox state changes
        }
	
	
	}
}

