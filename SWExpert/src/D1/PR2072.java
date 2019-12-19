package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2072 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 1; i <= tc; i++) {
			sum = 0;
			String tmp = br.readLine();
			for (int j = 0; j < 10; j++) {
				String num[] = tmp.split(" ");
				if (Integer.parseInt(num[j]) % 2 != 0) {
					sum += Integer.parseInt(num[j]);
				}
			}
			System.out.println("#" + i + " " + sum);
		}
	}
}
