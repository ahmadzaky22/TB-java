package inheritance;

public class KabelLCD extends JumlahKondisiPosisiSarana {
	public KabelLCD(){
		System.out.println("\nKabel LCD");
		Input();
		View();
	}
	public void Analisis(){
		System.out.println("\n*Analisis Kabel LCD*");
		if(jumlah >= 1){
			System.out.println("Kabel LCD SESUAI!");
		}
		else{
			System.out.println("Kabel LCD TIDAK SESUAI!");
		}
		if(kondisi.equals("berfungsi")){
			System.out.println("Kondisi LCD SESUAI!");
		}
		else{
			System.out.println("Kondisi LCD TIDAK SESUAI!");
		}
		if(posisi.equals("dekat_dosen")){
			System.out.println("Posisi Kabel LCD SESUAI!");
		}
		else{
			System.out.println("posisi Kabel LCD TIDAK SESUAI!");
		}
	}
}
