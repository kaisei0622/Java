package college.intro2;

public class Exam19 {

	public static void main(String[] args) {
		//スコープ
		//問題19
		int[] seq = new int [25];
		int i;
		for(  i = 1; i < seq.length; i++) {
			if((i % 2 == 0) || (i % 3 == 0)) {
				System.out.println(i + "~");
			} else {
				System.out.println(i);
			}
		}

	}

}
