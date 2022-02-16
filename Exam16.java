package college.intro2;

import java.util.Random;

public class Exam16 {
	private static final int Asan = 0;

	public static void main(String[] args) {
		//メソッド(関数)2
		//問題16
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
	}
	static String toHandString(int hand) {
		String str = toHandString(Asan);
		System.out.println("Aさん:" + str);

		return str ; 
	}





}
