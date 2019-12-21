package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

public class PR1204 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		int tc = Integer.parseInt(br.readLine());
		
		int max=0;
		int many = 0;
		for(int i = 1; i <= tc ; i++) {
			max=0;
			many = 0;
			int jumsu [] = new int [101];
			String tcn = br.readLine();
			String n = br.readLine();
			String a [] = String.valueOf(n).split(" ");
			for(int j = 0; j < a.length; j ++) {
				int tmp = Integer.parseInt(a[j]);
				jumsu[tmp]++;
			}
			for(int k=0;k<jumsu.length;k++) {
				if(max<jumsu[k]) {
					max = jumsu[k];
					many = k;
				}else if(max==jumsu[k]) {
					if(max < k) {
						many = k;
					}
				}
				
			}
			System.out.println("#"+tcn+" "+many);
		}
	}

}
