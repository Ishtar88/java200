package yr.java.twoback;

public class H017_2_If3hangTest {

	public static void main(String[] args) {
		
		int year=2018;
		
		String sEven=((year%2==0)?"짝수 해":"홀수 해"); 
		System.out.printf("%d는 %s입니다. %n",year,((year%2==0)?"짝수해":"홀수해"));
		System.out.printf("%d는 %s입니다. %n",year, sEven);

		
	}

}
