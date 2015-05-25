package abstractpack;

import java.util.Scanner;

public class LingkunganRuangKelas extends RuangKelas3 {
	Scanner input = new Scanner(System.in);
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
	@Override
	void analisis() {
		System.out.println("\n*Analisis Kebersihan*");
		if(lantai.equals("bersih")){
			System.out.println("kondisi lantai SESUAI!");
		}
		else{
			System.out.println("kondisi lantai TIDAK SESUAI!");
		}
		if(dinding.equals("bersih")){
			System.out.println("kondisi dinding SESUAI!");
		}
		else{
			System.out.println("kondisi dinding TIDAK SESUAI!");
		}
		if(atap.equals("bersih")){
			System.out.println("kondisi atap SESUAI!");
		}
		else{
			System.out.println("kondisi atap TIDAK SESUAI!");
		}
		if(pintu.equals("bersih")){
			System.out.println("kondisi pintu SESUAI!");
		}
		else{
			System.out.println("kondisi pintu TIDAK SESUAI!");
		}
		if(jendela.equals("bersih")){
			System.out.println("kondisi jendela SESUAI!");
		}
		else{
			System.out.println("kondisi jendela TIDAK SESUAI!");
		}
		
	}
	
}
