package TBfinal;

public class login {
	login2 a = new login2();
	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public void loginKelas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("username : ");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblUsername.setBounds(71, 89, 78, 28);
		frame.getContentPane().add(lblUsername);
		
		username = new JTextField();
		username.setToolTipText("");
		username.setForeground(Color.DARK_GRAY);
		username.setFont(new Font("Andalus", Font.BOLD, 20));
		username.setBackground(Color.WHITE);
		username.setBounds(193, 86, 165, 32);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("password : ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblPassword.setBounds(71, 141, 93, 25);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setFont(new Font("Algerian", Font.BOLD, 18));
		lblLogin.setBounds(193, 36, 69, 28);
		frame.getContentPane().add(lblLogin);
		
		password = new JPasswordField();
		password.setForeground(Color.DARK_GRAY);
		password.setFont(new Font("Andalus", Font.PLAIN, 20));
		password.setBackground(Color.WHITE);
		password.setBounds(193, 137, 165, 31);
		frame.getContentPane().add(password);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.kelas(username.getText(), password.getText());
				if(a.kelas(username.getText(), password.getText())== true){
					frame.setVisible(false);
					IdentitasRuangKelas IRK = new IdentitasRuangKelas();
					IRK.IdentitasRuangKelas();
				}
				else{
					JOptionPane.showMessageDialog(null, "incorrect username or password");
					username.setText("");
					password.setText("");;
				}
			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNewButton.setBounds(193, 197, 101, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
