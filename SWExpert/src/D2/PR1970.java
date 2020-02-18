package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1970 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int i = 1; i <= TC; i++) {
			int money = Integer.parseInt(br.readLine());
			if (money % 10 != 0) {
				change1(money, i);
			} else if (money % 10 == 0)
				change2(money, i);
		}
	}

	static void change1(int money, int i) {
		int change[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
		int count[] = new int[change.length];
		int j = 0;
		for (int k = 0; k < count.length; k++) {
			count[k] = 0;
		}
		while (money != 0) {
			if (money < 0) {// 거스름돈이 더 많은경우
				count[j]--;
				money += change[j++];
			} else {
				count[j]++;
				money -= change[j];
			}
		}
		System.out.println("#" + i++);
		for (int k = 0; k < count.length - 1; k++) {
			System.out.format("%d ", count[k]);
		}
		System.out.println();
	}

	static void change2(int money, int i) {
		int change[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int count[] = new int[change.length];
		int j = 0;

		for (int k = 0; k < count.length; k++) {
			count[k] = 0;
		}

		while (money != 0) {
			if (money < 0) {// 거스름돈이 더 많은경우
				count[j]--;
				money += change[j++];
			} else {
				count[j]++;
				money -= change[j];
			}
		}
		System.out.println("#" + i);
		for (int k = 0; k < count.length; k++) {
			System.out.format("%d ", count[k]);
		}
		System.out.println();
	}
}
