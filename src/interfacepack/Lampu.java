package interfacepack;

import java.util.Scanner;

public class Lampu implements JumlahKondisiPosisiSarana{
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
		System.out.println("masukkan jumlah Lampu : ");
		jumlah = input.nextInt();
		if(jumlah >= 18){
			return 1;
		}
		else{
			return 0; 
		}
	}

	@Override
	public int analisisKondisi() {
		System.out.println("masukkan kondisi Lampu : ");
		posisi = input.next();
		if(kondisi.equals("baik")&& jumlah == 18){
			return 1;
		}
		else{
			return 0;
		}
	}

	@Override
	public int analisisPosisi() {
		System.out.println("masukkan posisi Lampu : ");
		posisi = input.next();
		if(posisi.equals("atap_ruangan")){
			return 1; 
		}
		else{
			return 0; 
		}
	}

	@Override
	public void tampil() {
		System.out.println("jumlah Lampu : "+jumlah);
		System.out.println("kondisi Lampu : "+kondisi);
		System.out.println("posisi Lampu : "+posisi);
	}

}

