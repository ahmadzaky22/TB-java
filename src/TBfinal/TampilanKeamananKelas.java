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
import java.awt.Font;
import java.awt.Color;

public class TampilanKeamananKelas {
	KeamananRuangKelas a = new KeamananRuangKelas();
	private JFrame frame;
	private JTextField kokoh;
	private JTextField kunciP;
	private JTextField kunciJ;
	private JTextField bahaya;

	/**
	 * Launch the application.
	 */
	public void KeamananKelas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TampilanKeamananKelas window = new TampilanKeamananKelas();
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
	public TampilanKeamananKelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKeamananRuangKelas = new JLabel("KEAMANAN RUANG KELAS");
		lblKeamananRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblKeamananRuangKelas.setBounds(146, 11, 198, 21);
		frame.getContentPane().add(lblKeamananRuangKelas);
		
		JLabel lblKekokohan = new JLabel("Kekokohan : ");
		lblKekokohan.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblKekokohan.setBounds(10, 40, 98, 32);
		frame.getContentPane().add(lblKekokohan);
		
		final JComboBox kokohbox = new JComboBox();
		kokohbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		kokohbox.setModel(new DefaultComboBoxModel(new String[] {"kokoh", "tidak kokoh"}));
		kokohbox.setBounds(112, 38, 92, 37);
		frame.getContentPane().add(kokohbox);
		
		kokoh = new JTextField();
		kokoh.setFont(new Font("Andalus", Font.PLAIN, 15));
		kokoh.setBackground(Color.LIGHT_GRAY);
		kokoh.setBounds(215, 38, 106, 37);
		frame.getContentPane().add(kokoh);
		kokoh.setColumns(10);
		
		JButton Addkokoh = new JButton("Add");
		Addkokoh.setFont(new Font("Stencil", Font.PLAIN, 12));
		Addkokoh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setKekokohan(kokohbox.getSelectedItem().toString());
				kokoh.setText(kokohbox.getSelectedItem().toString());
				a.analisisKekokohan();
			}
		});
		Addkokoh.setBounds(331, 38, 93, 37);
		frame.getContentPane().add(Addkokoh);
		
		JLabel lblKunciPintu = new JLabel("Kunci Pintu : ");
		lblKunciPintu.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblKunciPintu.setBounds(10, 88, 92, 32);
		frame.getContentPane().add(lblKunciPintu);
		
		final JComboBox KPbox = new JComboBox();
		KPbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KPbox.setModel(new DefaultComboBoxModel(new String[] {"ada", "tidak ada"}));
		KPbox.setBounds(112, 86, 92, 37);
		frame.getContentPane().add(KPbox);
		
		kunciP = new JTextField();
		kunciP.setFont(new Font("Andalus", Font.PLAIN, 15));
		kunciP.setBackground(Color.LIGHT_GRAY);
		kunciP.setColumns(10);
		kunciP.setBounds(215, 86, 106, 37);
		frame.getContentPane().add(kunciP);
		
		JButton AddKP = new JButton("Add");
		AddKP.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddKP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setKunciPintu(KPbox.getSelectedItem().toString());
				kunciP.setText(KPbox.getSelectedItem().toString());
				a.analisisKunciPintu();
			}
		});
		AddKP.setBounds(331, 86, 93, 37);
		frame.getContentPane().add(AddKP);
		
		JLabel lblKunciJendela = new JLabel("Kunci Jendela : ");
		lblKunciJendela.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblKunciJendela.setBounds(10, 136, 92, 32);
		frame.getContentPane().add(lblKunciJendela);
		
		final JComboBox KJbox = new JComboBox();
		KJbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		KJbox.setModel(new DefaultComboBoxModel(new String[] {"ada", "tidak ada"}));
		KJbox.setBounds(112, 134, 92, 37);
		frame.getContentPane().add(KJbox);
		
		kunciJ = new JTextField();
		kunciJ.setFont(new Font("Stencil", Font.PLAIN, 15));
		kunciJ.setBackground(Color.LIGHT_GRAY);
		kunciJ.setColumns(10);
		kunciJ.setBounds(215, 134, 106, 37);
		frame.getContentPane().add(kunciJ);
		
		JButton AddKJ = new JButton("Add");
		AddKJ.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddKJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setKunciJendela(KJbox.getSelectedItem().toString());
				kunciJ.setText(KJbox.getSelectedItem().toString());
				a.analisisKunciJendela();
			}
		});
		AddKJ.setBounds(331, 134, 93, 37);
		frame.getContentPane().add(AddKJ);
		
		JLabel lblBahaya = new JLabel("Bahaya : ");
		lblBahaya.setFont(new Font("Stencil", Font.PLAIN, 11));
		lblBahaya.setBounds(10, 184, 92, 32);
		frame.getContentPane().add(lblBahaya);
		
		final JComboBox bahayabox = new JComboBox();
		bahayabox.setFont(new Font("Stencil", Font.PLAIN, 12));
		bahayabox.setModel(new DefaultComboBoxModel(new String[] {"aman", "tidak aman"}));
		bahayabox.setBounds(112, 182, 92, 37);
		frame.getContentPane().add(bahayabox);
		
		bahaya = new JTextField();
		bahaya.setFont(new Font("Stencil", Font.PLAIN, 15));
		bahaya.setBackground(Color.LIGHT_GRAY);
		bahaya.setColumns(10);
		bahaya.setBounds(215, 182, 106, 37);
		frame.getContentPane().add(bahaya);
		
		JButton Addbahaya = new JButton("Add");
		Addbahaya.setFont(new Font("Stencil", Font.PLAIN, 12));
		Addbahaya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setBahaya(bahayabox.getSelectedItem().toString());
				bahaya.setText(bahayabox.getSelectedItem().toString());
				a.analisisBahaya();
			}
		});
		Addbahaya.setBounds(331, 182, 93, 37);
		frame.getContentPane().add(Addbahaya);
		
		JButton btnNewButton = new JButton("PREVIOUS");
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				TampilanKenyamananKelas TKK = new TampilanKenyamananKelas();
				TKK.KenyamananKelas();
			}
		});
		btnNewButton.setBounds(10, 237, 106, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNext = new JButton("LOG OUT");
		btnNext.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
			}
		});
		btnNext.setBounds(318, 237, 106, 37);
		frame.getContentPane().add(btnNext);
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setFont(new Font("Stencil", Font.PLAIN, 12));
		btnEdit.setBounds(164, 237, 106, 37);
		frame.getContentPane().add(btnEdit);
	}
}

