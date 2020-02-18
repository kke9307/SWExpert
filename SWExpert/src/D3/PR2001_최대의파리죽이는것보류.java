package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PR2001_최대의파리죽이는것보류 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int fly[][] = new int[N][N];
			for (int j = 0; j < N; j++) {
				String tmp[] = br.readLine().split(" ");
				int tmp2[] = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
				for (int k = 0; k < N; k++) {
					fly[j][k] = tmp2[k];
					// System.out.print(fly[j][k]+" ");
				}
				// System.out.println();
			}
			System.out.println("============================================");
			int cnt = 0;
			int cnt2= 0;
			int sum =0;
			for (int j = M; cnt2 < M; j--) {
				cnt=0;
				cnt2 ++;
				for (int k =M ; cnt < M; k--) {
					System.out.print(fly[j][k]+" ");
					sum+=fly[j][k];
					cnt++;
				}
				System.out.println();
			}
			System.out.format("#%d %d\n",i,sum);
		}
	}

}
