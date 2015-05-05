package inheritance;

public class TestRuangKelas {
	public static void main (String[]zaky){
		
	StopKontak SK = new StopKontak();
	
	KabelLCD KL = new KabelLCD();
	KL.Analisis();
	
	Lampu L = new Lampu();
	L.Analisis();
	
	KipasAngin KA = new KipasAngin();
	KA.Analisis();
	
	AC AC = new AC();
	AC.Analisis();
	
	CCTV CCTV = new CCTV();
	CCTV.Analisis();
	
	}
}
