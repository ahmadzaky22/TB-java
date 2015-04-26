package TB2015;

public class CheckRuangKelas {
	RuangKelas id = new RuangKelas();
	RuangKelas2 id2 = new RuangKelas2();
	
	
	public void IdentitasRuangKelas(){
		
		id.identitasRuangKelas();
		
		if(id.pilihFakultas == 1){
			System.out.println("Fakultas anda : Fakultas Teknik");
		}
		else if(id.pilihFakultas == 2){
			System.out.println("Fakultas anda : Fakultas Kedokteran");
		}
		else if(id.pilihFakultas == 3){
			System.out.println("Fakultas anda : Fakultas Hukum");
		}
		else if(id.pilihFakultas == 4){
			System.out.println("Fakultas anda : Fakultas Ekonomi Bisnis");
		}
		else if(id.pilihFakultas == 5){
			System.out.println("Fakultas anda : Fakultas Agama Islam");
		}
		
	}
	
	public void KondisiRuangKelas(){ 
		
		id.inputKondisiRuangKelas();
		if(id.getPanjangKelas()!= id.luas()){
			System.out.println("bentuk kelas persegi panjang , kelas SESUAI!");
			
		}
		else{
			System.out.println("bentuk kelas tidak persegi panjang , kelas TIDAK SESUAI!");
		}
		if(id.rasioLuas() >= 0.5){
			System.out.println("rasio kelas SESUAI!");
		}
		else{
			System.out.println("rasio kelas TIDAK SESUAI!");
		}
		if(id.getJumlahPintu() >= 2 ){
			System.out.println("jumlah pintu SESUAI!");
		}
		else{
			System.out.println("jumlah pintu TIDAK SESUAI!");
		}
		if(id.getJumlahJendela() >= 1){
			System.out.println("jumlah jendela SESUAI!");
		}
		else{
			System.out.println("jumlah jendela TIDAK SESUAI!");
		}
	}
	
