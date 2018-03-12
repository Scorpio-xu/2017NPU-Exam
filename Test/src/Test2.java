import java.util.Scanner;

/**
 * 将字符串中的数字字符输出
 * @author 徐启明
 *
 */
public class Test2 {

	/**
	 * 去除非数字字符
	 * @param str
	 * @return
	 */
	private static String changeStr(String str) {
		String numberStr = "";
		for (int i = 0; i < str.length(); i++) {
			int asc = str.charAt(i);
			if (asc >= 48 && asc <= 57)
				numberStr += str.charAt(i);
		}
		if (0==numberStr.length())
			System.out.println("您输入的字符串中没有数字字符。");
		return numberStr;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("第一大题第2小题");
		System.out.println("**********************");

		System.out.println("请输入字符串（不多于80个字符）：");
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			if (str.length() > 80)
				System.out.println("不要大于80个字符，请重新输入：");
			str = sc.next();
		} while (str.length() > 80);

		System.out.println(changeStr(str));
	}

}
