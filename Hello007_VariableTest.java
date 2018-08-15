package yr.java.twoback;

public class Hello007_VariableTest {
	
	public static void main(String[] args) {
		int a=10; 
		int b=20; 
		int c=a+b;
		System.out.println("1-- 합 10+20="+c);
		int d=10;
		d=d+20; 
		System.out.println("2-- 합 10+20="+d);
		String str="안녕하세요! 자바를 즐깁시다.";
		System.out.println("3--문자열 출력:"+str);
		//String Concantenation
		System.out.println("--String Concatenation Test--");
		System.out.println(a+b+" 합 ");
		System.out.println(a+" 합 "+b);
		System.out.println(" 합 "+a+b);
		System.out.println(" 합 " +(a+b)); 
		
	}

}
