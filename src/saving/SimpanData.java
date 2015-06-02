package saving;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SimpanData {
	RuangKelas a = new RuangKelas();
	StopKontak b = new StopKontak();
	KabelLCD c = new KabelLCD();
	Lampu d = new Lampu();
	KipasAngin e = new KipasAngin();
	AC f = new AC();
	CCTV g = new CCTV();
	LingkunganRuangKelas h = new LingkunganRuangKelas();
	KenyamananRuangKelas i = new KenyamananRuangKelas();
	KebersihanRuangKelas j = new KebersihanRuangKelas();
	KeamananRuangKelas k = new KeamananRuangKelas();
	
	public void saveIdentitasRuangKelas(){
		String namafile = "identitaskelas.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("nama ruang : "+a.namaRuangan[0]);
			os.writeObject("lokasi ruang : "+a.lokasiRuang[0]);
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveKondisiRuangKelas(){
		String namafile = "kondisikelas.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("panjang kelas : "+a.getPanjangKelas());
			os.writeObject("lebar kelas : "+a.getlebarKelas());
			os.writeObject("jumlah kursi : "+a.getJumlahKursi());
			os.writeObject("jumlah pintu : "+a.getJumlahPintu());
			os.writeObject("jumlah jendela : "+a.getJumlahJendela());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveStopKontak(){
		String namafile = "stopkontak.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah stop kontak : "+b.getJumlah());
			os.writeObject("kondisi stop kontak : "+b.getKondisi());
			os.writeObject("posisi stop kontak : "+b.getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveKabelLCD(){
		String namafile = "kabelLCD.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah Kabel LCD : "+c.getJumlah());
			os.writeObject("kondisi Kabel LCD : "+c.getKondisi());
			os.writeObject("posisi Kabel LCD : "+c.getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveLampu(){
		String namafile = "lampu.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah Lampu : "+d.getJumlah());
			os.writeObject("kondisi Lampu : "+d.getKondisi());
			os.writeObject("posisi Lampu : "+d.getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveKipasAngin(){
		String namafile = "kipasAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah Kipas angin : "+e.getJumlah());
			os.writeObject("kondisi Kipas angin : "+e.getKondisi());
			os.writeObject("posisi Kipas angin : "+e.getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveAC(){
		String namafile = "AC.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah AC : "+f.getJumlah());
			os.writeObject("kondisi AC : "+f.getKondisi());
			os.writeObject("posisi AC : "+f.getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveCCTV(){
		String namafile = "CCTV.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("jumlah CCTV : "+g.getJumlah());
			os.writeObject("kondisi CCTV : "+g.getKondisi());
			os.writeObject("posisi CCTV : "+g.getPosisi());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveLingkunganRuangKelas(){
		String namafile = "kipasAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kondisi lantai : "+h.getLantai());
			os.writeObject("kondisi dinding : "+h.getDinding());
			os.writeObject("kondisi atap : "+h.getAtap());
			os.writeObject("kondisi pintu : "+h.getPintu());
			os.writeObject("kondisi jendela : "+h.getJendela());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveKenyamananRuangKelas(){
		String namafile = "kipasAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kebisingan : "+i.getKebisingan());
			os.writeObject("bau : "+i.getBau());
			os.writeObject("kebocoran : "+i.getKebocoran());
			os.writeObject("kerusakan : "+i.getKerusakan());
			os.writeObject("keausan : "+i.getKeausan());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveKebersihanRuangKelas(){
		String namafile = "kipasAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("sirkulasi udara : "+j.getSirkulasiUdara());
			os.writeObject("nilai pencahayaan: "+j.getNilaiPencahayaan());
			os.writeObject("kelembapan : "+j.getKelembapan());
			os.writeObject("suhu : "+j.getSuhu());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public void saveKeamananRuangKelas(){
		String namafile = "kipasAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kekokohan : "+k.getKekokohan());
			os.writeObject("kunci pintu : "+k.getKunciPintu());
			os.writeObject("kunci jendela : "+k.getKunciJendela());
			os.writeObject("bahaya : "+k.getBahaya());
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
