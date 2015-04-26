package TB2015;
import java.util.*;

public class RuangKelas {
	Scanner input = new Scanner(System.in);
	//Identitas Ruang Kelas
	String [] namaRuangan = new String[1];
	String [] lokasiRuang = new String[1];
	int pilihFakultas;
	
	//Kondisi Ruang Kelas
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
	
	public void identitasRuangKelas(){
		System.out.println("=== IDENTITAS RUANG KELAS ===");
		System.out.println("masukkan nama Ruang : ");
		namaRuangan[0] = input.nextLine();
		System.out.println("masukkan lokasi Ruangan : ");
		lokasiRuang[0] = input.nextLine();
		System.out.println("1. Fakultas Teknik");
		System.out.println("2. Fakultas Kedokteran");
		System.out.println("3. Fakultas Hukum");
		System.out.println("4. Fakultas Ekonomi Bisnis");
		System.out.println("5. Fakultas Agama Islam");
		System.out.println("pilih fakultas anda masukkan nomor fakultas : ");
		pilihFakultas = input.nextInt();
		
		System.out.println("nama Ruang : "+namaRuangan[0]);
		System.out.println("lokasi Ruang : "+lokasiRuang[0]);
	}
	
	public void inputKondisiRuangKelas(){
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
		System.out.println("luas kelas : "+luas());
		System.out.println("rasio luas kelas : "+rasioLuas());
	}
	double luas (){
		return panjangKelas*lebarKelas;
	}
	double rasioLuas(){
		return luas()/jumlahKursi;
	}
	
}
