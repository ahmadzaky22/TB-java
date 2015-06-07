package TBfinal;

public class tampilanJumlahKondisiPosisiSarana {
	StopKontak a = new StopKontak();
	KabelLCD b = new KabelLCD();
	Lampu c = new Lampu();
	KipasAngin d = new KipasAngin();
	AC ac = new AC();
	CCTV f = new CCTV();
	Internet g = new Internet();
	private JFrame frame;
	private JTextField kondisiSK;
	private JTextField posisiSK;
	private JTextField jumlahKL;
	private JTextField kondisiKL;
	private JTextField posisiKL;
	private JTextField jumlahL;
	private JTextField kondisiL;
	private JTextField posisiL;
	private JTextField jumlahKA;
	private JTextField kondisiKA;
	private JTextField posisiKA;
	private JTextField jumlahAC;
	private JTextField kondisiAC;
	private JTextField posisiAC;
	private JTextField jumlahC;
	private JTextField kondisiC;
	private JTextField posisiC;
	private JTextField SSID;
	private JTextField bandwidth;
	private JTextField jumlahSK;

	/**
	 * Launch the application.
	 */
	public void Sarana() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tampilanJumlahKondisiPosisiSarana window = new tampilanJumlahKondisiPosisiSarana();
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
	public tampilanJumlahKondisiPosisiSarana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 847, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblStopKontak = new JLabel("Jumlah Stop Kontak : ");
		lblStopKontak.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblStopKontak.setBounds(20, 69, 125, 26);
		frame.getContentPane().add(lblStopKontak);
		
		JLabel lblKondisiStopKontak = new JLabel("Kondisi Stop Kontak : ");
		lblKondisiStopKontak.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblKondisiStopKontak.setBounds(20, 114, 125, 26);
		frame.getContentPane().add(lblKondisiStopKontak);
		
		kondisiSK = new JTextField();
		kondisiSK.setFont(new Font("Andalus", Font.PLAIN, 12));
		kondisiSK.setForeground(Color.DARK_GRAY);
		kondisiSK.setBackground(Color.LIGHT_GRAY);
		kondisiSK.setBounds(242, 110, 81, 34);
		frame.getContentPane().add(kondisiSK);
		kondisiSK.setColumns(10);
		
		JLabel lblPosisiStopKontak = new JLabel("Posisi Stop Kontak : ");
		lblPosisiStopKontak.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblPosisiStopKontak.setBounds(20, 159, 125, 26);
		frame.getContentPane().add(lblPosisiStopKontak);
		
		posisiSK = new JTextField();
		posisiSK.setFont(new Font("Andalus", Font.PLAIN, 12));
		posisiSK.setForeground(Color.DARK_GRAY);
		posisiSK.setBackground(Color.LIGHT_GRAY);
		posisiSK.setBounds(242, 155, 81, 34);
		frame.getContentPane().add(posisiSK);
		posisiSK.setColumns(10);
		
		JLabel lblSarana = new JLabel("SARANA");
		lblSarana.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblSarana.setBounds(390, 11, 89, 34);
		frame.getContentPane().add(lblSarana);
		
		JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD : ");
		lblJumlahKabelLcd.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblJumlahKabelLcd.setBounds(20, 204, 125, 26);
		frame.getContentPane().add(lblJumlahKabelLcd);
		
		jumlahKL = new JTextField();
		jumlahKL.setFont(new Font("Andalus", Font.PLAIN, 12));
		jumlahKL.setForeground(Color.DARK_GRAY);
		jumlahKL.setBackground(Color.LIGHT_GRAY);
		jumlahKL.setBounds(155, 200, 168, 34);
		frame.getContentPane().add(jumlahKL);
		jumlahKL.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Kondisi Kabel LCD : ");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblNewLabel.setBounds(20, 249, 125, 26);
		frame.getContentPane().add(lblNewLabel);
		
		kondisiKL = new JTextField();
		kondisiKL.setFont(new Font("Andalus", Font.PLAIN, 12));
		kondisiKL.setBackground(Color.LIGHT_GRAY);
		kondisiKL.setBounds(242, 245, 81, 34);
		frame.getContentPane().add(kondisiKL);
		kondisiKL.setColumns(10);
		
