package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1213 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= 10; i++) {
			int T = Integer.parseInt(br.readLine());
			String banbok = br.readLine().trim();
			String str = br.readLine().trim();
			int cnt = 0;
			for (int k = banbok.length(); k <= str.length(); k++) {
				String word = str.substring(k - banbok.length(), k);
				if (word.equals(banbok)) {
					++cnt;
				}
			}
			System.out.format("#%d %d\n", i, cnt);
		}
	}
}
