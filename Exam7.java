package college.intro1;

public class Exam7 {

	public static void main(String[] args) {
		//問題7_1
		for (double dx =1.0; dx < 50; dx++) {
			if (dx ==1000) {
				break;
			}
			System.out.println(Math.sqrt(dx));
		}

		//問題7_2
		int [][] ary =  new int[][]{{12,2,2,3},{23},{34,2,17},{45,3,3,5}};
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 1; j++) {
				ary[i][j] *= 2;
				System.out.println(ary[i][j]);
			}
		}

		//演習
		int money = 10000;
		for (int i = 0; i < 20; i++) {
			money *= 1.015 ;
			System.out.println(money + 1);
		}
	}

}
