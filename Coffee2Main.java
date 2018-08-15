package yr.java.twoback;

public class Coffee2Main {	
	
	public static void main(String[] args) {
		
		int myMoneyA=800; //800원은 커피 몇 잔일까?
		int cupsA=Coffee2Main.coffee(myMoneyA); 
		Coffee2Main.printCoffee(cupsA); //static 메서드라 객체 생성없이 바로 호출 가능합니다. 
		
		int myMoneyB=150; //150원은 커피 몇 잔일까? 
		int cupsB=Coffee2Main.coffee(myMoneyB);
		Coffee2Main.printCoffee(cupsB); //static 메서드라 객체 생성없이 바로 호출 가능합니다. 
		
	}//main
	
	public static int coffee(int money) {
		int cups=0; 
		if (money>0) {
			cups=money/200; 
		}else if(money==0) {
			cups=0; 
		}else {
			cups=-1; 
		}
		return cups; 
	}//coffee
	
	
	public static void printCoffee(int cups) {
		if (cups>0) {
			System.out.println("A 손님, 커피는 "+cups+"잔 입니다.");
			//System.out.printf("커피는 %d 잔입니다.",cups);
		}else {
			System.out.println("B 손님, 액수가 부족합니다.");
		}
	}//printCoffee;
	

}
