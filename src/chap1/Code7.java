package chap1;

import java.util.Scanner;

/**
 *
 * 11718��
 * ����
 * �Է� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * �Է� �Է��� �־�����. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�. �� ����
 * 100���ڸ� ���� ������, �� ���� �־����� �ʴ´�. ��, �� ���� �������� �������� �ʰ�, �������� ������ �ʴ´�.
 * 
 * ��� �Է¹��� �״�� ����Ѵ�.
 *   
 * <pre>
 * chap1
 * Code7.java
 * </pre>
 * 
 * @author	: jepark
 * @Date	: 2017. 6. 29.
 * @Version
 */
public class Code7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String msg;
		
		while(cnt < 100) {
			
			msg = sc.next();
			
			if(msg.length() <= 100 && msg != "" && msg != null) {
				
				if(msg.charAt(0) != ' ' && msg.charAt(msg.length() - 1) != ' ') {
			
					if(!(msg.matches(".*[��-����-�Ӱ�-�R]+.*"))) {
						
						cnt++;
						
						System.out.println(msg);
					}
				}
			}
		}  
		
		sc.close();
	}
}
