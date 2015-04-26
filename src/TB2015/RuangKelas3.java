package TB2015;
import java.util.*;

public class RuangKelas3 {
	Scanner input = new Scanner(System.in);
	//lingkungan ruang kelas
	String kondisiLantai;
	String kondisiDinding;
	String kondisiAtap;
	String kondisiPintu;
	String kondisiJendela;
	
	//kebersihan ruang kelas
	String sirkulasiUdara;
	int nilaiPencahayaan;
	int kelembapan;
	int suhu;
	
	//kenyamanan ruang kelas
	String kebisingan;
	String bau;
	String kebocoran;
	String kerusakan;
	String keausan;
	
	//keamanan ruang kelas
	String kekokohan;
	String kunciPintu;
	String kunciJendela;
	String bahaya;
	
	public void lingkunganRuangKelas(){
		System.out.println("\n=== LINGKUNGAN RUANG KELAS ===");
		System.out.println("masukkan kondisi lantai : ");
		kondisiLantai = input.next();
		System.out.println("masukkan kondisi dinding : ");
		kondisiDinding = input.next();
		System.out.println("masukkan kondisi atap : ");
		kondisiAtap = input.next();
		System.out.println("masukkan kondisi pintu : ");
		kondisiPintu = input.next();
		System.out.println("masukkan kondisi jendela : ");
		kondisiJendela = input.next();
		
		//view
		System.out.println("kondisi lantai : "+kondisiLantai);
		System.out.println("kondisi dinding : "+kondisiDinding);
		System.out.println("kondisi atap : "+kondisiAtap);
		System.out.println("kondisi pintu : "+kondisiPintu);
		System.out.println("kondisi jendela : "+kondisiJendela);
	}
	
	public void kebersihanRuangKelas(){
		System.out.println("\n=== KEBERSIHAN RUANG KELAS ===");
		System.out.println("masukkan kondisi sirkulasi Udara : ");
		sirkulasiUdara = input.next();
		System.out.println("masukkan nilai pencahayaan : ");
		nilaiPencahayaan = input.nextInt();
		System.out.println("masukkan kelembapan (%) : ");
		kelembapan = input.nextInt();
		System.out.println("masukkan suhu : ");
		suhu = input.nextInt();
		
		//view
		System.out.println("kondisi sirkulasi Udara : "+sirkulasiUdara);
		System.out.println("nilai pencahayaan : "+nilaiPencahayaan);
		System.out.println("kelembapan : "+kelembapan);
		System.out.println("suhu : "+suhu);
	}
	
	public void kenyamananRuangKelas(){
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
		
		//view
		System.out.println("kebisingan : "+kebisingan);
		System.out.println("bau : "+bau);
		System.out.println("kebocoran : "+kebocoran);
		System.out.println("kerusakan : "+kerusakan);
		System.out.println("keausan : "+keausan);
	}
	
	public void keamananRuangKelas(){
		System.out.println("\n=== KEAMANAN RUANG KELAS ===");
		
		System.out.println("kekokohan : ");
		kekokohan = input.next();
		System.out.println("kunci pintu : ");
		kunciPintu = input.next();
		System.out.println("kunci jendela : ");
		kunciJendela = input.next();
		System.out.println("bahaya : ");
		bahaya = input.next();
		
		//view
		System.out.println("kekokohan : "+kekokohan);
		System.out.println("kunci pintu : "+kunciPintu);
		System.out.println("kunci jendela : "+kunciJendela);
		System.out.println("bahaya : "+bahaya);	
	}

}
