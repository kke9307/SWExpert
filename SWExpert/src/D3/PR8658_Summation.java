package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR8658_Summation {
	private static int min(int n[]) {
		int min = 1000000;
		for (int i = 0; i < n.length; i++) {
			if (min > n[i]) {
				min = n[i];
			}
		}
		return min;
	}

	private static int max(int n[]) {
		int max = 0;
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		PR8658_Summation pr = new PR8658_Summation();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String str[] = br.readLine().split(" ");
			int num[] = new int[str.length];
			for (int j = 0; j < str.length; j++) {
				int sum = 0;
				for (int k = 0; k < str[j].length(); k++) {
					sum += str[j].charAt(k) - 48;
				}
				num[j] = sum;
			}

			System.out.format("#%d %d %d \n",i, pr.max(num), pr.min(num));
		}
	}
}
