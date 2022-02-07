package college.intro1;

public class Exam6 {

	public static void main(String[] args) {
		//問題6
		int year = 2022;
		if (year % 4 == 0) {
			System.out.println("うるう年");
		} if (year % 100 == 0 ) {
			System.out.println("うるう年ではない");
		} if (year % 400 == 0) {
			System.out.println("うるう年");
		} else {
			System.out.println("うるう年ではない");
		}

		//演習
		int ix  = 12345 / 543;
		if ( ix % 2 == 0) {
			System.out.println(ix+"は偶数");
		}else {
			System.out.println(ix+"は奇数");
		}
	}

}