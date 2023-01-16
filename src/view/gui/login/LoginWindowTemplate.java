package view.gui.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class LoginWindowTemplate extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
    private LoginWindowComponent component;
	
	/**
	 * Create the frame.
	 */
	public LoginWindowTemplate(LoginWindowComponent loginComponent) {
		component = loginComponent;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Nerry\\Downloads\\usuarios.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Registro de estudiantes");

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		buildWindow();
		
	}
	
	private void buildWindow() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("CheckBoxMenuItem.border"));
		panel_2.setBackground(new Color(0, 51, 102));
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(204, 51, 102));
		panel_1.setBackground(new Color(102, 153, 204));
		panel_1.setBounds(170, 24, 304, 418);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(71, 156, 173, 29);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setBackground(new Color(51, 204, 255));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(71, 291, 173, 29);
		panel_1.add(btnNewButton);
		
		JLabel lblMessage = new JLabel("Bienvenido");
		lblMessage.setBounds(53, 82, 205, 29);
		panel_1.add(lblMessage);
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(71, 233, 173, 29);
		panel_1.add(passwordField);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setBounds(120, 23, 62, 48);
		panel_1.add(lblIcon);
		lblIcon.setBackground(new Color(51, 204, 255));
		lblIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcon.setIcon(new ImageIcon(LoginWindowTemplate.class.getResource("/Images/man-icon.png")));
		
		JButton btnNewButton_1 = new JButton("   Salir   ");
		btnNewButton_1.setBounds(212, 384, 82, 23);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(102, 153, 204));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Nerry\\Downloads\\cerrar.png"));
		lblNewLabel_1.setBounds(41, 226, 29, 48);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nerry\\Downloads\\usuario (1).png"));
		lblNewLabel.setBounds(35, 146, 46, 49);
		panel_1.add(lblNewLabel);
		
	}
	
}
