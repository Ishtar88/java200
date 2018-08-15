package yr.java.twoback;

public class Coffee1Main {
	
	public static void main(String[] args) {
		int myMoney =800; //800원은 커피 몇 잔일까? 
		int cups=0; 
		if(myMoney>0) {
			cups = myMoney/200;
		}else if(myMoney==0) {
			cups=0;
		}else {
			cups=-1; 
		}
	
	if(cups>0) {
		System.out.println("당신의 커피는 "+cups+"잔 입니다.");
		System.out.printf("당신은 총 %d잔의 커피를 마실 수 있습니다.", cups);
	}else {
		System.out.println("액수가 모자랍니다.");
	}

}
}