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
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Font;
import java.awt.Color;

public class TampilanKebersihanKelas {
	KebersihanRuangKelas a = new KebersihanRuangKelas();
	private JFrame frame;
	private JTextField SU;
	private JTextField NP;
	private JTextField kelembapan;
	private JTextField suhu;

	/**
	 * Launch the application.
	 */
	public void KebersihanKelas() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TampilanKebersihanKelas window = new TampilanKebersihanKelas();
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
	public TampilanKebersihanKelas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 474, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblKebersihanRuangKelas = new JLabel("KEBERSIHAN RUANG KELAS");
		lblKebersihanRuangKelas.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblKebersihanRuangKelas.setBounds(132, 11, 219, 21);
		frame.getContentPane().add(lblKebersihanRuangKelas);
		
		JLabel lblSirkulasiUdara = new JLabel("Sirkulasi Udara : ");
		lblSirkulasiUdara.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblSirkulasiUdara.setBounds(10, 39, 112, 36);
		frame.getContentPane().add(lblSirkulasiUdara);
		
		final JComboBox SUbox = new JComboBox();
		SUbox.setFont(new Font("Stencil", Font.PLAIN, 12));
		SUbox.setModel(new DefaultComboBoxModel(new String[] {"lancar", "macet"}));
		SUbox.setBounds(132, 39, 87, 36);
		frame.getContentPane().add(SUbox);
		
		SU = new JTextField();
		SU.setBackground(Color.LIGHT_GRAY);
		SU.setFont(new Font("Stencil", Font.PLAIN, 15));
		SU.setBounds(229, 39, 118, 36);
		frame.getContentPane().add(SU);
		SU.setColumns(10);
		
		JButton AddSU = new JButton("Add");
		AddSU.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddSU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setSirkulasiUdara(SUbox.getSelectedItem().toString());
				SU.setText(SUbox.getSelectedItem().toString());
				a.analisisSirkulasiUdara();
			}
		});
		AddSU.setBounds(356, 39, 92, 36);
		frame.getContentPane().add(AddSU);
		
		JLabel lblNilaiPencahayaan = new JLabel(" Nilai Pencahayaan : ");
		lblNilaiPencahayaan.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblNilaiPencahayaan.setBounds(10, 86, 118, 36);
		frame.getContentPane().add(lblNilaiPencahayaan);
		
		NP = new JTextField();
		NP.setBackground(Color.LIGHT_GRAY);
		NP.setColumns(10);
		NP.setBounds(312, 86, 35, 36);
		frame.getContentPane().add(NP);
		
		JButton AddNP = new JButton("Add");
		AddNP.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddNP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setNilaiPencahayaan(Integer.parseInt(NP.getText().toString()));
				a.analisisPencahayaan();
			}
		});
		AddNP.setBounds(356, 86, 92, 36);
		frame.getContentPane().add(AddNP);
		
		final JSlider slider = new JSlider();
		slider.setBackground(Color.WHITE);
		slider.setMinimum(200);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				NP.setText(String.valueOf(slider.getValue()));
			}
		});
		slider.setValue(200);
		slider.setMaximum(310);
		slider.setBounds(132, 86, 172, 36);
		frame.getContentPane().add(slider);
		
		JLabel lblKelembapan = new JLabel(" Kelembapan : ");
		lblKelembapan.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblKelembapan.setBounds(10, 133, 118, 36);
		frame.getContentPane().add(lblKelembapan);
		
		kelembapan = new JTextField();
		kelembapan.setBackground(Color.LIGHT_GRAY);
		kelembapan.setColumns(10);
		kelembapan.setBounds(312, 133, 35, 36);
		frame.getContentPane().add(kelembapan);
		
		JButton AddKelembapan = new JButton("Add");
		AddKelembapan.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddKelembapan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setKelembapan(Integer.parseInt(kelembapan.getText().toString()));
				a.analisisKelembapan();
			}
		});
		AddKelembapan.setBounds(356, 133, 92, 36);
		frame.getContentPane().add(AddKelembapan);
		
		final JSlider sliderkelembapan = new JSlider();
		sliderkelembapan.setBackground(Color.WHITE);
		sliderkelembapan.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				kelembapan.setText(String.valueOf(sliderkelembapan.getValue()));
			}
		});
		sliderkelembapan.setMinimum(50);
		sliderkelembapan.setMaximum(90);
		sliderkelembapan.setBounds(132, 133, 172, 36);
		frame.getContentPane().add(sliderkelembapan);
		
		JLabel lblSuhu = new JLabel(" Suhu : ");
		lblSuhu.setFont(new Font("Stencil", Font.PLAIN, 10));
		lblSuhu.setBounds(10, 180, 118, 36);
		frame.getContentPane().add(lblSuhu);
		
		suhu = new JTextField();
		suhu.setBackground(Color.LIGHT_GRAY);
		suhu.setColumns(10);
		suhu.setBounds(312, 180, 35, 36);
		frame.getContentPane().add(suhu);
		
		JButton AddSuhu = new JButton("Add");
		AddSuhu.setFont(new Font("Stencil", Font.PLAIN, 12));
		AddSuhu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setSuhu(Integer.parseInt(suhu.getText().toString()));
				a.analisisSuhu();
			}
		});
		
		AddSuhu.setBounds(356, 180, 92, 36);
		frame.getContentPane().add(AddSuhu);
		final JSlider sliderSuhu = new JSlider();
		sliderSuhu.setBackground(Color.WHITE);
		sliderSuhu.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				suhu.setText(String.valueOf(sliderSuhu.getValue()));
			}
		});
		sliderSuhu.setValue(20);
		sliderSuhu.setMinimum(20);
		sliderSuhu.setMaximum(40);
		sliderSuhu.setBounds(132, 180, 172, 36);
		frame.getContentPane().add(sliderSuhu);
		
		JButton previous = new JButton("PREVIOUS");
		previous.setFont(new Font("Stencil", Font.PLAIN, 12));
		previous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TampilanLingkunganKelas TLK = new TampilanLingkunganKelas();
				TLK.LingkunganKelas();
			}
		});
		previous.setBounds(10, 227, 112, 46);
		frame.getContentPane().add(previous);
		
		JButton next = new JButton("NEXT");
		next.setFont(new Font("Stencil", Font.PLAIN, 12));
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				TampilanKenyamananKelas TKK = new TampilanKenyamananKelas();
				TKK.KenyamananKelas();
				a.save();
				a.read();
			}
		});
		next.setBounds(336, 227, 112, 46);
		frame.getContentPane().add(next);
	}
}
