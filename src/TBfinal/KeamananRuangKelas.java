package dragndrop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class KeamananRuangKelas extends RuangKelas3 {
	Scanner input = new Scanner(System.in);
	String namafile = "KeamananKelas.txt";
	private String kekokohan;
	private String kunciPintu;
	private String kunciJendela;
	private String bahaya;
	
	public String getKekokohan() {
		return kekokohan;
	}
	public void setKekokohan(String kekokohan) {
		this.kekokohan = kekokohan;
	}
	public String getKunciPintu() {
		return kunciPintu;
	}
	public void setKunciPintu(String kunciPintu) {
		this.kunciPintu = kunciPintu;
	}
	public String getKunciJendela() {
		return kunciJendela;
	}
	public void setKunciJendela(String kunciJendela) {
		this.kunciJendela = kunciJendela;
	}
	public String getBahaya() {
		return bahaya;
	}
	public void setBahaya(String bahaya) {
		this.bahaya = bahaya;
	}
	@Override
	void input() {
			System.out.println("\n=== KEAMANAN RUANG KELAS ===");
			
			System.out.println("kekokohan : ");
			kekokohan = input.next();
			System.out.println("kunci pintu : ");
			kunciPintu = input.next();
			System.out.println("kunci jendela : ");
			kunciJendela = input.next();
			System.out.println("bahaya : ");
			bahaya = input.next();
	}
	@Override
	void view() {
		System.out.println("kekokohan : "+kekokohan);
		System.out.println("kunci pintu : "+kunciPintu);
		System.out.println("kunci jendela : "+kunciJendela);
		System.out.println("bahaya : "+bahaya);	
		
	}
	
	void analisisKekokohan() {
		if(kekokohan.equals("kokoh")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisKunciPintu(){
		if(kunciPintu.equals("ada")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisKunciJendela(){
		if(kunciJendela.equals("ada")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisBahaya(){
		if(bahaya.equals("aman")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}	
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}
	}
	@Override
	void save() {
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kekokohan : "+kekokohan);
			os.writeObject("kunci pintu : "+kunciPintu);
			os.writeObject("kunci jendela : "+kunciJendela);
			os.writeObject("bahaya : "+bahaya);
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
			System.out.println("kekokohan : "+kekokohan);
			System.out.println("kunci pintu : "+kunciPintu);
			System.out.println("kunci jendela : "+kunciJendela);
			System.out.println("bahaya : "+bahaya);	
			
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