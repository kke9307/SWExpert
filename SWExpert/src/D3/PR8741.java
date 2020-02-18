package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PR8741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken().substring(0, 1).toUpperCase();
			String str2 = st.nextToken().substring(0, 1).toUpperCase();
			String str3 = st.nextToken().substring(0, 1).toUpperCase();
			System.out.println("#" + i +" "+ str1 + str2 + str3);

		}
	}

}
