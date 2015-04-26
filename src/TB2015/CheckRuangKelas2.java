package TB2015;
import java.util.*;

/*
lingkungan ruang kelas
kebersihan ruang kelas
kenyamanan ruang kelas
keamanan ruang kelas
*/

public class CheckRuangKelas2 {
	RuangKelas id = new RuangKelas();
	RuangKelas2 id2 = new RuangKelas2();
	RuangKelas3 id3 = new RuangKelas3();
	
	CheckRuangKelas listinput = new CheckRuangKelas();
	
	Scanner in = new Scanner (System.in);
	
	public void LingkunganRuangKelas (){
		
		id3.lingkunganRuangKelas();
		
		System.out.println("\n*Analisis Kebersihan*");
		if(id3.kondisiLantai.equals("bersih")){
			System.out.println("kondisi lantai SESUAI!");
		}
		else{
			System.out.println("kondisi lantai TIDAK SESUAI!");
		}
		if(id3.kondisiDinding.equals("bersih")){
			System.out.println("kondisi dinding SESUAI!");
		}
		else{
			System.out.println("kondisi dinding TIDAK SESUAI!");
		}
		if(id3.kondisiAtap.equals("bersih")){
			System.out.println("kondisi atap SESUAI!");
		}
		else{
			System.out.println("kondisi atap TIDAK SESUAI!");
		}
		if(id3.kondisiPintu.equals("bersih")){
			System.out.println("kondisi pintu SESUAI!");
		}
		else{
			System.out.println("kondisi pintu TIDAK SESUAI!");
		}
		if(id3.kondisiJendela.equals("bersih")){
			System.out.println("kondisi jendela SESUAI!");
		}
		else{
			System.out.println("kondisi jendela TIDAK SESUAI!");
		}
	}
	
	public void KebersihanRuangKelas(){
		
		id3.kebersihanRuangKelas();
		
		System.out.println("\n*Analisis*");
		if(id3.sirkulasiUdara.equals("lancar")){
			System.out.println("sirkulasi Udara SESUAI!");
		}
		else{
			System.out.println("sirkulasi Udara TIDAK SESUAI!");
		}
		if(id3.nilaiPencahayaan >= 250 && id3.nilaiPencahayaan <= 300 ){
			System.out.println("nilai pencahayaan SESUAI!");
		}
		else{
			System.out.println("nilai pencahayaan TIDAK SESUAI!");
		}
		if(id3.kelembapan >=70 && id3.kelembapan <=80){
			System.out.println("kelembapan SESUAI!");
		}
		else{
			System.out.println("kelembapan TIDAK SESUAI!");
		}
		if(id3.suhu >=25 && id3.suhu <= 35){
			System.out.println("suhu SESUAI!");
		}
		else{
			System.out.println("suhu TIDAK SESUAI!");
		}
	}
	
	public void KenyamananRuangKelas(){
		
		id3.kenyamananRuangKelas();
		
		System.out.println("\n*Analisis*");
		if(id3.kebisingan.equals("tidak_bising")){
			System.out.println("kebisingan SESUAI!");
		}
		else{
			System.out.println("kebisingan TIDAK SESUAI!");
		}
		if(id3.bau.equals("tidak_bau")){
			System.out.println("bau SESUAI!");
		}
		else{
			System.out.println("bau TIDAK SESUAI!");
		}
		if(id3.kebocoran.equals("tidak_bocor")){
			System.out.println("kebocoran SESUAI!");
		}
		else{
			System.out.println("kebocoran TIDAK SESUAI!");
		}
		if(id3.kerusakan.equals("tidak_rusak")){
			System.out.println("kerusakan SESUAI!");
		}	
		else{
			System.out.println("kerusakan TIDAK SESUAI!");
		}
		if(id3.keausan.equals("tidak_aus")){
			System.out.println("keausa SESUAI!");
		}
		else{
			System.out.println("keausan TIDAK SESUAI!");
		}	
	}
	
	public void KeamananRuangKelas(){
		
		id3.keamananRuangKelas();
		
		System.out.println("\n*Analisis*");
		if(id3.kekokohan.equals("kokoh")){
			System.out.println("kekokohan SESUAI!");
		}
		else{
			System.out.println("kekokohan TIDAK SESUAI!");
		}
		if(id3.kunciPintu.equals("ada")){
			System.out.println("kunci pintu SESUAI!");
		}
		else{
			System.out.println("kunci pintu TIDAK SESUAI!");
		}
		if(id3.kunciJendela.equals("ada")){
			System.out.println("kunci jendela SESUAI!");
		}
		else{
			System.out.println("kunci jendela TIDAK SESUAI!");
		}
		if(id3.bahaya.equals("aman")){
			System.out.println("keamanan ruang SESUAI!");
		}	
		else{
			System.out.println("keamanan ruang TIDAK SESUAI!");
		}
	}
	
	public void ListInputan(){
	
	System.out.println("\n=== LIST INPUTAN ===");
	
	System.out.println("1. identitas ruang kelas");
	System.out.println("2. kondisi ruang kelas");
	System.out.println("3. jumlah,kondisi dan posisi sarana");
	System.out.println("4. lingkungan ruang kelas");
	System.out.println("5. kebersihan ruang kelas");
	System.out.println("6. kenyamanan ruang kelas");
	System.out.println("7. keamanan ruang kelas");
	
	System.out.println("pilih list inputan : ");
	int list = in.nextInt();
		if(list == 1){
			listinput.IdentitasRuangKelas();
		}
		else if( list == 2){
			listinput.KondisiRuangKelas();
		}
		else if(list == 3){
			listinput.JumlahKondisiPosisiSarana();
		}
		else if(list == 4){
			LingkunganRuangKelas();
		}
		else if(list == 5){
			KebersihanRuangKelas();
		}
		else if(list == 6){
			KenyamananRuangKelas();
		}
		else if(list == 7){
			KeamananRuangKelas();
		}
	}
	
	
}
