package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2805_보류 {
	static int Harvest(int farm[][]) {
		int harvest = 0;

		return harvest;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int farm[][] = new int[N][N];
			for (int j = 0; j < N; j++) {
				String num = br.readLine().trim();
				for (int k = 0; k < N; k++) {
					farm[j][k] = num.charAt(k) - 48;
				}
			}
			System.out.println("N: " + N + ", N/2: " + N / 2 + "\n");
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (j == N / 2) {
						if (k != N / 2) {
							System.out.print(farm[j][k] + " ");
						}
					} else {
						System.out.print(" ");
					}
					if (k == N / 2) {
						System.out.print(farm[j][k] + " ");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("============================================");

			for (int j = N/2-1; j > 0; j--) {
				for (int k = (N / 2)-j; k > 0; k--) {
					if(j != 0) {
					System.out.print("(" + j + "," + k + ")" + farm[j][k] + " ");
					}

				}
				System.out.println();
			}
		}

	}
}
