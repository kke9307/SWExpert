package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR2029 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i = 1; i<=t ; i++) {
			String a []= br.readLine().split(" ");
			System.out.println("#"+i+" "+Integer.parseInt(a[0])/Integer.parseInt(a[1])+" "+Integer.parseInt(a[0])%Integer.parseInt(a[1]));
		}
	}

}
