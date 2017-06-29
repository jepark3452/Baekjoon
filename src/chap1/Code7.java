package chap1;

import java.util.Scanner;

/**
 *
 * 11718¹ø
 * ¹®Á¦
 * ÀÔ·Â ¹ŞÀº ´ë·Î Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇÏ½Ã¿À.
 * 
 * ÀÔ·Â ÀÔ·ÂÀÌ ÁÖ¾îÁø´Ù. ÀÔ·ÂÀº ÃÖ´ë 100ÁÙ·Î ÀÌ·ç¾îÁ® ÀÖ°í, ¾ËÆÄºª ¼Ò¹®ÀÚ, ´ë¹®ÀÚ, °ø¹é, ¼ıÀÚ·Î¸¸ ÀÌ·ç¾îÁ® ÀÖ´Ù. °¢ ÁÙÀº
 * 100±ÛÀÚ¸¦ ³ÑÁö ¾ÊÀ¸¸ç, ºó ÁÙÀº ÁÖ¾îÁöÁö ¾Ê´Â´Ù. ¶Ç, °¢ ÁÙÀº °ø¹éÀ¸·Î ½ÃÀÛÇÏÁö ¾Ê°í, °ø¹éÀ¸·Î ³¡³ªÁö ¾Ê´Â´Ù.
 * 
 * Ãâ·Â ÀÔ·Â¹ŞÀº ±×´ë·Î Ãâ·ÂÇÑ´Ù.
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
			
					if(!(msg.matches(".*[¤¡-¤¾¤¿-¤Ó°¡-ÆR]+.*"))) {
						
						cnt++;
						
						System.out.println(msg);
					}
				}
			}
		}  
		
		sc.close();
	}
}
