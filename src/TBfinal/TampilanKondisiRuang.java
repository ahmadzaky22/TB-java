package TBfinal;

public class TampilanKondisiRuang {
	KondisiRuangKelas a = new KondisiRuangKelas();
	tampilanJumlahKondisiPosisiSarana c = new tampilanJumlahKondisiPosisiSarana();
	private JFrame frame;
	private JTextField panjang;
	private JTextField lebar;
	private JTextField luas;
	private JTextField kursi;
	private JTextField pintu;
	private JTextField jendela;
	private JTextField rasioLuas;

	/**
	 * Launch the application.
	 */
	public void KondisiRuang() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TampilanKondisiRuang window = new TampilanKondisiRuang();
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
	public TampilanKondisiRuang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 527, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPanjangKelas = new JLabel("Panjang Kelas :");
		lblPanjangKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblPanjangKelas.setBounds(10, 63, 111, 26);
		frame.getContentPane().add(lblPanjangKelas);
		
		panjang = new JTextField();
		panjang.setBackground(Color.LIGHT_GRAY);
		panjang.setBounds(131, 58, 207, 36);
		frame.getContentPane().add(panjang);
		panjang.setColumns(10);
		
		JLabel lblLebarKelas = new JLabel("Lebar Kelas : ");
		lblLebarKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblLebarKelas.setBounds(10, 112, 111, 26);
		frame.getContentPane().add(lblLebarKelas);
		
		lebar = new JTextField();
		lebar.setBackground(Color.LIGHT_GRAY);
		lebar.setBounds(131, 107, 207, 36);
		frame.getContentPane().add(lebar);
		lebar.setColumns(10);
		
		JLabel lblLuasKelas = new JLabel("Luas Kelas");
		lblLuasKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblLuasKelas.setBounds(395, 58, 89, 26);
		frame.getContentPane().add(lblLuasKelas);
		
		luas = new JTextField();
		luas.setBackground(Color.LIGHT_GRAY);
		luas.setBounds(360, 90, 140, 36);
		frame.getContentPane().add(luas);
		luas.setColumns(10);
		
		JButton btnLuas = new JButton("Hitung Luas Kelas");
		btnLuas.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnLuas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setPanjangKelas(Integer.parseInt(panjang.getText()));
				a.setlebarKelas(Integer.parseInt(lebar.getText()));
				a.luas();
				luas.setText(Double.toString(a.luas()));
				a.analisisLuas();
			}
		});
		btnLuas.setBounds(360, 137, 140, 38);
		frame.getContentPane().add(btnLuas);
		
		JLabel lblKondisiRuangKelas = new JLabel("KONDISI RUANG KELAS");
		lblKondisiRuangKelas.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblKondisiRuangKelas.setBounds(182, 11, 180, 26);
		frame.getContentPane().add(lblKondisiRuangKelas);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi : ");
		lblJumlahKursi.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblJumlahKursi.setBounds(10, 164, 111, 26);
		frame.getContentPane().add(lblJumlahKursi);
		
		kursi = new JTextField();
		kursi.setBackground(Color.LIGHT_GRAY);
		kursi.setBounds(131, 158, 207, 38);
		frame.getContentPane().add(kursi);
		kursi.setColumns(10);
		
		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu : ");
		lblJumlahPintu.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblJumlahPintu.setBounds(10, 216, 111, 26);
		frame.getContentPane().add(lblJumlahPintu);
		
		pintu = new JTextField();
		pintu.setBackground(Color.LIGHT_GRAY);
		pintu.setBounds(131, 210, 122, 38);
		frame.getContentPane().add(pintu);
		pintu.setColumns(10);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela : ");
		lblJumlahJendela.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblJumlahJendela.setBounds(10, 268, 111, 25);
		frame.getContentPane().add(lblJumlahJendela);
		
		jendela = new JTextField();
		jendela.setBackground(Color.LIGHT_GRAY);
		jendela.setBounds(131, 262, 122, 36);
		frame.getContentPane().add(jendela);
		jendela.setColumns(10);
		
		JButton btnPrevious = new JButton("PREVIOUS");
		btnPrevious.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				IdentitasRuangKelas b = new IdentitasRuangKelas();
				b.IdentitasRuangKelas();
			}
		});
		btnPrevious.setBounds(10, 322, 106, 36);
		frame.getContentPane().add(btnPrevious);
		
		JButton btnLanjut = new JButton("NEXT");
		btnLanjut.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnLanjut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				c.Sarana();
			}
		});
		btnLanjut.setBounds(394, 322, 106, 36);
		frame.getContentPane().add(btnLanjut);
		
		rasioLuas = new JTextField();
		rasioLuas.setBackground(Color.LIGHT_GRAY);
		rasioLuas.setBounds(360, 211, 140, 36);
		frame.getContentPane().add(rasioLuas);
		rasioLuas.setColumns(10);
		
		JLabel lblLuasRasioKelas = new JLabel("Luas Rasio Kelas");
		lblLuasRasioKelas.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblLuasRasioKelas.setBounds(370, 180, 111, 26);
		frame.getContentPane().add(lblLuasRasioKelas);
		
		JButton btnRasioLuas = new JButton("Hitung Rasio Luas");
		btnRasioLuas.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnRasioLuas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setJumlahKursi(Integer.parseInt(kursi.getText()));
				a.rasioLuas();
				rasioLuas.setText(Double.toString(a.rasioLuas()));
				a.analisisRasioLuas();
				a.save();
				a.read();
			}
		});
		btnRasioLuas.setBounds(360, 258, 140, 36);
		frame.getContentPane().add(btnRasioLuas);
		
		JButton AddPntu = new JButton("Add");
		AddPntu.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddPntu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setJumlahPintu(Integer.parseInt(pintu.getText()));
				a.analisisPintu();
			}
		});
		AddPntu.setBounds(260, 211, 78, 36);
		frame.getContentPane().add(AddPntu);
		
		JButton AddJndl = new JButton("Add");
		AddJndl.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddJndl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setJumlahJendela(Integer.parseInt(jendela.getText()));
				a.anlisisJendela();
			}
		});
		AddJndl.setBounds(260, 262, 78, 36);
		frame.getContentPane().add(AddJndl);
	}
}