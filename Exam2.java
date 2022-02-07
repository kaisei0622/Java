package college.intro1;

public class Exam2 {

	public static void main(String[] args) {
		//文字列 
		//問題2_1
		String str = "Hello!!";

		System.out.println(str);

		//問題2_2
		String str1 = "Hello";
		String str2 = "World!!";		
		str = str1 + str2;

		System.out.println(str);

		//問題2_3
		char ch = 'あ';

		System.out.println(ch+":"+(int)ch);

		//問題2_4
		int ix = 1234;
		String str3 = String.valueOf(ix);

		System.out.println(str3);

		//問題2_5
		String str4 = "5432";
		int ix1 = Integer.parseInt(str4);

		System.out.println(ix1);

		//演習
		String name = "田村海星";
		String san = String.valueOf(name);

		System.out.println("私の名前は、" +san+ "です。");

	}

}
