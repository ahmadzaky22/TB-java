package interfacepack;

import java.util.*;

public class StopKontak implements JumlahKondisiPosisiSarana {
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
		System.out.println("masukkan jumlah stop kontak : ");
		jumlah = input.nextInt();
		
		if(jumlah >= 4){
			return 1;
		}
		else{
			return 0;
		}
	}
	@Override
	public int analisisKondisi() {
		System.out.println("masukkan kondisi stop kontak : ");
		kondisi = input.next();
		if(kondisi.equals("baik")){
			return 1;
		}
		else{
			return 0;
		}
	}
	@Override
	public int analisisPosisi() {
		System.out.println("masukkan posisi Stop Kontak: ");
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
		System.out.println("jumlah stop kontak : "+jumlah);
		System.out.println("kondisi stop kontak : "+kondisi);
		System.out.println("posisi stop kontak : "+posisi);
	}
}
