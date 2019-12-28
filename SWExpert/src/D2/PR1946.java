package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tc; i++) {
			int casecount = Integer.parseInt(br.readLine());
			String a ="";
			for (int j = 0; j < casecount; j++) {
				String str[] = br.readLine().split(" ");
				for (int k = 0; k < Integer.parseInt(str[1]); k++) {
					a += str[0];
				}
			}
			System.out.print("#"+i);
			for(int p = 0 ; p <a.length(); p ++) {
				if(p%10==0) {
					System.out.println();
				}
				System.out.print(a.charAt(p));
			}
			System.out.println();
		}
	}

}
