import java.util.Scanner;

/**
 * 实现冒泡排序
 * 
 * @author Scorpio-xu
 *
 */
public class Test1 {

	/**
	 * 冒泡排序
	 * 
	 * @param array
	 */
	private static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp;
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * 输出数组内容
	 * 
	 * @param array
	 */
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
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
			if (1 == flag)
				System.out.println("您的输入中包含非数字字符，请重新输入：");
		} while (1 == flag);
		return Integer.parseInt(str);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("第一大题第1小题");
		System.out.println("**********************");

		System.out.println("请输入您要输入几个数字：");
		int n = input();
		int[] array = new int[n];
		int a = 0;
		System.out.println("请输入待排序的数字：");
		for (int i = 0; i < n; i++) {
			a = i + 1;
			System.out.print("请输入第" + a + "个数：");
			array[i] = input();
		}

		System.out.print("您输入的数字为：");
		printArray(array);
		array = bubbleSort(array);
		System.out.println();

		System.out.print("从小到大排列为：");
		printArray(array);
	}

}
