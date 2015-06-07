package TBfinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AC implements JumlahKondisiPosisiSarana {
	Scanner input = new Scanner (System.in);
	String namafile = "AC.txt";
	private int jumlah;
	private String kondisi;
	private String posisi;
	
	public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public String getKondisi() {
		return kondisi;
	}
	public void setKondisi(String kondisi) {
		this.kondisi = kondisi;
	}
	public String getPosisi() {
		return posisi;
	}
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	
	@Override
	public void analisisJumlah() {
		if(jumlah >= 1){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}
	}

	@Override
	public void analisisKondisi() {
		if(kondisi.equals("baik")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}
	}

	@Override
	public void analisisPosisi() {
		if(posisi.equals("disamping")||posisi.equals("dibelakang")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}
	}

	@Override
	public void tampil() {
		System.out.println("jumlah AC : "+jumlah);
		System.out.println("kondisi AC : "+kondisi);
		System.out.println("posisi AC : "+posisi);
	}
	@Override
	public void save() {
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah AC : "+getJumlah());
			os.writeObject("kondisi AC : "+getKondisi());
			os.writeObject("posisi AC : "+getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void read() {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(namafile));
			is.readObject();
			System.out.println("jumlah AC : "+jumlah);
			System.out.println("kondisi AC : "+kondisi);
			System.out.println("posisi AC : "+posisi);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

