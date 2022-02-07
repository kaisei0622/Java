package college.intro1;

public class Exam3 {

	public static void main(String[] args) {
		//算術基礎
		//問題3＿1
		int ix = 10;
		int iy = 20;

		System.out.println(iy = iy + ix); 
		System.out.println(iy = iy * ix); 

		//問題3_2
		int ix1 = 10;
		int iy1;
		int iz1;

		System.out.println(iy1 = ix1++); 
		System.out.println(iz1 = ++ix1);	

		//問題3_3
		int ix2 = 0x7FFFFFFF;
		int iy2 = 0x8FFFFFFF;

		System.out.println(ix2+","+iy2+","+ix2+iy2);

		//問題3_4
		double dx =(10/3);
		double dy =3.33333;

		System.out.println(dx+","+dy+","+dx+dy);

		//演習
		int price = 1980;
		price *= 1.08;

		System.out.println("消費税込みの値段は"+price+"です");
	}

}
