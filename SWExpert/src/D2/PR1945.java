package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1945 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			int N = Integer.parseInt(br.readLine());
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			if (N % 2 == 0 || N % 3 == 0 || N % 5 == 0 || N % 7 == 0 || N % 11 == 0) {
				while (N % 2 == 0 || N % 3 == 0 || N % 5 == 0 || N % 7 == 0 || N % 11 == 0) {
					if (N % 11 == 0) {
						N /= 11;
						e++;
					} else if (N % 7 == 0) {
						N /= 7;
						d++;
					} else if (N % 5 == 0) {
						N /= 5;
						c++;

					} else if (N % 3 == 0) {
						N /= 3;
						b++;
					} else if (N % 2 == 0) {
						N /= 2;
						a++;
					}
				}
			}
			System.out.println("#"+i+" "+a+" "+b+" "+c+" "+d+" "+e);
		}
	}

}
