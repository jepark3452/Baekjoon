package chap1;

import java.util.Scanner;

/**
 *
 * 11718번
 * 문제
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 * 
 * 입력 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은
 * 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 * 
 * 출력 입력받은 그대로 출력한다.
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
			
					if(!(msg.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*"))) {
						
						cnt++;
						
						System.out.println(msg);
					}
				}
			}
		}  
		
		sc.close();
	}
}
