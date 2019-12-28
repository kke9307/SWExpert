package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PR1984 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		int arr[] = new int[10];
		for (int i = 1; i <= tc; i++) {
			double max = 0.0;
			double min =100;
			double sum = 0;
			String s[] = br.readLine().split(" ");
			for (int j = 0; j < 10; j++) {
				arr[j] = Integer.parseInt(s[j]);
			}
			for (int k = 0; k < 10; k++) {
				if(min>arr[k]) {
					min = arr[k];
				}
				else if(max<arr[k]) {
					max = arr[k];
				}
			}
			for(int p = 0; p < 10 ; p ++) {
				if(arr[p]!=min && arr[p]!=max) {
					sum += arr[p];
				}
			}
			System.out.println("#" + i + " " + Math.round(sum/8));
		}
	}

}
