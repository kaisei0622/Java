package college.intro2;

public class Exam15 {
	public static void main(String[] main) {
		//メソッド(関数)1
		//問題15
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
	}

	static boolean isUru(int year){	
		if(isUru(year)) {
			System.out.println("うるう年");
		} else {
			System.out.println("うるう年ではない");
		}
		return false;

	}
}
