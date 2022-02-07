package college.intro1;

public class Exam4 {

	public static void main(String[] args) {
		//4.1次元配列
		//問題4_1
		int [] ary = {3,11,7,5,13};
		System.out.println(ary[3]);

		//問題4_2
		int num = ary.length;
		System.out.println(num);

		//問題4_3
		String [] str = {"Shinjyuku","Tokyo-to","Japan"};
		int num1 = str.length;
		System.out.println(num1);

		//演習
		int sum = 0;
		for (int i =0; i < ary.length; i++) {
			sum += ary[i];
		}
		System.out.println("合計は"+sum+"です");
	}

}
