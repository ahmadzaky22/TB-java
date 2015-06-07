package TBfinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class StopKontak implements JumlahKondisiPosisiSarana {
	Scanner input = new Scanner (System.in);
	String namafile = "stopkontak.txt";
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
		if(getJumlah() >= 4){
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
		if(posisi.equals("dekat dosen")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}
		
	}
	@Override
	public void tampil() {
		System.out.println("jumlah stop kontak : "+jumlah);
		System.out.println("kondisi stop kontak : "+kondisi);
		System.out.println("posisi stop kontak : "+posisi);
	}
	public void save(){
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah stop kontak : "+jumlah);
			os.writeObject("kondisi stop kontak : "+kondisi);
			os.writeObject("posisi stop kontak : "+posisi);
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void read(){
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(namafile));
			is.readObject();
			System.out.println("jumlah stop kontak : "+getJumlah());
			System.out.println("kondisi stop kontak : "+getKondisi());
			System.out.println("posisi stop kontak : "+getPosisi());
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