package abstractpack;

import java.util.Scanner;

public class KenyamananRuangKelas extends RuangKelas3 {
	Scanner input = new Scanner(System.in);
	
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
	@Override
	void analisis() {
		System.out.println("\n*Analisis*");
		if(kebisingan.equals("tidak_bising")){
			System.out.println("kebisingan SESUAI!");
		}
		else{
			System.out.println("kebisingan TIDAK SESUAI!");
		}
		if(bau.equals("tidak_bau")){
			System.out.println("bau SESUAI!");
		}
		else{
			System.out.println("bau TIDAK SESUAI!");
		}
		if(kebocoran.equals("tidak_bocor")){
			System.out.println("kebocoran SESUAI!");
		}
		else{
			System.out.println("kebocoran TIDAK SESUAI!");
		}
		if(kerusakan.equals("tidak_rusak")){
			System.out.println("kerusakan SESUAI!");
		}	
		else{
			System.out.println("kerusakan TIDAK SESUAI!");
		}
		if(keausan.equals("tidak_aus")){
			System.out.println("keausa SESUAI!");
		}
		else{
			System.out.println("keausan TIDAK SESUAI!");
		}	
	}
}
