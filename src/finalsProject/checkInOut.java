package finalsProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.time.temporal.ChronoUnit;

public class checkInOut extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPrompt;
	private JLabel lblPromptChildren;
	static LocalDate checkInDate;
	static LocalDate checkOutDate;
	static int adult;
	static int children;
	static long numberOfDays;
	private long numberOfDaysBetween;
	static int numOfGuests;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkInOut frame = new checkInOut();
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
	public checkInOut() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 483);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(228, 220, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCozyHotel = new JLabel("Cozy Hotel");
		lblCozyHotel.setFont(new Font("Serif", Font.PLAIN, 26));
		lblCozyHotel.setBounds(131, 10, 126, 60);
		contentPane.add(lblCozyHotel);
		
		JDateChooser dateChsrCheckIn = new JDateChooser();
		dateChsrCheckIn.setBounds(131, 105, 126, 19);
		contentPane.add(dateChsrCheckIn);
		
		JDateChooser dateChsrCheckOut = new JDateChooser();
		dateChsrCheckOut.setBounds(131, 150, 126, 19);
		contentPane.add(dateChsrCheckOut);
		
		JLabel lblCheckInDate = new JLabel("Check-in date:");
		lblCheckInDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCheckInDate.setBounds(132, 91, 84, 13);
		contentPane.add(lblCheckInDate);
		
		
		
		JLabel lblCheckOutDate = new JLabel("Check-out date:");
		lblCheckOutDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCheckOutDate.setBounds(131, 134, 103, 13);
		contentPane.add(lblCheckOutDate);
		
		
		
		SpinnerNumberModel adu = new SpinnerNumberModel(1, 1, null, 1); //initial, minimum, maximum, step size
		
		JSpinner spnAdult = new JSpinner(adu);
		spnAdult.setBounds(149, 238, 96, 20);
		contentPane.add(spnAdult);
		
		JLabel lblNumGuests = new JLabel("Number of guests:");
		lblNumGuests.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumGuests.setBounds(131, 198, 126, 19);
		contentPane.add(lblNumGuests);
		
		JLabel lblAdult = new JLabel("Adult:");
		lblAdult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdult.setBounds(111, 237, 48, 19);
		contentPane.add(lblAdult);
		
		lblPrompt = new JLabel("");
		lblPrompt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrompt.setForeground(new Color(255, 0, 0));
		lblPrompt.setBounds(114, 174, 158, 25);
		contentPane.add(lblPrompt);
		
		lblPromptChildren = new JLabel("*Ages 12 and below");
		lblPromptChildren.setBounds(255, 289, 108, 25);
		contentPane.add(lblPromptChildren);
		
		SpinnerNumberModel child = new SpinnerNumberModel(0, 0, null, 1);
		
		JSpinner spnChildren = new JSpinner(child);
		spnChildren.setBounds(149, 290, 96, 20);
		contentPane.add(spnChildren);	
		
		
		
		JButton btnProceed =  new JButton("Proceed");
		btnProceed.setBackground(new Color(213, 180, 136));
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				checkInDate = dateChsrCheckIn.getDate() != null ? dateChsrCheckIn.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;
				checkOutDate = dateChsrCheckOut.getDate() != null ? dateChsrCheckOut.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;
				
				
				adult = (int) spnAdult.getValue();
				children =(int) spnChildren.getValue();
				
				numOfGuests = (adult + children);

				if (checkInDate == null || checkOutDate == null) {
					lblPrompt.setText("Please choose valid dates.");
				} else if (checkOutDate.isBefore(checkInDate)) {
					lblPrompt.setText("Enter a valid checkout date.");
					} else {
						
						numberOfDaysBetween = ChronoUnit.DAYS.between(checkInDate, checkOutDate);

						// If you want to include both check-in and check-out days in the count:
						numberOfDays = numberOfDaysBetween++; // Increment by 1
				    	setVisible(false);
						RoomTypes f3 = new RoomTypes();
						f3.setVisible(true);
				    }	
			}
		});
		btnProceed.setBounds(149, 335, 85, 21);
		contentPane.add(btnProceed);
		
		JLabel lblChildren = new JLabel("Children:");
		lblChildren.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChildren.setBounds(98, 289, 48, 19);
		contentPane.add(lblChildren);
		
		
		
		
		
		
		
	}
}
