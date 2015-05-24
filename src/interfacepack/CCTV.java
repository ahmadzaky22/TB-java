package interfacepack;

import java.util.Scanner;

public class CCTV implements JumlahKondisiPosisiSarana{
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
		System.out.println("masukkan jumlah CCTV : ");
		jumlah = input.nextInt();
		if(jumlah == 2){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisKondisi() {
		System.out.println("masukkan kondisi CCTV : ");
		kondisi = input.next();
		if(kondisi.equals("baik") && jumlah == 2){
			return 1;
		}
		else{
			return 0; 
		}
	}

	@Override
	public int analisisPosisi() {
		System.out.println("masukkan posisi CCTV : ");
		posisi = input.next();
		if(posisi.equals("depan_dan_belakang")){
			return 1;
		}
		else{
			return 0;
		}
		
	}

	@Override
	public void tampil() {
		System.out.println("jumlah CCTV : "+jumlah);
		System.out.println("kondisi CCTV : "+kondisi);
		System.out.println("posisi CCTV : "+posisi);	
	}

}

