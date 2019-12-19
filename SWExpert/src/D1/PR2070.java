package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PR2070 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			String tmp = br.readLine();
			StringTokenizer st = new StringTokenizer(tmp);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if(A < B) {
				System.out.println("#"+i+" <");
			}else if(A > B) {
				System.out.println("#"+i+" >");
			}else {
				System.out.println("#"+i+" =");
			}
		}
	}

}
