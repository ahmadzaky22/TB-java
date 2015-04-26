package TB2015;

import java.util.Scanner;

public class RuangKelas2 {
	Scanner input = new Scanner(System.in);
	
	//Jumlah, Kondisi dan Posisi Sarana
	private int jumlahStopKontak;
	private String kondisiStopKontak;
	private String posisiStopKontak;
	
	private int jumlahKabelLCD;
	private String kondisiKabelLCD;
	private String posisiKabelLCD;
	
	private int jumlahLampu;
	private String kondisiLampu;
	private String posisiLampu;
	
	private int jumlahKipasAngin;
	private String kondisiKipasAngin;
	private String posisiKipasAngin;
	
	private int jumlahAC;
	private String kondisiAC;
	private String posisiAC;
	
	//SSID
	//Bandwidth
	
	private int jumlahCCTV;
	private String kondisiCCTV;
	private String posisiCCTV;
	
	//Stop kontak
	public void setJumlahStopKontak (int jumlahStopKontak){
		this.jumlahStopKontak = jumlahStopKontak;
	}
	public int getJumlahStopKontak (){
		return jumlahStopKontak;
	}
	public void setKondisiStopKontak(String kondisiStopKontak){
		this.kondisiStopKontak = kondisiStopKontak;
	}
	public String getKondisiStopKontak (){
		return kondisiStopKontak;
	}
	public void setPosisiStopKontak(String posisiStopKontak){
		this.posisiStopKontak = posisiStopKontak;
	}
	public String getPosisiStopKontak (){
		return posisiStopKontak;
	}
	//Kabel LCD
	public void setJumlahKabelLCD (int jumlahKabelLCD){
		this.jumlahKabelLCD = jumlahKabelLCD;
	}
	public int getJumlahKabelLCD (){
		return jumlahKabelLCD;
	}
	public void setKondisiKabelLCD(String kondisiKabelLCD){
		this.kondisiKabelLCD = kondisiKabelLCD;
	}
	public String getKondisiKabelLCD(){
		return kondisiKabelLCD;
	}
	public void setPosisiKabelLCD(String posisiKabelLCD){
		this.posisiKabelLCD = posisiKabelLCD;
	}
	public String getPosisiKabelLCD(){
		return posisiKabelLCD;
	}
	//Lampu
	public void setJumlahLampu (int jumlahLampu){
		this.jumlahLampu = jumlahLampu;
	}
	public int getJumlahLampu (){
		return jumlahLampu;
	}
	public void setKondisiLampu(String kondisiLampu){
		this.kondisiLampu = kondisiLampu;
	}
	public String getKondisiLampu(){
		return kondisiLampu;
	}
	public void setPosisiLampu(String posisiLampu){
		this.posisiLampu = posisiLampu;
	}
	public String getPosisiLampu(){
		return posisiLampu;
	}
	//Kipas Angin
	public void setJumlahKipasAngin (int jumlahKipasAngin){
		this.jumlahKipasAngin = jumlahKipasAngin;
	}
	public int getJumlahKipasAngin (){
		return jumlahKipasAngin;
	}
	public void setKondisiKipasAngin (String kondisiKipasAngin){
		this.kondisiKipasAngin = kondisiKipasAngin;
	}
	public String getKondisiKipasAngin(){
		return kondisiKipasAngin;
	}
	public void setPosisiKipasAngin(String posisiKipasAngin){
		this.posisiKipasAngin = posisiKipasAngin;
	}
	public String getPosisiKipasAngin(){
		return posisiKipasAngin;
	}
	//AC
	public int getJumlahAC() {
		return jumlahAC;
	}
	public void setJumlahAC(int jumlahAC) {
		this.jumlahAC = jumlahAC;
	}
	public String getKondisiAC() {
		return kondisiAC;
	}
	public void setKondisiAC(String kondisiAC) {
		this.kondisiAC = kondisiAC;
	}
	public String getPosisiAC() {
		return posisiAC;
	}
	public void setPosisiAC(String posisiAC) {
		this.posisiAC = posisiAC;
	}
	//CCTV
	public int getJumlahCCTV() {
		return jumlahCCTV;
	}
	public void setJumlahCCTV(int jumlahCCTV) {
		this.jumlahCCTV = jumlahCCTV;
	}
	public String getKondisiCCTV() {
		return kondisiCCTV;
	}
	public void setKondisiCCTV(String kondisiCCTV) {
		this.kondisiCCTV = kondisiCCTV;
	}
	public String getPosisiCCTV() {
		return posisiCCTV;
	}
	public void setPosisiCCTV(String posisiCCTV) {
		this.posisiCCTV = posisiCCTV;
	}
	
	public void jumlahKondisiPosisiSarana(){
		System.out.println("\n=== JUMLAH,KONDISI DAN POSISI SARANA ===");
		//Stop kontak
		System.out.println("masukkan Jumlah Stop kontak : ");
		jumlahStopKontak = input.nextInt();
		System.out.println("kondisi Stop kontak : ");
		kondisiStopKontak = input.next();
		System.out.println("posisi Stop kontak : ");
		posisiStopKontak = input.next();
		
		//Kabel LCD
		System.out.println("masukkan Jumlah Kabel LCD : ");
		jumlahKabelLCD = input.nextInt();
		System.out.println("kondisi Kabel LCD : ");
		kondisiKabelLCD = input.next();
		System.out.println("posisi Kabel LCD : ");
		posisiKabelLCD = input.next();
		
		//Lampu
		System.out.println("masukkan Jumlah Lampu : ");
		jumlahLampu = input.nextInt();
		System.out.println("kondisi Lampu : ");
		kondisiLampu = input.next();
		System.out.println("posisi Lampu : ");
		posisiLampu = input.next();
		
		//Kipas Angin 
		System.out.println("masukkan Jumlah Kipas Angin : ");
		jumlahKipasAngin = input.nextInt();
		System.out.println("kondisi Kipas Angin : ");
		kondisiKipasAngin = input.next();
		System.out.println("posisi Kipas Angin : ");
		posisiKipasAngin = input.next();
		
		//AC
		System.out.println("masukkan Jumlah AC : ");
		jumlahAC = input.nextInt();
		System.out.println("kondisi AC : ");
		kondisiAC = input.next();
		System.out.println("posisi AC : ");
		posisiAC = input.next();
		
		//CCTV
		System.out.println("masukkan Jumlah CCTV: ");
		jumlahCCTV = input.nextInt();
		System.out.println("kondisi CCTV : ");
		kondisiCCTV = input.next();
		System.out.println("posisi CCTV : ");
		posisiCCTV = input.next();
		
	}
	
	
}
