package finalsProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class ContactInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtCNumber;
	private JTextField txtEmailAdd;
	private JTextField txtAdditional;
	private JTextField txtCard;
	private JTextField txtCardExp;
	private JTextField txtCardCVV;
	private JTextField txtCardName;
	private JTextArea textAreaPayment;
	private JLabel lblDispDaysOfStay;
	private JLabel lblDispGuest;
	private JLabel lblDispCheckIn;
	private JLabel lblDispCheckOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInfo frame = new ContactInfo();
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
	public ContactInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 819, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 220, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblContactInfo = new JLabel("Contact Information");
		lblContactInfo.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblContactInfo.setBounds(26, 33, 242, 29);
		contentPane.add(lblContactInfo);
		
		JLabel lblFName = new JLabel("Full Name:");
		lblFName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFName.setBounds(26, 79, 62, 23);
		contentPane.add(lblFName);
		
		txtFName = new JTextField();
		txtFName.setBounds(26, 102, 460, 29);
		contentPane.add(txtFName);
		txtFName.setColumns(10);
		
		JLabel lblCNumber = new JLabel("Contact Number:");
		lblCNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCNumber.setBounds(26, 141, 112, 23);
		contentPane.add(lblCNumber);
		
		txtCNumber = new JTextField();
		txtCNumber.setColumns(10);
		txtCNumber.setBounds(26, 162, 218, 29);
		contentPane.add(txtCNumber);
		
		txtEmailAdd = new JTextField();
		txtEmailAdd.setColumns(10);
		txtEmailAdd.setBounds(268, 162, 218, 29);
		contentPane.add(txtEmailAdd);
		
		JLabel lblEmailAdd = new JLabel("Email Address:");
		lblEmailAdd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailAdd.setBounds(271, 141, 91, 23);
		contentPane.add(lblEmailAdd);
		
		JLabel lblAdditional = new JLabel("Additional Detail & Preferences:");
		lblAdditional.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdditional.setBounds(26, 202, 336, 23);
		contentPane.add(lblAdditional);
		
		txtAdditional = new JTextField();
		txtAdditional.setColumns(10);
		txtAdditional.setBounds(26, 225, 460, 54);
		contentPane.add(txtAdditional);
		
		JLabel lblPaymentInformation = new JLabel("Payment Information:");
		lblPaymentInformation.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblPaymentInformation.setBounds(26, 296, 184, 24);
		contentPane.add(lblPaymentInformation);
		
		JLabel lblCard = new JLabel("Card Number");
		lblCard.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCard.setBounds(26, 331, 112, 23);
		contentPane.add(lblCard);
		
		txtCard = new JTextField();
		txtCard.setColumns(10);
		txtCard.setBounds(26, 354, 242, 29);
		contentPane.add(txtCard);
		
		JLabel lblCardExp = new JLabel("Expiration Date");
		lblCardExp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCardExp.setBounds(26, 391, 112, 23);
		contentPane.add(lblCardExp);
		
		txtCardExp = new JTextField();
		txtCardExp.setColumns(10);
		txtCardExp.setBounds(26, 411, 124, 29);
		contentPane.add(txtCardExp);
		
		txtCardCVV = new JTextField();
		txtCardCVV.setColumns(10);
		txtCardCVV.setBounds(156, 411, 112, 29);
		contentPane.add(txtCardCVV);
		
		JLabel lblCardCVV = new JLabel("CVV");
		lblCardCVV.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCardCVV.setBounds(156, 391, 112, 23);
		contentPane.add(lblCardCVV);
		
		txtCardName = new JTextField();
		txtCardName.setColumns(10);
		txtCardName.setBounds(26, 465, 242, 29);
		contentPane.add(txtCardName);
		
		JLabel lblCardName = new JLabel("Name on Card");
		lblCardName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCardName.setBounds(26, 445, 112, 23);
		contentPane.add(lblCardName);
		
		JButton btnConfirm = new JButton("Confirm Booking");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ThankYou f5 = new ThankYou();
				f5.setVisible(true);
			}
		});
		btnConfirm.setBounds(61, 511, 164, 23);
		contentPane.add(btnConfirm);
		
		JLabel lblPolicies = new JLabel("Policies:");
		lblPolicies.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblPolicies.setBounds(282, 296, 184, 24);
		contentPane.add(lblPolicies);
		
		JLabel lblCPoli = new JLabel("Cancel Policy:");
		lblCPoli.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblCPoli.setBounds(281, 396, 112, 23);
		contentPane.add(lblCPoli);
		
		JLabel lblCPoli1 = new JLabel("Book & Buy promo. Reservation cannot");
		lblCPoli1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPoli1.setBounds(281, 418, 223, 23);
		contentPane.add(lblCPoli1);
		
		JLabel lblCPoli2 = new JLabel("be cancelled and is non-refundable. ");
		lblCPoli2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCPoli2.setBounds(281, 434, 223, 23);
		contentPane.add(lblCPoli2);
		
		JLabel lblGPoli = new JLabel("Guarantee Policy:");
		lblGPoli.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblGPoli.setBounds(281, 324, 112, 23);
		contentPane.add(lblGPoli);
		
		JLabel lblGPoli1 = new JLabel("Please provide credit card details to");
		lblGPoli1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGPoli1.setBounds(281, 346, 223, 23);
		contentPane.add(lblGPoli1);
		
		JLabel lblGPoli2 = new JLabel("guarantee your reservation.");
		lblGPoli2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGPoli2.setBounds(281, 362, 223, 23);
		contentPane.add(lblGPoli2);
		
		JLabel lblPoli1 = new JLabel("*Confirming your booking means you have");
		lblPoli1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPoli1.setBounds(282, 465, 222, 23);
		contentPane.add(lblPoli1);
		
		JLabel lblPoli2 = new JLabel("read and agreed on the hotel's policies.");
		lblPoli2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblPoli2.setBounds(282, 482, 222, 23);
		contentPane.add(lblPoli2);
		
		JPanel panelYourStay = new JPanel();
		panelYourStay.setLayout(null);
		panelYourStay.setBackground(new Color(241, 238, 223));
		panelYourStay.setBounds(525, 91, 268, 455);
		contentPane.add(panelYourStay);
		
		JLabel lblDispGuest = new JLabel(" 0");
		lblDispGuest.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDispGuest.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispGuest.setBounds(26, 169, 97, 24);
		panelYourStay.add(lblDispGuest);
		
		JLabel lblCheckIn = new JLabel("Check-in");
		lblCheckIn.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckIn.setBounds(26, 76, 72, 13);
		panelYourStay.add(lblCheckIn);
		
		JLabel lblCheckInTime = new JLabel("After 2:00PM");
		lblCheckInTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCheckInTime.setBounds(26, 100, 106, 13);
		panelYourStay.add(lblCheckInTime);
		
		JLabel lblDispCheckOut = new JLabel(" to null");
		lblDispCheckOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckOut.setBounds(126, 145, 126, 13);
		panelYourStay.add(lblDispCheckOut);
		
		JLabel lblDispCheckIn = new JLabel("null");
		lblDispCheckIn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDispCheckIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckIn.setBounds(26, 145, 97, 13);
		panelYourStay.add(lblDispCheckIn);
		
		JLabel lblDispDaysOfStay = new JLabel("");
		lblDispDaysOfStay.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispDaysOfStay.setBounds(126, 169, 126, 24);
		panelYourStay.add(lblDispDaysOfStay);
		
		JLabel lblYourStay = new JLabel("Booking Summary:");
		lblYourStay.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblYourStay.setBounds(21, 26, 200, 24);
		panelYourStay.add(lblYourStay);
		
		JLabel lblCheckout = new JLabel("Check-out");
		lblCheckout.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckout.setBounds(149, 76, 72, 13);
		panelYourStay.add(lblCheckout);
		
		JLabel lblBeforepm = new JLabel("Before 12:00PM");
		lblBeforepm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBeforepm.setBounds(148, 100, 97, 13);
		panelYourStay.add(lblBeforepm);
		
		textAreaPayment = new JTextArea();
		textAreaPayment.setEditable(false);
		textAreaPayment.setBackground(new Color(241, 238, 223));
		textAreaPayment.setBounds(50, 239, 189, 189);
		panelYourStay.add(textAreaPayment);
		
		JLabel lblPaymentDetails = new JLabel("Payment Details: ");
		lblPaymentDetails.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblPaymentDetails.setBounds(21, 204, 200, 24);
		panelYourStay.add(lblPaymentDetails);
		
		displayPayment();
		//display();
		
	}
	private void displayPayment() {
		textAreaPayment.setText(RoomTypes.roomType+" Room Php"+ String.format("%,.2f\n",RoomTypes.previousTotal)
				+"("+checkInOut.numberOfDays+" night/s)\n"
				+ String.join("\n", RoomTypes.selectedAdditionals)+ " for "+RoomTypes.massageGuests
				+"\n\tPhp"+String.format("%,.2f",RoomTypes.totalMassage)
				+"\nTotal Amount Due: \n\tPhp"+String.format("%,.2f",RoomTypes.total));
	}
	/*private void display() {
		lblDispCheckIn.setText("" + checkInOut.checkInDate);
		lblDispCheckOut.setText(" to " + checkInOut.checkOutDate);
		
		if (checkInOut.numOfGuests ==1) {
			lblDispGuest.setText(checkInOut.numOfGuests +" Guest, ");
			}else {
				lblDispGuest.setText(checkInOut.numOfGuests +" Guests, ");
			}
		
		if(checkInOut.numberOfDays == 1) {
			lblDispDaysOfStay.setText(checkInOut.numberOfDays+" night");
			}else {
				lblDispDaysOfStay.setText(checkInOut.numberOfDays+" nights");
			}
	
		}*/
}
