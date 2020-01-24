package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PR3456 {
	static int Lastbyun(int num[]) {
		int byun = 0;
		if (num[0] == num[1]) {
			byun = num[2];
		} else if (num[1] == num[2]) {
			byun = num[0];
		} else if (num[0] == num[2]) {
			byun = num[1];
		}
		return byun;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		for (int i = 1; i <= TC; i++) {
			String tmp[] = br.readLine().split(" ");
			int num[] = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();
			System.out.format("#%d %d\n", i, Lastbyun(num));
		}
	}

}
