package polimorfisme;

import java.util.Scanner;
public class JumlahKondisiPosisiSarana {
	Scanner input = new Scanner(System.in);
	
	int jumlah;
	String kondisi;
	String posisi;
	String Sarana;
	
	public void Input(String Sarana){
		this.Sarana = Sarana;
		System.out.println("masukkan Jumlah "+Sarana+":");
		jumlah = input.nextInt();
		System.out.println("kondisi "+Sarana+":");
		kondisi = input.next();
		System.out.println("posisi "+Sarana+":");
		posisi = input.next();
	}
	public void View(String Sarana){
		this.Sarana = Sarana;
		System.out.println("\njumlah "+Sarana+":"+jumlah);
		System.out.println("kondisi "+Sarana+":"+kondisi);
		System.out.println("posisi "+Sarana+":"+posisi);
	}
	public void Analisis(){
		System.out.println("\n*Analisis Stop Kontak*");
		if(jumlah >= 4){
			System.out.println("Stop Kontak SESUAI!");
		}
		else{
			System.out.println("Stop Kontak TIDAK SESUAI!");
		}
		if(kondisi.equals("baik")&& jumlah == 4){
			System.out.println("kondisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("kondisi Stop Kontak TIDAK SESUAI!");
		}
		if(posisi.equals("dekat_dosen")||posisi.equals("dipojok_ruang")){
			System.out.println("posisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("posisi Stop Kontak TIDAK SESUAI!");
		}
	}
}
