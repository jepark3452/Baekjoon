package chap1;

import java.util.Scanner;

/**
 * 
 * 1001번
 * A-B를 계산하시오.
 * 
 * 입력 첫째 줄에 A와 B가 주어진다. (0< A,B < 10)
 * 
 * 출력 첫째 줄에 A-B를 출력한다.
 * 
 * @author jepark
 *
 */
public class Code3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		
		System.out.print(A - B);
		
		sc.close();
	}
}
