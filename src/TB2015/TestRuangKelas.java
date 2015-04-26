package TB2015;
import java.util.*;
public class TestRuangKelas {
	
	public static void main (String [] zakypanduiqbal){
		
		Scanner in = new Scanner(System.in);
		CheckRuangKelas play = new CheckRuangKelas();
		CheckRuangKelas2 play2 = new CheckRuangKelas2();
		
		play.IdentitasRuangKelas();
		play.KondisiRuangKelas();
		play.JumlahKondisiPosisiSarana();
		
		play2.LingkunganRuangKelas();
		play2.KebersihanRuangKelas();
		play2.KenyamananRuangKelas();
		play2.KeamananRuangKelas();
		
		play2.ListInputan();
		
		System.out.println("anda ingin mengedit ?(yes or no)");
		String edit = in.next();
		
		if(edit.equals("yes")){
			play.IdentitasRuangKelas();
			play.KondisiRuangKelas();
			play.JumlahKondisiPosisiSarana();
			
			play2.LingkunganRuangKelas();
			play2.KebersihanRuangKelas();
			play2.KenyamananRuangKelas();
			play2.KeamananRuangKelas();
			play2.ListInputan();
		}
		else{
			System.out.println("Selesai");
		}
		
	}
}
