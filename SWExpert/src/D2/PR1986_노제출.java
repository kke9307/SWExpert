package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1986_노제출 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			int sum = 0;
			int n = Integer.parseInt(br.readLine());
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					sum -= j;
				} else {
					sum += j;
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
