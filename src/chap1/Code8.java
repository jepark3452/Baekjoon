package chap1;

import java.util.Scanner;

/**
 *
 * 11719¹ø
 * ¹®Á¦ ÀÔ·Â ¹ŞÀº ´ë·Î Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇÏ½Ã¿À.
 * 
 * ÀÔ·Â ÀÔ·ÂÀÌ ÁÖ¾îÁø´Ù. ÀÔ·ÂÀº ÃÖ´ë 100ÁÙ·Î ÀÌ·ç¾îÁ® ÀÖ°í, ¾ËÆÄºª ¼Ò¹®ÀÚ, ´ë¹®ÀÚ, °ø¹é, ¼ıÀÚ·Î¸¸ ÀÌ·ç¾îÁ® ÀÖ´Ù. °¢ ÁÙÀº
 * 100±ÛÀÚ¸¦ ³ÑÁö ¾ÊÀ¸¸ç, ºó ÁÙÀÌ ÁÖ¾îÁú ¼öµµ ÀÖ°í, °¢ ÁÙÀÇ ¾Õ µÚ¿¡ °ø¹éÀÌ ÀÖÀ» ¼öµµ ÀÖ´Ù.
 * 
 * Ãâ·Â ÀÔ·Â¹ŞÀº ±×´ë·Î Ãâ·ÂÇÑ´Ù.
 * 
 * <pre>
 * chap1
 * Code8.java
 * </pre>
 * 
 * @author : jepark
 * @Date : 2017. 6. 29.
 * @Version
 */
public class Code8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String msg;
		
		while(cnt < 100) {
			
			msg = sc.next();
			
			if(msg.length() <= 100 && msg != "" && msg != null) {
				
				if(!(msg.matches(".*[¤¡-¤¾¤¿-¤Ó°¡-ÆR]+.*"))) {
					
					cnt++;
					
					System.out.println(msg);
				}
			}
		}  
		
		sc.close();
	}
}

