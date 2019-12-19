package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2063 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String num [] = null ;
		if (N % 2 != 0) {
			num = br.readLine().split(" ");
			for(int i = 0; i < num.length; i++) {
				int tmp = Integer.parseInt(num[i]);
				if(tmp < Integer.parseInt(num[i])) {
					
				}
				else if(tmp == Integer.parseInt(num[i])) {
					num [i] = num [i];
				}
			
			}
			System.out.println(num[N/2]);
		}

	}

}
