package inheritance;
import java.util.Scanner;
public class JumlahKondisiPosisiSarana {
	Scanner input = new Scanner(System.in);
	
	int jumlah;
	String kondisi;
	String posisi;
	
	public void Input(){
		System.out.println("masukkan Jumlah : ");
		jumlah = input.nextInt();
		System.out.println("kondisi : ");
		kondisi = input.next();
		System.out.println("posisi : ");
		posisi = input.next();
	}
	public void View(){
		System.out.println("\njumlah : "+jumlah);
		System.out.println("kondisi : "+kondisi);
		System.out.println("posisi : "+posisi);
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
		if(posisi.equals("dekat_dosen")||posisi.equals("Dipojok_ruang")){
			System.out.println("posisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("posisi Stop Kontak TIDAK SESUAI!");
		}
	}
}