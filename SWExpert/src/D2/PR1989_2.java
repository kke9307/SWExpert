package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1989_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int tf = 0;
		for (int i = 1; i <= tc; i++) {
			String pl = br.readLine().trim();
			char a [] = pl.toCharArray();
			for(char c : a) {
				for(int j = a.length-1; j>-1;j-- ) {
					if(c != a[j]) {
						tf -=1;
						break;
					}
					else if(c == a[j]) {
						tf += 1;
					}
				}
				
			}
			System.out.println("#"+i+" "+tf);
		}
	}
}
