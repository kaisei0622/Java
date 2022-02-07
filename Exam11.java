package college.intro2;

public class Exam11 {

	public static void main(String[] args) {
		//問題11
		int[] seq = new int[50];
		for (int i = 1; i < seq.length; i++) {
			if(i == 34) {
				break;
			}else if((i % 3 == 0)||(i % 10 == 3)||(i / 10 ==3)) {
				System.out.println(i+"~");
			} else {
				System.out.println(i);
			}


		}

	}

}
