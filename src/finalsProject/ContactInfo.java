package finalsProject;

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
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ContactInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFName;
	private JTextField txtCNumber;
	private JTextField txtEmailAdd;
	private JTextField txtAdditional;
	private JTextField txtPay;
	private JTextArea textAreaPayment;
	private JLabel lblError;
	static String name;
	static String contact;
	static String email;
	static String remarks;
	static double tqtotal;
	static int randomNum;

	/**
	 * Create the frame.
	 */
	public ContactInfo(Booking booking) {
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

		JLabel lblFName = new JLabel("Name:");
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
		lblAdditional.setBounds(26, 202, 184, 23);
		contentPane.add(lblAdditional);

		txtAdditional = new JTextField();
		txtAdditional.setColumns(10);
		txtAdditional.setBounds(26, 225, 460, 54);
		contentPane.add(txtAdditional);

		JLabel lblPaymentInformation = new JLabel("Payment Information:");
		lblPaymentInformation.setFont(new Font("Georgia", Font.PLAIN, 18));
		lblPaymentInformation.setBounds(26, 296, 184, 24);
		contentPane.add(lblPaymentInformation);

		JLabel lblPay = new JLabel("Enter your total amount due:");
		lblPay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPay.setBounds(26, 331, 184, 23);
		contentPane.add(lblPay);

		txtPay = new JTextField();
		txtPay.setColumns(10);
		txtPay.setBounds(26, 354, 242, 29);
		contentPane.add(txtPay);

		lblError = new JLabel("");
		lblError.setForeground(new Color(255, 0, 0));
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblError.setBounds(38, 385, 218, 23);
		contentPane.add(lblError);

		JButton btnConfirm = new JButton("Confirm Booking");
		btnConfirm.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double total = booking.getTotalPrice();
				
				double amountDue = Double.parseDouble(txtPay.getText());
				
				if (total != amountDue) {
					lblError.setText("Enter the same amount as your amount due.");
					
				} else {
					
				

				name = txtFName.getText();
				contact = txtCNumber.getText();
				email = txtEmailAdd.getText();
				remarks = txtAdditional.getText();
				tqtotal = Double.parseDouble(txtPay.getText());


				setVisible(false);
				ThankYou f5 = new ThankYou(booking);
				f5.setVisible(true);
				}
			}
			
			

		});
		btnConfirm.setBounds(62, 419, 164, 23);
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
		panelYourStay.setBounds(504, 91, 289, 443);
		contentPane.add(panelYourStay);

		JLabel lblDispGuest = new JLabel(" 0");
		lblDispGuest.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDispGuest.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispGuest.setBounds(37, 169, 97, 24);
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
		lblDispCheckOut.setBounds(137, 145, 126, 13);
		panelYourStay.add(lblDispCheckOut);

		JLabel lblDispCheckIn = new JLabel("null");
		lblDispCheckIn.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDispCheckIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckIn.setBounds(37, 145, 97, 13);
		panelYourStay.add(lblDispCheckIn);

		JLabel lblDispDaysOfStay = new JLabel("");
		lblDispDaysOfStay.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispDaysOfStay.setBounds(137, 169, 126, 24);
		panelYourStay.add(lblDispDaysOfStay);

		JLabel lblYourStay = new JLabel("Booking Summary:");
		lblYourStay.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblYourStay.setBounds(21, 26, 200, 24);
		panelYourStay.add(lblYourStay);

		JLabel lblCheckout = new JLabel("Check-out");
		lblCheckout.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckout.setBounds(167, 76, 72, 13);
		panelYourStay.add(lblCheckout);

		JLabel lblBeforepm = new JLabel("Before 12:00PM");
		lblBeforepm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBeforepm.setBounds(166, 100, 97, 13);
		panelYourStay.add(lblBeforepm);

		textAreaPayment = new JTextArea();
		textAreaPayment.setEditable(false);
		textAreaPayment.setBackground(new Color(241, 238, 223));
		textAreaPayment.setBounds(26, 239, 253, 147);
		panelYourStay.add(textAreaPayment);

		JLabel lblPaymentDetails = new JLabel("Payment Details: ");
		lblPaymentDetails.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblPaymentDetails.setBounds(21, 204, 200, 24);
		panelYourStay.add(lblPaymentDetails);

		JLabel lblPleaseNoteYour = new JLabel("*Please note your requests or special needs");
		lblPleaseNoteYour.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblPleaseNoteYour.setBounds(213, 203, 223, 23);
		contentPane.add(lblPleaseNoteYour);

		displayPayment(booking);

		LocalDate checkInDate = booking.getCheckInDate();
		LocalDate checkOutDate = booking.getCheckOutDate();

		int numOfGuests = booking.getNumOfGuests();
		long numberOfDays = booking.getNumOfDays();

		lblDispCheckIn.setText("" + checkInDate);
		lblDispCheckOut.setText(" to " + checkOutDate);

		if (checkInOut.numOfGuests == 1) {
			lblDispGuest.setText(numOfGuests + " Guest, ");
		} else {
			lblDispGuest.setText(numOfGuests + " Guests, ");
		}

		if (checkInOut.numberOfDays == 1) {
			lblDispDaysOfStay.setText(numberOfDays + " night");
		} else {
			lblDispDaysOfStay.setText(numberOfDays + " nights");
		}
		
		BookingStorage.addBooking(booking);

	}

	private void displayPayment(Booking booking) {
		textAreaPayment.setText("Room: " + RoomTypes.roomType + "\tPhp"
				+ String.format("%,.2f\n", RoomTypes.previousTotal) + String.join("\n", RoomTypes.selectedAdditionals)
				+ "\nTotal Amount Due: \tPhp"
				+ String.format("%,.2f", RoomTypes.total));
	}
}
