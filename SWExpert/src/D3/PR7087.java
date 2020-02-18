package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR7087 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 1; i <= TC; i++) {
			int N = Integer.parseInt(br.readLine());
			int alpa[] = new int[26];
			for (int p = 0; p < alpa.length; p++) {
				alpa[p] = 0;
			}
			for (int j = 0; j < N; j++) {

				String alphabet = br.readLine();
				int ascii = alphabet.charAt(0) - 65;
				alpa[ascii]++;
			}
			for (int k = 0; k < alpa.length; k++) {
				if (alpa[k] == 0) {
					count = k;
					break;
				}
			}
			System.out.format("#%d %d\n", i, count);
		}
	}

}
