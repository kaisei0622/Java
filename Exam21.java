package college.intro2;

public class Exam21 {

	public static void main(String[] args) {
		//定数
		//問題21
		final double DIFF = 1.0e-10;
		double x = 1000.;
		double dx = Math.sqrt(x);
		do {
			if (dx-1.0 <= DIFF) {
				break;
			}			
			System.out.println(dx);
			dx = dx - 1.0;
		}
		while(dx < 100);
	}

}
