package phoneMe;
import java.util.Scanner;

public class PhoneTest {
	
	public static void main(String[] args) {
	
		
		phone phone1 = new phone("Motorola","PCH",1996, 18);
		phone phone2 = new phone("Iphone","FiveS",1998, 330);
		phone phone3 = new phone("Sprint", "RHS",1850,8);
	
		System.out.println(phone1.brand);
		System.out.println(phone2.brand);
		System.out.println(phone3.brand);
		
		System.out.println("Which phone would you like to buy?");
		Scanner sc= new Scanner(System.in);
		int pOne = sc.nextInt();
		
		if (pOne == 1){
		System.out.println(phone1.price);
		}
		else if  (pOne == 2) {
			System.out.println(phone2.price);
		if  (pOne == 3) {
			
			System.out.println(phone3.price);
		}
			
		}
			
		}

		
}
