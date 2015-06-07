package TBfinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class IndukRuangKelas {
	Scanner input = new Scanner(System.in);
	//Identitas Ruang Kelas
	private String namaRuangan ;
	private String lokasiRuang ;
	public String getNamaRuangan() {
		return namaRuangan;
	}
	public void setNamaRuangan(String namaRuangan) {
		this.namaRuangan = namaRuangan;
	}
	public String getLokasiRuang() {
		return lokasiRuang;
	}
	public void setLokasiRuang(String lokasiRuang) {
		this.lokasiRuang = lokasiRuang;
	}
	String namafile = "identitaskelas.txt";
	private String pilihFakultas;
	
	public String getPilihFakultas() {
		return pilihFakultas;
	}
	public void setPilihFakultas(String pilihFakultas) {
		this.pilihFakultas = pilihFakultas;
	}
	public void input(){
		System.out.println("=== IDENTITAS RUANG KELAS ===");
		System.out.println("masukkan nama Ruang : ");
		namaRuangan = input.nextLine();
		System.out.println("masukkan lokasi Ruangan : ");
		lokasiRuang = input.next();
		pilihFakultas = input.next();
	}
	public void view(){
		System.out.println("nama Ruang : "+namaRuangan);
		System.out.println("lokasi Ruang : "+lokasiRuang);
	}
	public void save(){
			try{
				ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
				os.writeObject("nama ruang : "+namaRuangan);
				os.writeObject("lokasi ruang : "+lokasiRuang);
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
			System.out.println("nama ruangan : "+namaRuangan);
			System.out.println("lokasi ruang : "+lokasiRuang);
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
