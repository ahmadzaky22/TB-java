package interfacepack;

import java.util.Scanner;

public class KabelLCD implements JumlahKondisiPosisiSarana {
	Scanner input = new Scanner (System.in);
	private int jumlah;
	private String kondisi;
	private String posisi;
	
	public int getJumlah() {
		return jumlah;
	}
	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}
	public String getKondisi() {
		return kondisi;
	}
	public void setKondisi(String kondisi) {
		this.kondisi = kondisi;
	}
	public String getPosisi() {
		return posisi;
	}
	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}
	
	@Override
	public int analisisJumlah() {
		System.out.println("masukkan jumlah Kabel LCD : ");
		jumlah = input.nextInt();
		if(jumlah >= 1){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisKondisi() {
		System.out.println("masukkan kondisi Kabel LCD : ");
		posisi = input.next();
		if(kondisi.equals("berfungsi")){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisPosisi() {
		System.out.println("masukkan posisi Kabel LCD : ");
		posisi = input.next();
		if(posisi.equals("dekat_dosen")){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public void tampil() {
		System.out.println("jumlah Kabel LCD : "+jumlah);
		System.out.println("kondisi Kabel LCD : "+kondisi);
		System.out.println("posisi Kabel LCD : "+posisi);
	}
}
