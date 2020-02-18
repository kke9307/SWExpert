package Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baby_Gin_Game {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		int card[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count[] = new int[card.length];
		for (int i = 1; i <= TC; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = 0; j < count.length; j++) {
				count[j] = 0;
			}
			// System.out.println(num);
			int cnt = 0;
			while (num != 0) {
				int n = num;
				n %= 10;
				num /= 10;
				count[n]++;
				cnt++;
			}
			if (cnt <= 5) {
				while (cnt != 6) {
					count[0]++;
					cnt++;
				}
			}
			/*
			 * for (int j = 0; j < count.length; j++) { System.out.print(count[j] + " "); }
			 * System.out.println();
			 */
			run(count);
		}
	}

	static void baby_gin(int cnt) {
		if (cnt >= 2) {
			System.out.println("Baby Gin");
		} else {
			System.out.println("Lose");
		}
	}

	static void run(int arr[]) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 3) {
				arr[i] -= 3;
				cnt++;
			}
		}
		triplete(arr, cnt);
	}

	static void triplete(int arr[], int cnt) {
		int totalCnt = cnt;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				cnt++;
				if (cnt >= 3) {
					totalCnt++;
				}
			} else {
				cnt = 0;
			}

		}
		baby_gin(totalCnt);
	}
}
