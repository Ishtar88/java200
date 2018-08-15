package yr.java.twoback;

public class H033_NestedForStarChapt33 {
	
	public static void main(String[] args) {
		//중첩 for
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		for (int i = 11; i>=0; i--) {
			for (int j = i ; j >=0; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}

}
