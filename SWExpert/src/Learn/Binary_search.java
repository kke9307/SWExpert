package Learn;

import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		int arr [] = {2,4,7,9,11,19,23};
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int answer = 0;
		int mid = arr.length/2;
		if(arr[mid] < a) {
			while(arr[mid]!=a) {
				--mid;
				if(mid > arr.length-1) {
					answer = -1;
					break;
				}
			}
			answer = mid;
		}
		else if(arr[mid] > a) {
			while(arr[mid]!=a) {
				--mid;
				if(mid < 0) {
					answer = -1;
					break;
				}
			}
			answer = mid;
		}
		else if(arr[mid] == a) {
			answer = mid; 
		}
	
		System.out.println(mid);
	}

}
