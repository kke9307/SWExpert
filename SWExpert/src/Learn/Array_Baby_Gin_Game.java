package Learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Array_Baby_Gin_Game {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp[] = br.readLine().split(" ");
		int arr[] = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();

		//BubbleSort(arr);
		//System.out.println("===========BubbleSort===========");

		CountingSort(arr);
		System.out.println("===========CountingSort===========");

	}

	static void BubbleSort(int arr[]) {
		for (int roopCnt = 0; roopCnt < arr.length; roopCnt++) { // 원소의 개수만큼의 루프를 더 돌아야 정렬 됨
			for (int i = 1; i < arr.length; i++) {
				if (arr[i - 1] > arr[i]) {
					int tmp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = tmp;
				}
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	static void CountingSort(int arr[]) {

		int[] counts = new int[getMax(arr) + 1]; // 가장 큰 값 +1 로 배열 선언
		for (int i = 0; i < arr.length; i++) { // 1단계 원소들의 개수 별로 저장
			counts[arr[i]]++;
		}
		for (int i = 0; i < counts.length; i++) {// 한번 출력 해봄
			System.out.print(counts[i] + " ");
		}
		System.out.println();

		for (int i = 1; i < counts.length; i++) {// 1-1 단계
			counts[i] += counts[i - 1];
		}
		for (int i = 0; i < counts.length; i++) {// 한번 출력 해봄
			System.out.print(counts[i] + " ");
		}
		System.out.println();

		int tmp[] = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) { // 2단계 
			counts[arr[i]]--;
			tmp[counts[arr[i]]] = arr[i];
		}
		for (int i = 0; i < tmp.length; i++) {
			System.out.print(tmp[i] + " ");
		}
		System.out.println();
	}

	static int getMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
