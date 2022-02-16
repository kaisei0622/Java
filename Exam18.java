package college.intro2;

public class Exam18 {

	public static void main(String[] args) {
		//引数の参照渡し
		//問題18_1
		int[] x = {1};
		div2(x);

		//問題18_2
		String name = "Aip College";
		change(name);
		System.out.println(name);

		//問題18_3
		StringBuffer name1= new StringBuffer("Tokyo");
		change2(name1);
		System.out.println(name1);

		//演習
		char[] mes = {'H','A','L'};    
		caesarCipher(mes,1);
		for (int i = 0; i< mes.length; i++) {
			if ('A' <= mes[i] && mes[i] < 'Z') {
				mes[i]++;
			} else if (mes[i] == 'Z') {
				mes[i] = 'A';
			}
			System.out.println(mes);
		}
	}

	static void div2(int[] x) {
		for(int i = 0; i < x.length; i++) {
			x[i] = x[i] / 2;
			System.out.println(x[i]);
		}
	}

	static String change(String name) {
		name += "AiP College";
		return name;
	}

	static void change2(StringBuffer name1) {
		name1.append("Aip College");
	}

	static void caesarCipher(char[] mes,int shift) {

	}

}
