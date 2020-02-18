package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PR6730 {
	static int down_difficulty(int nstairs[]) {
		int down = 0;
		for (int i = 1; i < nstairs.length; i++) {
			if ((nstairs[i - 1] - nstairs[i]) < 0) {
				if(down > nstairs[i - 1] - nstairs[i])
				down =nstairs[i - 1] - nstairs[i];
			} else if ((nstairs[i - 1] - nstairs[i]) == 0) {
				if (down == 0) {
					down = 0;
				} else if (down != 0) {
					down = down;
				}
			}
		}
		return Math.abs(down);
	}

	static int up_difficulty(int nstairs[]) {
		int up = 0;
		for (int i = 1; i < nstairs.length; i++) {
			if ((nstairs[i - 1] - nstairs[i]) > 0) {
				if (up < nstairs[i - 1] - nstairs[i]) {
					up = Math.abs(nstairs[i - 1] - nstairs[i]);
				}
			} else if ((nstairs[i - 1] - nstairs[i]) == 0) {
				if (up == 0) {
					up = 0;
				} else if (up != 0) {
					up = up;
				}
			}
		}
		return up;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= TC; i++) {
			int pTC = Integer.parseInt(br.readLine().trim());
			String stairs[] = br.readLine().split(" ");
			int nstairs[] = Arrays.stream(stairs).mapToInt(Integer::parseInt).toArray();
			System.out.format("#%d %d %d\n", i, down_difficulty(nstairs), up_difficulty(nstairs));
		}
	}

}
