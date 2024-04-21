package chap02;

import java.util.Scanner;

public class Test2 {

	static int sumOf(int[] x) {
		
		int sum = 0;
		
		for(int i = 0; i < x.length; i++) {
			
			sum += x[i];
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수는 : ");
		
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		
		for(int i = 0; i < x.length; i++) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		int result = sumOf(x);
		
		System.out.println("모든 요소의 합계는 : " + result + "입니다.");
		
	}

}
