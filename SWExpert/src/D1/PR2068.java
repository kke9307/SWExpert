package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2068 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= tc ; i ++) {
			int max = 0;
			String tmp = br.readLine();
			for(int j = 0; j < 10 ; j ++) {
				String num [] = tmp.split(" ");
				if(max <Integer.parseInt(num[j])) {
					max = Integer.parseInt(num[j]);
				}
			}
			System.out.println("#"+i+" "+max);
		}
	}

}
