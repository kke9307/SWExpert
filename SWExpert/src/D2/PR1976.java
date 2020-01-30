package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PR1976 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= TC; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int hour1 = Integer.parseInt(st.nextToken());
			int min1 = Integer.parseInt(st.nextToken());
			int hour2 = Integer.parseInt(st.nextToken());
			int min2 = Integer.parseInt(st.nextToken());

			int totalH = hour1 + hour2;
			int totalM = min1 + min2;
			if ((totalM) >= 60) {
				totalH += 1;
				totalM -= 60;
			}
			if (totalH > 12) {
				totalH -= 12;
			}
			System.out.format("#%d %d %d\n", i, totalH, totalM);
		}
	}

}
