package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR4406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			String str = br.readLine();
			if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")) {
				str = str.replace("a", "");
				str = str.replace("e", "");
				str = str.replace("i", "");
				str = str.replace("o", "");
				str = str.replace("u", "");
			}
			System.out.format("#%d %s", i, str);
		}
	}

}
