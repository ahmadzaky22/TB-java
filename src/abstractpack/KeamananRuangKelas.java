package abstractpack;

import java.util.Scanner;

public class KeamananRuangKelas extends RuangKelas3 {
	Scanner input = new Scanner(System.in);
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
	@Override
	void analisis() {
		System.out.println("\n*Analisis*");
		if(kekokohan.equals("kokoh")){
			System.out.println("kekokohan SESUAI!");
		}
		else{
			System.out.println("kekokohan TIDAK SESUAI!");
		}
		if(kunciPintu.equals("ada")){
			System.out.println("kunci pintu SESUAI!");
		}
		else{
			System.out.println("kunci pintu TIDAK SESUAI!");
		}
		if(kunciJendela.equals("ada")){
			System.out.println("kunci jendela SESUAI!");
		}
		else{
			System.out.println("kunci jendela TIDAK SESUAI!");
		}
		if(bahaya.equals("aman")){
			System.out.println("keamanan ruang SESUAI!");
		}	
		else{
			System.out.println("keamanan ruang TIDAK SESUAI!");
		}
		
		
	}
	
}
