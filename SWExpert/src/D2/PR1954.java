package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1954 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println("#"+i+" ");
			for (int j = 1; j <= N * N; j++) {
				if (j % N == 0) {
					System.out.println(j + " ");
				} else {
					System.out.print(j + " ");
				}
			}
		}
	}

}
