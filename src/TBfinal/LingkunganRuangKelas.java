package dragndrop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LingkunganRuangKelas extends RuangKelas3 {
	Scanner input = new Scanner(System.in);
	String namafile = "LingkunganKelas.txt";
	private String lantai;
	private String dinding;
	private String atap;
	private String pintu;
	private String jendela;
	
	public String getLantai() {
		return lantai;
	}
	public void setLantai(String lantai) {
		this.lantai = lantai;
	}
	public String getDinding() {
		return dinding;
	}
	public void setDinding(String dinding) {
		this.dinding = dinding;
	}
	public String getAtap() {
		return atap;
	}
	public void setAtap(String atap) {
		this.atap = atap;
	}
	public String getPintu() {
		return pintu;
	}
	public void setPintu(String pintu) {
		this.pintu = pintu;
	}
	public String getJendela() {
		return jendela;
	}
	public void setJendela(String jendela) {
		this.jendela = jendela;
	}
	@Override
	void input() {
		System.out.println("\n=== LINGKUNGAN RUANG KELAS ===");
		System.out.println("masukkan kondisi lantai : ");
		lantai = input.next();
		System.out.println("masukkan kondisi dinding : ");
		dinding = input.next();
		System.out.println("masukkan kondisi atap : ");
		atap = input.next();
		System.out.println("masukkan kondisi pintu : ");
		pintu = input.next();
		System.out.println("masukkan kondisi jendela : ");
		jendela = input.next();
	}
	@Override
	void view() {
		System.out.println("kondisi lantai : "+lantai);
		System.out.println("kondisi dinding : "+dinding);
		System.out.println("kondisi atap : "+atap);
		System.out.println("kondisi pintu : "+pintu);
		System.out.println("kondisi jendela : "+jendela);
		
	}
	
	void analisisLantai() {
		if(lantai.equals("bersih")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisDinding(){
		if(dinding.equals("bersih")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisAtap(){
		if(atap.equals("bersih")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisPintu(){
		if(pintu.equals("bersih")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisJendela(){
		if(jendela.equals("bersih")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	@Override
	void save() {
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kondisi lantai : "+lantai);
			os.writeObject("kondisi dinding : "+dinding);
			os.writeObject("kondisi atap : "+atap);
			os.writeObject("kondisi pintu : "+pintu);
			os.writeObject("kondisi jendela : "+jendela);
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
	void read() {
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(namafile));
			is.readObject();
			System.out.println("kondisi lantai : "+lantai);
			System.out.println("kondisi dinding : "+dinding);
			System.out.println("kondisi atap : "+atap);
			System.out.println("kondisi pintu : "+pintu);
			System.out.println("kondisi jendela : "+jendela);
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