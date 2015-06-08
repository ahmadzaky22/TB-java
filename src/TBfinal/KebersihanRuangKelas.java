package dragndrop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class KebersihanRuangKelas extends RuangKelas3{
	Scanner input = new Scanner(System.in);
	String namafile = "KebersihanKelas.txt";
	private String sirkulasiUdara;
	private int nilaiPencahayaan;
	private int kelembapan;
	private int suhu;

	public String getSirkulasiUdara() {
		return sirkulasiUdara;
	}

	public void setSirkulasiUdara(String sirkulasiUdara) {
		this.sirkulasiUdara = sirkulasiUdara;
	}

	public int getNilaiPencahayaan() {
		return nilaiPencahayaan;
	}

	public void setNilaiPencahayaan(int nilaiPencahayaan) {
		this.nilaiPencahayaan = nilaiPencahayaan;
	}

	public int getKelembapan() {
		return kelembapan;
	}

	public void setKelembapan(int kelembapan) {
		this.kelembapan = kelembapan;
	}

	public int getSuhu() {
		return suhu;
	}

	public void setSuhu(int suhu) {
		this.suhu = suhu;
	}

	@Override
	void input() {
		System.out.println("\n=== KEBERSIHAN RUANG KELAS ===");
		System.out.println("masukkan kondisi sirkulasi Udara : ");
		sirkulasiUdara = input.next();
		System.out.println("masukkan nilai pencahayaan : ");
		nilaiPencahayaan = input.nextInt();
		System.out.println("masukkan kelembapan (%) : ");
		kelembapan = input.nextInt();
		System.out.println("masukkan suhu : ");
		suhu = input.nextInt();
	}

	@Override
	void view() {
			System.out.println("kondisi sirkulasi Udara : "+sirkulasiUdara);
			System.out.println("nilai pencahayaan : "+nilaiPencahayaan);
			System.out.println("kelembapan : "+kelembapan);
			System.out.println("suhu : "+suhu);
	}

	void analisisSirkulasiUdara() {
		if(sirkulasiUdara.equals("lancar")){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisPencahayaan(){
		if(nilaiPencahayaan >= 250 && nilaiPencahayaan <= 300 ){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisKelembapan(){
		if(kelembapan >=70 && kelembapan <=80){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	void analisisSuhu(){
		if(suhu >=25 && suhu <= 35){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	@Override
	void save() {
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("sirkulasi udara : "+sirkulasiUdara);
			os.writeObject("nilai pencahayaan: "+nilaiPencahayaan);
			os.writeObject("kelembapan : "+kelembapan);
			os.writeObject("suhu : "+suhu);
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
			System.out.println("kondisi sirkulasi Udara : "+sirkulasiUdara);
			System.out.println("nilai pencahayaan : "+nilaiPencahayaan);
			System.out.println("kelembapan : "+kelembapan);
			System.out.println("suhu : "+suhu);
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