	public void JumlahKondisiPosisiSarana(){
		
		id2.jumlahKondisiPosisiSarana();
		
		//View
		System.out.println("\njumlah Stop Kontak : "+id2.getJumlahStopKontak());
		System.out.println("kondisi Stop Kontak : "+id2.getKondisiStopKontak());
		System.out.println("posisi Stop Kontak : "+id2.getPosisiStopKontak());
		
		System.out.println("\njumlah kabel LCD : "+id2.getJumlahKabelLCD());
		System.out.println("kondisi kabel LCD : "+id2.getKondisiKabelLCD());
		System.out.println("posisi kabel LCD : "+id2.getPosisiKabelLCD());
		
		System.out.println("\njumlah Lampu : "+id2.getJumlahLampu());
		System.out.println("kondisi Lampu : "+id2.getKondisiLampu());
		System.out.println("posisi Lampu : "+id2.getPosisiLampu());
		
		System.out.println("\njumlah Kipas Angin : "+id2.getJumlahKipasAngin());
		System.out.println("kondisi Kipas Angin : "+id2.getKondisiKipasAngin());
		System.out.println("posisi Kipas Angin : "+id2.getPosisiKipasAngin());

		System.out.println("\njumlah AC : "+id2.getJumlahAC());
		System.out.println("kondisi AC : "+id2.getKondisiAC());
		System.out.println("posisi AC : "+id2.getPosisiAC());
		
		System.out.println("\njumlah CCTV : "+id2.getJumlahCCTV());
		System.out.println("kondisi CCTV : "+id2.getKondisiCCTV());
		System.out.println("posisi CCTV : "+id2.getPosisiCCTV());
		
		System.out.println("\n*Analisis Stop Kontak*");
		//Stop Kontak
		if(id2.getJumlahStopKontak() >= 4){
			System.out.println("Stop Kontak SESUAI!");
		}
		else{
			System.out.println("Stop Kontak TIDAK SESUAI!");
		}
		if(id2.getKondisiStopKontak().equals("baik")&& id2.getJumlahStopKontak() == 4){
			System.out.println("kondisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("kondisi Stop Kontak TIDAK SESUAI!");
		}
		if(id2.getPosisiStopKontak().equals("dekat_dosen")||id2.getPosisiStopKontak().equals("Dipojok_ruang")){
			System.out.println("posisi Stop Kontak SESUAI!");
		}
		else{
			System.out.println("posisi Stop Kontak TIDAK SESUAI!");
		}
		
		System.out.println("\n*Analisis Kabel LCD*");
		//Kabel LCD
		if(id2.getJumlahKabelLCD() >= 1){
			System.out.println("Kabel LCD SESUAI!");
		}
		else{
			System.out.println("Kabel LCD TIDAK SESUAI!");
		}
		if(id2.getKondisiKabelLCD().equals("berfungsi")){
			System.out.println("Kondisi LCD SESUAI!");
		}
		else{
			System.out.println("Kondisi LCD TIDAK SESUAI!");
		}
		if(id2.getPosisiKabelLCD().equals("dekat_dosen")){
			System.out.println("Posisi Kabel LCD SESUAI!");
		}
		else{
			System.out.println("posisi Kabel LCD TIDAK SESUAI!");
		}
		
		System.out.println("\n*Analisis Lampu*");
		//Lampu
		if(id2.getJumlahLampu() >= 18){
			System.out.println("Lampu SESUAI!");
		}
		else{
			System.out.println("Lampu TIDAK SESUAI!");
		}
		if(id2.getKondisiLampu().equals("baik")&& id2.getJumlahLampu() == 18){
			System.out.println("Kondisi Lampu SESUAI!");
		}
		else{
			System.out.println("Kondisi Lampu TIDAK SESUAI!");
		}
		if(id2.getPosisiLampu().equals("atap_ruangan")){
			System.out.println("posisi Lampu SESUAI!");
		}
		else{
			System.out.println("posisi Lampu TIDAK SESUAI!");
		}
		
		System.out.println("\n*Analisis Kipas Angin*");
		//Kipas Angin
		if(id2.getJumlahKipasAngin() >= 2){
			System.out.println("Kipas Angin SESUAI!");
		}
		else{
			System.out.println("Kipas Angin TIDAK SESUAI!");
		}
		if(id2.getKondisiKipasAngin().equals("baik") && id2.getJumlahKipasAngin() == 2){
			System.out.println("Kondisi Kipas Angin SESUAI!");
		}
		else{
			System.out.println("Kondisi Kipas Angin TIDAK SESUAI!");
		}
		if(id2.getPosisiKipasAngin().equals("atap_ruangan")){
			System.out.println("posisi Kipas Angin SESUAI!");
		}
		else{
			System.out.println("posisi Kipas Angin TIDAK SESUAI!");
		}
		
		System.out.println("\n*Analisis AC*");
		//AC
		if(id2.getJumlahAC() >= 1){
			System.out.println("AC SESUAI!");
		}
		else{
			System.out.println("AC TIDAK SESUAI!");
		}
		if(id2.getKondisiAC().equals("baik")){
			System.out.println("konidis AC SESUAI!");
		}
		else{
			System.out.println("kondisi AC TIDAK SESUAI!");
		}
		if(id2.getPosisiAC().equals("disamping")||id2.getPosisiAC().equals("dibelakang")){
			System.out.println("posisi AC SESUAI!");
		}
		else{
			System.out.println("posisi AC TIDAK SESUAI!");
		}
		
		System.out.println("\n*Analisis CCTV*");
		//CCTV
		if(id2.getJumlahCCTV() == 2){
			System.out.println("CCTV SESUAI!");
		}
		else{
			System.out.println("CCTV TIDAK SESUAI!");
		}
		if(id2.getKondisiCCTV().equals("baik") && id2.getJumlahCCTV() == 2){
			System.out.println("kondisi CCTV SESUAI!");
		}
		else{
			System.out.println("kondisi CCTV TIDAK SESUAI!");
		}
		if(id2.getPosisiCCTV().equals("depan_dan_belakang")){
			System.out.println("posisi CCTV SESUAI!");
		}
	}
	
}
