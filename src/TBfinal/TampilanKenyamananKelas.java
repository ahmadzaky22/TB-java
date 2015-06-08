package dragndrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TampilanKenyamananKelas {
	KenyamananRuangKelas a = new KenyamananRuangKelas();
	private JFrame frame;
	private JTextField bising;
	private JTextField bau;
	private JTextField bocor;
	private JTextField rusak;
	private JTextField aus;

	/**
	 * Launch the application.
	 */
	public void KenyamananKelas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TampilanKenyamananKelas window = new TampilanKenyamananKelas();
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
	public TampilanKenyamananKelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKenyamananRuangKelas = new JLabel("KENYAMANAN RUANG KELAS");
		lblKenyamananRuangKelas.setBounds(144, 11, 181, 25);
		frame.getContentPane().add(lblKenyamananRuangKelas);
		
		JLabel lblKebisingan = new JLabel("Kebisingan : ");
		lblKebisingan.setBounds(10, 50, 90, 25);
		frame.getContentPane().add(lblKebisingan);
		
		final JComboBox bisingbox = new JComboBox();
		bisingbox.setModel(new DefaultComboBoxModel(new String[] {"bising", "tidak bising"}));
		bisingbox.setBounds(110, 47, 90, 33);
		frame.getContentPane().add(bisingbox);
		
		bising = new JTextField();
		bising.setBounds(210, 47, 115, 33);
		frame.getContentPane().add(bising);
		bising.setColumns(10);
		
		JButton Addbising = new JButton("Add");
		Addbising.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setKebisingan(bisingbox.getSelectedItem().toString());
				bising.setText(bisingbox.getSelectedItem().toString());
				a.analisisKebisingan();
			}
		});
		Addbising.setBounds(335, 47, 89, 33);
		frame.getContentPane().add(Addbising);
		
		JLabel lblBau = new JLabel("Bau : ");
		lblBau.setBounds(10, 94, 90, 25);
		frame.getContentPane().add(lblBau);
		
		final JComboBox baubox = new JComboBox();
		baubox.setModel(new DefaultComboBoxModel(new String[] {"bau", "tidak bau"}));
		baubox.setBounds(110, 91, 90, 33);
		frame.getContentPane().add(baubox);
		
		bau = new JTextField();
		bau.setColumns(10);
		bau.setBounds(210, 90, 115, 33);
		frame.getContentPane().add(bau);
		
		JButton AddBau = new JButton("Add");
		AddBau.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setBau(baubox.getSelectedItem().toString());
				bau.setText(baubox.getSelectedItem().toString());
				a.analisisBau();
			}
		});
		AddBau.setBounds(335, 91, 89, 33);
		frame.getContentPane().add(AddBau);
		
		JLabel lblKebocoran = new JLabel("Kebocoran : ");
		lblKebocoran.setBounds(10, 139, 90, 25);
		frame.getContentPane().add(lblKebocoran);
		
		final JComboBox bocorbox = new JComboBox();
		bocorbox.setModel(new DefaultComboBoxModel(new String[] {"bocor", "tidak bocor"}));
		bocorbox.setBounds(110, 135, 90, 33);
		frame.getContentPane().add(bocorbox);
		
		bocor = new JTextField();
		bocor.setColumns(10);
		bocor.setBounds(210, 134, 115, 33);
		frame.getContentPane().add(bocor);
		
		JButton Addbocor = new JButton("Add");
		Addbocor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setKebocoran(bocorbox.getSelectedItem().toString());
				bocor.setText(bocorbox.getSelectedItem().toString());
				a.analisisKebocoran();
			}
		});
		Addbocor.setBounds(335, 135, 89, 33);
		frame.getContentPane().add(Addbocor);
		
		JLabel lblKerusakan = new JLabel("Kerusakan : ");
		lblKerusakan.setBounds(10, 181, 90, 25);
		frame.getContentPane().add(lblKerusakan);
		
		final JComboBox rusakbox = new JComboBox();
		rusakbox.setModel(new DefaultComboBoxModel(new String[] {"rusak", "tidak rusak"}));
		rusakbox.setBounds(110, 177, 90, 33);
		frame.getContentPane().add(rusakbox);
		
		rusak = new JTextField();
		rusak.setColumns(10);
		rusak.setBounds(210, 178, 115, 33);
		frame.getContentPane().add(rusak);
		
		JButton Addrusak = new JButton("Add");
		Addrusak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setKerusakan(rusakbox.getSelectedItem().toString());
				rusak.setText(rusakbox.getSelectedItem().toString());
				a.analisisKerusakan();
			}
		});
		Addrusak.setBounds(335, 176, 89, 33);
		frame.getContentPane().add(Addrusak);
		
		JLabel lblKeausan = new JLabel("Keausan : ");
		lblKeausan.setBounds(10, 223, 90, 25);
		frame.getContentPane().add(lblKeausan);
		
		final JComboBox ausbox = new JComboBox();
		ausbox.setModel(new DefaultComboBoxModel(new String[] {"aus", "tidak aus"}));
		ausbox.setBounds(110, 219, 90, 33);
		frame.getContentPane().add(ausbox);
		
		aus = new JTextField();
		aus.setColumns(10);
		aus.setBounds(210, 219, 115, 33);
		frame.getContentPane().add(aus);
		
		JButton AddAus = new JButton("Add");
		AddAus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setKeausan(ausbox.getSelectedItem().toString());
				aus.setText(ausbox.getSelectedItem().toString());
				a.analisisKeausan();
			}
		});
		AddAus.setBounds(335, 220, 89, 33);
		frame.getContentPane().add(AddAus);
		
		JButton btnNewButton = new JButton("PREVIOUS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TampilanKebersihanKelas TKK = new TampilanKebersihanKelas();
				TKK.KebersihanKelas();
			}
		});
		btnNewButton.setBounds(10, 269, 101, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TampilanKeamananKelas TKK = new TampilanKeamananKelas();
				TKK.KeamananKelas();
				a.save();
				a.read();
			}
		});
		btnNext.setBounds(323, 269, 101, 40);
		frame.getContentPane().add(btnNext);
	}

}
