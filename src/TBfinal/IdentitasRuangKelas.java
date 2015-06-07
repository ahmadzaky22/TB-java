package TBfinal;

public class IdentitasRuangKelas {
	IndukRuangKelas a = new IndukRuangKelas();
	private JFrame frame;
	private JTextField namaRuang;
	private JTextField lokasiRuang;
	private JTextField view;

	/**
	 * Launch the application.
	 */
	public void IdentitasRuangKelas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdentitasRuangKelas window = new IdentitasRuangKelas();
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
	public IdentitasRuangKelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 481, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIdentitasRuangKelas = new JLabel("IDENTITAS RUANG KELAS");
		lblIdentitasRuangKelas.setForeground(Color.BLACK);
		lblIdentitasRuangKelas.setFont(new Font("Algerian", Font.PLAIN, 15));
		lblIdentitasRuangKelas.setBounds(161, 11, 184, 28);
		frame.getContentPane().add(lblIdentitasRuangKelas);
		
		JLabel lblNamaRuang = new JLabel("Nama Ruang : ");
		lblNamaRuang.setBackground(Color.BLACK);
		lblNamaRuang.setForeground(Color.BLACK);
		lblNamaRuang.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblNamaRuang.setBounds(33, 55, 118, 28);
		frame.getContentPane().add(lblNamaRuang);
		
		namaRuang = new JTextField();
		namaRuang.setFont(new Font("Andalus", Font.PLAIN, 16));
		namaRuang.setBackground(Color.LIGHT_GRAY);
		namaRuang.setBounds(161, 50, 270, 33);
		frame.getContentPane().add(namaRuang);
		namaRuang.setColumns(10);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang : ");
		lblLokasiRuang.setForeground(Color.BLACK);
		lblLokasiRuang.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblLokasiRuang.setBounds(33, 102, 118, 28);
		frame.getContentPane().add(lblLokasiRuang);
		
		lokasiRuang = new JTextField();
		lokasiRuang.setFont(new Font("Andalus", Font.PLAIN, 16));
		lokasiRuang.setBackground(Color.LIGHT_GRAY);
		lokasiRuang.setBounds(161, 100, 270, 33);
		frame.getContentPane().add(lokasiRuang);
		lokasiRuang.setColumns(10);
		
		final JComboBox prodi = new JComboBox();
		prodi.setForeground(Color.BLACK);
		prodi.setFont(new Font("Stencil", Font.PLAIN, 12));
		prodi.setModel(new DefaultComboBoxModel(new String[] {"Teknik Informatika", "Teknik Mesin", "Teknik Industri", "Teknik Sipil", "Teknik Elektro"}));
		prodi.setBounds(161, 144, 270, 28);
		frame.getContentPane().add(prodi);
		
		JLabel lblProgramStudi = new JLabel("Program Studi :");
		lblProgramStudi.setForeground(Color.BLACK);
		lblProgramStudi.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblProgramStudi.setBounds(33, 144, 118, 28);
		frame.getContentPane().add(lblProgramStudi);
		
		JButton submit = new JButton("submit");
		submit.setFont(new Font("Stencil", Font.PLAIN, 12));
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				view.setText("nama ruang : "+namaRuang.getText()+"\n"+"lokasi ruang : "+lokasiRuang.getText()+"\n"+"prodi : "+prodi.getSelectedItem());
				a.save();
				a.read();
			}
		});
		submit.setBounds(161, 183, 112, 39);
		frame.getContentPane().add(submit);
		
		view = new JTextField();
		view.setFont(new Font("Andalus", Font.PLAIN, 14));
		view.setBackground(Color.LIGHT_GRAY);
		view.setBounds(33, 233, 398, 72);
		frame.getContentPane().add(view);
		view.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setNamaRuangan(namaRuang.getText());
				a.setLokasiRuang(lokasiRuang.getText());
				a.setPilihFakultas(prodi.getSelectedItem().toString());
				frame.setVisible(false);
				TampilanKondisiRuang KR = new TampilanKondisiRuang();
				KR.KondisiRuang();
			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNewButton.setBounds(161, 316, 112, 39);
		frame.getContentPane().add(btnNewButton);
	}
}