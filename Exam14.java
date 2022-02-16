package college.intro2;

public class Exam14 {
	public static void main(String[] args) {
		//ビット演算 
		//問題14_1
		int  ix= 0b1;
		for(int i= 1; i < 32; i++) {
			System.out.println ( Integer.toBinaryString (ix) ); 
			ix <<= 1;
		}

		//問題14_2
		int ix1 = 0b11000011; 
		int iy1 = 0b11110000;
		System.out.println ( Integer.toBinaryString (ix1 & iy1) ); 
		System.out.println ( Integer.toBinaryString (ix1 | iy1) ); 
		System.out.println ( Integer.toBinaryString (ix1 ^ iy1) ); 


	}  

}