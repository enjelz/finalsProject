package finalsProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import finalsProject.BookingStorage.RoomType;

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
import java.util.ArrayList;
import java.util.List;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class RoomTypes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblDispCheckIn;
	private JLabel lblDispCheckOut;
	private JLabel lblDispGuest;
	private JLabel lblDispRoomType;
	private JLabel lblDispDaysOfStay;
	private static JLabel lblDispTotal;
	private JLabel lblCheckOutTime;
	private JLabel lblAddons;
	public static JCheckBox chckbxBed;
	private JCheckBox chckbxPillow;
	private JCheckBox chckbxBlanket;
	static double total;
	static String addOn;

	private JRadioButton rdbtnSigMassage;
	private JRadioButton rdbtnAromaMassage;
	private JRadioButton rdbtnBodyGlowMassage;

	private double previousTotalMassageCost = 0;
	private JSpinner spnGuests;
	private JButton btnConfirmMassage;
	static double previousTotal;
	private JTextArea textAreaAddOns;
	private JButton btnLuxuryBook;
	private JButton btnStandardBook;
	private JButton btnDeluxeBook;
	private static JLabel lblStandardStatus;
	private static JLabel lblDeluxeStatus;
	private static JLabel lblLuxuryStatus;
	public static String roomType;
	public static double totalMassage;
	public static int massageGuests;
	public static List<String> selectedAdditionals = new ArrayList<>();


	/**
	 * Create the frame.
	 */
	public RoomTypes(Booking booking) {
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

		JLabel lblPicStandard = new JLabel("---------------------");
		lblPicStandard.setIcon(new ImageIcon(RoomTypes.class.getResource("/images/Standard1.png")));
		lblPicStandard.setBounds(42, 134, 114, 104);
		contentPane.add(lblPicStandard);

		JLabel lblPicLuxury = new JLabel("---------------------");
		lblPicLuxury.setIcon(new ImageIcon(RoomTypes.class.getResource("/images/Luxury1.png")));
		lblPicLuxury.setBounds(42, 419, 114, 104);
		contentPane.add(lblPicLuxury);

		JLabel lblNewLabel_3_4_2 = new JLabel("");
		lblNewLabel_3_4_2.setBounds(136, 239, 218, 13);
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3_4_2);

		JPanel panelYourStay = new JPanel();
		panelYourStay.setBounds(1145, 79, 268, 455);
		panelYourStay.setBackground(new Color(241, 238, 223));
		contentPane.add(panelYourStay);
		panelYourStay.setLayout(null);

		lblDispGuest = new JLabel("");
		lblDispGuest.setHorizontalAlignment(SwingConstants.TRAILING);
		lblDispGuest.setBounds(26, 169, 97, 24);
		panelYourStay.add(lblDispGuest);
		lblDispGuest.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispGuest.setText(" 0");

		JLabel lblCheckIn = new JLabel("Check-in");
		lblCheckIn.setBounds(26, 76, 72, 13);
		panelYourStay.add(lblCheckIn);
		lblCheckIn.setFont(new Font("Lucida Fax", Font.BOLD, 13));

		JLabel lblCheckInTime = new JLabel("After 2:00PM");
		lblCheckInTime.setBounds(26, 100, 106, 13);
		panelYourStay.add(lblCheckInTime);
		lblCheckInTime.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblDispCheckOut = new JLabel("");
		lblDispCheckOut.setBounds(126, 145, 126, 13);
		panelYourStay.add(lblDispCheckOut);
		lblDispCheckOut.setFont(new Font("Tahoma", Font.BOLD, 12));

		lblDispCheckIn = new JLabel("");
		lblDispCheckIn.setBounds(26, 145, 97, 13);
		panelYourStay.add(lblDispCheckIn);
		lblDispCheckIn.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDispCheckIn.setHorizontalAlignment(SwingConstants.TRAILING);

		lblDispRoomType = new JLabel("");
		lblDispRoomType.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispRoomType.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 13));
		lblDispRoomType.setBounds(4, 204, 248, 22);
		panelYourStay.add(lblDispRoomType);

		lblDispTotal = new JLabel("");
		lblDispTotal.setForeground(new Color(227, 98, 147));
		lblDispTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblDispTotal.setFont(new Font("Serif", Font.BOLD, 15));
		lblDispTotal.setBounds(26, 370, 226, 22);
		panelYourStay.add(lblDispTotal);

		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				booking.setTotalPrice(total);
				
				if (booking.getRoomType() == null) {
					return;
				}

				setVisible(false);
				ContactInfo f4 = new ContactInfo(booking);
				f4.setVisible(true);
			}
		});
		btnProceed.setBounds(81, 406, 113, 21);
		panelYourStay.add(btnProceed);

		lblDispDaysOfStay = new JLabel("");
		lblDispDaysOfStay.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 11));
		lblDispDaysOfStay.setBounds(126, 169, 126, 24);
		panelYourStay.add(lblDispDaysOfStay);

		JLabel lblYourStay = new JLabel("Your Stay:");
		lblYourStay.setBounds(21, 26, 121, 24);
		panelYourStay.add(lblYourStay);
		lblYourStay.setFont(new Font("Georgia", Font.PLAIN, 20));

		JLabel lblCheckout = new JLabel("Check-out");
		lblCheckout.setFont(new Font("Lucida Fax", Font.BOLD, 13));
		lblCheckout.setBounds(149, 76, 72, 13);
		panelYourStay.add(lblCheckout);

		lblCheckOutTime = new JLabel("Before 12:00PM");
		lblCheckOutTime.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCheckOutTime.setBounds(148, 100, 97, 13);
		panelYourStay.add(lblCheckOutTime);

		lblAddons = new JLabel("Add-ons:");
		lblAddons.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 12));
		lblAddons.setBounds(26, 231, 72, 25);
		panelYourStay.add(lblAddons);

		JPanel panelStandard = new JPanel();
		panelStandard.setBackground(new Color(205, 183, 169));
		panelStandard.setBounds(22, 122, 828, 130);
		contentPane.add(panelStandard);
		panelStandard.setLayout(null);

		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(145, 46, 114, 13);
		panelStandard.add(lblStandard);
		lblStandard.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblCapStandard = new JLabel("Maximum of 1 person only.");
		lblCapStandard.setBounds(145, 62, 187, 13);
		panelStandard.add(lblCapStandard);
		lblCapStandard.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblRateStandard = new JLabel("P5,000.00");
		lblRateStandard.setBounds(366, 45, 114, 24);
		panelStandard.add(lblRateStandard);
		lblRateStandard.setHorizontalAlignment(SwingConstants.CENTER);
		lblRateStandard.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		lblStandardStatus = new JLabel("Available");
		lblStandardStatus.setBounds(535, 46, 100, 22);
		panelStandard.add(lblStandardStatus);
		lblStandardStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStandardStatus.setFont(new Font("Sylfaen", Font.PLAIN, 16));

		
		btnStandardBook = new JButton("BOOK");
		btnStandardBook.setBounds(703, 44, 85, 21);
		panelStandard.add(btnStandardBook);
		btnStandardBook.setBackground(new Color(240, 240, 240));

		btnStandardBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				booking.setRoomType(RoomType.STANDARD);

				lblDispRoomType.setText("Room Type: Standard");

				roomType = "Standard";
				total = total + (checkInOut.numberOfDays * 5000) - previousTotal;

				updateTotal();

				toEnable();

				previousTotal = checkInOut.numberOfDays * 5000;

			}
		});

		JPanel panelRoomDetails = new JPanel();
		panelRoomDetails.setBackground(new Color(224, 201, 169));
		panelRoomDetails.setForeground(new Color(255, 255, 255));
		panelRoomDetails.setBounds(21, 79, 829, 39);
		contentPane.add(panelRoomDetails);
		panelRoomDetails.setLayout(null);

		JLabel lblNewLabel = new JLabel("Room Details");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(74, 12, 126, 13);
		panelRoomDetails.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 15));

		JLabel lblRoomRate = new JLabel("Rate per Night");
		lblRoomRate.setBounds(359, 6, 121, 24);
		panelRoomDetails.add(lblRoomRate);
		lblRoomRate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoomRate.setFont(new Font("Georgia", Font.BOLD, 15));

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(524, 6, 126, 24);
		panelRoomDetails.add(lblStatus);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setFont(new Font("Georgia", Font.BOLD, 15));

		JPanel panelDeluxe = new JPanel();
		panelDeluxe.setBackground(new Color(205, 183, 169));
		panelDeluxe.setBounds(22, 263, 828, 130);
		contentPane.add(panelDeluxe);
		panelDeluxe.setLayout(null);

		JLabel lblPicDeluxe = new JLabel("---------------------");
		lblPicDeluxe.setIcon(new ImageIcon(RoomTypes.class.getResource("/images/DeLuxe1.png")));
		lblPicDeluxe.setBounds(20, 11, 114, 104);
		panelDeluxe.add(lblPicDeluxe);

		JLabel lblCapDeluxe = new JLabel("Maximum of 2 persons only.");
		lblCapDeluxe.setBounds(144, 70, 187, 13);
		panelDeluxe.add(lblCapDeluxe);
		lblCapDeluxe.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblDeluxe = new JLabel("Deluxe");
		lblDeluxe.setBounds(144, 49, 114, 13);
		panelDeluxe.add(lblDeluxe);
		lblDeluxe.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblRateDeluxe = new JLabel("P8,000.00");
		lblRateDeluxe.setBounds(370, 44, 114, 24);
		panelDeluxe.add(lblRateDeluxe);
		lblRateDeluxe.setHorizontalAlignment(SwingConstants.CENTER);
		lblRateDeluxe.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblDeluxeStatus = new JLabel("Available");
		lblDeluxeStatus.setBounds(534, 49, 100, 22);
		panelDeluxe.add(lblDeluxeStatus);
		lblDeluxeStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblDeluxeStatus.setFont(new Font("Sylfaen", Font.PLAIN, 16));

		btnDeluxeBook = new JButton("BOOK");
		btnDeluxeBook.setBounds(703, 47, 85, 21);
		panelDeluxe.add(btnDeluxeBook);
		btnDeluxeBook.setBackground(new Color(240, 240, 240));
		btnDeluxeBook.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				booking.setRoomType(RoomType.DELUXE);

				lblDispRoomType.setText("Room Type: Deluxe");
				roomType = "Deluxe\t";
				total = total + (checkInOut.numberOfDays * 8000) - previousTotal;

				updateTotal();

				toEnable();

				previousTotal = checkInOut.numberOfDays * 8000;

			}
		});

		JPanel panelLuxury = new JPanel();
		panelLuxury.setBackground(new Color(205, 183, 169));
		panelLuxury.setBounds(22, 404, 828, 130);
		contentPane.add(panelLuxury);
		panelLuxury.setLayout(null);

		JLabel lblRateLuxury = new JLabel("P10,000.00");
		lblRateLuxury.setBounds(372, 49, 114, 24);
		panelLuxury.add(lblRateLuxury);
		lblRateLuxury.setHorizontalAlignment(SwingConstants.CENTER);
		lblRateLuxury.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblMaximumOf = new JLabel("Maximum of 4 persons only.");
		lblMaximumOf.setBounds(140, 77, 187, 13);
		panelLuxury.add(lblMaximumOf);
		lblMaximumOf.setFont(new Font("Tahoma", Font.PLAIN, 12));

		JLabel lblLuxury = new JLabel("Luxury");
		lblLuxury.setBounds(140, 47, 114, 26);
		panelLuxury.add(lblLuxury);
		lblLuxury.setFont(new Font("Tahoma", Font.BOLD, 15));

		lblLuxuryStatus = new JLabel("Available");
		lblLuxuryStatus.setBounds(534, 54, 100, 22);
		panelLuxury.add(lblLuxuryStatus);
		lblLuxuryStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblLuxuryStatus.setFont(new Font("Sylfaen", Font.PLAIN, 16));

		JPanel panelAdditionals = new JPanel();
		panelAdditionals.setBackground(new Color(241, 238, 223));
		panelAdditionals.setBounds(860, 79, 275, 455);
		contentPane.add(panelAdditionals);
		panelAdditionals.setLayout(null);

		JLabel lblAdditionals = new JLabel("Additionals:");
		lblAdditionals.setFont(new Font("Georgia", Font.ITALIC, 16));
		lblAdditionals.setBounds(21, 22, 102, 24);
		panelAdditionals.add(lblAdditionals);

		JLabel lblBed = new JLabel("P500.00");
		lblBed.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBed.setBounds(166, 55, 59, 13);
		panelAdditionals.add(lblBed);

		JLabel lblPilloP = new JLabel("P150.00");
		lblPilloP.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPilloP.setBounds(166, 77, 59, 13);
		panelAdditionals.add(lblPilloP);

		JLabel lblBlanketP = new JLabel("P100.00");
		lblBlanketP.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBlanketP.setBounds(166, 101, 59, 13);
		panelAdditionals.add(lblBlanketP);

		JLabel lblMassageServices = new JLabel("Massage Services:");
		lblMassageServices.setFont(new Font("Georgia", Font.PLAIN, 16));
		lblMassageServices.setBounds(21, 125, 169, 24);
		panelAdditionals.add(lblMassageServices);

		chckbxBed = new JCheckBox("Bed");
		chckbxBed.setBounds(53, 53, 80, 13);
		panelAdditionals.add(chckbxBed);

		chckbxPillow = new JCheckBox("Pillow");
		chckbxPillow.setBounds(53, 102, 80, 13);
		panelAdditionals.add(chckbxPillow);

		chckbxBlanket = new JCheckBox("Blanket");
		chckbxBlanket.setBounds(53, 78, 80, 13);
		panelAdditionals.add(chckbxBlanket);

		JLabel lblonlyOneFor = new JLabel("*only one for each is allowed");
		lblonlyOneFor.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblonlyOneFor.setBounds(119, 29, 133, 13);
		panelAdditionals.add(lblonlyOneFor);

		JLabel lblPhpFor = new JLabel("Php 2,000 for 60 minutes");
		lblPhpFor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPhpFor.setBounds(106, 207, 146, 13);
		panelAdditionals.add(lblPhpFor);

		JLabel lblDeets = new JLabel("Deets**");
		lblDeets.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDeets.setBounds(106, 191, 146, 13);
		panelAdditionals.add(lblDeets);

		JLabel lblDeets_1 = new JLabel("Deets**");
		lblDeets_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDeets_1.setBounds(106, 260, 146, 13);
		panelAdditionals.add(lblDeets_1);

		JLabel lblPhpFor_1 = new JLabel("Php 2,500 for 60 minutes");
		lblPhpFor_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPhpFor_1.setBounds(106, 276, 146, 13);
		panelAdditionals.add(lblPhpFor_1);

		JLabel lblDeets_1_1 = new JLabel("Apricot Scrub with Dead Sea Salt");
		lblDeets_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDeets_1_1.setBounds(70, 330, 182, 13);
		panelAdditionals.add(lblDeets_1_1);

		JLabel lblPhpFor_1_1 = new JLabel("Php 3,200 for 90 minutes");
		lblPhpFor_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPhpFor_1_1.setBounds(106, 345, 146, 13);
		panelAdditionals.add(lblPhpFor_1_1);

		SpinnerNumberModel a = new SpinnerNumberModel(1, 1, checkInOut.numOfGuests, 1);
		spnGuests = new JSpinner(a);
		spnGuests.setBounds(153, 384, 59, 20);
		panelAdditionals.add(spnGuests);

		JLabel lblGuestsMassage = new JLabel("Number of Guests:");
		lblGuestsMassage.setFont(new Font("Serif", Font.PLAIN, 12));
		lblGuestsMassage.setBounds(53, 381, 102, 25);
		panelAdditionals.add(lblGuestsMassage);
		
		chckbxBlanket.addItemListener(new CheckBoxListener());
		chckbxPillow.addItemListener(new CheckBoxListener());
		chckbxBed.addItemListener(new CheckBoxListener());
		

		btnLuxuryBook = new JButton("BOOK");
		btnLuxuryBook.setBounds(702, 52, 85, 21);
		panelLuxury.add(btnLuxuryBook);
		btnLuxuryBook.setBackground(new Color(240, 240, 240));

		btnLuxuryBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				booking.setRoomType(RoomType.LUXURY);

				lblDispRoomType.setText("Room Type: Luxury");
				roomType = "Luxury\t";
				total = total + (checkInOut.numberOfDays * 10000) - previousTotal;

				updateTotal();

				toEnable();

				previousTotal = checkInOut.numberOfDays * 10000;

			}
		});

		// radio button
		rdbtnSigMassage = new JRadioButton("Cozy Hotel Signature Massage");
		rdbtnSigMassage.setBounds(31, 161, 221, 23);
		panelAdditionals.add(rdbtnSigMassage);

		rdbtnAromaMassage = new JRadioButton("Aromatherapy Massage");
		rdbtnAromaMassage.setBounds(31, 230, 221, 23);
		panelAdditionals.add(rdbtnAromaMassage);

		rdbtnBodyGlowMassage = new JRadioButton("Total Body Glow Massage");
		rdbtnBodyGlowMassage.setBounds(31, 300, 221, 23);
		panelAdditionals.add(rdbtnBodyGlowMassage);

		ButtonGroup massageButtonGroup = new ButtonGroup();
		massageButtonGroup.add(rdbtnSigMassage);
		massageButtonGroup.add(rdbtnAromaMassage);
		massageButtonGroup.add(rdbtnBodyGlowMassage);

		textAreaAddOns = new JTextArea();
		textAreaAddOns.setEditable(false);
		textAreaAddOns.setBackground(new Color(241, 238, 223));
		textAreaAddOns.setBounds(81, 237, 164, 108);
		panelYourStay.add(textAreaAddOns);

		btnConfirmMassage = new JButton("Confirm");

		btnConfirmMassage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				massageGuests = (int) spnGuests.getValue();
				int massage = 0;

				total -= previousTotalMassageCost;

				if (rdbtnSigMassage.isSelected()) {
					massage = 2000;
					selectedAdditionals.add("Signature Massage");
				} else {
					selectedAdditionals.remove("Signature Massage");
				}

				if (rdbtnAromaMassage.isSelected()) {
					massage = 2500;
					selectedAdditionals.add("Aroma Massage");
				} else {
					selectedAdditionals.remove("Aroma Massage");
				}

				if (rdbtnBodyGlowMassage.isSelected()) {
					massage = 3200;
					selectedAdditionals.add("Glow Massage\t");
				} else {
					selectedAdditionals.remove("Glow Massage\t");
				}

				totalMassage = massage * massageGuests;

				total += totalMassage;
				textAreaAddOns.setText(String.join("\n", selectedAdditionals));

				updateTotal();

				previousTotalMassageCost = totalMassage;
			}
		});
		btnConfirmMassage.setBounds(153, 417, 89, 23);
		panelAdditionals.add(btnConfirmMassage);

		JButton btnClearMassage = new JButton("Clear");
		btnClearMassage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				massageButtonGroup.clearSelection();
				total -= previousTotalMassageCost;
				previousTotalMassageCost = 0;

				selectedAdditionals.remove("Signature Massage");
				selectedAdditionals.remove("Aroma Massage");
				selectedAdditionals.remove("Glow Massage\t");
				textAreaAddOns.setText(String.join("\n", selectedAdditionals));
				updateTotal();
			}
		});
		btnClearMassage.setBounds(53, 417, 80, 23);
		panelAdditionals.add(btnClearMassage);

		toDisable();
		display();
		updateAvailability(booking);

	}

	
	private class CheckBoxListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();

			if (source == chckbxBed) {
				if (chckbxBed.isSelected()) {
					total = total + 500;
					selectedAdditionals.add("Bed\t\tPhp500.00");
				} else {
					total = total - 500;
					selectedAdditionals.remove("Bed\t\tPhp500.00");
				}
			} else if (source == chckbxPillow) {
				if (chckbxPillow.isSelected()) {
					total = total + 100;
					selectedAdditionals.add("Pillow\t\tPhp100.00");
				} else {
					total = total - 100;
					selectedAdditionals.remove("Pillow\t\tPhp100.00");
				}
			} else if (source == chckbxBlanket) {
				if (chckbxBlanket.isSelected()) {
					total = total + 150;
					selectedAdditionals.add("Blanket\t\tPhp150.00");
				} else {
					total = total - 150;
					selectedAdditionals.remove("Blanket\t\tPhp150.00");
				}
			}

			textAreaAddOns.setText(String.join("\n", selectedAdditionals));
			updateTotal();

		}
	}

	public void toDisable() {
		// radio button
		rdbtnSigMassage.setEnabled(false);
		rdbtnAromaMassage.setEnabled(false);
		rdbtnBodyGlowMassage.setEnabled(false);

		chckbxBed.setEnabled(false);
		chckbxBlanket.setEnabled(false);
		chckbxPillow.setEnabled(false);

		spnGuests.setEnabled(false);

		btnConfirmMassage.setEnabled(false);
	}

	public void toEnable() {
		rdbtnSigMassage.setEnabled(true);
		rdbtnAromaMassage.setEnabled(true);
		rdbtnBodyGlowMassage.setEnabled(true);

		chckbxBed.setEnabled(true);
		chckbxBlanket.setEnabled(true);
		chckbxPillow.setEnabled(true);

		spnGuests.setEnabled(true);

		btnConfirmMassage.setEnabled(true);
	}

	public void updateTotal() {
		lblDispTotal.setText("Your total: " + String.format("P%,.2f", total));
	}

	public void display() {
		lblDispCheckIn.setText("" + checkInOut.checkInDate);
		lblDispCheckOut.setText(" to " + checkInOut.checkOutDate);

		if (checkInOut.numOfGuests == 1) {
			lblDispGuest.setText(checkInOut.numOfGuests + " Guest, ");
		} else {
			lblDispGuest.setText(checkInOut.numOfGuests + " Guests, ");
		}

		if (checkInOut.numberOfDays == 1) {
			lblDispDaysOfStay.setText(checkInOut.numberOfDays + " night");
		} else {
			lblDispDaysOfStay.setText(checkInOut.numberOfDays + " nights");
		}

	}

	public void updateAvailability(Booking booking) {
		boolean isLuxuryAvailable = BookingStorage.isBookingAvailable(RoomType.LUXURY, booking.getCheckInDate(),
				booking.getCheckOutDate());

		boolean isDeluxeAvailable = BookingStorage.isBookingAvailable(RoomType.DELUXE, booking.getCheckInDate(),
				booking.getCheckOutDate());

		boolean isStandardAvailable = BookingStorage.isBookingAvailable(RoomType.STANDARD, booking.getCheckInDate(),
				booking.getCheckOutDate());

		if (!isLuxuryAvailable) {
			btnLuxuryBook.setEnabled(false);
			lblLuxuryStatus.setText("Unnavailable");
		}

		if (!isDeluxeAvailable) {
			btnDeluxeBook.setEnabled(false);
			lblDeluxeStatus.setText("Unnavailable");
		}

		if (!isStandardAvailable) {
			btnStandardBook.setEnabled(false);
			lblStandardStatus.setText("Unnavailable");
		}
	}
}
