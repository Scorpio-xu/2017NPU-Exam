import java.util.Scanner;

/**
 * 考生成绩统计程序
 * 
 * @author Scorpio-xu
 *
 */
public class Test9 {

	/**
	 * 统计判断学生成绩
	 * 
	 * @param array
	 * @return
	 */
	private static int[] judgeArray(int[] array) {
		int sum = 0;
		int count1 = 0;
		int count2 = 0;
		int[] judgeArray = new int[3];
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] < 60)
				count1++;
			if (array[i] >= 90)
				count2++;
		}
		judgeArray[0] = sum / array.length;
		judgeArray[1] = count1;
		judgeArray[2] = count2;
		return judgeArray;
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

		System.out.println("第二大题第9小题");
		System.out.println("**********************");

		System.out.println("请输入学生人数（最多40个）：");
		int n = 0;
		do {
			if (n > 40)
				System.out.println("不能超过40人，请重新输入：");
			n = input();
		} while (n > 40);
		int[] array = new int[n];

		int a = 0;
		int score = 0;
		System.out.println("请输入每个学生的成绩：");
		for (int i = 0; i < array.length; i++) {
			a = i + 1;
			System.out.print("请输入第" + a + "个学生的成绩：");
			do {
				if (score > 100)
					System.out.print("成绩不能超过100分，请重新输入：");
				score = input();
			} while (score > 100);
			array[i] = score;
		}

		int judgeArray[] = judgeArray(array);
		int averageScore = judgeArray[0];
		int count1 = judgeArray[1];
		int count2 = judgeArray[2];

		System.out.println("平均成绩为：" + averageScore + "分");
		System.out.println("不及格学生数量为：" + count1 + "个");
		System.out.println("成绩优秀学生数量为：" + count2 + "个");
	}

}
