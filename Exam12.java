package college.intro2;

public class Exam12 {

	public static void main(String[] args) {
		//問題12
		int[] seq = new int[51];
		for (int i = 1; i < seq.length; i++) {
			if((i % 3 == 0)||(i % 10 == 3)||(i / 10 ==3)) {
				System.out.println(i+"~");
			}else if(i % 5 == 0) {
				System.out.println(i+"!!");
			} else {
				System.out.println(i);
			}

		}

		//演習
		int count = 0;
		for(int num = 1; num < 100; num++) {
			if((num % 13 == 0) || (num % 17 == 0)) {
				count++;
				System.out.println(count + ":" + num);
			}
		}

	}

}
