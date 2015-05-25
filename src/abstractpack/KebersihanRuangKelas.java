package abstractpack;

import java.util.Scanner;

public class KebersihanRuangKelas extends RuangKelas3{
	Scanner input = new Scanner(System.in);
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

	@Override
	void analisis() {
		System.out.println("\n*Analisis*");
		if(sirkulasiUdara.equals("lancar")){
			System.out.println("sirkulasi Udara SESUAI!");
		}
		else{
			System.out.println("sirkulasi Udara TIDAK SESUAI!");
		}
		if(nilaiPencahayaan >= 250 && nilaiPencahayaan <= 300 ){
			System.out.println("nilai pencahayaan SESUAI!");
		}
		else{
			System.out.println("nilai pencahayaan TIDAK SESUAI!");
		}
		if(kelembapan >=70 && kelembapan <=80){
			System.out.println("kelembapan SESUAI!");
		}
		else{
			System.out.println("kelembapan TIDAK SESUAI!");
		}
		if(suhu >=25 && suhu <= 35){
			System.out.println("suhu SESUAI!");
		}
		else{
			System.out.println("suhu TIDAK SESUAI!");
		}
	}
}
