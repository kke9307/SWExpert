package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1926 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) {
			if (String.valueOf(i).contains("3")||String.valueOf(i).contains("6")||String.valueOf(i).contains("9")) {
				if(String.valueOf(i).length()>1) {
					for (int j = 0; j < String.valueOf(i).length(); j++) {
						char c = String.valueOf(i).charAt(j);
						if(c == '3'||c == '6'||c == '9') {
							System.out.print("-");
						}
					}
					System.out.print(" ");
				} else {
					System.out.print("-"+" ");
				}
			} else {
				System.out.print(i + " ");
				}
			
			} 
			
	}
}
