package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String alpa = br.readLine();
		for (int i = 0; i < alpa.length(); i++) {
			char a = alpa.charAt(i);
			System.out.print(a - 64 + " ");
		}
	}
}
