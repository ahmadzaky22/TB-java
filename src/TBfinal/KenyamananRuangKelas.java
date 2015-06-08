package dragndrop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class KenyamananRuangKelas extends RuangKelas3 {
	Scanner input = new Scanner(System.in);
	String namafile = "KenyamananKelas.txt";
	private String kebisingan;
	private String bau;
	private String kebocoran;
	private String kerusakan;
	private String keausan;
	public String getKebisingan() {
		return kebisingan;
	}
	public void setKebisingan(String kebisingan) {
		this.kebisingan = kebisingan;
	}
	public String getBau() {
		return bau;
	}
	public void setBau(String bau) {
		this.bau = bau;
	}
	public String getKebocoran() {
		return kebocoran;
	}
	public void setKebocoran(String kebocoran) {
		this.kebocoran = kebocoran;
	}
	public String getKerusakan() {
		return kerusakan;
	}
	public void setKerusakan(String kerusakan) {
		this.kerusakan = kerusakan;
	}
	public String getKeausan() {
		return keausan;
	}
	public void setKeausan(String keausan) {
		this.keausan = keausan;
	}
	@Override
	void input() {
		System.out.println("\n=== KENYAMANAN RUANG KELAS ===");
		System.out.println("kebisingan : ");
		kebisingan = input.next();
		System.out.println("bau : ");
		bau = input.next();
		System.out.println("kebocoran : ");
		kebocoran = input.next();
		System.out.println("kerusakan : ");
		kerusakan = input.next();
		System.out.println("keausan : ");
		keausan = input.next();
	}
	@Override
	void view() {
		System.out.println("kenyamanan kebisingan: "+kebisingan);
		System.out.println("kenyamanan bau: "+bau);
		System.out.println("kenyamanan kebocoran : "+kebocoran);
		System.out.println("kenyamanan kerusakan : "+kerusakan);
		System.out.println("kenyamanan keausan : "+keausan);
	}
	
	void analisisKebisingan() {
		if(kebisingan.equals("tidak bising")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisBau(){
		if(bau.equals("tidak bau")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisKebocoran(){
		if(kebocoran.equals("tidak bocor")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisKerusakan(){
		if(kerusakan.equals("tidak rusak")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}	
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisKeausan(){
		if(keausan.equals("tidak aus")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}	
	@Override
	void save() {
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kebisingan : "+kebisingan);
			os.writeObject("bau : "+bau);
			os.writeObject("kebocoran : "+kebocoran);
			os.writeObject("kerusakan : "+kerusakan);
			os.writeObject("keausan : "+keausan);
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
			System.out.println("kebisingan: "+kebisingan);
			System.out.println("bau: "+bau);
			System.out.println("kebocoran : "+kebocoran);
			System.out.println("kerusakan : "+kerusakan);
			System.out.println("keausan : "+keausan);
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