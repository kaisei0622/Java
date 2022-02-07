package college.intro1;

public class Exam8 {
	public static void main(String[] args) {
		//問題8
		double diff = 1.0e-10;
		double dx = 1000.;
		do {
			System.out.println(Math.sqrt(dx)); 
		} while(dx - 1.0 <= diff);


		//演習
		int money = 10000;
		int count1 = 0;
		while(money < 15000) {
			money *= 1.015;
			count1++;
		}
		System.out.println((double)count1/2+"年");
	}

}
