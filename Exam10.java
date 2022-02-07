package college.intro2;

public class Exam10 {

	public static void main(String[] args) {
		//問題10
		int[] seq = new int[50];		
		for (int i = 1; i < seq.length; i++) {
			if(i % 3 == 0) {
				System.out.println(i+"~");
			} else if(i == 46 ) {
				break;
			} else {
				System.out.println(i);
			}


		}

	}

}
