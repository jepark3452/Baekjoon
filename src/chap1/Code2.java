package chap1;

import java.util.Scanner;

/**
 * 
 * 1000��
 * �� �� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� ù° �ٿ� A�� B�� �־�����. (0 < A,B < 10)
 * 
 * ��� ù° �ٿ� A+B�� ����Ѵ�.
 * 
 * @author jepark
 *
 */
public class Code2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		
		System.out.print(A + B);
		
		sc.close();
	}
}
