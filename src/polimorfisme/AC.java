package polimorfisme;

public class AC extends JumlahKondisiPosisiSarana{
	public AC(){
		System.out.println("\nAC");
		Input("AC");
		View("AC");
	}
	public void Analisis(){
		System.out.println("\n*Analisis AC*");
		if(jumlah >= 1){
			System.out.println("AC SESUAI!");
		}
		else{
			System.out.println("AC TIDAK SESUAI!");
		}
		if(kondisi.equals("baik")){
			System.out.println("konidis AC SESUAI!");
		}
		else{
			System.out.println("kondisi AC TIDAK SESUAI!");
		}
		if(posisi.equals("disamping")||posisi.equals("dibelakang")){
			System.out.println("posisi AC SESUAI!");
		}
		else{
			System.out.println("posisi AC TIDAK SESUAI!");
		}
	}
}
