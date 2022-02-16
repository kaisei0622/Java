package college.intro2;

public class Exam20 {

	public static void main(String[] args) {
		//ラベル付きbreak文
		//問題20
		int[][] numlist = new int[][] {
			{36,11,54,40},
			{87,67,48,39,82},
			{71,83,59,16}
		};
		myLabel:for ( int i  = 0; i < 3 ; i++) {
			for (int j = 0; j < 4; j++) {
				if (numlist[i][j] % 13 == 0 ) {
					System.out.println(numlist[i][j]);
					break myLabel;
				} else {
					System.out.println("見つかりません");
				}
			}
		}
	}

}
