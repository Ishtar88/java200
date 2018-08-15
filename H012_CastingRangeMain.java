package yr.java.twoback;

public class H012_CastingRangeMain {
	
	public static void main(String[] args) {
		
		char cc='ㄱ';//
		System.out.println(cc);
		System.out.println((int)cc);
		cc='ㄴ'; //
		System.out.println(cc);
		System.out.println((int)cc);
		System.out.println((char)12594);
		System.out.println((char)12595);
		System.out.println("-----------------------------------");
		
		for (int i = 1; i <=100; i++) {
			System.out.print((char)i+" ");
			//char(i) > int를 char로 캐스팅 
			if (i%10==0) {
				System.out.println();
				
			}
		
			
		}
		
		
	}

}