		JLabel lblPosisiKabelLcd = new JLabel("Posisi Kabel LCD : ");
		lblPosisiKabelLcd.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblPosisiKabelLcd.setBounds(20, 294, 125, 26);
		frame.getContentPane().add(lblPosisiKabelLcd);
		
		posisiKL = new JTextField();
		posisiKL.setFont(new Font("Andalus", Font.PLAIN, 12));
		posisiKL.setForeground(Color.DARK_GRAY);
		posisiKL.setBackground(Color.LIGHT_GRAY);
		posisiKL.setBounds(242, 290, 81, 34);
		frame.getContentPane().add(posisiKL);
		posisiKL.setColumns(10);
		
		JLabel lblJumlahLampu = new JLabel("Jumlah Lampu : ");
		lblJumlahLampu.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblJumlahLampu.setBounds(20, 339, 125, 26);
		frame.getContentPane().add(lblJumlahLampu);
		
		jumlahL = new JTextField();
		jumlahL.setFont(new Font("Andalus", Font.PLAIN, 12));
		jumlahL.setBackground(Color.LIGHT_GRAY);
		jumlahL.setColumns(10);
		jumlahL.setBounds(155, 335, 168, 34);
		frame.getContentPane().add(jumlahL);
		
		JLabel lblKondisiLampu = new JLabel("Kondisi Lampu : ");
		lblKondisiLampu.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblKondisiLampu.setBounds(20, 387, 125, 26);
		frame.getContentPane().add(lblKondisiLampu);
		
		kondisiL = new JTextField();
		kondisiL.setFont(new Font("Andalus", Font.PLAIN, 12));
		kondisiL.setBackground(Color.LIGHT_GRAY);
		kondisiL.setColumns(10);
		kondisiL.setBounds(242, 379, 81, 34);
		frame.getContentPane().add(kondisiL);
		
		JLabel lblPosisiLampu = new JLabel("Posisi Lampu : ");
		lblPosisiLampu.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblPosisiLampu.setBounds(20, 428, 125, 26);
		frame.getContentPane().add(lblPosisiLampu);
		
		posisiL = new JTextField();
		posisiL.setFont(new Font("Andalus", Font.PLAIN, 12));
		posisiL.setBackground(Color.LIGHT_GRAY);
		posisiL.setColumns(10);
		posisiL.setBounds(242, 424, 81, 34);
		frame.getContentPane().add(posisiL);
		
		JLabel lblJumlahKipasAngin = new JLabel("Jumlah Kipas Angin : ");
		lblJumlahKipasAngin.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblJumlahKipasAngin.setBounds(434, 69, 125, 26);
		frame.getContentPane().add(lblJumlahKipasAngin);
		
		jumlahKA = new JTextField();
		jumlahKA.setFont(new Font("Andalus", Font.PLAIN, 12));
		jumlahKA.setForeground(Color.DARK_GRAY);
		jumlahKA.setBackground(Color.LIGHT_GRAY);
		jumlahKA.setColumns(10);
		jumlahKA.setBounds(569, 65, 168, 34);
		frame.getContentPane().add(jumlahKA);
		
		JLabel lblKondisiKipasAngin = new JLabel("Kondisi Kipas Angin : ");
		lblKondisiKipasAngin.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblKondisiKipasAngin.setBounds(434, 114, 125, 26);
		frame.getContentPane().add(lblKondisiKipasAngin);
		
		kondisiKA = new JTextField();
		kondisiKA.setFont(new Font("Andalus", Font.PLAIN, 12));
		kondisiKA.setForeground(Color.DARK_GRAY);
		kondisiKA.setBackground(Color.LIGHT_GRAY);
		kondisiKA.setColumns(10);
		kondisiKA.setBounds(656, 110, 81, 34);
		frame.getContentPane().add(kondisiKA);
		
		JLabel lblPosisiKipasAngin = new JLabel("Posisi Kipas Angin : ");
		lblPosisiKipasAngin.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblPosisiKipasAngin.setBounds(434, 159, 125, 26);
		frame.getContentPane().add(lblPosisiKipasAngin);
		
		posisiKA = new JTextField();
		posisiKA.setFont(new Font("Andalus", Font.PLAIN, 12));
		posisiKA.setForeground(Color.DARK_GRAY);
		posisiKA.setBackground(Color.LIGHT_GRAY);
		posisiKA.setColumns(10);
		posisiKA.setBounds(656, 155, 81, 34);
		frame.getContentPane().add(posisiKA);
		
