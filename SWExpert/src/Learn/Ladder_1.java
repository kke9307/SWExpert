package Learn;

import java.util.Scanner;

public class Ladder_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int dx[] = { 0, 0, -1, 1 };
		int dy[] = { -1, 1, 0, 0 };
		for(int i = 0; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				for(int k = 0; k < 4;) {
					int testX = i+dx[k];
					int testY = j + dy[k];
					//test(arr[testX][testY]);
				}
			}
		}
	}

}
