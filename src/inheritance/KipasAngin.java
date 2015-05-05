package inheritance;

public class KipasAngin extends JumlahKondisiPosisiSarana {
	public KipasAngin(){
		System.out.println("\nKipas Angin");
		Input();
		View();
	}
	public void Analisis(){
		System.out.println("\n*Analisis Kipas Angin*");
		if(jumlah >= 2){
			System.out.println("Kipas Angin SESUAI!");
		}
		else{
			System.out.println("Kipas Angin TIDAK SESUAI!");
		}
		if(kondisi.equals("baik") && jumlah == 2){
			System.out.println("Kondisi Kipas Angin SESUAI!");
		}
		else{
			System.out.println("Kondisi Kipas Angin TIDAK SESUAI!");
		}
		if(posisi.equals("atap_ruangan")){
			System.out.println("posisi Kipas Angin SESUAI!");
		}
		else{
			System.out.println("posisi Kipas Angin TIDAK SESUAI!");
		}
	}
}