package TBfinal;

public class ListInputan {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void ListInput() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListInputan window = new ListInputan();
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
	public ListInputan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 436, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblListInputan = new JLabel("LIST EDIT");
		lblListInputan.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblListInputan.setBounds(180, 11, 85, 24);
		frame.getContentPane().add(lblListInputan);
		
		JButton btnNewButton = new JButton("IDENTITAS RUANG KELAS");
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				IdentitasRuangKelas IRK = new IdentitasRuangKelas();
				IRK.IdentitasRuangKelas();
			}
		});
		btnNewButton.setBounds(118, 36, 190, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnKondisiRuangKelas = new JButton("KONDISI RUANG KELAS");
		btnKondisiRuangKelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TampilanKondisiRuang TKR = new TampilanKondisiRuang();
				TKR.KondisiRuang();
			}
		});
		btnKondisiRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnKondisiRuangKelas.setBounds(118, 90, 190, 43);
		frame.getContentPane().add(btnKondisiRuangKelas);
		
		JButton btnSarana = new JButton("SARANA");
		btnSarana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				tampilanJumlahKondisiPosisiSarana JPS = new tampilanJumlahKondisiPosisiSarana();
				JPS.Sarana();
			}
		});
		btnSarana.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnSarana.setBounds(118, 144, 190, 43);
		frame.getContentPane().add(btnSarana);
		
		JButton btnLingkunganRuangKelas = new JButton("LINGKUNGAN RUANG KELAS");
		btnLingkunganRuangKelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TampilanLingkunganKelas LRK = new TampilanLingkunganKelas();
				LRK.LingkunganKelas();
			}
		});
		btnLingkunganRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnLingkunganRuangKelas.setBounds(118, 198, 190, 43);
		frame.getContentPane().add(btnLingkunganRuangKelas);
		
		JButton btnKenyamananRuangKelas = new JButton("KENYAMANAN RUANG KELAS");
		btnKenyamananRuangKelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TampilanKenyamananKelas TKK = new TampilanKenyamananKelas();
				TKK.KenyamananKelas();
			}
		});
		btnKenyamananRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnKenyamananRuangKelas.setBounds(118, 252, 190, 43);
		frame.getContentPane().add(btnKenyamananRuangKelas);
		
		JButton btnKebersihanRuangKelas = new JButton("KEBERSIHAN RUANG KELAS");
		btnKebersihanRuangKelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TampilanKebersihanKelas TKK = new TampilanKebersihanKelas();
				TKK.KebersihanKelas();
			}
		});
		btnKebersihanRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnKebersihanRuangKelas.setBounds(118, 306, 190, 43);
		frame.getContentPane().add(btnKebersihanRuangKelas);
		
		JButton btnKeamananRuangKelas = new JButton("KEAMANAN RUANG KELAS");
		btnKeamananRuangKelas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TampilanKeamananKelas TKK2 = new TampilanKeamananKelas();
				TKK2.KeamananKelas();
			}
		});
		btnKeamananRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnKeamananRuangKelas.setBounds(118, 357, 190, 43);
		frame.getContentPane().add(btnKeamananRuangKelas);
	}

}
