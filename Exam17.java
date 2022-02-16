package college.intro2;

public class Exam17 {
	//引数の値渡し
	//問題17
	public static void main(String[] args) {
		int x= 1;
		div2(x);
		System.out.println(x);


	}

	static int div2(int x) {
		x = x / 2;
		System.out.println(x);
		return x;
	}

}
