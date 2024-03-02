package finalsProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class HomePage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(228, 220, 203));
		panel.setBounds(322, 0, 308, 427);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnBookNow = new JButton("Book Now ");
		btnBookNow.setBackground(new Color(206, 141, 77));
		btnBookNow.setBounds(92, 284, 135, 27);
		panel.add(btnBookNow);
		btnBookNow.setFont(new Font("Serif", Font.PLAIN, 15));

		JLabel lblMotto = new JLabel("\"Book your stay, the perfect way.\"");
		lblMotto.setBounds(32, 202, 255, 21);
		panel.add(lblMotto);
		lblMotto.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));

		JLabel lblHms = new JLabel("Cozy Hotel");
		lblHms.setBounds(0, 134, 313, 69);
		panel.add(lblHms);
		lblHms.setHorizontalAlignment(SwingConstants.CENTER);
		lblHms.setFont(new Font("Serif", Font.PLAIN, 25));

		JButton btnAboutUs = new JButton("");
		btnAboutUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAboutUs.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\icons8-about-us-24.png"));
		btnAboutUs.setBounds(276, 11, 25, 25);
		panel.add(btnAboutUs);

		JLabel lblAboutUs = new JLabel("About Us");
		lblAboutUs.setFont(new Font("Sylfaen", Font.ITALIC, 14));
		lblAboutUs.setBounds(211, 16, 64, 20);
		panel.add(lblAboutUs);

		JLabel lblHomePic = new JLabel("New label");
		lblHomePic.setBounds(-87, 0, 448, 427);
		contentPane.add(lblHomePic);
		lblHomePic.setIcon(new ImageIcon(HomePage.class.getResource("/images/CozyLogo.png")));
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				checkInOut f2 = new checkInOut();
				f2.setVisible(true);
			}
		});
	}
}
