package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2071 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			double sum = 0;
			double avg = 0;
			String tmp = br.readLine();
			for (int j = 0; j < 10; j++) {
				String num[] = tmp.split(" ");
				sum += Integer.parseInt(num[j]);
			}
			avg = sum / 10;
			System.out.println("#" + i + " " +(String.format("%.0f", avg)));
		}

	}

}