		JLabel lblJumlahAc = new JLabel("Jumlah AC : ");
		lblJumlahAc.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblJumlahAc.setBounds(434, 204, 125, 26);
		frame.getContentPane().add(lblJumlahAc);
		
		jumlahAC = new JTextField();
		jumlahAC.setFont(new Font("Andalus", Font.PLAIN, 12));
		jumlahAC.setForeground(Color.DARK_GRAY);
		jumlahAC.setBackground(Color.LIGHT_GRAY);
		jumlahAC.setColumns(10);
		jumlahAC.setBounds(569, 200, 168, 34);
		frame.getContentPane().add(jumlahAC);
		
		JLabel lblKondisiAc = new JLabel("Kondisi AC : ");
		lblKondisiAc.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblKondisiAc.setBounds(434, 249, 125, 26);
		frame.getContentPane().add(lblKondisiAc);
		
		JLabel lblPosisiAc = new JLabel("Posisi AC : ");
		lblPosisiAc.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblPosisiAc.setBounds(434, 294, 125, 26);
		frame.getContentPane().add(lblPosisiAc);
		
		kondisiAC = new JTextField();
		kondisiAC.setFont(new Font("Andalus", Font.PLAIN, 12));
		kondisiAC.setForeground(Color.DARK_GRAY);
		kondisiAC.setBackground(Color.LIGHT_GRAY);
		kondisiAC.setColumns(10);
		kondisiAC.setBounds(656, 245, 81, 34);
		frame.getContentPane().add(kondisiAC);
		
		posisiAC = new JTextField();
		posisiAC.setFont(new Font("Andalus", Font.PLAIN, 12));
		posisiAC.setForeground(Color.DARK_GRAY);
		posisiAC.setBackground(Color.LIGHT_GRAY);
		posisiAC.setColumns(10);
		posisiAC.setBounds(656, 290, 81, 34);
		frame.getContentPane().add(posisiAC);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV : ");
		lblJumlahCctv.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblJumlahCctv.setBounds(434, 339, 125, 26);
		frame.getContentPane().add(lblJumlahCctv);
		
		jumlahC = new JTextField();
		jumlahC.setFont(new Font("Andalus", Font.PLAIN, 12));
		jumlahC.setForeground(Color.DARK_GRAY);
		jumlahC.setBackground(Color.LIGHT_GRAY);
		jumlahC.setColumns(10);
		jumlahC.setBounds(569, 335, 168, 34);
		frame.getContentPane().add(jumlahC);
		
		JLabel lblKondisiCctv = new JLabel("Kondisi CCTV : ");
		lblKondisiCctv.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblKondisiCctv.setBounds(434, 383, 125, 26);
		frame.getContentPane().add(lblKondisiCctv);
		
		kondisiC = new JTextField();
		kondisiC.setFont(new Font("Andalus", Font.PLAIN, 12));
		kondisiC.setForeground(Color.DARK_GRAY);
		kondisiC.setBackground(Color.LIGHT_GRAY);
		kondisiC.setColumns(10);
		kondisiC.setBounds(656, 379, 81, 34);
		frame.getContentPane().add(kondisiC);
		
		JLabel lblPosisiCctv = new JLabel("Posisi CCTV : ");
		lblPosisiCctv.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblPosisiCctv.setBounds(434, 428, 125, 26);
		frame.getContentPane().add(lblPosisiCctv);
		
		posisiC = new JTextField();
		posisiC.setFont(new Font("Andalus", Font.PLAIN, 12));
		posisiC.setForeground(Color.DARK_GRAY);
		posisiC.setBackground(Color.LIGHT_GRAY);
		posisiC.setColumns(10);
		posisiC.setBounds(656, 424, 81, 34);
		frame.getContentPane().add(posisiC);
		
		JLabel lblSsid = new JLabel("SSID : ");
		lblSsid.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblSsid.setBounds(20, 472, 125, 26);
		frame.getContentPane().add(lblSsid);
		
		SSID = new JTextField();
		SSID.setFont(new Font("Andalus", Font.PLAIN, 12));
		SSID.setBackground(Color.LIGHT_GRAY);
		SSID.setColumns(10);
		SSID.setBounds(242, 468, 81, 34);
		frame.getContentPane().add(SSID);
		
