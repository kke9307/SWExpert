package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PR1983_짜증나_다시 {
	static int TotalJumsu (int arr[]) {
		int totalJum = 0;
		if(arr[0]!=0) {
			arr[0]=(int)(arr[0]*0.35);
			 if(arr[1]!=0) {
				arr[1]=(int)(arr[1]*0.45);
			}
			 if(arr[2]!=0) {
				arr[2]=(int)(arr[2]*0.20);
			}
		}
		
		totalJum = arr[0]+arr[1]+arr[2];
		return totalJum;
	}
	static int FinalRank(int arr[]) {
		int finalRank = 0;
		if(arr.length/10>=1) {
			
		}
		else if( arr.length/10==1) {
			
		}
		return finalRank;
	}	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> rank = new ArrayList<Integer>();
		int TC = Integer.parseInt(br.readLine().trim());
		for (int i = 1; i <= TC; i++) {
			int num [] = new int [2];
			for (int j = 0; j < 2; j++) {
				String tmp [] = br.readLine().split(" ");
				num[j] = Integer.parseInt(tmp[j]);
			}
			for (int k = 0; k < num[0]; k++) {
				String jumsu[] = br.readLine().split(" ");
				int nums [] = Arrays.stream(jumsu).mapToInt(Integer::parseInt).toArray();
				rank.add(TotalJumsu(nums));
			}
			System.out.println(rank);
			int student = rank.indexOf(num[0]);
			Collections.sort(rank);
			System.out.println("학생의 등수or 인덱스 번호"+rank.indexOf(student));
		}
	}

}


