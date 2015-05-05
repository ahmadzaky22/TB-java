package inheritance;

public class Lampu extends JumlahKondisiPosisiSarana {
	public Lampu(){
		System.out.println("\nLampu");
		Input();
		View();
	}
	public void Analisis(){
		System.out.println("\n*Analisis Lampu*");
		if(jumlah >= 18){
			System.out.println("Lampu SESUAI!");
		}
		else{
			System.out.println("Lampu TIDAK SESUAI!");
		}
		if(kondisi.equals("baik")&& jumlah == 18){
			System.out.println("Kondisi Lampu SESUAI!");
		}
		else{
			System.out.println("Kondisi Lampu TIDAK SESUAI!");
		}
		if(posisi.equals("atap_ruangan")){
			System.out.println("posisi Lampu SESUAI!");
		}
		else{
			System.out.println("posisi Lampu TIDAK SESUAI!");
		}
	}
}
