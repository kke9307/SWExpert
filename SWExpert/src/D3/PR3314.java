package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PR3314 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= TC; i++) {
			String arr[] = br.readLine().split(" ");
			int student[] = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			int sum = 0;
			for (int j = 0; j < student.length; j++) {
				if (student[j] < 40) {
					student[j] = 40;
				}
				sum += student[j];
			}
			System.out.format("#%d %d\n", i, sum / student.length);
		}
	}

}
