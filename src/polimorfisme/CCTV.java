package polimorfisme;

public class CCTV extends JumlahKondisiPosisiSarana{
	public CCTV(){
		System.out.println("\nCCTV");
		Input("CCTV");
		View("CCTV");
	}
	public void Analisis(){
		System.out.println("\n*Analisis CCTV*");
		if(jumlah == 2){
			System.out.println("CCTV SESUAI!");
		}
		else{
			System.out.println("CCTV TIDAK SESUAI!");
		}
		if(kondisi.equals("baik") && jumlah == 2){
			System.out.println("kondisi CCTV SESUAI!");
		}
		else{
			System.out.println("kondisi CCTV TIDAK SESUAI!");
		}
		if(posisi.equals("depan_dan_belakang")){
			System.out.println("posisi CCTV SESUAI!");
		}
	}
}
