package TBfinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

public class KondisiRuangKelas extends IndukRuangKelas{
	String namafile = "kondisiRuang.txt";
	private int panjangKelas;
	private int lebarKelas;
	private int jumlahKursi; 
	private int jumlahPintu;
	private int jumlahJendela; 
	
	public void setPanjangKelas(int panjangKelas){
		this.panjangKelas = panjangKelas;
	}
	public int getPanjangKelas(){
		return panjangKelas;
	}
	public void setlebarKelas(int lebarKelas){
		this.lebarKelas = lebarKelas;
	}
	public int getlebarKelas(){
		return lebarKelas;
	}
	public void setJumlahKursi(int jumlahKursi){
		this.jumlahKursi = jumlahKursi;
	}
	public int getJumlahKursi(){
		return jumlahKursi;
	}
	public void setJumlahPintu(int jumlahPintu){
		this.jumlahPintu = jumlahPintu;
	}
	public int getJumlahPintu(){
		return jumlahPintu;
	}
	public void setJumlahJendela(int jumlahJendela){
		this.jumlahJendela = jumlahJendela;
	}
	public int getJumlahJendela(){
		return jumlahJendela;
	}
	
	public void input(){
		System.out.println("\n=== KONDISI RUANG KELAS ===");
		System.out.println("masukkan panjang kelas : ");
		panjangKelas = input.nextInt();
		System.out.println("masukkan lebar kelas : ");
		lebarKelas = input.nextInt();
		System.out.println("masukkan jumlah kursi : ");
		jumlahKursi = input.nextInt();
		System.out.println("masukkan jumlah pintu : ");
		jumlahPintu = input.nextInt();
		System.out.println("masukkan jumlah jendela : ");
		jumlahJendela = input.nextInt();
		
	}
	public void view(){
		System.out.println("panjang kelas : "+panjangKelas);
		System.out.println("lebar kelas : "+lebarKelas);
		System.out.println("jumlah kursi : "+jumlahKursi);
		System.out.println("jumlah pintu : "+jumlahPintu);
		System.out.println("jumlah jendela : "+jumlahJendela);
		System.out.println("luas kelas : "+luas());
		System.out.println("rasio luas kelas : "+rasioLuas());
	}
	public void analisisLuas(){
		if(panjangKelas!= luas()){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	public void analisisRasioLuas(){
		if(rasioLuas() >= 0.5){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	public void analisisPintu(){
		if(jumlahPintu >= 2 ){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	public void anlisisJendela(){
		if(jumlahJendela >= 1){
			JOptionPane.showMessageDialog(null, "Sesuai");
		}
		else{
			JOptionPane.showMessageDialog(null, "Tidak Sesuai");
		}}
	
		double luas (){
			return panjangKelas*lebarKelas;
		}
		double rasioLuas(){
			return luas()/jumlahKursi;
		}
	public void save(){
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("panjang kelas : "+panjangKelas);
			os.writeObject("lebar kelas : "+lebarKelas);
			os.writeObject("jumlah kursi : "+jumlahKursi);
			os.writeObject("jumlah pintu : "+jumlahPintu);
			os.writeObject("jumlah jendela : "+jumlahJendela);
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
			System.out.println("panjang kelas : "+panjangKelas);
			System.out.println("lebar kelas : "+lebarKelas);
			System.out.println("jumlah pintu : "+jumlahPintu);
			System.out.println("jumlah kursi : "+jumlahKursi);
			System.out.println("jumlah jendela : "+jumlahJendela);
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