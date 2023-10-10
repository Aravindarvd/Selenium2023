package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 13;
		int range = num/2;
		boolean flag = false;
		
		for(int i =2;i<=range;i++) {
			if(num%i==0) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Given number is not a Prime number");
		}else {
			System.out.println("Given number is a Prime number");
		}

}
	}
