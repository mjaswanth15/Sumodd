package sumodd;

public class Sumodd {

	public static void main(String[] args) {
		
    System.out.println(isOdd(11));
    sumOdd(-21,21);
    sumOdd(100,1000);
	}
	public static boolean isOdd(int number) {
		if (number < 0) {
			return false;
		}
		else if(number%2==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void sumOdd(int start, int end) {
		int sum=0;
		if(start <= end && start > 0 && end > 0) {
		for(int i=start;i<=end;i++) {
			if(isOdd(i)== true) {
				sum= i + sum;
				//System.out.println("sum is "+ sum);
			}
			//System.out.println("sum is "+ sum);
		}
		
		System.out.println("sum is "+ sum);
	}
	else {
		System.out.println("invalid number");
	}
	}
}
