package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PR7728 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> hs = new HashSet<String>();
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			hs.clear();
			String str = br.readLine();
			for (int j = 1; j <= str.length(); j++) {
				hs.add(str.substring(j - 1, j));
			}
			System.out.format("#%d %d\n", i, hs.size());
		}
	}

}
