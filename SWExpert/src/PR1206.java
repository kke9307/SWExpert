import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int cnt = 0;
			String num[] = br.readLine().split(" ");
			for (int j = 1; j < num.length; j++) {
				cnt++;
				if (Integer.parseInt(num[j]) < Integer.parseInt(num[j])) {

				}
			}
		}
	}

}
