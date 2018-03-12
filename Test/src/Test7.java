import java.util.Scanner;

/**
 * 找质数
 * 
 * @author Scorpio-xu
 *
 */
public class Test7 {

	/**
	 * 判断一个数是否是质数
	 * 
	 * @param number
	 * @return
	 */
	private static boolean isPrime(int number) {
		boolean flag = true;
		if (1 == number)
			flag = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	/**
	 * 输入数字并检查
	 */
	public static int input() {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		String str = null;
		do {
			str = sc.next();
			flag = 0;
			for (int i = 0; i < str.length(); i++) {
				if ((int) str.charAt(i) < 48 || (int) str.charAt(i) > 57)
					flag = 1;
			}
			if (0 == flag && 0 == Integer.parseInt(str))
				flag = 1;
			if (1 == flag)
				System.out.println("您输入的不是正整数，请重新输入：");
		} while (1 == flag);
		return Integer.parseInt(str);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("第二大题第7小题");
		System.out.println("**********************");

		int[] array = new int[20];
		System.out.println("随机输入20个正整数：");
		int a = 1;
		for (int i = 0; i < 20; i++) {
			a = i + 1;
			System.out.print("请输入第" + a + "个数：");
			array[i] = input();
		}

		System.out.print("您输入的数字中质数有：");
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
