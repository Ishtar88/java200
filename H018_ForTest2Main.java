package yr.java.twoback;

public class H018_ForTest2Main {
	
	public static void main(String[] args)
	{
		int i =0; 
		for(; ; ) {
			System.out.print(i+"=>");
			i++;
			if(i==10)
				break;
		}
		System.out.println();
		
		for (int j = 0; j < 10; j++) {
			System.out.print(j+"<=");
		}
		
		System.out.println();
		
		System.out.println("아직 i 를 사용할 수 있지 i="+i);
		
		for (int k = 0, m=1; k < 4; k++, m++) {
			System.out.print(k+"<===k  m===>"+m);
		}
		//i는 여기까지
			
		}

}
