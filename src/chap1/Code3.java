package chap1;

import java.util.Scanner;

/**
 * 
 * 1001��
 * A-B�� ����Ͻÿ�.
 * 
 * �Է� ù° �ٿ� A�� B�� �־�����. (0< A,B < 10)
 * 
 * ��� ù° �ٿ� A-B�� ����Ѵ�.
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
