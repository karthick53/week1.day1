package week.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int n = 8;
		int firstNum = 0, secNum = 1, thirdNum;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (int i = 3; i <n; i++) {
			
			thirdNum = firstNum + secNum;
			System.out.println(thirdNum);
			firstNum = secNum;
			secNum = thirdNum;
			
		}

	}

}