		JLabel lblBandwidth = new JLabel("bandwidth : ");
		lblBandwidth.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblBandwidth.setBounds(434, 472, 125, 26);
		frame.getContentPane().add(lblBandwidth);
		
		bandwidth = new JTextField();
		bandwidth.setFont(new Font("Andalus", Font.PLAIN, 12));
		bandwidth.setForeground(Color.DARK_GRAY);
		bandwidth.setBackground(Color.LIGHT_GRAY);
		bandwidth.setColumns(10);
		bandwidth.setBounds(656, 469, 81, 34);
		frame.getContentPane().add(bandwidth);
		
		JButton btnNewButton = new JButton("PREVIOUS");
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TampilanKondisiRuang TKR = new TampilanKondisiRuang();
				TKR.KondisiRuang();
			}
		});
		btnNewButton.setBounds(20, 530, 102, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TampilanLingkunganKelas TLK = new TampilanLingkunganKelas();
				TLK.LingkunganKelas();
			}
		});
		btnNext.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNext.setBounds(712, 530, 102, 34);
		frame.getContentPane().add(btnNext);
		
		JButton AddSK = new JButton("Add");
		AddSK.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddSK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setJumlah(Integer.parseInt(jumlahSK.getText().toString()));
				a.analisisJumlah();
			}
		});
		AddSK.setBounds(333, 65, 67, 34);
		frame.getContentPane().add(AddSK);
		
		final JComboBox KSKbox = new JComboBox();
		KSKbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KSKbox.setModel(new DefaultComboBoxModel(new String[] {"baik", "rusak"}));
		KSKbox.setBounds(154, 110, 82, 34);
		frame.getContentPane().add(KSKbox);
		
		JButton addSK1 = new JButton("Add");
		addSK1.setFont(new Font("Stencil", Font.PLAIN, 12));
		addSK1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setKondisi(KSKbox.getSelectedItem().toString());
				kondisiSK.setText(KSKbox.getSelectedItem().toString());
				a.analisisKondisi();
			}
		});
		addSK1.setBounds(333, 110, 67, 34);
		frame.getContentPane().add(addSK1);
		
		final JComboBox PSKbox = new JComboBox();
		PSKbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		PSKbox.setModel(new DefaultComboBoxModel(new String[] {"dekat dosen", "jauh"}));
		PSKbox.setBounds(155, 155, 82, 34);
		frame.getContentPane().add(PSKbox);
		
		JButton addSK2 = new JButton("Add");
		addSK2.setFont(new Font("Stencil", Font.PLAIN, 12));
		addSK2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setPosisi(PSKbox.getSelectedItem().toString());
				posisiSK.setText(PSKbox.getSelectedItem().toString());
				a.analisisPosisi();
				a.save();
				a.read();
			}
		});
		addSK2.setBounds(333, 155, 67, 34);
		frame.getContentPane().add(addSK2);
		
		JButton addKL = new JButton("Add");
		addKL.setFont(new Font("Stencil", Font.PLAIN, 12));
		addKL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b.setJumlah(Integer.parseInt(jumlahKL.getText().toString()));
				b.analisisJumlah();
			}
		});
		addKL.setBounds(333, 200, 67, 34);
		frame.getContentPane().add(addKL);
		
		final JComboBox KKLbox = new JComboBox();
		KKLbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KKLbox.setModel(new DefaultComboBoxModel(new String[] {"berfungsi", "rusak"}));
		KKLbox.setBounds(155, 245, 82, 34);
		frame.getContentPane().add(KKLbox);
		
		JButton addKL1 = new JButton("Add");
		addKL1.setFont(new Font("Stencil", Font.PLAIN, 12));
		addKL1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setKondisi(KKLbox.getSelectedItem().toString());
				kondisiKL.setText(KKLbox.getSelectedItem().toString());
				b.analisisKondisi();
			}
		});
		addKL1.setBounds(333, 245, 67, 34);
		frame.getContentPane().add(addKL1);
		
		final JComboBox PKLbox = new JComboBox();
		PKLbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		PKLbox.setModel(new DefaultComboBoxModel(new String[] {"dekat dosen", "jauh"}));
		PKLbox.setBounds(154, 290, 82, 34);
		frame.getContentPane().add(PKLbox);
		
		JButton addKL2 = new JButton("Add");
		addKL2.setFont(new Font("Stencil", Font.PLAIN, 12));
		addKL2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b.setPosisi(PKLbox.getSelectedItem().toString());
				posisiKL.setText(PKLbox.getSelectedItem().toString());
				b.analisisPosisi();
				b.save();
				b.read();
			}
		});
		addKL2.setBounds(333, 290, 67, 34);
		frame.getContentPane().add(addKL2);
		
		JButton AddL = new JButton("Add");
		AddL.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setJumlah(Integer.parseInt(jumlahL.getText().toString()));
				c.analisisJumlah();
			}
		});
		AddL.setBounds(333, 335, 67, 34);
		frame.getContentPane().add(AddL);
		
		final JComboBox KLbox = new JComboBox();
		KLbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KLbox.setModel(new DefaultComboBoxModel(new String[] {"baik", "rusak"}));
		KLbox.setBounds(155, 380, 82, 34);
		frame.getContentPane().add(KLbox);
		
		JButton AddL1 = new JButton("Add");
		AddL1.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddL1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setKondisi(KLbox.getSelectedItem().toString());
				kondisiL.setText(KLbox.getSelectedItem().toString());
				c.analisisKondisi();
			}
		});
		AddL1.setBounds(333, 379, 67, 34);
		frame.getContentPane().add(AddL1);
		
		final JComboBox PLbox = new JComboBox();
		PLbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		PLbox.setModel(new DefaultComboBoxModel(new String[] {"atap ruangan"}));
		PLbox.setBounds(154, 424, 82, 34);
		frame.getContentPane().add(PLbox);
		
		JButton AddL2 = new JButton("Add");
		AddL2.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddL2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setPosisi(PLbox.getSelectedItem().toString());
				posisiL.setText(PLbox.getSelectedItem().toString());
				c.analisisPosisi();
				c.save();
				c.read();
			}
		});
		AddL2.setBounds(333, 424, 67, 34);
		frame.getContentPane().add(AddL2);
		
		jumlahSK = new JTextField();
		jumlahSK.setFont(new Font("Andalus", Font.PLAIN, 12));
		jumlahSK.setBackground(Color.LIGHT_GRAY);
		jumlahSK.setForeground(Color.DARK_GRAY);
		jumlahSK.setBounds(155, 65, 168, 34);
		frame.getContentPane().add(jumlahSK);
		jumlahSK.setColumns(10);
		
		JButton AddKA = new JButton("Add");
		AddKA.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddKA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setJumlah(Integer.parseInt(jumlahKA.getText().toString()));
				d.analisisJumlah();
			}
		});
		AddKA.setBounds(747, 65, 67, 34);
		frame.getContentPane().add(AddKA);
		
		final JComboBox KKAbox = new JComboBox();
		KKAbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KKAbox.setModel(new DefaultComboBoxModel(new String[] {"baik", "rusak"}));
		KKAbox.setBounds(569, 110, 82, 34);
		frame.getContentPane().add(KKAbox);
		
		JButton AddKA1 = new JButton("Add");
		AddKA1.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddKA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setKondisi(KKAbox.getSelectedItem().toString());
				kondisiKA.setText(KKAbox.getSelectedItem().toString());
				d.analisisKondisi();
			}
		});
		AddKA1.setBounds(747, 110, 67, 34);
		frame.getContentPane().add(AddKA1);
		
		final JComboBox PKAbox = new JComboBox();
		PKAbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		PKAbox.setModel(new DefaultComboBoxModel(new String[] {"atap ruangan", "dinding"}));
		PKAbox.setBounds(569, 155, 82, 34);
		frame.getContentPane().add(PKAbox);
		
		JButton AddKA2 = new JButton("Add");
		AddKA2.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddKA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				d.setPosisi(PKAbox.getSelectedItem().toString());
				posisiKA.setText(PKAbox.getSelectedItem().toString());
				d.analisisPosisi();
				d.save();
				d.read();
			}
		});
		AddKA2.setBounds(747, 155, 67, 34);
		frame.getContentPane().add(AddKA2);
		
		JButton AddAC = new JButton("Add");
		AddAC.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ac.setJumlah(Integer.parseInt(jumlahAC.getText().toString()));
				ac.analisisJumlah();
			}
		});
		AddAC.setBounds(747, 200, 67, 34);
		frame.getContentPane().add(AddAC);
		
		final JComboBox KACbox = new JComboBox();
		KACbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KACbox.setModel(new DefaultComboBoxModel(new String[] {"baik", "rusak"}));
		KACbox.setBounds(569, 245, 82, 34);
		frame.getContentPane().add(KACbox);
		
		JButton button = new JButton("Add");
		button.setFont(new Font("Stencil", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ac.setKondisi(KACbox.getSelectedItem().toString());
				kondisiAC.setText(KACbox.getSelectedItem().toString());
				ac.analisisKondisi();
			}
		});
		button.setBounds(747, 245, 67, 34);
		frame.getContentPane().add(button);
		
		final JComboBox PACbox = new JComboBox();
		PACbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		PACbox.setModel(new DefaultComboBoxModel(new String[] {"dibelakang", "disamping", "didepan"}));
		PACbox.setBounds(569, 290, 82, 34);
		frame.getContentPane().add(PACbox);
		
		JButton AddAC2 = new JButton("Add");
		AddAC2.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddAC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ac.setPosisi(PACbox.getSelectedItem().toString());
				posisiAC.setText(PACbox.getSelectedItem().toString());
				ac.analisisPosisi();
				ac.save();
				ac.read();
			}
		});
		AddAC2.setBounds(747, 290, 67, 34);
		frame.getContentPane().add(AddAC2);
		
		JButton AddC = new JButton("Add");
		AddC.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setJumlah(Integer.parseInt(jumlahC.getText().toString()));
				f.analisisJumlah();
			}
		});
		AddC.setBounds(747, 335, 67, 34);
		frame.getContentPane().add(AddC);
		
		final JComboBox KCbox = new JComboBox();
		KCbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KCbox.setModel(new DefaultComboBoxModel(new String[] {"baik", "rusak"}));
		KCbox.setBounds(569, 379, 82, 34);
		frame.getContentPane().add(KCbox);

		JButton AddC1 = new JButton("Add");
		AddC1.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setKondisi(KCbox.getSelectedItem().toString());
				kondisiC.setText(KCbox.getSelectedItem().toString());
				f.analisisKondisi();
			}
		});
		AddC1.setBounds(747, 379, 67, 34);
		frame.getContentPane().add(AddC1);
		
		final JComboBox PCbox = new JComboBox();
		PCbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		PCbox.setModel(new DefaultComboBoxModel(new String[] {"depan", "belakang", "samping"}));
		PCbox.setBounds(569, 424, 82, 34);
		frame.getContentPane().add(PCbox);
		
		JButton AddC2 = new JButton("Add");
		AddC2.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setPosisi(PCbox.getSelectedItem().toString());
				posisiC.setText(PCbox.getSelectedItem().toString());
				f.analisisPosisi();
				f.save();
				f.read();
			}
		});
		AddC2.setBounds(747, 424, 67, 34);
		frame.getContentPane().add(AddC2);
		
		final JComboBox SSIDbox = new JComboBox();
		SSIDbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		SSIDbox.setModel(new DefaultComboBoxModel(new String[] {"UMMhotspot", "UMMPremiumHotspot"}));
		SSIDbox.setBounds(155, 469, 81, 33);
		frame.getContentPane().add(SSIDbox);
		
		JButton AddSSID = new JButton("Add");
		AddSSID.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddSSID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.setSSID(SSIDbox.getSelectedItem().toString());
				SSID.setText(SSIDbox.getSelectedItem().toString());
			}
		});
		AddSSID.setBounds(333, 468, 67, 34);
		frame.getContentPane().add(AddSSID);
		
		final JComboBox BWbox = new JComboBox();
		BWbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		BWbox.setModel(new DefaultComboBoxModel(new String[] {"64 MB", "32 MB", "16 MB", "8 MB", "4 MB", "2 MB"}));
		BWbox.setBounds(569, 469, 81, 33);
		frame.getContentPane().add(BWbox);
		
		JButton AddBW = new JButton("Add");
		AddBW.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddBW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				g.setBandwidth(BWbox.getSelectedItem().toString());
				bandwidth.setText(BWbox.getSelectedItem().toString());
				g.save();
				g.read();
			}
		});
		AddBW.setBounds(747, 468, 67, 34);
		frame.getContentPane().add(AddBW);
	}
}