package college.intro1;

import java.util.Random;

public class Exam9 {
	public static void main(String[] args) {

		//問題９	
		Random rnd = new Random();
		int A = rnd.nextInt(3);
		int B = rnd.nextInt(3);
		String Asan, Bsan;
		Asan = "";
		Bsan = "";
		switch (A) {		
		case 0:
			Asan = ("グー");
			break;
		case 1:
			Asan =("チョキ");
			break;
		case 2:
			Asan =("パー");
			break;

		default:
			Asan = "";
			break;

		}  
		switch (B) {
		case 0:
			Bsan = ("グー");
			break;
		case 1:
			Bsan = ("チョキ");
			break;
		case 2:
			Bsan = ("パー");
			break;
		default:
			Bsan = "";
			break;

		} 

		if (Asan == Bsan ) {
			System.out.println("Asan:" + Asan);
			System.out.println("Bsan:" + Bsan);
			System.out.println("あいこ");		
		} else if(((A == 0) && (B == 1)) || ((A == 1) && (B==2)) || ((A == 2) && (B == 0))){
			System.out.println("Asan:" + Asan);
			System.out.println("Bsan:" + Bsan);
			System.out.println("Asanの勝ち");	
		} else {
			System.out.println("Asan:" + Asan);
			System.out.println("Bsan:" + Bsan);
			System.out.println("Bsanの勝ち");	

		}




		//演習
		Random rand = new Random();
		int kuji = rand.nextInt(10);
		switch(kuji) {
		case 0:
			System.out.println("大吉");
			break;
		case 2:
		case 3:
			System.out.println("吉");
			break;
		case 4:
			System.out.println("小吉");
			break;
		case 5:
			System.out.println("凶");
			break;
		default:
			System.out.println("小吉");
			break;
		}
	}

}
