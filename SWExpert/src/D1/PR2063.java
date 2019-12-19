package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2063 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N % 2 != 0) {
			String num[] = br.readLine().split(" ");
			for(int i = 0 ; i < num.length; i++) {
			}
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (Integer.parseInt(num[i]) > Integer.parseInt(num[j])) {
						String tmp = num[i];
						num[i] = num[j];
						num[j] =tmp;
					}
				}
			}
			System.out.println(num[N / 2]);
		}

	}

}
