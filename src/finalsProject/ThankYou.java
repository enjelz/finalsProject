package finalsProject;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;



public class ThankYou extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblThankYouBookingNum;
	private JLabel lblDispPleaseName;
	private JLabel lblDispContactInfo;
	private JLabel lblDispEmailAdd;

	/**
	 * Create the frame.
	 */
	public ThankYou(Booking booking) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(227, 220, 203));
		panel.setBounds(0, 0, 557, 458);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHms = new JLabel("Booking Confirmed");
		lblHms.setBounds(137, 61, 270, 38);
		panel.add(lblHms);
		lblHms.setHorizontalAlignment(SwingConstants.CENTER);
		lblHms.setFont(new Font("Serif", Font.PLAIN, 30));

		JLabel lblHms_1 = new JLabel("Cozy Hotel");
		lblHms_1.setBounds(213, 11, 103, 23);
		panel.add(lblHms_1);
		lblHms_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHms_1.setFont(new Font("Serif", Font.PLAIN, 20));

		JLabel lblMotto = new JLabel("\"Book your stay, the perfect way.\"");
		lblMotto.setHorizontalAlignment(SwingConstants.CENTER);
		lblMotto.setBounds(163, 34, 207, 14);
		panel.add(lblMotto);
		lblMotto.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 9));

		lblDispPleaseName = new JLabel(
				"");
		lblDispPleaseName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispPleaseName.setBounds(39, 110, 478, 14);
		panel.add(lblDispPleaseName);
		lblDispPleaseName.setFont(new Font("Tahoma", Font.PLAIN, 11));

		JLabel lblBookingDeatils = new JLabel("Booking Details");
		lblBookingDeatils.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingDeatils.setFont(new Font("Serif", Font.BOLD, 19));
		lblBookingDeatils.setBounds(53, 194, 131, 38);
		panel.add(lblBookingDeatils);

		JLabel lblBookingNo = new JLabel("Booking No.");
		lblBookingNo.setBounds(53, 219, 63, 38);
		panel.add(lblBookingNo);
		lblBookingNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingNo.setFont(new Font("Serif", Font.PLAIN, 12));

		lblThankYouBookingNum = new JLabel("New label");
		lblThankYouBookingNum.setBounds(53, 258, 63, 14);
		panel.add(lblThankYouBookingNum);
		lblThankYouBookingNum.setText("" + ContactInfo.randomNum);

		JLabel lblCheckIn = new JLabel("Check In - Out");
		lblCheckIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblCheckIn.setFont(new Font("Serif", Font.PLAIN, 12));
		lblCheckIn.setBounds(172, 219, 72, 38);
		panel.add(lblCheckIn);

		JLabel lblThankYouCheckIn = new JLabel("New label");
		lblThankYouCheckIn.setBounds(172, 258, 113, 14);
		panel.add(lblThankYouCheckIn);

		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setFont(new Font("Serif", Font.PLAIN, 12));
		lblTotal.setBounds(314, 227, 29, 23);
		panel.add(lblTotal);

		JLabel lblThankYouTotalAmount = new JLabel("New label");
		lblThankYouTotalAmount.setBounds(314, 258, 72, 14);
		panel.add(lblThankYouTotalAmount);
		lblThankYouTotalAmount.setText("" + ContactInfo.tqtotal);

		JLabel lblNewLabel_2 = new JLabel("Duration:");
		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(416, 231, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNightsStay = new JLabel("New label");
		lblNightsStay.setBounds(416, 258, 72, 14);
		panel.add(lblNightsStay);

		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBounds(222, 402, 103, 14);
		panel.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel(
				"Thank you for choosing Cozy Hotel! We can't wait to make your stay exceptional.");
		lblNewLabel_1.setBounds(79, 377, 422, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 11));

		JLabel lblNewLabel_3_1 = new JLabel("Remarks:");
		lblNewLabel_3_1.setFont(new Font("Serif", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(53, 306, 63, 14);
		panel.add(lblNewLabel_3_1);

		JLabel lblThankYouRemarks = new JLabel("");
		lblThankYouRemarks.setBounds(53, 331, 472, 35);
		panel.add(lblThankYouRemarks);

		JLabel lblThankYouCheckOut = new JLabel("null");
		lblThankYouCheckOut.setBounds(172, 270, 103, 14);
		panel.add(lblThankYouCheckOut);
		
		JLabel lblContactInfo = new JLabel("Contact No:");
		lblContactInfo.setFont(new Font("Serif", Font.PLAIN, 11));
		lblContactInfo.setBounds(54, 150, 72, 14);
		panel.add(lblContactInfo);
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setFont(new Font("Serif", Font.PLAIN, 11));
		lblEmailAddress.setBounds(53, 169, 73, 14);
		panel.add(lblEmailAddress);
		
		lblDispContactInfo = new JLabel("");
		lblDispContactInfo.setBounds(134, 150, 191, 14);
		panel.add(lblDispContactInfo);
		
		lblDispEmailAdd = new JLabel("");
		lblDispEmailAdd.setBounds(137, 169, 191, 14);
		panel.add(lblDispEmailAdd);
		
			lblThankYouBookingNum.setText(String.format("%03d" ,booking.getId()));
			lblThankYouCheckIn.setText(booking.getCheckInDate()+" to");
			lblThankYouCheckOut.setText(booking.getCheckOutDate()+"");
			lblNightsStay.setText(booking.getNumOfDays() + " Night/s");
			lblThankYouTotalAmount.setText(String.format("%,.2f", booking.getTotalPrice()));
			lblThankYouRemarks.setText(ContactInfo.remarks);
			lblDispPleaseName.setText("We are pleased to inform you " + ContactInfo.name+",");
			lblDispEmailAdd.setText(ContactInfo.email);
			lblDispContactInfo.setText(ContactInfo.contact);
			
			JLabel lblDispPleaseName_1 = new JLabel("that your reservation request has been received and confirmed.");
			lblDispPleaseName_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblDispPleaseName_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblDispPleaseName_1.setBounds(39, 125, 478, 14);
			panel.add(lblDispPleaseName_1);
	
			
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				HomePage f1 = new HomePage();
				f1.setVisible(true);
			}
		});
	}
}
