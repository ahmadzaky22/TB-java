package polimorfisme;

public class TestRuangKelas {
	public static void main (String[]args){
		
	JumlahKondisiPosisiSarana SK = new StopKontak();
	JumlahKondisiPosisiSarana KL = new KabelLCD();
	JumlahKondisiPosisiSarana L = new Lampu();
	JumlahKondisiPosisiSarana KA = new KipasAngin();
	JumlahKondisiPosisiSarana AC = new AC();
	JumlahKondisiPosisiSarana CCTV = new CCTV();
	
	JumlahKondisiPosisiSarana sarana [] = {SK, KL, L, KA, AC, CCTV}; 
	
	for(JumlahKondisiPosisiSarana x : sarana){
		x.Input("");
		x.View("");
		x.Analisis();
	}
	}
}
