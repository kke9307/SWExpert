package D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR9317 {
	static int test(int length, String sentence, String inputSen) {
		int collectSen = 0;
		char A[] = sentence.toCharArray();
		char B[] = inputSen.toCharArray();
		for (int i = 0; i < length; i++) {
			if (A[i] != B[i]) {
				collectSen++;
			}
		}
		return length - collectSen;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= TC; i++) {
			int length = Integer.parseInt(br.readLine().trim());
			String sentence = br.readLine().trim();
			String inputSen = br.readLine().trim();
			System.out.format("#%d %d\n", i, test(length, sentence, inputSen));
		}
	}

}
