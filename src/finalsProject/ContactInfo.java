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


public class ContactInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtCNumber;
	private JTextField txtEmailAdd;
	private JTextField txtAdditional;
	private JTextField txtLName;
	private JTextField txtCard;
	private JTextField txtCardExp;
	private JTextField txtCardCVV;
	private JTextField txtCardName;

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
		
		JLabel lblFName = new JLabel("First Name:");
		lblFName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFName.setBounds(26, 79, 62, 23);
		contentPane.add(lblFName);
		
		txtFName = new JTextField();
		txtFName.setBounds(26, 102, 218, 29);
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
		
		txtLName = new JTextField();
		txtLName.setColumns(10);
		txtLName.setBounds(268, 102, 218, 29);
		contentPane.add(txtLName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLastName.setBounds(268, 79, 62, 23);
		contentPane.add(lblLastName);
		
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
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(241, 238, 223));
		panel.setBounds(514, 79, 268, 455);
		contentPane.add(panel);
		
		JLabel lblDispChildren = new JLabel("Children: 0");
		lblDispChildren.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDispChildren.setBounds(155, 236, 103, 13);
		panel.add(lblDispChildren);
		
		JLabel lblDispAdult = new JLabel("Adult: 0");
		lblDispAdult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDispAdult.setBounds(46, 235, 99, 13);
		panel.add(lblDispAdult);
		
		JLabel lblNumberOfGuests = new JLabel("Number of Guests: ");
		lblNumberOfGuests.setFont(new Font("Lucida Sans", Font.BOLD, 13));
		lblNumberOfGuests.setBounds(26, 204, 168, 22);
		panel.add(lblNumberOfGuests);
		
		JLabel lblCheckIn = new JLabel("Check-in");
		lblCheckIn.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckIn.setBounds(26, 76, 72, 13);
		panel.add(lblCheckIn);
		
		JLabel lblCheckInTime = new JLabel("After 2:00PM");
		lblCheckInTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCheckInTime.setBounds(26, 100, 106, 13);
		panel.add(lblCheckInTime);
		
		JLabel lblDispCheckOut = new JLabel(" to null");
		lblDispCheckOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckOut.setBounds(126, 145, 126, 13);
		panel.add(lblDispCheckOut);
		
		JLabel lblDispCheckIn = new JLabel("null");
		lblDispCheckIn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDispCheckIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckIn.setBounds(26, 145, 97, 13);
		panel.add(lblDispCheckIn);
		
		JLabel lblDispDaysOfStay = new JLabel("");
		lblDispDaysOfStay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispDaysOfStay.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispDaysOfStay.setBounds(88, 169, 106, 24);
		panel.add(lblDispDaysOfStay);
		
		JLabel lblBookingSummary = new JLabel("Booking Summary");
		lblBookingSummary.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblBookingSummary.setBounds(21, 26, 224, 24);
		panel.add(lblBookingSummary);
		
		JLabel lblCheckout = new JLabel("Check-out");
		lblCheckout.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckout.setBounds(149, 76, 72, 13);
		panel.add(lblCheckout);
		
		JLabel lblBeforepm = new JLabel("Before 12:00PM");
		lblBeforepm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBeforepm.setBounds(148, 100, 97, 13);
		panel.add(lblBeforepm);
		
		JLabel lblPaymentDetails = new JLabel("Payment Details");
		lblPaymentDetails.setFont(new Font("Serif", Font.BOLD, 14));
		lblPaymentDetails.setBounds(26, 259, 126, 25);
		panel.add(lblPaymentDetails);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(88, 421, 89, 23);
		panel.add(btnEdit);
		
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
	}
}
