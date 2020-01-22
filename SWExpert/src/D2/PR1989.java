package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1989 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int tf = 0;
		for (int i = 1; i <= tc; i++) {
			String pl = br.readLine().trim();
			tf = 0;
			if (3 <= pl.length() || pl.length() <= 10)
				if (pl.length() % 2 == 0) {
					System.out.println("#" + i + " 0");
				} else if (pl.length() % 2 != 0) {
					char a[] = pl.toCharArray();
					int w = a.length / 2;
					for (int j = 0; j < w; j++) {
						for (int k = a.length - 1; w <= k; k--) {
							if (a[j] != a[k]) {
								tf -= 1;
								break;
							} else if (a[j] == a[k]) {
								tf += 1;
								break;
							}
							break;
						}
					}
					if (tf < 0) {
						System.out.println("#" + i + " 0");
					} else if (tf >= 0) {
						System.out.println("#" + i + " 1");
					}
				}
		}
	}
}
