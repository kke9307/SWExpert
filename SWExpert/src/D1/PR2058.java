package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2058 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		String N = br.readLine();
		int sum = 0;
		for(int i = 0; i<N.length();i++) {
			char num = N.charAt(i);
			sum += (num-48);
		}
		System.out.println(sum);
	}

}
