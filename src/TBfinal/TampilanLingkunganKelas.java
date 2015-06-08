package dragndrop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class TampilanLingkunganKelas {
	LingkunganRuangKelas a = new LingkunganRuangKelas();
	private JFrame frame;
	private JTextField lantai;
	private JTextField pintu;
	private JTextField dinding;
	private JTextField atap;
	private JTextField jendela;

	/**
	 * Launch the application.
	 */
	public void LingkunganKelas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TampilanLingkunganKelas window = new TampilanLingkunganKelas();
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
	public TampilanLingkunganKelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 480, 366);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLingkunganRuangKelas = new JLabel("LINGKUNGAN RUANG KELAS");
		lblLingkunganRuangKelas.setFont(new Font("Algerian", Font.PLAIN, 16));
		lblLingkunganRuangKelas.setBounds(125, 11, 225, 27);
		frame.getContentPane().add(lblLingkunganRuangKelas);
		
		JLabel lblLantai = new JLabel("Lantai : ");
		lblLantai.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblLantai.setBounds(45, 49, 70, 33);
		frame.getContentPane().add(lblLantai);
		
		lantai = new JTextField();
		lantai.setFont(new Font("Stencil", Font.PLAIN, 12));
		lantai.setBackground(Color.LIGHT_GRAY);
		lantai.setBounds(221, 49, 86, 33);
		frame.getContentPane().add(lantai);
		lantai.setColumns(10);
		
		final JComboBox Lantaibox = new JComboBox();
		Lantaibox.setFont(new Font("Stencil", Font.PLAIN, 12));
		Lantaibox.setModel(new DefaultComboBoxModel(new String[] {"bersih", "kotor"}));
		Lantaibox.setBounds(125, 48, 86, 34);
		frame.getContentPane().add(Lantaibox);
		
		JButton AddLantai = new JButton("Add");
		AddLantai.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddLantai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setLantai(Lantaibox.getSelectedItem().toString());
				lantai.setText(Lantaibox.getSelectedItem().toString());
				a.analisisLantai();
			}
		});
		AddLantai.setBounds(317, 49, 94, 33);
		frame.getContentPane().add(AddLantai);
		
		JLabel lblPintu = new JLabel("Pintu : ");
		lblPintu.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblPintu.setBounds(45, 93, 70, 33);
		frame.getContentPane().add(lblPintu);
		
		final JComboBox Pintubox = new JComboBox();
		Pintubox.setFont(new Font("Stencil", Font.PLAIN, 12));
		Pintubox.setModel(new DefaultComboBoxModel(new String[] {"bersih", "kotor"}));
		Pintubox.setBounds(125, 93, 86, 34);
		frame.getContentPane().add(Pintubox);
		
		pintu = new JTextField();
		pintu.setFont(new Font("Stencil", Font.PLAIN, 12));
		pintu.setBackground(Color.LIGHT_GRAY);
		pintu.setColumns(10);
		pintu.setBounds(221, 93, 86, 33);
		frame.getContentPane().add(pintu);
		
		JButton AddPintu = new JButton("Add");
		AddPintu.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddPintu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setPintu(Pintubox.getSelectedItem().toString());
				pintu.setText(Pintubox.getSelectedItem().toString());
				a.analisisLantai();
			}
		});
		AddPintu.setBounds(317, 93, 94, 33);
		frame.getContentPane().add(AddPintu);
		
		JLabel lblDinding = new JLabel("Dinding : ");
		lblDinding.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblDinding.setBounds(45, 137, 70, 33);
		frame.getContentPane().add(lblDinding);
		
		final JComboBox Dindingbox = new JComboBox();
		Dindingbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		Dindingbox.setModel(new DefaultComboBoxModel(new String[] {"bersih", "kotor"}));
		Dindingbox.setBounds(125, 138, 86, 34);
		frame.getContentPane().add(Dindingbox);
		
		dinding = new JTextField();
		dinding.setFont(new Font("Stencil", Font.PLAIN, 12));
		dinding.setBackground(Color.LIGHT_GRAY);
		dinding.setColumns(10);
		dinding.setBounds(221, 137, 86, 33);
		frame.getContentPane().add(dinding);
		
		JButton Adddinding = new JButton("Add");
		Adddinding.setFont(new Font("Stencil", Font.PLAIN, 12));
		Adddinding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setDinding(Dindingbox.getSelectedItem().toString());
				dinding.setText(Dindingbox.getSelectedItem().toString());
				a.analisisDinding();
			}
		});
		Adddinding.setBounds(317, 137, 94, 33);
		frame.getContentPane().add(Adddinding);
		
		JLabel lblAtap = new JLabel("Atap : ");
		lblAtap.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblAtap.setBounds(45, 180, 70, 33);
		frame.getContentPane().add(lblAtap);
		
		final JComboBox Atapbox = new JComboBox();
		Atapbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		Atapbox.setModel(new DefaultComboBoxModel(new String[] {"bersih", "kotor"}));
		Atapbox.setBounds(125, 183, 86, 34);
		frame.getContentPane().add(Atapbox);
		
		atap = new JTextField();
		atap.setFont(new Font("Stencil", Font.PLAIN, 12));
		atap.setBackground(Color.LIGHT_GRAY);
		atap.setColumns(10);
		atap.setBounds(221, 184, 86, 33);
		frame.getContentPane().add(atap);
		
		JButton Addatap = new JButton("Add");
		Addatap.setFont(new Font("Stencil", Font.PLAIN, 12));
		Addatap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setAtap(Atapbox.getSelectedItem().toString());
				atap.setText(Atapbox.getSelectedItem().toString());
				a.analisisAtap();
			}
		});
		Addatap.setBounds(317, 184, 94, 33);
		frame.getContentPane().add(Addatap);
		
		JLabel lblJendela = new JLabel("Jendela : ");
		lblJendela.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblJendela.setBounds(45, 224, 70, 33);
		frame.getContentPane().add(lblJendela);
		
		final JComboBox Jendelabox = new JComboBox();
		Jendelabox.setFont(new Font("Stencil", Font.PLAIN, 12));
		Jendelabox.setModel(new DefaultComboBoxModel(new String[] {"bersih", "kotor"}));
		Jendelabox.setBounds(125, 228, 86, 34);
		frame.getContentPane().add(Jendelabox);
		
		jendela = new JTextField();
		jendela.setFont(new Font("Stencil", Font.PLAIN, 12));
		jendela.setBackground(Color.LIGHT_GRAY);
		jendela.setColumns(10);
		jendela.setBounds(221, 229, 86, 33);
		frame.getContentPane().add(jendela);
		
		JButton Addjendela = new JButton("Add");
		Addjendela.setFont(new Font("Stencil", Font.PLAIN, 12));
		Addjendela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setJendela(Jendelabox.getSelectedItem().toString());
				jendela.setText(Jendelabox.getSelectedItem().toString());
				a.analisisJendela();
				a.save();
				a.read();
			}
		});
		Addjendela.setBounds(317, 229, 94, 33);
		frame.getContentPane().add(Addjendela);
		
		JButton btnNewButton = new JButton("PREVIOUS");
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				tampilanJumlahKondisiPosisiSarana JPS = new tampilanJumlahKondisiPosisiSarana();
				JPS.Sarana();
			}
		});
		btnNewButton.setBounds(45, 273, 96, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TampilanKebersihanKelas TKK = new TampilanKebersihanKelas();
				TKK.KebersihanKelas();
			}
		});
		btnNext.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNext.setBounds(317, 273, 94, 37);
		frame.getContentPane().add(btnNext);
	}
}
